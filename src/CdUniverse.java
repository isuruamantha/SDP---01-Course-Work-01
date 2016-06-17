import java.util.*;
import java.text.*;

public class CdUniverse { // this is the main body of the whole class

	static List<String> cdList = new ArrayList<String>(); // In this cdList the
															// CD details are
															// included
	static List<String> rentList = new ArrayList<String>(); // In this list all
															// rented CD details
															// are included
	static Scanner sc = new Scanner(System.in); // Scanner for the whole class
	static int x = cdList.size();
	static String mm = "yes";
	static String itemName = "";
	static String confirmation;
	static String itemPrice = "";

	public static void main(String[] args) { // the main method of the whole
												// class

		boolean value = true; // if the entered password and user name is true
								// this method will execute
		String in = "";

		value = userDetails(value);

		while (value) {

			MenuList(in);
		}
	}

	public static boolean userDetails(boolean s) {
		String username = "admin"; // user must enter Admin to entered to the
									// system
		String passWord = "456"; // user must input the password correctly to
									// enter the system
		String enteredUser;
		String enteredPassword;

		do {

			Date dateNow = new Date(); // To show the current date and time to
										// the
										// user
			SimpleDateFormat date = new SimpleDateFormat(
					"dd.MM.yyyy 'at' hh:mm  " + "\n");

			System.out.println("Today: " + date.format(dateNow));
			System.out
					.println("       (                 )  (                 (    (         "
							+ "\n"
							+ "   (   )\\ )           ( /(  )\\ )              )\\ ) )\\ )      "
							+ "\n"
							+ "   )\\ (()/(       (   )\\())(()/( (   (   (   (()/((()/( (    "
							+ "\n"
							+ " (((_) /(_))      )\\ ((_)\\  /(_)))\\  )\\  )\\   /(_))/(_)))\\   "
							+ "\n"
							+ " )\\___(_))_    _ ((_) _((_)(_)) ((_)((_)((_) (_)) (_)) ((_)  "
							+ "\n"
							+ "((/ __||   \\  | | | || \\| ||_ _|\\ \\ / / | __|| _ \\/ __|| __| "
							+ "\n"
							+ " | (__ | |) | | |_| || .` | | |  \\ V /  | _| |   /\\__ \\| _|  "
							+ "\n"
							+ "  \\___||___/   \\___/ |_|\\_||___|  \\_/   |___||_|_\\|___/|___| "
							+ "\n" + "");
			System.out.print("Enter Username : ");
			enteredUser = sc.next();
			System.out.print("Enter password : ");
			enteredPassword = sc.next();

			if (enteredUser.equals(username)
					&& enteredPassword.equals(passWord)) {
				s = true;
			} else {
				System.out
						.println("Invalid User name and Password! Please re enter the user name and password!" + '\n'); // password
																														// and
																														// displayed
			}
		} while (!(enteredUser.equals(username) && enteredPassword
				.equals(passWord)));
		return s;
	}

	public static void MenuList(String choice) { // This method contains CD shop
													// menu

		System.out.println("");
		System.out.println("\t \t" + " +-+-+ +-+-+-+-+-+-+-+-+ +-+-+-+-+"
				+ '\n' + "\t \t" + " |C|D| |U|n|i|v|e|r|s|e| |M|e|n|u|" + '\n'
				+ "\t \t" + " +-+-+ +-+-+-+-+-+-+-+-+ +-+-+-+-+" + '\n');
		System.out.println("Add CD details to the database (Press 1) ");
		System.out.println("Display the included CDs in the database(Press 2)");
		System.out.println("Remove a CD from database (Press 3)");
		System.out.println("New CD rental(Press 4) ");
		System.out.println("Display rented CD list(Press 5) ");
		System.out.println("CD returnings(Press 6) ");
		System.out.println("Search a CD in the database(Press 7) ");
		System.out.println("Edit CD details(Press 8) ");
		System.out.println("Reminders about rented CDs(Press 9) ");
		System.out.println("Exit(Press 10) ");
		System.out.println("");
		System.out.print("Enter your choice :  ");
		choice = sc.next();
		switch (choice) {
		case "1":
			cdDetails();
			break;
		case "2":
			checkingCdList();
			break;
		case "3":
			deleteCd();
			break;
		case "4":
			rentCd();
			break;
		case "5":
			showRentedCd();
			break;
		case "6":
			cdReturning();
			break;
		case "7":
			searchCd();
			break;
		case "8":
			editCd();
			break;
		case "9":
			dueDates();
			break;
		case "10":
			System.out
					.println("\t\t _   _                                 _                _             _ "
							+ '\n'
							+ "\t\t| | | |                               (_)              | |           | |"
							+ "\n"
							+ "\t\t| |_| | __ ___   _____    __ _   _ __  _  ___ ___    __| | __ _ _   _| |"
							+ "\n"
							+ "\t\t|  _  |/ _` \\ \\ / / _ \\  / _` | | '_ \\| |/ __/ _ \\  / _` |/ _` | | | | |"
							+ "\n"
							+ "\t\t| | | | (_| |\\ V /  __/ | (_| | | | | | | (_|  __/ | (_| | (_| | |_| |_|"
							+ "\n"
							+ "\t\t\\_| |_/\\__,_| \\_/ \\___|  \\__,_| |_| |_|_|\\___\\___|  \\__,_|\\__,_|\\__, (_)"
							+ "\n"
							+ "\t\t                                                                 __/ |  "
							+ "\n"
							+ "\t\t                                                                |___/   ");
			System.exit(0);
			break;
		default:
			System.out.print("Invalid input! Enter again please!");
		}
	}

	public static void cdDetails() { // this method is about the adding CDs into
										// the menu
										// the data base

		String confirm = "yes";

		System.out.println("");
		System.out.print("\t\t +-+-+-+ +-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+-+-+"
				+ "\n" + "\t\t |A|d|d| |C|D|s| |t|o| |t|h|e| |d|a|t|a|b|s|e|"
				+ "\n" + "\t\t +-+-+-+ +-+-+-+ +-+-+ +-+-+-+ +-+-+-+-+-+-+-+"
				+ "\n");
		while (confirm.equalsIgnoreCase("yes")) {
			int itemPrice;
			System.out.print("Enter CD name : ");
			sc.nextLine();
			itemName = sc.nextLine();
			System.out.print("Enter CD price(Rs) : ");

			do {
				if (!sc.hasNextInt()) {
					System.err.print("Enter an Integer!\n");
					System.out.print("Enter CD price(Rs) : ");
					sc.next();
				}

			} while (!sc.hasNextInt());
			itemPrice = sc.nextInt();
			System.out.println("CD Number \t CD Name \t CD price ");
			System.out.println("");
			System.out.println(x + ")\t\t " + itemName + "\t\t " + itemPrice);
			cdList.add(x + "\t" + itemName);
			x++;

			System.out.println("CD \"" + itemName
					+ "\" added succesfully to the database!");
			do {
				System.out
						.println("Do you want to add a new CD to the system?(Yes or No)");
				confirm = sc.next();
				if (!(confirm.equalsIgnoreCase("yes") || confirm
						.equalsIgnoreCase("no")))
					System.out.println("Invalid input. Enter (Yes/No)");
			} while (!(confirm.equalsIgnoreCase("yes") || confirm
					.equalsIgnoreCase("no")));
		}
	}

	public static void checkingCdList() { // This method is about checking the
											// CD in the database
		System.out.println("");
		System.out.println("\t\t +-+-+ +-+-+-+-+-+-+-+-+" + "\n"
				+ "\t\t |C|D| |D|a|t|a|B|a|s|e|" + "\n"
				+ "\t\t +-+-+ +-+-+-+-+-+-+-+-+");
		System.out.println("");
		for (String showTheList : cdList) {
			System.out.println(showTheList);

		}
		System.out.println("");
		System.out.println(cdList.size() + " CDs in the database ");

	}

	public static void deleteCd() { // This method is about deleting CD from the
									// database
		Boolean r = true;
		String confirmation = "yes";
		System.out.println("");
		System.out
				.println("\t\t +-+-+-+-+-+-+ +-+ +-+-+-+-+-+ +-+-+-+-+ +-+-+-+ +-+-+-+-+-+-+-+-+"
						+ "\n"
						+ "\t\t |D|e|l|e|t|e| |a| |M|o|v|i|e| |f|r|o|m| |t|h|e| |d|a|t|a|b|a|s|e|"
						+ "\n"
						+ "\t\t +-+-+-+-+-+-+ +-+ +-+-+-+-+-+ +-+-+-+-+ +-+-+-+ +-+-+-+-+-+-+-+-+");
		System.out.println("");
		while (confirmation.equalsIgnoreCase("yes")) {
			System.out.print("Enter the CD number you want to delete : ");
			int cdNum = sc.nextInt();

			try {
				cdList.remove(cdNum);
				cdList.add(cdNum + "This CD is deleted!");
			} catch (java.lang.IndexOutOfBoundsException e) {
				r = false;
				System.err.println("CD not found!");
			}
			if (r) {
				System.out
						.println("CD \"" + cdNum + "\" Deleted successfully!");
			}
			System.out
					.println("Do you want to delete another CD from the Database?(Yes or No)");
			confirmation = sc.next();

		}
	}

	public static void rentCd() { // This method about rent a CD from the
		String confirm = "no"; // database
		do {
			int y = 0;
			System.out.println(" ");
			System.out
					.println("\t\t +-+-+ +-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+-+"
							+ "\n"
							+ "\t\t |C|D| |R|e|n|t|a|l| |I|n|f|o|r|m|a|t|i|o|n|"
							+ "\n"
							+ "\t\t +-+-+ +-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+-+");
			System.out.println("");
			System.out.print("Enter the CD number: ");
			int itemNumber = sc.nextInt();
			try {
				cdList.get(itemNumber);
			} catch (java.lang.IndexOutOfBoundsException e) {
				System.out.println("CD not found!");
				confirm = "yes";
			}
			System.out.print("Enter item type (weekly/overnight): ");
			String itemType = sc.next();
			System.out.print("Enter borrower name: ");
			sc.nextLine();
			String borrowerName = sc.nextLine();
			System.out.print("Enter borrower address: ");
			String borrowerAddress = sc.nextLine();
			System.out.print("Enter borrower mobile Number: ");

			do {
				if (!sc.hasNextInt()) {
					System.err.print("Enter an Integer!\n");
					System.out.print("Enter borrower mobile Number: ");
					sc.next();
				}

			} while (!sc.hasNextInt());

			int borrowerNumber = sc.nextInt();

			System.out.print("Rented date(dd/mm/yyyy): ");
			String rentedDate = sc.next();
			System.out.print("Due date(dd/mm/yyyy): ");
			String dueDate = sc.next();
			int rentNumber = y;
			rentList.add(itemNumber + ";" + dueDate + ";" + itemType + ";"
					+ borrowerName + ";" + borrowerAddress + " ;"
					+ borrowerNumber + ";" + rentedDate + ";" + rentNumber
					+ ";");
			y++;
			System.out
					.println("Your cd rental details was recorded successfully!");
			do {
				System.out.println("Do you want to rent a new cd? (Yes/No)");
				confirm = sc.next();
				if (!(confirm.equalsIgnoreCase("yes") || confirm
						.equalsIgnoreCase("no")))
					System.out.println("Invalid input. Enter (Yes/No)");
			} while (!(confirm.equalsIgnoreCase("yes") || confirm
					.equalsIgnoreCase("no")));
		} while (confirm.equalsIgnoreCase("yes"));
	}

	public static void showRentedCd() { // Display the rented CDs in the
										// database
		System.out.println("");
		System.out.println("\t\t +-+-+-+-+-+-+ +-+-+ +-+-+-+-+" + "\n"
				+ "\t\t |R|e|n|t|e|d| |C|D| |L|i|s|t|" + "\n"
				+ "\t\t +-+-+-+-+-+-+ +-+-+ +-+-+-+-+");
		System.out.println("");

		for (int i = 0; i < rentList.size(); i++) {
			String arr[] = rentList.get(i).split(";");
			System.out.println("Item Number: " + arr[0] + "\n" + "Due date: "
					+ arr[1] + "\n" + "Item type: " + arr[2] + "\n"
					+ "Borrower Name: " + arr[3] + "\n" + "Borrower Address: "
					+ arr[4] + "\n" + "Borrower mobile number: " + arr[5]
					+ "\n" + "Rented Date: " + arr[6]);

		}
	}

	public static void cdReturning() { // This method contains CD returning
										// details
		System.out.println("");
		System.out.println("\t\t +-+-+ +-+-+-+-+-+-+-+-+-+ +-+-+-+-+" + "\n"
				+ "\t\t |C|D| |R|e|t|u|r|n|i|n|g| |M|e|n|u|" + "\n"
				+ "\t\t +-+-+ +-+-+-+-+-+-+-+-+-+ +-+-+-+-+");
		System.out.println("");

		do {

			System.out.println("Enter CD number: ");
			int item_number = sc.nextInt();
			rentList.remove(item_number);

			System.out.println("Your cd returning was recorded successfully!");
			do {
				System.out.println("Return anthor cd? yes/no");
				confirmation = sc.next();
				if (!(confirmation.equalsIgnoreCase("yes") || confirmation
						.equalsIgnoreCase("no")))
					System.out.println("Invalid input. Enter yes/no");
			} while (!(confirmation.equalsIgnoreCase("yes") || confirmation
					.equalsIgnoreCase("no")));
		} while (!confirmation.equalsIgnoreCase("no"));
	}

	public static void searchCd() { // This method about searching a cd from the
									// database

		System.out.println("");
		System.out.println("\t\t +-+-+-+-+-+-+" + "\n" + "\t\t |S|e|a|r|c|h|"
				+ "\n" + "\t\t +-+-+-+-+-+-+");
		System.out.println("");
		do {

			System.out.print("Enter CD name that you want search: ");
			String name = "";

			do {
				try {
					name = sc.next();
				} catch (Exception e) {
					System.out.print("Enter a name");
					sc.next();
				}
			} while (name.equals(""));
			System.out.println("");

			int count = 0;

			for (int i = 0; i < cdList.size(); i++) {
				String[] arr = cdList.get(i).split("\t");
				if (name.toLowerCase().contains(arr[1])) {
					System.out.println(i + ")    " + arr[1]);
					count = 1;
					continue;
				}
			}

			if (count == 0) {
				System.out.println("CD Not Found");
			}

			do {
				System.out.println("");
				System.out.print("Do you want to search another cd? (Yes/No)");
				confirmation = sc.next();
				if (!(confirmation.equalsIgnoreCase("yes") || confirmation
						.equalsIgnoreCase("no")))
					System.out.println("Invalid input. Enter yes/no");
			} while (!(confirmation.equalsIgnoreCase("yes") || confirmation
					.equalsIgnoreCase("no")));
		} while (!confirmation.equalsIgnoreCase("no"));
	}

	public static void editCd() { // this method about editing a CDs in the
									// database
		System.out.println("");
		System.out.println("\t\t +-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+" + "\n"
				+ "\t\t |E|d|i|t| |C|D| |D|e|t|a|i|l|s|" + "\n"
				+ "\t\t +-+-+-+-+ +-+-+ +-+-+-+-+-+-+-+");

		System.out.println("");
		System.out.print("Enter the CD Name that you want to Edit : ");
		String cdName = sc.next();
		for (int i = 0; i < cdList.size(); i++) {
			String[] arr = cdList.get(i).split("\t");
			if (arr[1].equals(cdName)) {
				System.out.print("Enter new CD Name : ");
				String cdNameNew = sc.next();
				cdList.set(i, arr[0] + "\t" + cdNameNew);
				System.out.println("Updated CD details!");
				break;
			}
			System.out.println("No CD Found with that number!");
		}

	}

	public static void dueDates() { // This method about show a reminder about
									// rented CDs in the database
		int count = 0;
		System.out.println(" ");
		System.out.println("\t\t +-+-+-+-+-+-+-+-+-+" + "\n"
				+ "\t\t |R|e|m|i|n|d|e|r|s|" + '\n'
				+ "\t\t +-+-+-+-+-+-+-+-+-+");
		System.out.println("");
		System.out.print("Enter the date in dd/mm/yyyy format: ");
		String number = sc.next();

		for (int i = 0; i < rentList.size(); i++) {
			String arr[] = rentList.get(i).split(";");
			String date = arr[1];
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			f.setLenient(false);
			Date parse = null;
			Date user = new Date();
			try {

				parse = f.parse(date);
				user = f.parse(number);
			} catch (ParseException e) {
			}

			Calendar cal = Calendar.getInstance();
			cal.setTime(user);
			cal.add(Calendar.DATE, 7);

			int diffInDays = (int) (Math.abs(cal.getTime().getTime()
					- parse.getTime()) / (1000 * 60 * 24 * 60));

			if (diffInDays > 7) {
				count++;
				System.out.println("Item number : " + arr[0] + "\n"
						+ "Rented Date: " + arr[6] + "\n" + "Due Date: "
						+ arr[1] + "\n" + "Item Type: " + arr[2] + "\n"
						+ "Borrower Name: " + arr[3] + "\n"
						+ "Borrower Address: " + arr[4] + "\n"
						+ "Borrower mobile number: " + arr[5]);
			}
		}

		if (count > 0) {
			System.out.println(count + " Reminders Available");
		} else {
			System.out.println("NO Reminders Available! ");

		}

	}

}

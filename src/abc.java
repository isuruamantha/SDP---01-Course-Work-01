import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class abc {
	public static void main(String []chamath){
		
		
		Scanner sc= new Scanner(System.in);
		int [] arr= new int[10];
		
		for ( int i=0; i<arr.length;i++){
			arr[i]=i*80+12;
			
		}
		
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		
		
		for(int i : arr){
			System.out.println(i);
		}
		
		List<String> list=new ArrayList<String>();
		
		list.add("ABC"); //0 
		
		System.out.println("Enter String: ");
		
		String s=sc.nextLine();
		list.add(s); //1
		
		list.add("ABC");//2
		list.add("DEF");//3
		list.add("100");//4
		list.add("200");//5
		list.add("400");//6
		list.add("400");//7

		list.set(1, "CDE"); //1
		
		for(int i=0;i<list.size();i+=2){
			System.out.println(list.get(i));
		}
		
	}
	

}

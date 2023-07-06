import java.util.ArrayList;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArryList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements u want to store?");
		
		int noe = sc.nextInt();
		
		for(int i=0; i< noe; i++)
		{
			System.out.println("Enter any number");
			int ele = sc.nextInt();
			al.add(ele);
		}
		
		System.out.println("The elements are"+al);

	}

}

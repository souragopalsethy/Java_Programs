package imp;

import java.util.Scanner;

public class Inser_Into_Arrayy {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num+1];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+i+"elements");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("["+i+"]"+"  --->"+arr[i]);
			
		}
	
		// TODO Auto-generated method stub

	}

}

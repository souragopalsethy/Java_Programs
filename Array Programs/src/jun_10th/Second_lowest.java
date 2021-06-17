package jun_10th;

import java.util.Arrays;
import java.util.Scanner;

public class Second_lowest {
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
		Arrays.sort(arr);
		System.out.println("Second lowest elemet of array is "+arr[1]);
		
		// TODO Auto-generated method stub

	}

}

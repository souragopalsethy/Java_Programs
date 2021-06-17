package Practice;

import java.util.Scanner;

public class duplicate_char_in_arr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+i+" elements");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j;k<arr.length;k++)
			{
				if(arr[j]==arr[k]&&(j!=k))
				System.out.println("duplicate elemnts are"+arr[j]);
			}
		}
		// TODO Auto-generated method stub

	}

}

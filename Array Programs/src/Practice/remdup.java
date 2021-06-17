package Practice;

import java.util.Scanner;

public class remdup {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+(i+1)+" element ");
			arr[i]=sc.nextInt();
		}
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[len-1];
					len--;
				}
			}
		}
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
		// TODO Auto-generated method stub

	}

}

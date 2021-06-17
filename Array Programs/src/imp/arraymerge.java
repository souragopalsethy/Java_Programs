package imp;

import java.util.Scanner;

public class arraymerge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter size of first array");
		int first=sc.nextInt();
		System.out.println("Eneter size of second array");
		int second=sc.nextInt();
		int third=first+second;
		int a[]=new int[first];
		int b[]=new int[second];
		int c[]=new int[third];
		System.out.println("Enter the elements to first array");
		for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
		System.out.println("Enter the elements to second array");
		for(int i=0;i<a.length;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=0;i<a.length;i++)
			c[a.length+i]=b[i];
		for(int j=0;j<third;j++)
			System.out.print(c[j]+" ");
			
			
			
		
	}
}

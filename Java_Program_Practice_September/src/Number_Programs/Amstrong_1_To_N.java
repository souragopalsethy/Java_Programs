package Number_Programs;

import java.util.Scanner;

public class Amstrong_1_To_N {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int num=i;
		int temp=num;
		int temp2=num;
		int count=0;
		int sum=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		while(temp2!=0)
		{
			int last=temp2%10;
			int result=1;
			for(int j=0;j<count;j++)
			{
				result=result*last;
			}
			sum=sum+result;
			temp2=temp2/10;
		}
		if (sum==num) {
			System.out.print(sum+" ");
			
		}
		
		
		
	}
	
	
}
}

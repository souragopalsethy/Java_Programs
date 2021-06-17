package String_prg;
import java.util.Scanner;

public class White_Spaces_remove {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int count=0;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				arr[j]=arr[i];
				j++;
			}
			if(arr[i]==' ')
				count++;
		
		}
		for(int i=0;i<arr.length-count;i++)
			System.out.print(arr[i]);
	

}
}

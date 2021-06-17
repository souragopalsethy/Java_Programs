package rough;

import java.util.Scanner;

public class Print_Voiel_consonant_words_of_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		String str[]=s.split("[\\s]");
		char arr[]=s.toCharArray();
		String voiel="";
		String consonanat="";
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].startsWith("a")||str[i].startsWith("e")||str[i].startsWith("i")||str[i].startsWith("o")||str[i].startsWith("u")||str[i].startsWith("A")||str[i].startsWith("E")||str[i].startsWith("I")||str[i].startsWith("O")||str[i].startsWith("U"))
			{
				voiel=voiel+str[i]+" ";
			}
			else
				consonanat=consonanat+str[i]+" ";
		}
		System.out.println("Voiels are : "+voiel);
		System.out.println("Consonant are : "+consonanat);
	}
}
	
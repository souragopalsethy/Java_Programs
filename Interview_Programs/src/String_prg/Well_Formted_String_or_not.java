package String_prg;

import java.util.Stack;

public class Well_Formted_String_or_not {

	public static void main(String[] args) {
		String s="{[()]}";
		Stack stk= new Stack();
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		if(stk.isEmpty())
			stk.push(c);
		else if(c=='{'||c=='['||c=='(')
		{
			stk.push(c);
		}
		
		else if(c=='}'&& (Character)stk.peek()=='{' )
		{
			stk.pop();
		}
		else if(c==']'&& (Character)stk.peek()=='[' )
		{
			stk.pop();
		}
		else if(c==')'&& (Character)stk.peek()=='(' )
		{
			stk.pop();
		}
		}
		if(stk.isEmpty())
			System.out.println("WellFormated String");
		else
			System.out.println("Not a Well Formatd  String");
		// TODO Auto-generated method stub

	}

}

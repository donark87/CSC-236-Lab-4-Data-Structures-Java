//Donark Patel
//CSC 236
//Lab 4C

import java.util.Scanner;

public class PalindromeDemo
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String str;
		boolean check;

		System.out.println("Enter a sentence or a word");
		str = keyboard.nextLine();
		check = isPalindrome(str);

		if(check == true)
		{
			System.out.println("\nThis is a Palindrome");
		}
		else
		{
			System.out.println("\nThis is Not a Palindrome");
		}
		
	}

	public static boolean isPalindrome(String input)
	{
		StackClass<Character> ltrStack = new StackClass<Character>();
		StackClass<Character> rtlStack = new StackClass<Character>();

		for(int i = input.length() - 1; i >= 0; i --)
		{
			if(input.toUpperCase().charAt(i) >= 'A' && input.toUpperCase().charAt(i) <= 'Z')
			{
				ltrStack.push(input.toUpperCase().charAt(i));
			}
		}
		for(int i = 0; i < input.length(); i++)
		{
			if(input.toUpperCase().charAt(i) >= 'A' && input.toUpperCase().charAt(i) <= 'Z')
			{
				rtlStack.push(input.toUpperCase().charAt(i));
			}
		}

		while(!ltrStack.isEmptyStack())
		{
			if(!ltrStack.peek().equals(rtlStack.peek()))
			{
				return false;
			}
			ltrStack.pop();
			rtlStack.pop();
		}
		return true;
	}
}


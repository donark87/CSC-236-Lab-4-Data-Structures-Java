//Donark Patel
//CSC 236
//Lab 4B

import java.util.Scanner;
public class BaseDemo
{
	public static void main (String[]args)
	{

		Scanner keyboard = new Scanner(System.in);

		int base10Num,
			baseNum,
			remainder = 0,
			quotient = 0,
			answer = 0,
			temp;

		Stack remainderStack = new Stack();
		Stack quotientStack = new Stack();

		System.out.println("Enter your base 10 number: ");
		base10Num = keyboard.nextInt();

		if(base10Num < 0)
		{
			System.out.println("Negative number entered.");
		}

		System.out.println("Enter the base you would like to convert to.");
		baseNum = keyboard.nextInt();

		if(baseNum < 2 || baseNum > 9)
		{
			System.out.println("Base number must be between 2-9");
		}

		quotient = base10Num / baseNum;
		quotientStack.push(quotient);
		remainder = base10Num % baseNum;
		remainderStack.push(remainder);

		do
		{
			temp = quotientStack.pop();
			answer = temp/baseNum;
			quotientStack.push(answer);
			remainder = temp % baseNum;
			remainderStack.push(remainder);
		}while(answer != 0);

		System.out.print("\nThe base 10 Number "+ base10Num + " converted to base " + baseNum + " is: ");

		while(!remainderStack.isEmpty())
		{
			System.out.print(remainderStack.pop());
		}

		System.out.println(" ");

	}
}
//Donark Patel
//CSC 236
//Lab 4A

import java.util.Scanner;
public class FactorizationDemo
{
	public static void main (String [] args)
	{
		Integer num;
		int i,
			temp;
		String output;
		Scanner keyboard = new Scanner (System.in);
		StackClass<Integer> intStack = new StackClass<Integer>(10);

		System.out.println("Enter a number : ");
		num = keyboard.nextInt();
		temp = num;
		i = 2;

		while(i <= temp)
		{
			if(temp % i == 0)
			{
				intStack.push(i);
				temp /= i;
			}
			else
			{
				i++;
			}
		}
		try
		{
			System.out.print("\nThe Prime Factors of "+ num + " are ");
			output = "";
			while(!(intStack.isEmptyStack()))
			{
				output += intStack.peek() + "*";
				intStack.pop();
			}
			output = output.substring(0,output.length()-1);
			System.out.println(output);

		}
		catch(StackUnderflowException sufe)
		{
			System.out.println("Error: Stack is empty.");
			System.exit(0);
		}
	}
}
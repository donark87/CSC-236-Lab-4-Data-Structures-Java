//Donark Patel
//CSC 236
//Lab 4A

public class StackOverflowException  extends StackException
{
	/**
	Default Constructor
	Display the StackOverflowException's default message.
	**/
	public StackOverflowException()
	{
		super("Stack Overflow");
	}

	/**
	Overloaded Constructor
	Display the StackOverflowException's message passed by the user.
	**/
	public StackOverflowException(String message)
	{
		super(message);
	}
}
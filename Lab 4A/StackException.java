//Donark Patel
//CSC 236
//Lab 4A


public class StackException extends RuntimeException
{
	/**
	Default Constructor
	Display the StackException's default message.
	**/
	public StackException()
	{
		super("Error");
	}

	/**
	Overloaded Constructor
	Display the StackException's message passed by the user.
	**/
	public StackException(String message)
	{
		super(message);
	}
}
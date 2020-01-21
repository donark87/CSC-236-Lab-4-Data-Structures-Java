//Donark Patel
//CSC 236
//Lab 4A

public class StackUnderflowException  extends StackException
{
	/**
	Default Constructor
	Display the StackUnderflowException's default message.
	**/
	public StackUnderflowException()
	{
		super("Stack Underflow");
	}

	/**
	Overloaded Constructor
	Display the StackUnderflowException's message passed by the user.
	**/
	public StackUnderflowException(String message)
	{
		super(message);
	}
}
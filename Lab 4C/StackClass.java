//Donark Patel
//CSC 236
//Lab 4C

public class StackClass<T> implements StackClassADT<T>
{

	private int maxStackSize;
	private int stackTop;
	private T[] list;

	/**
	Default Constructor
	Create an array of capacity of 100
	Postcondition: maxStackSize = 100
					stackTop = 0
					List contains address of the array
	**/
	public StackClass()
	{
		maxStackSize = 100;
		stackTop = 0;
		list = (T[]) new Object[maxStackSize];
	}

	/**
	OverLoaded Constructor
	Create an array with users input
	Postcondition: stackTop = 0
					maxStackSize = stackSize
					list contains the address of the array
	**/
	public StackClass(int stackSize)
	{
		if(stackSize <= 0)
		{
			System.out.println("The array size much be greater than zero.");
			System.out.println("Creating an array of 100 elements");
			maxStackSize = 100;
		}
		else
		{
			maxStackSize = stackSize;
			stackTop = 0;
			list = (T[])new Object[maxStackSize];
		}
	}

	/**
	Method to initialize the stack to empty
	stackTop = 0
	**/
	public void initializeStack()
	{
		for(int i = 0; i < stackTop; i++)
		{
			list[i] = null;
			stackTop = 0;
		}
	}

	/**
	Method to check if the stack is empty
	Postcondition: Returns true if stack is empty
				   Returns false if stack is not empty.
	**/
	public boolean isEmptyStack()
	{
		return(stackTop == 0);
	}

	/**
	Method to check if the stack is full
	Postcondition: Returns true if stack is full
				   Returns false if stack is not full.
	**/
	public boolean isFullStack()
	{
		return (stackTop == maxStackSize);
	}

	/**
	Method to add an element onto the stack
	Precondition: The stack has to exist and must not be full
	Postcondition: NewElement is added to the top of the stack.
				   If the stack is full StackOverflowException is thrown.
	**/
	public void push(T newElement) throws StackOverflowException
	{
		if(isFullStack())
		{
			throw new StackOverflowException("Stack is full!");
		}
		else
		{
			list[stackTop] = newElement;
			stackTop ++;
		}
	}

	/**
	Method to return a reference to the top of the stack
	Precondition: The stack has to exist and must not be empty
	PostCondition: A reference to the top element of the stack if returned.
				   If the stack is empty a StackUnderflowException is thrown.
	**/
	public T peek() throws StackUnderflowException
	{
		if(isEmptyStack())
		{
			throw new StackUnderflowException("Stack is Empty!");
		}
		return (T) list[stackTop -1];
	}

	/**
	Method to remove the top element of the stack
	Precondition: The stack has to exist and must not be empty
	Postcondition: The top element of the stack is removed
				   If the stack is empty a StackUnderflowException is thrown.
	**/
	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
		{
			throw new StackUnderflowException();
		}
		else
		{
			stackTop--;
			list[stackTop] = null;
		}
	}
}

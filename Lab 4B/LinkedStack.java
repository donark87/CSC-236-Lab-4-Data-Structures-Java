//Donark Patel
//CSC 236
//Lab 4B

public class LinkedStack<T> implements StackClassADT<T>
{
	private StackNode<T> stackTop;

	private class StackNode<T>
	{
		public T info;
		public StackNode<T> link;

		/**
		Default Constructor
		Postcondition: info = null
						link = null
		**/
		public StackNode()
		{
			info = null;
			link = null;
		}

		/**
		Overloaded Constructor
		Postcondition: info = element
						link = pointer
		**/
		public StackNode(T element, StackNode<T> pointer)
		{
			info = element;
			link = pointer;
		}

		/**
		Method to return the info
		Postcondition: info is returned as a String object
		**/
		public String toString()
		{
			return info.toString();
		}
	}

	/**
	Default Constructor
	Postcondition: stackTop = null
	**/
	public LinkedStack()
	{
		stackTop  = null;
	}

	/**
	Method to initialize the stack.
	Postcondition: stackTop = null;
	**/
	public void initializeStack()
	{
		stackTop = null;
	}

	/**
	Method to check if the stack is empty
	Postcondition: Returns true if stack is empty
				   Returns false if stack is not empty
	**/
	public boolean isEmptyStack()
	{
		return(stackTop == null);
	}

	/**
	Method to check if the stack is full
	Postcondition: Returns true if stack is full
				   Returns false if stack is not full
	**/
	public boolean isFullStack()
	{
		return false;
	}

	/**
	Method to add an element onto the stack
	PreCondition: The stack has to exist and must not be full
	PostCondition: newElement is added to the top of the stack.
				   If the stack is full StackOverflowException is thrown.
	**/
	public void push(T newElement)
	{
		StackNode<T> newNode;
		newNode = new StackNode<T>(newElement, stackTop);
		stackTop = newNode;
	}

	/**
	Method to return a reference to the top of the stack
	PreCondition: The stack has to exist and must not be empty
	PostCondition: A reference to the top element of the stack if returned.
				   If the stack is empty a StackUnderflowException is thrown.
	**/
	public T peek() throws StackUnderflowException
	{
		if(stackTop == null)
		{
			throw new StackUnderflowException("Stack is empty.");
		}
		else
		{
			return stackTop.info;
		}
	}

	/**
	Method to remove the top element of the stack
	PreCondition: The stack has to exist and must not be empty
	Postcondition: The top element of the stack is removed
					   If the stack is empty a StackUnderflowException is thrown.
	**/
	public void pop() throws StackUnderflowException
	{
		if(stackTop == null)
		{
			throw new StackUnderflowException("Stack is empty.");
		}
		else
		{
			stackTop = stackTop.link;
		}
	}
}

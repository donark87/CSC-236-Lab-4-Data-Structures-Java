//Donark Patel
//CSC 236
//Lab 4B

import java.util.NoSuchElementException;
public class Stack<T> implements StackADT<T>
{
	private Node head;

	private class Node
	{
		private int element;
		private Node link;

		/**
		Default Constructor
		Postcondition: element = 0
					   link = null
		**/
		public Node()
		{
			element = 0;
			link =  null;
		}

		/**
		Overloaded Constructor
		Postcondition: element = newElem
	    			   link = newLink
		**/
		public Node(int newElem, Node newLink)
		{
			element = newElem;
			link = newLink;
		}
	}

	/**
	Default Constructor
	Postcondition: head = null
	**/
	public Stack()
	{
		head = null;
	}

	/**
	Method to add an element onto the stack
	Postcondition: A new node is created
				   Head points to the new node
	**/
	public void push(int newElem)
	{
		head = new Node(newElem, head);
	}

	/**
	Method to remove the top element
	Precondition: There must be a node in the list
				  If the list is empty an IllegalStateException is thrown
	Postcondition: head points to the next element in the list
				   and the value of the element is returned
	**/
	public int pop()
	{
		if(head == null)
		{
			throw new IllegalStateException();
		}
		else
		{
			int returnValue;
			returnValue = head.element;
			head = head.link;
			return returnValue;
		}
	}

	/**
	Method to check is the linked list is empty
	Precondition: A linked list must exist
	PostCondition: Returns true if the list is empty
				   Returns false if the list is not empty
	**/
	public boolean isEmpty()
	{
		return(head == null);
	}
}
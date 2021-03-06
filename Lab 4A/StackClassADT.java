//Donark Patel
//CSC 236
//Lab 4A

public interface StackClassADT<T>
{
	public abstract void initializeStack();
	public abstract boolean isEmptyStack();
	public abstract boolean isFullStack();
	public abstract void push(T newElement) throws StackOverflowException;
	public abstract T peek() throws StackUnderflowException;
	public abstract void pop()throws StackUnderflowException;
}
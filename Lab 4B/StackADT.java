//Donark Patel
//CSC 236
//Lab 4B

public interface StackADT<T>
{
	public abstract void push(int newElem);
	public abstract int pop () throws IllegalStateException;
	public abstract boolean isEmpty();
}
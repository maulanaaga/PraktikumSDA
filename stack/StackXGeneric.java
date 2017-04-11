public class StackXGeneric <E>
{
    private int maxSize; // size of stack array
    private E [] stackArray;
    private int top; // top of stack
    public StackXGeneric(int s) // constructor
    {
        // set array size
        // menggunakan conditional operator
        // jika true, ukuran stack x, jika tidak diubah menjadi 10
        maxSize = s > 0 ? s : 10;
        stackArray = (E[]) new Object[maxSize]; // create array
        top = -1; // no items yet
    }

    public void push(E j) // put item on top of stack
    {
        stackArray[++top] = j; // increment top, insert item
    }

    public E pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }

    public E peek() // peek at top of stack
    {
        return stackArray[top];
    }

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize-1);
    }
} // end class StackXGeneric
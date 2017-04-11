public class TesStackGeneric
{
    public static void main(String[] args)
    {
        StackXGeneric <Integer> theStack = new StackXGeneric <Integer>
            (10); // make new stack
        StackXGeneric <Character> stackChar = new StackXGeneric
            <Character> (10); // make new stack

        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while( !theStack.isEmpty() ) // until it's empty,
        { // delete item from stack
            Integer value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println("");

        stackChar.push('<'); // push items onto stack
        stackChar.push('a');
        stackChar.push('2');
        stackChar.push('>');

        while( !stackChar.isEmpty() ) // until it's empty,
        { // delete item from stack
            Character value = stackChar.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println("");
    } // end main()
}
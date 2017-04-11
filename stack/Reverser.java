class Reverser
{
    private String input; // input string
    private String output; // output string
    public Reverser() // constructor
    { input = ""; }

    public String doRev(String in) // reverse the string
    {
        input = in;
        int stackSize = input.length(); // get max stack size
        StackXGeneric <Character> theStack = new StackXGeneric
            <Character> (stackSize); // make stack
        for(int j=0; j<input.length(); j++)
        {
            char ch = input.charAt(j); // get a char from input
            theStack.push(ch); // push it
        }
        output = "";
        while( !theStack.isEmpty() )
        {
            char ch = theStack.pop(); // pop a char,
            output = output + ch; // append to output
        }
        return output;
    } // end doRev()
    public static void main(String [] ar)
    {
        Reverser kata = new Reverser();
        String katarev = kata.doRev("informatika unsyiah");
        System.out.println(katarev);
    }
} // end class Reverser
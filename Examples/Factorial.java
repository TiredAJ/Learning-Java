public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int N = 0;
        
        System.out.print("Please enter a value: ");
        //Gets the user's input & parses to int
        N = Integer.parseInt(System.console().readLine());

        System.out.println("Factorial of " + N + " is " + Factorial(N));
    }

    public static int Factorial(int _N)
    {
        if (_N == 0) //checks if _N is 0
        {return 1;}
        else
        {return (_N * Factorial(_N-1));} //Recursive call
    }
}

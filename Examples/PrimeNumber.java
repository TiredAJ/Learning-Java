public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int I, M = 0, Flag = 0;
        int N = 0;

        System.out.print("Please enter an integer to check if it's a prime number: ");
        N = Integer.parseInt(System.console().readLine());

        M = N/2;

        if (N == 0 || N == 1)
        {System.out.println(N + " is not a prime number");}
        else
        {
            for(I = 2; I <= M; I++)
            {
                if (N % I == 0)
                {
                    System.out.println(N + " is not a prime number");
                    Flag = 1;
                    break;
                }
            }
            if (Flag == 0)
            {System.out.println(N + " is a prime number");}
        }
    }
}

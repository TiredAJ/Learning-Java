public class Fibonacci 
{
    public static void main(String[] args) throws Exception 
    {
        int N1 = 0, N2 = 1, N3, I = 0, Max = 100;

        System.out.print("How many values would you like?: ");
        Max = Integer.parseInt(System.console().readLine());

        System.out.println();
        System.out.println(N1);
        System.out.println(N2);

        for(I = 0; I <= Max; I++)
        {
            N3 = N1 + N2;

            System.out.println(N3);

            N1 = N2;
            N2 = N3;
        }
    }
}

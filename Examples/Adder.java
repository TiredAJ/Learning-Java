public class Adder 
{
    public static void main(String[] args) throws Exception 
    {
        int A, B;

        System.out.print("Please enter a value for A: ");
        A = Integer.parseInt(System.console().readLine());

        System.out.print("Please enter a value for B: ");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("the result is " + (A + B));
    }
}

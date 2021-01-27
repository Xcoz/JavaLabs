public class Prime
{
    public static void main(String[] args)
    {
        for(int i = 2; i < 100; i++)
            if (IsPrime(i)) {
                System.out.println(i);
            }
    }
    public static boolean IsPrime(int n)
    {
        boolean isPrime = true;
        for(int j = 2; j < n; j++)
        {

            if(n % j == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
}

public class FibonacciNumber{
    
    static int fib(int n)
    {
        if (n==0||n==1)
            return 0;
      else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]){
        int n;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                System.out.println(fib(n));
            } catch (NumberFormatException e) {
                System.err.println("input" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
 }
import java.util.*;

class Program {
    public static double handed(double x, int k)
    {
        double result = 1;
        int temp = 2;
        double shag = -1*temp*(temp+1)*x/2;
        double eps = Math.pow(10, -(k+1));
        while(Math.abs(shag) > eps) {
            result += shag;
            shag = -1 * shag*x/temp;
            temp++;
            shag *= (temp+1);
        }
        return result;
    }

    public static double system_usage(double x)
    {
        double sum;
        sum = 1 / Math.pow((1 + x), 3);

        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number K: ");
        int k = in.nextInt();

        System.out.print("Input a number X: ");
        double x = in.nextDouble();

        double handed_sum = handed(x, k);
        double system_sum = system_usage(x);

        Formatter fmt = new Formatter();
        fmt.format("Your system sum: %.3f\n", system_sum);
        fmt.format("Your handed sum: %.3f", handed_sum);
        System.out.println(fmt);
        in.close();
    }
}
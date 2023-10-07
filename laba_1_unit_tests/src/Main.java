import java.text.NumberFormat;
import java.util.*;
import java.io.*;
public class Main {

    private double x;
    private double epsilon;
    private int k;
    public Main(double x, int k) {
        this.x = x;
        this.k = k;
        epsilon = Math.pow(10, -k);

    }
    public Main() {
        this.x = 0;
        this.k = 0;
        epsilon = 0;

    }

    public static double calculateSystemSolution(double x) {
        return 1 / Math.pow((1 + x), 3);
    }
    public static double calculateMySolution(int k, double x) {
        double result = 1;
        int temp = 2;
        double shag = -1 * temp * (temp + 1) * x / 2;
        double eps = Math.pow(10, -(k + 1));
        while(Math.abs(shag) > eps) {
            result += shag;
            shag = -1 * shag * x / temp;
            temp++;
            shag *= (temp + 1);
        }
        return result;
    }
    public static void printResult(double x, int k){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k + 1);

        System.out.println("System result:");
        System.out.println(formatter.format(calculateSystemSolution(x)));

        System.out.println("My result:");
        System.out.println(formatter.format(calculateMySolution(k, x)));
    }


    public static void main(String[] args){
        double x = 0;
        double epsilon = 0;
        int k = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Enter k:");
            k = Integer.parseInt(br.readLine());
            System.out.println("Enter x:");
            x = Double.parseDouble(br.readLine());
            epsilon = Math.pow(10, -k);
        }
        catch (NumberFormatException e) {
            System.out.println("It is not int num");
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println("Error of reading from keyboard");
            System.exit(1);
        }
        if (x > 1 || x < -1){
            System.out.println("x is not in (-1,1)");
            System.exit(1);
        }
        printResult(x, k);
    }
}
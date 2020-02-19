package app;
        import java.util.Scanner;
public class lesson1 {
    public static void main(String args[]){
        System.out.println("Enter the variables:");

        float a;
        float b;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();

        System.out.println("The sum of the variables:");
        System.out.println(a+b);

    }
}

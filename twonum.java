import java.util.Scanner;
 public class twonum
 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number");
        
        int num1=input.nextInt();
        System.out.println("Enter Second Number");
        int num2=input.nextInt();
        int add;
        add=num1+num2;
        System.out.println("Sum of Two number is "+add);
    }
 }
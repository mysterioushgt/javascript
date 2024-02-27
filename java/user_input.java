import java.util.Scanner;
public class user_input{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no 1");
        int a=sc.nextInt();
        System.out.println("enter no 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        
        System.out.println("enter name");
        String str=sc.nextLine();
        System.out.println(str);


        // boolean b1=sc.hasNextInt();
        // System.out.println(b1);


    }
}
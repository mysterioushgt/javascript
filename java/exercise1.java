import java.util.Scanner;
public class exercise1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of math");
        int num1=sc.nextInt();
        System.out.println("enter the marks of hindi");
        int num2=sc.nextInt();
        System.out.println("enter the marks of english");
        int num3=sc.nextInt();
        System.out.println("enter the marks of science");
        int num4=sc.nextInt();
        System.out.println("enter the marks of sst");
        int num5=sc.nextInt();
        System.out.println("enter the total marks");
        int total_marks=sc.nextInt();
        System.out.println("obtained marks is"); 
        int obtained_marks=num1+num2+num3+num4+num5;
        System.out.println(obtained_marks);
        float percentage=(obtained_marks*100)/(total_marks*5);
                System.out.println(percentage);



    }
}
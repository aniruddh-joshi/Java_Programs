import java.util.Scanner;
class Demo{
    public static void main(String ags[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for a = ");
        a=sc.nextInt();
        System.out.println("Enter the number for b = ");
        b=sc.nextInt();
        int t=a;
            a=b;
            b=t;
    System.out.println("Swapped number for a = "+a);
    System.out.println("Swapped number for b = "+b);
    }
}
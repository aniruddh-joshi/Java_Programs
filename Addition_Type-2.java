import java.util.Scanner;
class Add{
    public static void main(String arg[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();
        c=addition(a,b);
        System.out.println("Addition of two numbers is: "+c);
    }
    public static int addition(int x,int y){
        return x+y;
    }

}
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number a = ");
    a=sc.nextInt();
    System.out.print("Enter the nummer b = ");
    b=sc.nextInt();
    int ar[]={a,b};
    swapint(a,b);
    swapar(ar);

    System.out.println("Swap Int Number a: "+a);
    System.out.println("Swap Int Number b: "+b);
    
    System.out.println("Swap Arr Number a: "+ar[0]);
    System.out.println("Swap Arr Number b: "+ar[1]);

    }
    public static void swapint(int x,int y){
        int t=x;
            x=y;
            y=t;
    }
    public static void swapar(int ar_x[]){
        int t=ar_x[0];
        ar_x[0]=ar_x[1];
        ar_x[1]=t;
    }
}
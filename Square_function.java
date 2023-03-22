import java.util.Scanner;
class square{
    public static void main(String args[]){
        int a,sq;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();
        sq=square_root(a);
        System.out.println("Square of the number is: "+sq);
    }
    public static int square_root(int x){
    return (x*x);
}
}
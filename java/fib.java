import java.util.Scanner;
class a{
	public static void main(String [] aaaa){
 int k =0,a=0,b=1;
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();

if (n == 0) {
	System.out.print("0");
} else if (n == 1) {
	System.out.print("1");
}
 while(k<=n){
 
 k=a+b;
 System.out.print(k+" ");
a=b;
b=k;
 }

}}

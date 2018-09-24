import java.util.Scanner;
class a{
	public static void main(String [] aaaa){
 int k =0,a=0,b=1;
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();

System.out.print("0 1 ");
 while(k<=n){
 
 k=a+b;
 System.out.print(k+" ");
a=b;
b=k;
 }

}}
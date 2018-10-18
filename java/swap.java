import java.util.Scanner;
class a {
	public static void main(String [] aa){
		Scanner sc = new Scanner(System.out);
		int a = sc.nextInt();
		int b=sc.nextInt();

	// b=a+b;
	// a=b-a;
	// b=b-a;

	// a=a*b;
	// b=a/b;
	// a=a/b ;

		//b=a+b-(a=b);
		
		//using 3rd Variable
		int c = a;
		a = b;
		b = c;

System.out.print(a+"   "+b);

	}
}

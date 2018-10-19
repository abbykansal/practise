import java.util.*; 
class a{
	
	public static void main(String [] a){
		Scanner sc = new Scanner(System.out);
		int a = sc.nextInt();

		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5-r;c++){
				System.out.print(" ");
			}

			for(int i=1 ;i<=r;i++){
					System.out.print("* ");
}

		System.out.println("");
		}
	}
}

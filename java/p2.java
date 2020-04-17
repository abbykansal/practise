import java.util.*; 
class a{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.out);
		int a = sc.nextInt();

		for(int r=1;r<=a;r++)
		{
			for(int c=1;c<=a-r;c++){
				System.out.print(" ");
			}

			for(int i=1 ;i<=r;i++){
					System.out.print("* ");
}

		System.out.println("");
		}
	}
}

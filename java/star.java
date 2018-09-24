 class star{
	public static void main(String [] a){

		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5-r;c++){
				System.out.print(" ");
			}

			for(int i=1 ;i<=r;i++){
					System.out.print("*");

			}
			for(int j=1;j<=r-1;j++)
			System.out.print("*");

		System.out.println("");
		}
	}
}
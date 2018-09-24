 class bnryptrn{
	public static void main(String [] a){
int k;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++){

			if((r+c)%2==0)
				k=1;
			else k=0;
				System.out.print(k);
			}
			System.out.println(" ");
		}
	}
}
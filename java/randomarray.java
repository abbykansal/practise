import java.util.*;
class a {
	public static void main(String [] aa){
		Random r = new Random();
			int a[] = new int[5];

			for(int j=0;j<a.length;j++)
				a[j] = r.nextInt(50);

			for(int i :a)
				System.out.print(i+"      ");

	}}
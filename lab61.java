import java.util.*;

public class lab61 {

	public static void main(String ar[])

	{   

		Scanner s=new Scanner(System.in);

		int i,j;

		int c[][]=new int[2][2];

		int a[][]=new int[2][2];

		int b[][]=new int[2][2];

		System.out.println("Enter the A matrix=");

		for(i=0;i<2;i++)

		{

			for(j=0;j<2;j++)

			{

				a[i][j]=s.nextInt();

			}

		}

		System.out.println("Enter the B matrix=");

		for(i=0;i<2;i++)

		{

			for(j=0;j<2;j++)

			{

				b[i][j]=s.nextInt();

			}

		}

	

		for(i=0;i<2;i++)

		{

			for(j=0;j<2;j++)

			{

				c[i][j]=a[i][j]+b[i][j];

			}

		}

		System.out.println(" The Resultant matrix=");

		for(i=0;i<2;i++)

		{

			for(j=0;j<2;j++)

			{

				System.out.print(c[i][j]+" ");

			}

			System.out.println();

		}

	}



}

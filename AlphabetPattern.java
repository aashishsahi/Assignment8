import java.util.Scanner;
public class AlphabetPattern {
	
	public static void Make(int n)
	{
		char ch = 'a';
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch + " ");
				ch++;
			}
			ch = 'a';
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n = sc.nextInt();
		sc.close();
		Make(n);
		

	}

}

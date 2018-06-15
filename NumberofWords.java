import java.util.Scanner;
public class NumberofWords {
	
	
	public static void Count(String s)
	{
		int i = 1;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)==' ')
			{
				i++;
			}
		}
		System.out.println("Number of words in string is: " + i);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Enter string: ");
		s = sc.nextLine();
		sc.close();
		Count(s);

	}

}

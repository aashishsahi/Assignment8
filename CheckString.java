import java.util.Scanner;
public class CheckString {
	
	public static void Check(String str, String s)
	{
		int k, f = 0, j;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==s.charAt(0))
			{
				k = 0;
				for(j=i;j<str.length() && k<s.length();j++)
				{
					if(str.charAt(j)!=s.charAt(k))
					{
						f = 1;
						break;
					}
						
					k++;
					
				}
				f = 0;
				if(k==s.length())
				{
					f=1;
					System.out.println("String is found");
					break;
				}
				
			}
		}
		if(f==0)
		{
			System.out.println("String not found");
		}
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str, s;
		System.out.print("Enter 1st string: ");
		str = sc.nextLine();
		System.out.print("Enter string to be searched: ");
		s = sc.nextLine();
		sc.close();
		Check(str, s);

		

	}

}

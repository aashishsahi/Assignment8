import java.util.Scanner;
public class RemoveVowel {
	
	public static void Remove(String s)
	{
		String NewStr="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')
			{
				NewStr = NewStr + s.charAt(i);
			}
		}
		System.out.println("String without vowels: " + NewStr);
	}

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		str = sc.nextLine();
		sc.close();
		Remove(str);

	}

}

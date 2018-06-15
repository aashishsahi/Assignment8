import java.util.Scanner;
public class ReverseString {
	
	public static void Reverse(String s)
	{
		int i = 0;
		String StrNew="", word="";
		while(i<(s.length()))
		{
			if(s.charAt(i)==' ')
			{
				if(StrNew!="" && word!="")
				{
					StrNew = word + " " + StrNew;
				}
				if(StrNew=="" && word!="")
				{
					StrNew = word;
				}
				
				word = "";
			}
			else
			{
				word = word + s.charAt(i);
			}
			i++;
		}
		if(StrNew!="" && word!="")
		{
			StrNew = word + " " + StrNew;
		}
		if(StrNew=="" && word!="")
		{
			StrNew = word;
		}
		
		System.out.println("Reverse string: " + StrNew);
	}

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		str = sc.nextLine();
		sc.close();
		Reverse(str);

	}

}

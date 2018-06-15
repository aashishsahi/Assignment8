import java.util.Scanner;
public class Substring {
	
	
	public static void Sub(String s)
	{
		
		int n = s.length();
		for (int c = 1; c <= n; c++) 
	    {    
	        
	        for (int i = 0; i <= n - c; i++) 
	        {
	            int j = i + c - 1;            
	            for (int k = i; k <= j; k++) 
	            {
	            	System.out.print(s.charAt(k));
	            }
	             
	            System.out.println();
	        }
	    }
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Enter string: ");
		s = sc.next();
		sc.close();
		Sub(s);

	}

}

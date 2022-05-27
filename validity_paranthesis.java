import java.util.*;
class Solution{
    public  static boolean validity(String Str)
	{
		Stack<Character> s=new  Stack<Character>();
		for( char ch :Str.toCharArray())
		{
			if (ch=='('|| ch=='{' || ch=='[')
			{
				s.push(ch);
			}
			else
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{ 
					char top= s.peek();
					if( ch==')'&& top=='('|| ch=='}'&& top=='{' || ch==']'&& top=='[')
					{
						s.pop();
					}
					else
					{
						return false;
					}

				}
			}
		}
		if (s.isEmpty())
		{
			return true;
		}
		else
		{ 
			return false;
		}

	}


	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(validity(input));
            
		}
		sc.close();
		
	}
}

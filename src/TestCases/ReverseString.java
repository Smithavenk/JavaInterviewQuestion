package TestCases;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String s="Smitha";
	int Len = s.length();
	String rev="";
	for(int i=Len-1;i>=0;i--)
	{
		rev=rev + s.charAt(i);
	}
	System.out.print("rev");


//string stringbuffer
 StringBuffer sf= new StringBuffer(s);
	System.out.print(sf.reverse());
}
}



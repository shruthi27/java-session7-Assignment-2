package substring;

public class SubStrings 
{
	public static void main(String[] args)
	{
	//we are going to print all substrings of given string
	String string = "sampletext";
	for(int x=1;x<=string.length();x++)//*1
	{
		for(int y=0;y<=string.length();x++)//*2
		{
			int z=y+x;//*3
			if(z<=string.length())
			{
				//predifined method to get it
				System.out.println(string.substring(y, z));
			}
		}
	}
}
}
	


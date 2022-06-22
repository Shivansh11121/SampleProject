package demo2;

public class Occurance_Of_character {

	public static void main(String[] args) 
	{
		String s="Java is a Programing Language";
		int total_length=s.length();
		int total_length_afterremoving=s.replace("a","").length();
		int len=total_length-total_length_afterremoving;
		System.out.println("Occurance of a=" +len);
	}

}

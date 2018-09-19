
public class StringAPIQuestions
{

	public static void main(String[] args) 
	{
		String river = "Mississippi";
		int numberOfCharacters = river.length();
		System.out.println(numberOfCharacters);
		
		String greeting = "Hello, World";
		String upperGreeting = greeting.toUpperCase();
		System.out.println(upperGreeting);
		
		//the method println() is undefined for the String class (it is only a method for the PrintSteam class), so it is illegal to call this method in this class.
		
		String changeLetters = river.replace("p", "s");
		System.out.println(changeLetters);
		//the replace method has 2 arguments, "p" and "s"
			
		String upperRiver = river.toUpperCase();
		System.out.println(upperRiver);
		
		
		
		
		
	}

}

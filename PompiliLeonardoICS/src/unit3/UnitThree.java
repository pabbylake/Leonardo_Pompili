package unit3;

public class UnitThree 
{

	public static void main(String[] args)
	{
		//Variables - 3.1
		//Declarations of variables
		
		//Two Main Types - Primitives & Objects
		//Primitives are simple data types
		//Objects are complex data types
		
		//Primitives
		int value; //declaring an integer (size = 4 bytes)
		double cost; //declaring a double (size 8 bytes) - decimal value
		boolean isFull; //declaring a boolean (size 1 bit) - true or false
		char character; //declaring a char
		
		//objects
		Integer valueObject; //wrapper class
		Double costObject;
		Boolean isFullObject;
		Character characterObject;
		
		String name;
		
		//Variable Assignment - 3.2
		value = 10;  //assignments
		cost = 4.38;
		isFull = true;
		character = 'c';
		
		//Object Assignment
		valueObject = 10; //same as valueObject = new Integer(10);
		costObject = 4.38; //same as costObject = new Double(4.38);
		isFullObject = true; //same as isFullObject = new Boolean(true);
		characterObject = 'c'; //same ascharacterObject - new Character('c');
		
		
		name = "Leo"; //String literal
		name = new String("Leo"); //mostly going to use these two
		
		//Type Conversions - 3.3
		//Casting - converting from one type to another
		
		cost = (double)value; //automatic cast turns integer into a double = 10.0 | Called a widening conversion
		
		value = (int)cost; //4.38 turns into 4 - called truncating, which deletes the decimal point, NOT ROUNDING
		
		String input = "25";
		int inputInt = Integer.parseInt(input);
		double inputDouble = Double.parseDouble(input);
		
		input = String.valueOf(inputInt); //takes 25 and turns it into a string
		
		System.out.println(cost);
		System.out.println(value);
		
		//Variable Calculations - 3.4
		
		//Order of Operations:
		//Parentheses, Exponent, {Multiply, Divide Modulus}, {Add, Subtract}
		//Example 1
		//value = 10 / 3 * 2 % (8 % 4); bad code
		//10 / 4 * 2 % 0
		//3 * 2 % 0
		//6 % 0 Error - Divide by zero exception
		//System.out.println(value);
		
	
		//Example 2
		value = ((6-2) / (6/3)) % (2%5) / (9/3);
		System.out.println(value);
		
		
		//Mixing Types
		//Example 3
		int n = 6;
		double result;
		result = (n+2) * n / 2; //24.0
		System.out.println(result);
		result = (n / 2) * (n - 1); //15.0
		System.out.println(result);
		result = (n / 7) * n * (n + 2); //0.0
		System.out.println(result);
		

		//Example 4
		int a=2, b = 3;
		double ratio;
		ratio = (double)a / b; //2.0/3.0 = 0.66666666667
		System.out.println(ratio);
		ratio = (double)(b / a);
		System.out.print(ratio);
		
		//Compound Operations
		//Example 5
		a +=4; //a = 6
		b +=a; //b = 9
		a *=3; //a = 18
		b %=a; //b = 9
		a -=b; //b = 9
		System.out.println(a + " " + b + 10 + true + new Integer(11)); //concatenating of String with numbers
		
		
	
		//Example 6
		a = 2;
		b = 4;
		int c = 6;
		a -= b + c; //a = -8
		b *= a + c; //b = -8
		c += a + b; //c = -10
		System.out.println(a + "\n" + b + c);
		
		
		
		
		//Pre/Post Incrementing and Decrementing - ONLY 1
		//Example 7
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(b++);
		System.out.println(b--);
		a +=b++;
		b -= ++a;
		System.out.println(a + " " + b );
		
		//3.5 Strings Mr. Lake in person on white board notes
		
		//String S = "Hello";
		//String S2 = new String("Hello");
		
		//a) Length => S.length () 5
		//b) charAt    H (0) E (1) L (2) L (3) O (4) 
		//c) Substring
		
		
		//Strings - 3.5
		//All about Strings
		//Strings are immutable - unchangeable
		//Strings are immutable sequences of characters
		
		//create a String
		String classDescription = "Geometry is a good class"; //literal
		String classDescription2 = new String("Gemoetry is a good class"); //constructor
		/*
		 * String API methods:
		 * length(), charAt(i), substring (i,j), indexOf ("x"),
		 * equals("other"), compareTo("other");
		 * 
		 * indexOf("x) and charAt(i) use indices
		 * Visualization of indexOf("x") and charAt(i) - each index corresponds to a character
		 * [G] [e] [o] [m] [e] [t] [r] [y] [] [i] [s] [] [a] [] [g] [o] [o] [d] [] [c] [l] [a] [s] [s]
		 *  0   1   2   3   4   5   6   7   8  9  10  11 12 13  14  15  16  17  18  19  20  21  22  23
		 *  
		 * substring(i,j) and substring(i) use a half close interval [i,j) for the indices
		 *  | G | e | o | m | e | t | r | y |  | i | s |  | a |  | g | o | o | d |  | c | l | a | s | s |
		 *  0   1   2   3   4   5   6   7   8  9  10  11  12  13 14  15  16  17 18  19 20  21  22  23  24
		 *  
		 */
		
		//Example 4:- Draw the console output and write code to print the sentences
		System.out.println(classDescription.length());
		System.out.println(classDescription.charAt(14) + classDescription.substring(20));
		System.out.println(classDescription.substring(5, 8) + classDescription.charAt(8) +classDescription.substring(3, 5));
		System.out.println(classDescription.indexOf("odd"));
		System.out.println(classDescription.indexOf("o"));
		System.out.println(classDescription.indexOf("met"));
		System.out.println(classDescription.equals(classDescription2));
		System.out.println(classDescription.indexOf("try"));
		System.out.println(classDescription.substring(0));
		System.out.println(classDescription.substring(0,24));
		//System.out.println(classDescription.substring(0, 30)); Bad Code
		
		/*
		 * compareTo is a stronger comparison than equals.
		 * It uses lexicographical("kinda" alphabetical) ordering for Strings
		 * compareTo returns
		 *  - 0 if the two Strings have the same characters in the same order
		 *  - negative if the first String comes before the second
		 *  - positive if the first String comes after the second
		 */

		 System.out.println("Hello".compareTo("hello")); //A,B,C,D,...Z,a,b,c,d,...z
		 System.out.println("hello".compareTo("hello"));
		 System.out.println("he".compareTo("hello"));
		
		/* Other useful String methods;
		 * toCharArray(), replace(oldCharm newChar), replaceAll(regex, replacement), isEmplty(),
		 * startsWith(prefix), endsWith(suffix), toUpperCase(), toLowerCase(), trim()
		 * 
		 * Write a line of code to print the following sentences using only classDescription
		 * 
		 * 1. "I am tall
		 * 2. "Try to get good rest"
		 * 3. "Meet me at class"
		 * 4. "It is oddly a game"
		 * 5. "I am last to get a retro style"
		 * 
		 * Visualization of indexOf("x") and charAt(i) - each index corresponds to a character
		 * [G] [e] [o] [m] [e] [t] [r] [y] [] [i] [s] [] [a] [] [g] [o] [o] [d] [] [c] [l] [a] [s] [s]
		 *  0   1   2   3   4   5   6   7   8  9  10  11 12 13  14  15  16  17  18  19  20  21  22  23
		 *  
		 * substring(i,j) and substring(i) use a half close interval [i,j) for the indices
		 *  | G | e | o | m | e | t | r | y |  | i | s |  | a |  | g | o | o | d |  | c | l | a | s | s |
		 *  0   1   2   3   4   5   6   7   8  9  10  11  12  13 14  15  16  17 18  19 20  21  22  23  24
		 */
		
		//I am tall
		System.out.println(classDescription.substring(9,10).toUpperCase()+ classDescription.substring(8, 9)
		+ classDescription.charAt(12)+ classDescription.charAt(3)+ classDescription.charAt(8)
		+ classDescription.charAt(5)+ classDescription.charAt(12)+ classDescription.charAt(20)
		+ classDescription.charAt(20));
		
		//Try to get good rest
		System.out.println(classDescription.substring(5, 6).toUpperCase() + classDescription.charAt(6) + classDescription.charAt(7)
		+ classDescription.charAt(8) + classDescription.charAt(5) + classDescription.charAt(15)
		+ classDescription.charAt(8) + classDescription.charAt(14) + classDescription.charAt(4)
		+ classDescription.charAt(5) + classDescription.charAt(8) + classDescription.charAt(14)
		+ classDescription.charAt(15) + classDescription.charAt(16) + classDescription.charAt(17)
		+ classDescription.charAt(8) + classDescription.charAt(6) + classDescription.charAt(4)
		+ classDescription.charAt(10) + classDescription.charAt(5));
	
		//Meet me at class
		System.out.println(classDescription.substring(3, 4).toUpperCase() + classDescription.charAt(4) + classDescription.charAt(4)
		+ classDescription.charAt(5) + classDescription.charAt(8)
		+ classDescription.charAt(3) + classDescription.charAt(4)
		+ classDescription.charAt(8) + classDescription.charAt(12) + classDescription.charAt(5)
		+ classDescription.charAt(8) + classDescription.charAt(19)
		+ classDescription.charAt(20) + classDescription.charAt(21)
		+ classDescription.charAt(22) + classDescription.charAt(23));
	
		//It is oddly a game
		System.out.println(classDescription.substring(9, 10).toUpperCase()+ classDescription.charAt(5)+ classDescription.charAt(8)
		+ classDescription.charAt(9)+ classDescription.charAt(10)+ classDescription.charAt(8)+ classDescription.charAt(2)+ classDescription.charAt(17)
		+ classDescription.charAt(17)+ classDescription.charAt(20)+ classDescription.charAt(7)+ classDescription.charAt(8)+ classDescription.charAt(12)
		+ classDescription.charAt(8)+ classDescription.charAt(14)+ classDescription.charAt(12)+ classDescription.charAt(3)
		+ classDescription.charAt(4));
		
		//I am last to get a retro style
		System.out.println(classDescription.substring(9,10).toUpperCase() + classDescription.charAt(8)
		+ classDescription.charAt(12) + classDescription.charAt(3) + classDescription.charAt(8)
		+ classDescription.charAt(20) + classDescription.charAt(12) + classDescription.charAt(22)
		+ classDescription.charAt(5) + classDescription.charAt(8) + classDescription.charAt(5)
		+ classDescription.charAt(2) + classDescription.charAt(8) + classDescription.charAt(14)
		+ classDescription.charAt(4) + classDescription.charAt(5) + classDescription.charAt(8)
		+ classDescription.charAt(12) + classDescription.charAt(8) + classDescription.charAt(6)
		+ classDescription.charAt(4) + classDescription.charAt(5) + classDescription.charAt(6)
		+ classDescription.charAt(2) + classDescription.charAt(8) + classDescription.charAt(22)
		+ classDescription.charAt(5) + classDescription.charAt(7) + classDescription.charAt(20)
		+ classDescription.charAt(4));
		
		
		
		
	}
	

}

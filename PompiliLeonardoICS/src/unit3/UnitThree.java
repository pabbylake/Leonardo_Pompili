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
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		

	}

}

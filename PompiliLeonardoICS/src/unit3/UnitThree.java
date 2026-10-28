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

	}

}

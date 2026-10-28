package unit3;

public class UnitThree {

	public static void main(String[] args) 
	{
        // ICS UNIT 3.1: DECLARING VARIABLES

        // 1. INTEGER (int)

        // Stores whole numbers; uses 4 bytes

        int age = 15;

        int score = 100;

        // 2. DOUBLE (double)

        // Stores decimal numbers; uses 8 bytes

        double price = 9.99;

        double height = 5.8;

        // 3. BOOLEAN (boolean)

        // Stores true or false

        boolean isReady = true;

        boolean isFinished = false;

        // 4. CHARACTER (char)

        // Stores one character

        char grade = 'A';

        // 5. STRING

        // Stores text

        String name = "Alex";

        // 6. WRAPPER CLASSES

        Integer valueObject = 10;

        Double costObject = 4.5;

        Boolean isFullObject = true;

        Character characterObject = 'B';

        // ICS UNIT 3.2: VARIABLE ASSIGNMENT

        // 7. DECLARING VARIABLES

        int number;

        double decimal;

        boolean answer;

        // 8. ASSIGNING VALUES

        number = 10;

        decimal = 3.14;

        answer = true;

        // 9. CHANGING A VARIABLE'S VALUE

        score = 85;

        // 10. VARIABLE CALCULATIONS

        int x = 10;

        int y = 5;

        int sum = x + y;           // 15

        int difference = x - y;    // 5

        int product = x * y;       // 50

        int quotient = x / y;      // 2

        // 11. ASSIGNING ONE VARIABLE TO ANOTHER

        int a = 7;

        int b = a;

        // 12. UPDATING A VARIABLE

        int points = 10;

        points = points + 5;       // 15

        // ICS UNIT 3.3: TYPE CONVERSION

        // 13. WIDENING CONVERSION

        // int to double happens automatically

        int wholeNumber = 10;

        double widenedNumber = wholeNumber;

        // widenedNumber is 10.0

        // 14. NARROWING CONVERSION (CASTING)

        // double to int requires casting

        double originalPrice = 9.99;

        int wholePrice = (int) originalPrice;

        // wholePrice is 9

        // 15. EXPLICIT CASTING

        double testScore = 95.8;

        int roundedDownScore = (int) testScore;

        // roundedDownScore is 95

        // Casting removes the decimal part; it does not round.

        // 16. INTEGER DIVISION

        int result = 7 / 2;

        // result is 3, not 3.5

        // 17. GETTING A DECIMAL RESULT

        double decimalAnswer = 7.0 / 2;

        // decimalAnswer is 3.5

        // 18. PRINTING VARIABLES

        System.out.println(age);

        System.out.println(score);

        System.out.println(price);

        System.out.println(height);

        System.out.println(isReady);

        System.out.println(isFinished);

        System.out.println(grade);

        System.out.println(name);

        System.out.println(sum);

        System.out.println(difference);

        System.out.println(product);

        System.out.println(quotient);

        System.out.println(points);

        System.out.println(widenedNumber);

        System.out.println(wholePrice);

        System.out.println(roundedDownScore);

        System.out.println(result);

        System.out.println(decimalAnswer);

        // IMPORTANT RULES

        // int = whole numbers

        // double = decimal numbers

        // boolean = true or false

        // char = one character

        // String = text

        // = assigns a value

        // Widening = smaller type to larger type

        // Narrowing = larger type to smaller type

        // (int) converts a value to an integer

        // Integer division removes the decimal part

	}

}

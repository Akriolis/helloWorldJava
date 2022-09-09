public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(2+3);
        int passenger;
        passenger = 0;
        // int newPassenger = 1; - initializing variable
        passenger = passenger + 5;
        passenger = passenger - 3;
        passenger = passenger -1 + 5;
        System.out.println(passenger);
        String driver = "Hamish"; // string literal
        int letters = driver.length();
        System.out.println(letters);
        driver = driver.toUpperCase();
        System.out.println(driver);
        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName = "Blake";
        String driverFullName = driverFirstName + " " + driverLastName;
        // string concatenation
        System.out.println(driverFullName);
        int stops = 3;
        int fare = 15;
        System.out.println("The bus made $"+fare+" after "+stops+" stops");
        // lowerCamelCase and UpperCamelCase
        int x = 2 + 3;
        int y = 1-5;
        int z = x*y;
        System.out.println(z);
        int paid = 10;
        double change = 3.25;
        double tip = (paid-change)*0.2;
        System.out.println(tip);
        double div =  5/2; // = 2 due to Truncation
        // casting
        double future = 25.5;
        int approx = (int) future;
        System.out.println(approx); // = 25
        int myX = 5;
        int myY = 2;
        int div2 = myX/myY;
        double moreAccurate = (double) 5/2;
        System.out.println(div2);
        System.out.println(moreAccurate);

    }
}
// .out. means output
// 1. Java is case-sensitive
// 2. Quotation marks display the message as is
// 3. ; means end of statement

// 1. variable names are case-sensitive
// 2. start variable names with a letter
// 3. cannot have white spaces

// basic Java number types
// Integer (int), Long (long), Double (double)

//basic Java text types
// String (String, ""), Character (char, '') - char can save only one symbol, so
// code char ten = '10' doesn't comply

//basic Java decision type
// Boolean (boolean, true or false)

//variable arithmetic
// int x = 2 + 3; addition
// int y = 4 - 5; subtraction
// int days = 7*4; multiplication
// double div = 5/2; division

// comments are the same as in Kotlin - // and /* */



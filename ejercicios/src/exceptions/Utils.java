package exceptions;

public class Utils {

	/**
	 * Calculate division of two numbers
	 *
	 * @param numerator.
	 * @param denominator.
	 * 
	 * @return the result of the division. 
	 * @throws ArithmeticException if denominator is zero.
	 */
    public static double divide(double numerator, double denominator) {

		if (0 == denominator) {
			throw new ArithmeticException("Denominator cannot be zero");
		}

    	return numerator / denominator;
    }
    
	/**
	 * Calculate the addition of two numbers
	 *
	 * @param value1.
	 * @param value1.
	 * 
	 * @return the result of the addition. 
	 * @throws ArithmeticException if return value is higher than max value of a int
	 */
    public static int add(int value1, int value2) {
		
		int total = value1 + value2;

		if (value1 > Integer.MAX_VALUE || value2 > Integer.MAX_VALUE || total > Integer.MAX_VALUE) {
            throw new ArithmeticException("Return value is higher than max value of a int");
        }

        return total;
    }
    
	/**
	 * Calculate the square root of a number
	 *
	 * @param value to calculate the square root.
	 * 
	 * @return the result of the addition. 
	 * @throws ArithmeticException if value is negative number
	 */
    public static double squareRoot(double value) {

		if (value < 0) {
            throw new ArithmeticException("Value cannot be negative");
        }

        return Math.sqrt(value); 
    }
    
	/**
	 * Calculate the length of a text
	 *
	 * @param text to calculate the length.
	 * 
	 * @return the length of the text 
	 * @throws NullPointerException if text is null.
	 */
    public static int calculateTextLength(String text) {
    	
		if (text == null) {
            throw new NullPointerException("Text cannot be null");
        }

        return text.length();
    }
    

    public static String getWeekdayByIndex(int index) {
    	String [] weekdays = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};

		if (index < 0 || index > weekdays.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    	
    	return weekdays[index];
    }
}

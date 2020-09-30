import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		if ( Math.pow(number1 * number1, 0.5) <= 10 / 2 && Math.pow(number2 * number2, 0.5) <= 5.0 / 2)
			System.out.print("Point (" + number1 + "," + number2 + ") is in the rectangle");
		else
			System.out.print("Point (" + number1 + "," + number2 + ") is not in the rectangle");
	}
}	
		

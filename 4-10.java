import java.util.Scanner;
 
public class Birthday {
	public static void main(String[] args) {
		String set1 =
		" 1  3  5  7\n" +
		" 9 11 13 15\n" +
		" 17 19 21 23\n" +
		" 25 27 29 31";
 
		String set2 =
		" 2  3  6  7\n" +
		" 10 11 14 15\n" +
		" 18 19 22 23\n" +
		" 26 27 30 31";
 
		String set3 =
		" 4  5  6  7\n" +
		" 12 13 14 15\n" +
		" 20 21 22 23\n" +
		" 28 29 30 31";
 
		String set4 =
		" 8  9 10 11\n" +
		" 12 13 14 15\n" +
		" 24 25 26 27\n" +
		" 28 29 30 31";
 
		String set5 =
		" 16 17 18 19\n" +
		" 20 21 22 23\n" +
		" 24 25 26 27\n" +
		" 28 29 30 31";
 
		int day = 0;
 
		Scanner input = new Scanner(System.in);
 
		System.out.print("Is your birthday in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter N for No and Y for Yes: ");
		char x0 = input.next().charAt(0);
 
		if (x0 == 'Y')
			day += 1;
    
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter N for No and Y for Yes: ");
		char x1 = input.next().charAt(0);
 
		if (x1 == 'Y')
			day += 2;
		
		System.out.print("\nIs your birthday in Set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter N for No and Y for Yes: ");
		char x2 = input.next().charAt(0);
 
		if (x2 == 'Y')
			day += 4;

		System.out.print("\nIs your birthday in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter N for No and Y for Yes: ");
		char x3 = input.next().charAt(0);
    
		if (x3 == 'Y')
			day += 8;
		
		System.out.print("\nIs your birthday in Set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter N for No and Y for Yes: ");
		char x4 = input.next().charAt(0);
    
		if (x4 == 'Y')
			day += 16;
 
		System.out.println("\nYour birthday is " + day + "!");
	}
}
 
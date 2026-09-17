import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        int guess, off;
        
        System.out.println("I'm thinking of a number between 1 and 100(including both). ");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number: ");
        guess = in.nextInt ();

        
        if (guess == number) {
			
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			System.out.println("You are correct!");
			
			}else{
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			off = guess - number;
			off = Math.abs(off);
			System.out.print("You were off by: ");
			System.out.println(off);	
			System.out.print("Type a number: ");
			guess = in.nextInt ();
			
			if (guess == number) {
					
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			System.out.println("You are correct!");
			
			}else{
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			off = guess - number;
			off = Math.abs(off);
			System.out.print("You were off by: ");
			System.out.println(off);
			System.out.print("Type a number: ");
			guess = in.nextInt ();
			if (guess == number) {
				
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			System.out.println("You are correct!");
			
			}else{
			System.out.println(" ");
			System.out.print("Your guess is: ");
			System.out.println(guess);
			off = guess - number;
			off = Math.abs(off);
			System.out.print("You were off by: ");
			System.out.println(off);
			System.out.print("The number is: ");
			System.out.println(number);
			
			}
			}
			}
			
	
        
    }
}

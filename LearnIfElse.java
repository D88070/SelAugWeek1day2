package selAug2021week1.day1;

public class LearnIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1001;

		// if the condition is satisfied ( valuated to true)
		
		if (number == 0) {
			System.out.println(" The number is neutral");
		} else if (number % 2 != 0) { // remainder is not equal to zero
			System.out.println("The number is odd");
		} else {
			System.out.println("The number is even");
		}

	}

}

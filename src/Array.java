import java.util.Scanner;
/**
 * 
 * 
 * 
 * 
 * 
 */

/**
 * @author c.toy
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {13, 17, 20, 2, 6, 8, -3, 10};
		int index = -1;
		int userValue;
		

		
		System.out.print("These are your values: ");
		
		for(int i = 0; i < myArray.length; i++){

			System.out.print(myArray[i] + "  ");
			
	}
		System.out.println("\nPlease enter a value. ");
		userValue = userInput.nextInt();
		
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("This is not a value!");
		} else {
			System.out.println("Your value is " + index);
		}
			
		userInput.close();
		
	}
}

import java.util.Scanner;
public class NineHeadsAndTails {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println
		("Hi, this program is credited to page 309 exercise 8.11 \nof Liang 10th edition");
				
		
		//0 is heads, and 1 is tails in this program
		
		
		//create the table
		int[][] CoinTable = new int[3][3];
		
		
		//assign coins to the table
		for (int i = 0; i < CoinTable.length; i++) {
		CoinTable[i][i]	= i;
		
			
		}
		
		
		//Display desired coin sections on the table
		//Ask for user input
		System.out.println("Enter a number between 0 and 511: ");
		int CoinState = input.nextInt();
		
		for (int i = 0; i != 3; i++) {
			if (CoinTable[i][i] == 2) {
				CoinTable[i][i]--; }
			System.out.println(CoinTable[i][i] + " " + CoinTable[i][i] + " " + CoinTable[i][i]);
			
			
			
			}
		}
		
		

		
		
	}


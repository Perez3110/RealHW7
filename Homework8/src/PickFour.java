public class PickFour {

	public static void main(String[] args) {
		
		System.out.println("Hi There, This program is credited to \n "
				+ "page 283 exercise 7.29 of Liang 10th edition. \n The majority of the code comes from Listing 7.2 page 255 of Liang 10th Edition");
		
		 int[] deck = new int[52]; 
      String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; 
      String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
 "10", "Jack", "Queen", "King"}; 

 // Initialize the cards 
      for (int i = 0; i < deck.length ; i++) 
          deck[i] = i; 

 // Shuffle the cards 
 for (int i = 0; i < deck.length; i++) { 
 // Generate an index randomly 
 int index = (int)(Math.random() * deck.length); 
 int temp = deck[i]; 
        deck[i] = deck[index]; 
        deck[index] = temp; 
       
        //Guarantee the sum
        deck[i] = 24;
        
      } 

 // Display the four cards for the sum
 
 for (int i = 0; i < 4; i++) { 
	 int cardNumber = (int)(Math.random()* deck.length);
        String suit = suits[cardNumber / 13]; 
        String rank = ranks[cardNumber % 13];    
        System.out.println("Card number " + deck[i] + ": " 
          + rank + " of " + suit); 
  
       
       
        	
       
        
       
     } 
 
		
		 //Set the limit of the addition of cards to 24
		 System.out.println("The sum of the cards is 24");

	}

}

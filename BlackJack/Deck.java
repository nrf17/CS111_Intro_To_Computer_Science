// This class represents the deck of cards from which cards are dealt to players.
public class Deck
{
	
	Card [] deck;
	int index2;
	
	
	// This constructor builds a deck of 52 cards.
	public Deck()
	{
		int index = 0;
		this.index2 = 51;
		deck = new Card[52];
		for(int i = 0; i < 4; i++){
			for(int j = 1; j < 14; j++){
				deck[index] = new Card(i,j);
				index++;
			}
		}
		
	}

	
	// This method takes the top card off the deck and returns it.
	public Card deal()
	{
		Card topcard = deck[index2];
		index2--;
		return topcard;
	}
	
	
	// this method returns true if there are no more cards to deal, false otherwise
	public boolean isEmpty()
	{ // returns a boolean so if the deck is empty do not have to loop through
	
		if(index2 <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	//this method puts the deck int some random order
	public void shuffle(){
		int index1 = 0;
		index2 = 51;

		Card [] deck1 = new Card[52];
		while(index1 < 52){
			boolean check = false;
			int card = (int)(Math.random()*51);
			Card random = deck[card];
			for(int i = 0; i > index1; i++){
				if(random == deck1[i]){
					check = true;
					break;
				}
			}
			if(check == false){
				deck1[index1] = random;
				index1++;
			}
		}
		deck = deck1;
	}

	public String toString(){
		String result = "";
		for(int i = 0; i < 52; i++){
			result += "Card " + (i + 1) + " " + this.deck[i];
		}
		return result;
	}
}
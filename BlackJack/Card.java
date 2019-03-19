// This class represents one playing card.
public class Card
{
	public static final int SPADES   = 0;
	public static final int HEARTS   = 1;
	public static final int CLUBS    = 2;
	public static final int DIAMONDS = 3;

	public static final int ACE      = 1;
	public static final int TWO      = 2;
	public static final int THREE    = 3;
	public static final int FOUR     = 4;
	public static final int FIVE     = 5;
	public static final int SIX      = 6;
	public static final int SEVEN    = 7;
	public static final int EIGHT    = 8;
	public static final int NINE     = 9;
	public static final int TEN      = 10;
	public static final int JACK     = 11;
	public static final int QUEEN    = 12;
	public static final int KING     = 13;


	private int suit;
	private int face;
	
	// This constructor builds a card with the given suit and face, turned face down.
	public Card(int cardSuit, int cardFace)
	{
		this.suit = cardSuit;
		this.face = cardFace;
	}

	// This method retrieves the suit (spades, hearts, etc.) of this card.
	public int getSuit()
	{
		return suit;
	}
	
	// This method retrieves the face (ace through king) of this card.
	public int getFace()
	{
		return face;
	}
	
	// This method retrieves the numerical value of this card
	// (usually same as card face, except 1 for ace and 10 for jack/queen/king)
	public int getValue()
	{
		int cardValue = face;
		if(face == 1){
			cardValue = 1;
		}
		if(cardValue >= 2 && cardValue <= 10){
			cardValue = face;
		}
		if(face > 10 && face <= 13){
			cardValue = 10;
		}
		return cardValue;
	}

	public String toString(){
		String result = "";
		String suit1 = "";
		String face1 = "";
		
		switch (this.suit){
		
		case 0: suit1 = "SPADES";
		break;
		
		case 1: suit1 = "HEARTS";
		break;
		
		case 2: suit1 = "CLUBS";
		break;
		
		case 3: suit1 = "DIAMONDS";
		break;
		}


		switch (this.face){
		
		case 1: face1 = "ACE";
		break;

		case 2: face1 = "TWO";
		break;

		case 3: face1 = "THREE";
		break;

		case 4: face1 = "FOUR";
		break;

		case 5: face1 = "FIVE";
		break;

		case 6: face1 = "SIX";
		break;

		case 7: face1 = "SEVEN";
		break;

		case 8: face1 = "EIGHT";
		break;

		case 9: face1 = "NINE";
		break;

		case 10: face1 = "TEN";
		break;

		case 11: face1 = "JACK";
		break;

		case 12: face1 = "QUEEN";
		break;

		case 13: face1 = "KING";
		break;
		}
		
		result += face1 + " of " + suit1 + '\n';
		return result;
	}
}
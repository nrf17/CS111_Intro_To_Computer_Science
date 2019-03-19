public class Player{
	
	String name;
	double balance;
	Card [] hand;
	Card [] hand2;
	double bet;
	double sideBet;
	int playerScore;
	int playerScore2;
	
	public Player(String name, double balance, Card [] hand, Card [] hand2){
		this.name = name;
		this.balance = balance;
		this.bet = 0.0;
		this.sideBet = 0.0;
		this.hand = hand;
		this.hand2 = hand2;
		this.playerScore = 0;
		this.playerScore2 = 0;
	}

	public int getScore(Card [] hand){
		int playerScore = 0;
		for(int i = 0; i < hand.length; i++){
			if(hand[i] == null){
				break;
			}
			playerScore += hand[i].getValue();
			if(hand[i].getFace() == 1){
				playerScore = playerScore - 1;
				if(playerScore <= 10){
					playerScore = playerScore + 11;
				}
				else{
					playerScore = playerScore + 1;
				}
			}
		}
		return playerScore;
	}

	public int getScore2(Card [] hand2){
		int playerScore2 = 0;
		for(int i = 0; i < hand2.length; i++){
			if(hand2[i] == null){
				break;
			}
			playerScore2 += hand2[i].getValue();
			if(hand2[i].getFace() == 1){
				playerScore2 = playerScore2 - 1;
				if(playerScore2 <= 10){
					playerScore2 = playerScore2 + 11;
				}
				else{
					playerScore2 = playerScore2 + 1;
				}
			}
		}
		return playerScore2;
	}


	public String getName(){
		return name;
	}

	public  double getBalance(){
		return balance;
	}
	public double setBalance(double reward){
		balance += reward;
		return balance;
	}

	public double getSideBet(){
		return sideBet;
	}

	public boolean setSideBet(double sideBet){
		if(sideBet == (bet/2)){
			this.sideBet = sideBet;
			return true;
		}
		else{
			return false;
		}
	}

	public double resetSideBet(double sideBet){
		sideBet = 0.0;
		return sideBet;
	}

	public double getBet(){
		return bet;
	}

	public boolean setBet(double bet){
		if(bet >= 0.0){
			this.bet = bet;
			return true;
		}
		else{
			return false;
		}
	}

	public double resetBet(double bet){
		bet = 0.0;
		return bet;
	}

	public Card[] getHand(){
		return hand;
	}

	public Card[] cardToHand(Card card){
		for (int i = 0; i < hand.length; i++){
			if(hand[i] == null){
				hand[i] = card;
				break;
			}
		}
		return hand;
	}

	public Card[] cardToHand2(Card card){
		for (int i = 0; i < hand2.length; i++){
			if(hand2[i] == null){
				hand2[i] = card;
				break;
			}
		}
		return hand2;
	}

	public String toString(){
		String result = "";
		String result2 = "";
		for(int i = 0; i < hand.length; i++){
			if(hand[i] == null){
				break;
			}
			result += this.hand[i] + "\n";
		}
		if(hand2 != null){
			for(int j = 0; j < hand2.length; j++){
				if(hand2[j] == null){
					break;
				}
				result2 += this.hand2[j] + "\n";
			}
		return ": hand 1 is: " + result + "\n" + "Hand 2 is: " + result2;
		}
		else{
			return ": hand 1 is: " + result;
		}
	}

	public Card[] resetHand(Card [] hand){
		for(int i = 0; i < hand.length; i++){
			hand[i] = null;
		}
		return hand;
	}

	public Card[] resetHand2(Card [] hand2){
		for(int i = 0; i < hand2.length; i++){
			hand2[i] = null;
		}
		return hand2;
	}
}
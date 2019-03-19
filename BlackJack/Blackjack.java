public class Blackjack{
	public static void main(String [] args){
		


		System.out.println("Enter the number of players entering the game.");
		int numPlayers = IO.readInt();
		Player [] players = new Player[numPlayers];
		String name = "";
		double balance = 0.0;
		double bet = 0.0;
		double sideBet = 0.0;
		String split = "";
		String answer = "";
		String round = "";
		String down = "";
		String insurance = "";
		Card [] dealerHand = new Card[12];
		Card [] dealerHand2 = new Card[12];
		
		Player dealer = new Player("Dealer", 999999, dealerHand, dealerHand2);

		for(int i = 0; i < players.length; i++){
			System.out.println("Enter your name.");
			name = IO.readString();
			System.out.println("Enter your balance.");
			balance = IO.readDouble();
			if(balance < 0){
				IO.reportBadInput();
				System.out.println("You can not have a negative amount of money.");
			}
			Card [] hand = new Card[12];
			Card [] hand2 = new Card[12];
			players[i] = new Player(name, balance, hand, hand2);
		}


		System.out.println("Are you sure your group would like to play, answer yes or no now.");
		round = IO.readString();
		while(round.equalsIgnoreCase("yes")){
			Deck original = new Deck();
			original.shuffle();

			for(Player i : players){
				System.out.println(i.getName() + " please enter you bet.");
				boolean charge = i.setBet(IO.readInt());
			}

			
			for(Player i : players){
				i.cardToHand(original.deal());
				i.cardToHand(original.deal());
				System.out.println(i.getName() + i + "\n" + i.getName() + " your hand 1 score is: " + i.getScore(i.hand) + "\n" + "Your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
			}


			for(Player i : players){
				if(i.hand[0].getFace() == i.hand[1].getFace()){
					System.out.println(i.getName() + ", you have a pair, would you like to split?" + "\n" + "split- pair of aces or 8s." + "\n" + "dont split- 4s, 5s, or 10s." + "\n" + "9 pair- should not split if the dealer has a 7, ace, or any card with value of 10." + "\n" + "7 pair- there is a 50-50 chance you bust, spilt if the dealer has an 8 or higher." + "\n" + "6 pair- dont spilt, only 30% of busting, but if you were, see the dealer has 4, 5, or 6." + "\n" + "2 or 3 pair-  dont split, there is no bust chances, but if you did, see if the dealer has 4, 5, or 6." + "\n");
					split = IO.readString();
					if(split.equalsIgnoreCase("yes")){
						if((i.getBalance() - (2*i.getBet())) < 0){
							break;
						}
						i.hand2[0] = i.hand[1];
						i.hand[1] = null;
					}
					if(split.equalsIgnoreCase("no")){
						break;
					}
				}
			}

			for(Player i : players){
				if(i.hand2[0] != null){
					i.cardToHand(original.deal());
					i.cardToHand2(original.deal());
					System.out.println(i.getName() + i + "\n" + i.getName() + ", your hand 1 score is: " + i.getScore(i.hand) + "\n" + " your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
				}
			}

			
			dealer.cardToHand(original.deal());
			dealer.cardToHand(original.deal());
			System.out.println("The dealers hand is: Face Down Card, " + dealerHand[1]);

			for(Player i : players){
				if(dealerHand[1].getFace() == 1){
					System.out.println("The dealers face up card is an Ace, you can now take insurance, would you like to do so?" + "\n" + "There is about a 33% chance that the face down card has a value of ten." + "\n");
					insurance = IO.readString();
					while(insurance.equalsIgnoreCase("yes")){
						System.out.println("Enter you insurance bet.");
						boolean sideCharge = i.setSideBet(i.getBet()/2);
						break;
					}
					if(insurance.equalsIgnoreCase("no")){
						break;
					}
				}
			}

		
			for(Player i : players){
				System.out.println(i.getName() + " would you like to double down?");
				down = "";
				down = IO.readString();
				if(down.equalsIgnoreCase("yes")){
					i.cardToHand(original.deal());
					i.setBet((2*i.getBet()));
				}
				if(down.equalsIgnoreCase("no")){
					System.out.println(i.getName() + " would you like to Hit or Stand?");
					answer = "";
					answer = IO.readString();
					while(answer.equalsIgnoreCase("hit") && i.getScore(i.hand) < 21){
						i.cardToHand(original.deal());
						System.out.println(i.getName() + i + "\n" + i.getName() + ", your hand 1 score is: " + i.getScore(i.hand) + "\n" + " your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
						System.out.println(i.getName() + " would you like to Hit or Stand?");
						answer = "";
						answer = IO.readString();
						if(answer.equalsIgnoreCase("stand")){
							break;
						}
					}
					down = "";
					System.out.println(i.getName() + i + "\n" + i.getName() + ", your hand 1 score is: " + i.getScore(i.hand) + "\n" + " your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
				}
			}

			for(Player i : players){
				if(i.hand2[0] != null){
					System.out.println(i.getName() + " would you like to double down?");
					down = "";
					down = IO.readString();
					if(down.equalsIgnoreCase("yes")){
						i.cardToHand(original.deal());
						i.setBet((2*i.getBet()));
					}
					if(down.equalsIgnoreCase("no")){
						System.out.println(i.getName() + " would you like to Hit or Stand?");
						answer = "";
						answer = IO.readString();
						while(answer.equalsIgnoreCase("hit") && i.getScore(i.hand) < 21){
							i.cardToHand(original.deal());
							System.out.println(i.getName() + i + "\n" + i.getName() + ", your hand 1 score is: " + i.getScore(i.hand) + "\n" + " your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
							System.out.println(i.getName() + " would you like to Hit or Stand?");
							answer = "";
							answer = IO.readString();
							if(answer.equalsIgnoreCase("stand")){
								break;
							}
						}
						down = "";
						System.out.println(i.getName() + i + "\n" + i.getName() + ", your hand 1 score is: " + i.getScore(i.hand) + "\n" + " your hand 2 score is: " + i.getScore2(i.hand2) + "\n");
					}
				}
			}


			System.out.println("Dealer" + dealer + "\n" + "The dealers score is: " + dealer.getScore(dealerHand) + "\n");
			while(dealer.getScore(dealerHand) < 17){
				if(dealer.getScore(dealerHand) >= 17){
					System.out.println("Dealer" + dealer + "\n" + "The dealers score is: " + dealer.getScore(dealerHand) + "\n");
					break;
				}
				dealer.cardToHand(original.deal());
				System.out.println("Dealer" + dealer + "\n" + "The dealers score is: " + dealer.getScore(dealerHand) + "\n");
			}


			for(Player i : players){
				if(dealer.getScore(dealerHand) == 21){
					i.setBalance((2*i.getSideBet()));
					System.out.println(i.getName() + ", congrats you won your insurance bet, your balance is now " + i.getBalance());
				}
				else{
					i.setBalance(-i.getSideBet());
					System.out.println(i.getName() + ", sorry you lost your insurance bet, your balance is now " + i.getBalance());
				}
			}

			for(Player i : players){
				if(i.getScore(i.hand) > 21){
					System.out.println(i.getName() + ", sorry but you haved busted, you lose.");
					i.setBalance(-i.getBet());
					System.out.println(i.getName() + " your balance is now: " + i.getBalance());
				}
				if(i.getScore(i.hand) < 22 && dealer.getScore(dealerHand) < 22 && i.getScore(i.hand) > dealer.getScore(dealerHand)){
					System.out.println(i.getName() +  ", congrats you won.");
					i.setBalance(i.getBet());
					System.out.println(i.getName() + " your balance is now: " + i.getBalance());
				}
				if(i.getScore(i.hand) < 22 && dealer.getScore(dealerHand) > 21 && i.getScore(i.hand) < dealer.getScore(dealerHand)){
					System.out.println(i.getName() + ", congrats the dealer has busted but you did not, you won.");
					i.setBalance(i.getBet());
					System.out.println(i.getName() + " your balance is now: " + i.getBalance());
				}
				if(i.getScore(i.hand) <  22 && dealer.getScore(dealerHand) < 22 && i.getScore(i.hand) < dealer.getScore(dealerHand)){
					System.out.println(i.getName() + ", sorry you lost.");
					i.setBalance(-i.getBet());
					System.out.println(i.getName() + " your balance is now: " + i.getBalance());
				}
				if(i.getScore(i.hand) == dealer.getScore(dealerHand)){
					System.out.println(i.getName() + ", you tied the dealer.");
					System.out.println("Your balance remains unchanged and is now: " + i.getBalance());
				}
			}


			for(Player i : players){
				if(i.hand2[0] != null && i.getScore2(i.hand2) > 3){
					if(i.getScore2(i.hand2) > 21){
						System.out.println(i.getName() + ", sorry but you haved busted, you lose.");
						i.setBalance(-i.getBet());
						System.out.println(i.getName() + " your balance is now: " + i.getBalance());
					}
					if(i.getScore2(i.hand2) < 22 && dealer.getScore(dealerHand) < 22 && i.getScore2(i.hand2) > dealer.getScore(dealerHand)){
						System.out.println(i.getName() +  ", congrats you won.");
						i.setBalance(i.getBet());
						System.out.println(i.getName() + " your balance is now: " + i.getBalance());
					}
					if(i.getScore2(i.hand2) < 22 && dealer.getScore(dealerHand) > 21 && i.getScore2(i.hand2) < dealer.getScore(dealerHand)){
						System.out.println(i.getName() + ", congrats the dealer has busted but you did not, you won.");
						i.setBalance(i.getBet());
						System.out.println(i.getName() + " your balance is now: " + i.getBalance());
					}
					if(i.getScore2(i.hand2) <  22 && dealer.getScore(dealerHand) < 22 && i.getScore2(i.hand2) < dealer.getScore(dealerHand)){
						System.out.println(i.getName() + ", sorry you lost.");
						i.setBalance(-i.getBet());
						System.out.println(i.getName() + " your balance is now: " + i.getBalance());
					}
					if(i.getScore2(i.hand2) == dealer.getScore(dealerHand)){
						System.out.println(i.getName() + ", you tied the dealer.");
						System.out.println("Your balance remains unchanged and is now: " + i.getBalance());
					}
				}
			}


			for(Player i : players){
				i.resetHand(i.hand);
				i.resetHand2(i.hand2);
				i.resetBet(i.getBet());
				i.resetSideBet(i.getSideBet());
			}
			dealer.resetHand(dealerHand);
			System.out.println("Would your group like to play again?  Talk it over with your group and answer yes or no.");
			round = "";
			round = IO.readString();
			if(round.equalsIgnoreCase("no")){
				break;
			}
		}
		System.out.println("Alright, thank you for playing have a good day");
	}
}
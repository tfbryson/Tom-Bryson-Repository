//Child Class
public class FaceCard extends Card {

	public FaceCard(Integer cardNumber, String symbol) {
		super(cardNumber, symbol);

	}

	public String getRank() {

		int thisRank = super.getRank();

		if (thisRank == 14) {
			return "Ace";
		}

		else if (thisRank == 11) {
			return "Jack";
		}

		else if (thisRank == 12) {
			return "Queen";
		}

		else if (thisRank == 13) {
			return "King";
		}
		

	}

}

//Orchastrator to bring everything together
import java.util.ArrayList;
import java.util.List;

public class Deck {

	static List<Card> deckOfCards = new ArrayList<>();

	public static void main(String[] args) {

	NumberedCards someCard = new NumberedCards(4, "Spades");
		int thisCardRank = someCard.getRank();
		System.out.println(thisCardRank);
		
		FaceCard someFaceCard = new FaceCard (14, "Spades");
				int thatCardRank = someFaceCard.getRank();
		System.out.println(thatCardRank);
	}
}

//Parent Class
public class Card {

	private Integer rank;
	private String suite;

	public Card(Integer cardNumber, String symbol) {
		this.rank = cardNumber;
		this.suite = symbol;
	}

	public String getSuite() {
		return suite;
	}

	public Integer getRank() {
		System.out.println(this.rank);
		return rank;
	}
}

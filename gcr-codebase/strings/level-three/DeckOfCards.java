public class DeckOfCards {
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[k++] = rank + " of " + suit;
        return deck;
    }
	//method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int rand = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }
	//method to distribute card
   public static void distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards");
            return;
        }
        int index = 0;
        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + ":");
            for (int j = 0; j < cards; j++) {
                System.out.println(deck[index++]);
            }
            System.out.println();
        }
    }
	//Main method
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);
        distribute(deck, 4, 5);
    }
}

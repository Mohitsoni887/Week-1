public class DeckOfCards {

    public static void main(String[] args) {
        // Suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create and initialize the deck
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Number of players and cards per player
        int numberOfPlayers = 4;
        int cardsPerPlayer = 5;

        // Distribute cards to players
        int cardIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[cardIndex++]);
            }
            System.out.println();
        }
    }
}

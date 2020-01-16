package cards;

/**
 * This class the main class that prints off all the cards;
 *
 * @author Ha Neul Moon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CARDS: ");
        Card card = new Card();
        System.out.println(card.showAllCards());
        System.out.println("That's all!");
    }
}

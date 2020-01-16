package cards;

/**
 * This class sets cards and has methods to print cards.
 *
 * @author Ha Neul Moon
 */
public class Card {
    private String[] suits = {"♣", "♦", "♥", "♠"};
    private String[] numbers = new String[13];
    
    
    
    public Card(){
        
    }
    
    public String pullCard(){
        
        String c = "";
        int r1 = (int) Math.floor(Math.random() * 3);
        int r2 = (int) Math.floor(Math.random() * 13);
        
        c = suits[r1] + numbers[r2];
        
        return c;
    }
    
    public String showAllCards(){
        String all = "";
        setNumbers();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                all += suits[i] + numbers[j] + " ";
            }
            all += "\n";
        }
        return all;
    }
    
    public void setNumbers(){
        for(int i = 0; i < 10; i++){
            numbers[i] = String.valueOf(i + 1);
        }
        numbers[10] = "J";
        numbers[11] = "Q";
        numbers[12] = "K";
        
    }
    
   
}

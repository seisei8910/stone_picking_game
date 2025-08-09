package stone_picking_game;
import java.util.Random;

public class Computer {
    
    protected void turn(String cullrntComputer) {
        
        
        
    }

    protected int getCount(int stones) {

        Random random = new Random();
        int count = 0;
        
        while(count == 0 || count > stones) {
            count = random.nextInt(4) + 1;
        }
        return count;
    }

}

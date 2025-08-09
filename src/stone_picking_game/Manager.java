package stone_picking_game;

public class Manager {
    public static int stones = 30;
    public static final int maxCount = 5;
    public static final int minimumCount = 1;
    private static String turn;

    public static void printRule() {

        System.out.println("=== 石取りゲーム ===");
        System.out.println("1ターンに" + minimumCount + "〜" + maxCount + "個の石を取ることができます。");
        System.out.println("最後の石を取った方が負けです。");

    }
    
    public static void updateStones(int count) {
        
        stones = stones - count;
        
    }
    
    public static void printTurnResult(String currentPlayer, int count) {

        System.out.println(currentPlayer + "は" + count + "個の石を取りました。残りの石:" + stones);

    }
    
    public static void changeTurn(String currentPlayer) {
        turn = currentPlayer;
    }

}

package stone_picking_game;


public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Computer computer1 = new Computer();

        Manager.printRule();
        while(Manager.stones > 0) {

            player1.Turn("player1");
//            int count = player1.getCount(stones);
//            stones = stones - count;
//            System.out.println("あなたは" + count + "個の石を取りました。残りの石:" + stones);
//            
//            count = computer1.getCount(stones);
//            stones = stones - count;
//            System.out.println("コンピューターは" + count + "個の石を取りました。残りの石:" + stones);

        }

    }

}

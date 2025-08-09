package stone_picking_game;


public class Main {

    public static void main(String[] args) {

        int stones = Manager.stones;
        Player player1 = new Player();
        Computer computer1 = new Computer();

        Manager.printRule();
        while(stones > 0) {

            int count = player1.getCount(stones);
            stones = stones - count;
            System.out.println("あなたは" + count + "個の石を取りました。残りの石:" + stones);

//            coputet1.playTurn(Manager.stones);
        }

    }

}

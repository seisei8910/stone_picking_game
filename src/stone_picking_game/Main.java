package stone_picking_game;


public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Computer computer1 = new Computer();

        Manager.printRule();
        while(Manager.stones > 0) {

            player1.takeTurn("player1");
            computer1.takeTurn("computer1");

        }

    }

}

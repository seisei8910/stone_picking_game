package stone_picking_game;
import java.util.Scanner;

public class Player {

    public void takeTurn(String currentPlayer) {

        if(Manager.stones > 0) {

            int count = getCount(Manager.stones);
            Manager.updateStones(count);
            Manager.printTurnResult(currentPlayer, count);
            Manager.changeTurn(currentPlayer);

        }

    }

    protected int getCount(int stones) {

        Scanner scanner = new Scanner(System.in);
        int maxCount = Manager.maxCount;
        int minimumCount = Manager.minimumCount;
        int count = 0;

        while(stones >= 5 && (count < 1 || count > 5)) {
            
            System.out.print("取る石の数 (" + minimumCount + "〜" +
                    maxCount + ") を入力してください:");

            if(scanner.hasNextInt()) {

                count = scanner.nextInt();

                if(count < 1 || count > maxCount) {

                    System.out.println(minimumCount + "〜" + maxCount + "以外の数字を入力しました。");

                }

            } else {

                System.out.println("数字以外を入力しました");
                scanner.next();

            }

        }
        
        while(stones < 5 && (count < 1 || count > stones)) {
            
            System.out.print("取る石の数 (" + minimumCount + "〜" +
                    stones + ") を入力してください:");

            if(scanner.hasNextInt()) {

                count = scanner.nextInt();

                if(count < 1 || count > stones) {

                    System.out.println(minimumCount + "〜" + stones + "以外の数字を入力しました。");

                }

            } else {

                System.out.println("数字以外を入力しました。");
                scanner.next();

            }

        }

        return count;

    }

}

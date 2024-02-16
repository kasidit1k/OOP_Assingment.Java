package Chap11;

public interface Game {
    public static final int level = 3;
    public void start();
    public void pause();
    public void toContinue();
    public void stop();
    public void play();
}


    /*----------------------*\
    -- TicTacToeAbst --
    \*----------------------*/
abstract class TicTacToeAbst implements Game{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void play() {
        System.out.println("play");
    }
}


 /*----------------------*\
     -- TicTacToe --
 \*----------------------*/
class TicTacToe extends TicTacToeAbst{
    @Override
    public void toContinue() {
        System.out.println("toContinue");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}

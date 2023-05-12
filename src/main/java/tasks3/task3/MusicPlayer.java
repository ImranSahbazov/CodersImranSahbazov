package tasks3.task3;

public interface MusicPlayer {
    public default void play(){
        System.out.println("musiqi calinmaqa baslayir");
    }
    public default void pause(){
        System.out.println("müsiqi pauza verir");
    }
    public  default void stop(){
        System.out.println(" musiqi dayandirilir.");
    }


}

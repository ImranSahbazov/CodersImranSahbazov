package tasks3.task3;

public class Main {
    public static void main(String[] args) {
        JazzMusicPlayer jmp = new JazzMusicPlayer();
        jmp.play();
        jmp.stop();
        jmp.pause();

        jmp.playJazzMusic();

        ClassicalMusicPlayer cmp = new ClassicalMusicPlayer();

        cmp.play();
        cmp.stop();
        cmp.pause();

        cmp.playClassicalMusic();


    }
}

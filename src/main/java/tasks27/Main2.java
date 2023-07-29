package tasks27;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee interface
interface AdvancedMediaPlayer {
    void playMp4(String fileName);
    void playAvi(String fileName);
}

// Concrete Adaptee class
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    @Override
    public void playAvi(String fileName) {
        // Do nothing
    }
}

// Concrete Adaptee class
class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file: " + fileName);
    }
}

// Adapter class implementing the Target interface
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("avi")) {
            advancedMediaPlayer.playAvi(fileName);
        }
    }
}

// Client class using the MediaPlayer interface
class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("avi")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}

// Main class to test the adapter pattern
public class Main2 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "movie.avi");
        audioPlayer.play("mkv", "video.mkv"); // Invalid media type
    }
}


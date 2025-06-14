interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media.");
    }

    void pause() {
        System.out.println("Pausing media.");
    }

    void stop() {
        System.out.println("Stopping media.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void rewind() {
        System.out.println("Rewinding video.");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video.");
    }

    public void addSong(String song) {
        System.out.println("Added: " + song);
    }

    public void removeSong(String song) {
        System.out.println("Removed: " + song);
    }
}

public class MediaTest {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.rewind();
        vp.addSong("The Exile by Taylor Swift");
        vp.removeSong("Enchanted By Taylor Swift");
    }
}

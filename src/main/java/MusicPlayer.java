import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Music Player
 * Given a Music file, this class with play it.
 * By Now, Supports the Well known formats
 * Implemented using Media and Media Player Class
 *
 * Should be made as Singleton.
 */
public class MusicPlayer {

    private Media media;
    private MediaPlayer mediaPlayer;
    private Playlist playlist;

    /*
     * Provide the Playlist file
     */
    private boolean setPlayList(String playListURI){
        return false;
    }

    /*
     * Get the source file.
     * Create a Media instance for the Source
     */
    public boolean setMedia(){
        return false;
    }

    /*
     * Get the Media Instance and Create a Media Player instance
     */
    public boolean setMediaPlayer(){
        return false;
    }

    public void play(){
    }

    public void pause(){
    }

    public void stop(){
    }

    public void next(){
    }

    public void previous(){
    }

}

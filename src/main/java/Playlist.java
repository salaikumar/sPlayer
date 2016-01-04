/**
 * Playlist Class.
 * Given a URI to a file, Create a playlist using it.
 * File Contains a list of songs to be played.
 * Create Array using it and supply it using Iterator
 */
public class Playlist {

    private String fileURI;
    private String[] songURI;
    private String   name;      //Name of the Playlist

    /*
     * Not Sure If this Constructor is of any use
     * Let it be there by now.
     */
    public Playlist(String fileURI, String name){
        this.name = name;
        this.fileURI = fileURI;

//      Populate URI for each song in the playlist
//      The Playlist is a simple text file.
//      Each line corresponds to a song in the playlist.
//      To be Done later
    }

    /*
     * Create a Playlist by giving its name
     */
    public  Playlist(String name){
        this.name = name;
//     Create a file with the given name + timestamp at permitted location.
    }


    public boolean addSong(String songURI){
        return false;
    }

    public boolean removeSong(Integer index){
        return false;
    }

    
}

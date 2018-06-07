import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MapOfHashmatique{
    public HashMap<String, String> getLyrics (){
        // Create HashMap 
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add songs 
        trackList.put("Bye, Bye, Bye", "Song lyrics for Bye, Bye, Bye..."); 
        trackList.put("It's Gonna Be Me", "Song lyrics for It's Gonna Be Me...");
        trackList.put("This I Promise You", "Song lyrics for This I Promise You...");
        trackList.put("No Strings Attached", "Song lyrics for No Strings Attached...");

        // Pull song lyrics out based on track title
        String lyrics = trackList.get("It's Gonna Be Me");

        // Print out all track names and lyrics
        Set<String> songsAndLyrics = trackList.keySet();
        for (String key : songsAndLyrics){
            System.out.println(key + " : " + trackList.get(key));
        }
        return trackList;
    }
}
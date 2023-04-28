/*
 * @author Sydney Stokes
 * 
 */
package org.howard.edu.lsp.finals.problem;
import java.util.*;

public class SongsDatabase {
    /* Key is the genre, HashSet contains associated songs */
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    /* 
     * Add a song title to a genre
     * @param genre
     * @param songTitle
     */
    public void addSong(String genre, String songTitle) {
        HashSet<String> songSet = map.get(genre);
        //if genre isn't there create a new genre
        if (songSet == null) {
            songSet = new HashSet<String>();
            map.put(genre, songSet);
        }
        //add song title to existing genre
        songSet.add(songTitle);
    }

    /* 
     * Return the Set that contains all songs for a genre 
     * @param genre
     * @return songSet
     */
    public Set<String> getSongs(String genre) {
        HashSet<String> songSet = map.get(genre);
        if (songSet == null) {
            songSet = new HashSet<String>();
        }
        return songSet;
    }

    /* 
     * Return genre, i.e., jazz, given a song title
     * @param songTitle
     * @return genre
     */
    public String getGenreOfSong(String songTitle) {
        for (String genre : map.keySet()) {
            HashSet<String> songSet = map.get(genre);
            //return the genre of the songSet if song is in it
            if (songSet.contains(songTitle)) {
                return genre;
            }
        }
        return null;
    }
}
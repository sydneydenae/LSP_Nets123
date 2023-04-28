/*
 * @author Sydney Stokes
 * 
 */
package org.howard.edu.lsp.finals.problem;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;

public class SongsDatabaseTest {
	@Test
	public void testSongsDatabase() {
    	
		//Testing addSong
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Rap", "Tomorrow");
        db.addSong("Rap", "Rapper's Delight");
        db.addSong("Jazz", "Summertime");

        SongsDatabase myDb = new SongsDatabase();
        myDb.addSong("R&B", "Backseat");
        myDb.addSong("Jazz", "Strange Fruit");
        myDb.addSong("HipHop", "Juicy");
        myDb.addSong("Jazz", "Always There");
        
        //Testing getSongs
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> jazzSongs = myDb.getSongs("Jazz");
        Set<String> hipHopSongs = myDb.getSongs("HipHop");

        assertTrue(rapSongs.contains("Rapper's Delight"));
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Tomorrow"));
        
        assertTrue(jazzSongs.contains("Always There"));
        assertTrue(jazzSongs.contains("Strange Fruit"));
        assertTrue(hipHopSongs.contains("Juicy"));
        
        assertFalse(rapSongs.contains("Juicy"));
        assertFalse(jazzSongs.contains("Backseat"));
        assertFalse(hipHopSongs.contains("Strange Fruit"));

        //Test getGenre
        assertEquals("Jazz", db.getGenreOfSong("Summertime"));
        assertEquals("Rap", db.getGenreOfSong("Gin and Juice"));
        assertEquals("Rap", db.getGenreOfSong("Tomorrow"));
        assertEquals("R&B", myDb.getGenreOfSong("Backseat"));
        assertEquals("HipHop", myDb.getGenreOfSong("Juicy"));
        
        assertNull(db.getGenreOfSong("Happy Birthday"));
        assertNull(db.getGenreOfSong("Jesus Walks"));

        //Print statements
        System.out.println(db.getGenreOfSong("Savage")); // prints "Rap"
        System.out.println(myDb.getGenreOfSong("Always There")); // prints "Jazz"
        System.out.println(db.getGenreOfSong("Tomorrow")); // prints "Rap"
        System.out.println(myDb.getGenreOfSong("Backseat")); // prints "R&B"
        System.out.println(myDb.getGenreOfSong("Juicy")); // prints "HipHop"
    }
}
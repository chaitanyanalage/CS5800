package Q2.tests;

import Q2.RealSongService;
import Q2.Song;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RealSongServiceTest {

    @Test
    public void testSearchById() {
        RealSongService realSongService = new RealSongService();
        Song song = realSongService.searchById(1);
        assertNotNull(song);
        assertEquals("Tum Hi Ho", song.getTitle());
        assertEquals("Arijit Singh", song.getArtist());
        assertEquals("Aashiqui 2", song.getAlbum());
        assertEquals(262, song.getDuration());
    }
}

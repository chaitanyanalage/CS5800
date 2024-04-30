package Q2;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs;

    public RealSongService() {
        // Initialize songs
        songs = new ArrayList<>();
        songs.add(new Song(1, "Tum Hi Ho", "Arijit Singh", "Aashiqui 2", 262));
        songs.add(new Song(2, "Dil Diyan Gallan", "Atif Aslam", "Tiger Zinda Hai", 261));
        songs.add(new Song(3, "Senorita", "Farhan Akhtar", "Zindagi Na Milegi Dobara", 231));
        songs.add(new Song(4, "Mast Magan", "Arijit Singh", "2 States", 280));
        songs.add(new Song(5, "Ghungroo", "Arijit Singh", "War", 302));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Song song : songs) {
            if (song.getSongID().equals(songID)) {
                return song;
            }
        }
        return null; // Return null if songID is not found
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}

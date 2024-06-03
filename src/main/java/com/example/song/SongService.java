/*

 * You can use the following import statements
  
 * import org.springframework.http.HttpStatus;
 * import org.springframework.web.server.ResponseStatusException;

 */

package com.example.song;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.example.song.SongRepository;
import com.example.song.Song;

// Don't modify the below code
public class SongService implements SongRepository {
	private static HashMap<Integer, Song> playlist = new HashMap<>();

	public SongService() {
		playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
		playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
		playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
		playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
		playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
	}

	int uniqueId = 6;

	@Override
	public ArrayList<Song> getSongs() {
		// TODO Auto-generated method stub
		Collection<Song> songCollection = playlist.values();
		ArrayList<Song> songsArray = new ArrayList<>(songCollection);
		return songsArray;
	}

	@Override
	public Song getSongById(int songId) {
		Song song = playlist.get(songId);
		// TODO Auto-generated method stub
		if (song == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return song;
	}

	@Override
	public Song addSong(Song song) {
		song.setSongId(uniqueId);
		playlist.put(uniqueId, song);
		uniqueId += 1;
		return song;
	}

	@Override
	public Song updateSong(int songId, Song song) {
		// TODO Auto-generated method stub
		Song songo = playlist.get(songId);
		if (songo == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		if (song.getSongName() != null) {
			songo.setSongName(song.getSongName());
		}
		if (song.getSongLyricist() != null) {
			songo.setSongLyricist(song.getSongLyricist());
		}
		if (song.getSongSinger() != null) {
			songo.setSongSinger(song.getSongSinger());
		}

		if (song.getSongMusicDirector() != null) {
			songo.setSongMusicDirector(song.getSongMusicDirector());
		}
		return songo;
	}

	@Override
	public void deleteSong(int songId) {
		// TODO Auto-generated method stub
		Song songd = playlist.get(songId);
		if (songd == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			playlist.remove(songId);
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}

	}
}
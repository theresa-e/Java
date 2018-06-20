package com.theresa.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.theresa.lookify.models.Song;
import com.theresa.lookify.repositories.SongRepository;
@Service
public class SongService {
	private final SongRepository songRepository;
	
	// Dependency injection
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public List<Song> allSongs() {
		return songRepository.findAll();
	}
	
	public Song createSong(Song newSong) {
		return songRepository.save(newSong);
	}
	
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if (optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}

	public void deleteSong(Long id) {
		Song deleteSong = this.findSong(id);
		songRepository.delete(deleteSong);
	}
	
	public List<Song> findTopSongs(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> findByArtistContaining(String artistSearch){
		return songRepository.findByArtistContaining(artistSearch);
	}
}

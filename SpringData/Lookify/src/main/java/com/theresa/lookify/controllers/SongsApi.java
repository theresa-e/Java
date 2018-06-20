package com.theresa.lookify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.theresa.lookify.models.Song;
import com.theresa.lookify.services.SongService;


@RestController
public class SongsApi {
	private final SongService songService; 
	
	public SongsApi(SongService songService) {
		this.songService = songService;
	}
	
	// Retrieves a list of all songs in database.
	@RequestMapping("api/songs")
	public List<Song> index(){
		return songService.allSongs();
	}
	
	// Create a new song in database.
	@RequestMapping(value="/api/songs", method=RequestMethod.POST)
	public Song create(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") String rating) {
		Integer ratingAsInteger = Integer.valueOf(rating);
		Song song = new Song(title, artist, ratingAsInteger);
		return songService.createSong(song);
	}
	
	// Show song based on id
	@RequestMapping("/api/songs/{id}")
	public Song show(@PathVariable("id") Long id) {
		Song song = songService.findSong(id);
		return song;
	}
	
	// Delete a song based on its id
	@RequestMapping(value="/api/songs/{id}", method=RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id){
		songService.deleteSong(id);
	}
}

package com.theresa.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.theresa.lookify.models.Song;
import com.theresa.lookify.services.SongService;

@Controller
public class SongsController {
	private final SongService songService;
	
	public SongsController(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "lookify/welcome.jsp";
	}
	
	@RequestMapping("/songs")
	public String home(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "lookify/index.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSong(id);
		model.addAttribute("song", song);
		return "/lookify/show.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String addSong(@ModelAttribute("song") Song song) {
		return "lookify/new.jsp";
	}
	
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "/lookify/new.jsp";
		} else {
			songService.createSong(song);
			List<Song> songs = songService.allSongs();
			model.addAttribute("songs", songs);
			return "redirect:/songs";
		}
	}
	
	@RequestMapping("/songs/topSongs")
	public String getTopSongs(Model model) {
		List<Song> topSongs = songService.findTopSongs();
		model.addAttribute("topSongs", topSongs);
		return "/lookify/topten.jsp";
	}
	
	@RequestMapping(value="/songs/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/songs";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String searchByArtist(@RequestParam(value="artistSearch") String artistSearch, Model model) {
		List<Song> results = songService.findByArtistContaining(artistSearch);
		model.addAttribute("results", results);
		return "lookify/artistsearch.jsp";
	}
}

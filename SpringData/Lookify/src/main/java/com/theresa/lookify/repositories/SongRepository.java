package com.theresa.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theresa.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findByArtistContaining(String artistSearch);
	List<Song> findAll();
	List<Song> findTop10ByOrderByRatingDesc();
}

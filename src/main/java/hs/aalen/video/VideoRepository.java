package hs.aalen.video;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, String>{

	public List<Video> findByGenreOrderByTitle(String genre);
	
	public List<Video> findByAgeRatingOrderByTitle(String age);
	
	public List<GenresOnly> findAllProjectedBy();
}


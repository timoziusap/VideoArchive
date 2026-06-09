package hs.aalen.video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

@Autowired
private VideoRepository videoRepository;
	
	public List<Video> getVideos(){
		ArrayList<Video> myList = new ArrayList<>();
		Iterator<Video> it = videoRepository.findAll().iterator();
		while(it.hasNext()) {
			myList.add(it.next());
		}
		return myList;
	}
	
	public Video getVideo(String title) {
		return videoRepository.findById(title).orElse(null);
	}
	
	public void addVideo( Video video) {
		videoRepository.save(video);
	}
	
	public void updateVideo(String title, Video video) {
		
		videoRepository.save(video);
	}
	
	public void deleteVideo(String title) {
		
		videoRepository.deleteById(title);
		
	}

	public List<Video> getAllVideosOfGenre(String genre) {
		return videoRepository.findByGenreOrderByTitle(genre);
	}
	public List<Video> getAllVideosOfAge(String age) {
		return videoRepository.findByAgeRatingOrderByTitle(age);
	}
	public List<GenresOnly> getAllGenres(){
		return videoRepository.findAllProjectedBy();
	}

	
}


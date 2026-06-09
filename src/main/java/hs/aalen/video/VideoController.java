package hs.aalen.video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
	
	@Autowired
	VideoService videoService;
	
	@GetMapping("/videos")
	public List<Video> getVideos(){
		return videoService.getVideos();
	}
	@GetMapping("/videos/{title}")
	public Video getVideo(@PathVariable String title) {
		
		return videoService.getVideo(title);
	}
	@PostMapping("/videos")
	public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}
	@PutMapping("/videos/{title}")
	public void updateVideo(@PathVariable String title,@RequestBody Video video) {
		videoService.updateVideo(title, video);
	}
	@DeleteMapping("/videos/{title}")
	public void deleteVideo(@PathVariable("title") String title) {
		
		videoService.deleteVideo(title);
		
	}
	@GetMapping("/videosbygenre/{genre}")
	public List<Video> getAllVideosOfGenre(@PathVariable String genre){
		return videoService.getAllVideosOfGenre(genre);
	}
	@GetMapping("/videosbyage/{age}")
	public List<Video> getAllVideosOfAge(@PathVariable String age){
		return videoService.getAllVideosOfAge(age);
	}
	@GetMapping("/videogenres")
	public List<GenresOnly> getAllGenres(){
		return videoService.getAllGenres();
		
	}
	
}

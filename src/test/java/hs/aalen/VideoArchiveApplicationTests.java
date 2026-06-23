package hs.aalen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import hs.aalen.video.Video;

@SpringBootTest
class VideoArchiveApplicationTests {

	@Test
	void contextLoads() {
	}


//	@Test
//	void erstellerWirdEingetragen_richtig() {
//		Video video = new Video("Matrix", "Klassiker", "16", "Action");
//		video.erstellerEintragen("Niclas");
//		assertEquals("Niclas", video.getErstellerName());
//	}

	@Test
	void erstellerWirdEingetragen_falsch() {
		Video video = new Video("Matrix", "Klassiker", "16", "Action");
		video.erstellerEintragen("Niclas");
		assertEquals("Max", video.getErstellerName());
	}

}

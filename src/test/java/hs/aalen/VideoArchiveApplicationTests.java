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

	// Test fuer die Methode erstellerEintragen aus der Klasse Video.
	// Wir legen ein Video an, tragen einen Namen ein und pruefen ob er gespeichert wurde.
	// Mit der richtigen Methode wird der Test gruen, mit der kaputten Variante rot.
	@Test
	void erstellerWirdEingetragen() {
		Video video = new Video("Matrix", "Klassiker", "16", "Action");
		video.erstellerEintragen("Niclas");
		assertEquals("Niclas", video.getErstellerName());
	}

}

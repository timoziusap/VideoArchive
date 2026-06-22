package hs.aalen;

import hs.aalen.video.Video;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VideoArchiveApplicationTests {

	@Test
	void contextLoads() {
	}

// Test zum Ci zeigen
// Das ist der JUnit Test fuer die Methode werHatAngelegt aus der Klasse Video.
// import hs.aalen.video.Video;
// import static org.junit.jupiter.api.Assertions.assertEquals;

 @Test
 void zeigtWerDasVideoAngelegtHat() {
     Video video = new Video("Matrix", "Klassiker", "16", "Action");
     String ergebnis = video.werHatAngelegt("Niclas");
     assertEquals("Matrix wurde angelegt von Niclas", ergebnis);
 }

    // Methode zum Ci zeigen -
    // Gleiche Methode, aber der Name wurde vergessen.
    // Dadurch stimmt der Satz nicht und der Test wird rot.
    // public String werHatAngelegt(String name) {
    //     return title + " wurde angelegt von ";
    // }

}

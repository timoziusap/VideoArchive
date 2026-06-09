package hs.aalen.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hs.aalen.video.GenresOnly;
import hs.aalen.video.Video;


@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		return personService.getPersons();
	}
	
	@GetMapping("/persons/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@PostMapping("/persons")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

	@PutMapping("persons/{id}")
	public void updatePerson(@PathVariable String id, @RequestBody Person person) {
		personService.updatePerson(id, person);
	}
	
	@DeleteMapping("/person/{title}")
	public void deleteVideo(@PathVariable("title") String title) {
		personService.deletePerson(title);
	}
	
}


package hs.aalen.person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hs.aalen.video.Video;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
		
		public List<Person> getPersons(){
			ArrayList<Person> myList = new ArrayList<>();
			Iterator<Person> it = personRepository.findAll().iterator();
			while(it.hasNext()) {
				myList.add(it.next());
			}
			return myList;
		}
		
		public Person getPerson(String id) {
			return personRepository.findById(id).orElse(null);
		}
		
		public void addPerson(Person person) {
			personRepository.save(person);
		}
		public void updatePerson(String id, Person person) {
			
			personRepository.save(person);
		}
		public void deletePerson(String title) {
			
			personRepository.deleteById(title);
		}
		
}

package com.irfan.emids;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public void addPersonDetails(Person person){
		personRepository.save(person);
	}
	
	public List<Person> getAllPersonDetails(){
		List<Person> persons=new ArrayList<>();
	  personRepository.findAll().forEach(persons::add);
	  return persons;
		}

}

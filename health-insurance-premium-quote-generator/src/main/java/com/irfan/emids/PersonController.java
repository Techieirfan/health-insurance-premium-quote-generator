package com.irfan.emids;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
@Autowired
	PersonService personService;
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public Double generateQuote(@RequestBody Person person){
		System.out.println("person"+ person.toString());
		personService.addPersonDetails(person);
		return new PremiumCalculatorService().getPremiumAmount(person);
	}
	@RequestMapping(method=RequestMethod.GET,value="/")
	public List<Person> getPersonDetails(){
		
		
		
		return personService.getAllPersonDetails();
	}

}

package com.irfan.emids;


public class PremiumCalculatorService {
	public double premium=5000;
	public double basepremium=0;
	
	
	
	public double getPremiumAmount(Person p){
		
		getPremiumByAge(p.getAge());
		getPremiumByGender(p.getGender());
		getPremiumByPreExiConditions(p);
		getPremiumByHabits(p);
		
		return premium;
	}
	public double getPremiumByAge(int age){
		if(age>=18 && age<=25){
			premium=premium+(premium *0.1);
		}else if(age>25 && age<=30){
			premium=premium+(premium *0.1);
			premium=premium+(premium *0.1);
		}else if(age>30 && age<=35){
			premium=premium+(premium *0.1);
			premium=premium+(premium *0.1);
			premium=premium+(premium *0.1);
		}else if(age>40){
			premium=premium+(premium *0.2);
		}
		basepremium=premium;
		return premium;//6655
	}
	public double getPremiumByGender(String gender){
		
		if(gender.equals("Male")){
			premium=premium+(premium *0.02);
			
		}		
		return premium;		
	}
	
	public double getPremiumByPreExiConditions(Person p){
		
		if(p.isHyperTension()){
			premium=premium+(premium *0.01);			
		}
		if(p.isBloodpressure()){
			premium=premium+(premium *0.01);			
		}
		if(p.isSugar()){
			premium=premium+(premium *0.01);			
		}
		if(p.isOverweight()){
			premium=premium+(premium *0.01);			
		}
		
		return premium;		
	}
	
	public double getPremiumByHabits(Person p){
		
		if(p.isExercise()){
			premium=premium-(basepremium *0.03);			
		}
		if(p.isSmoking()){
			premium=premium+(premium *0.03);			
		}
		if(p.isAlochol()){
			premium=premium+(premium *0.03);			
		}
		if(p.isDrugs()){
			premium=premium+(premium *0.03);			
		}
		
		return premium;			
	}
	
	

}

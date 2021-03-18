package Utility;

import org.openqa.selenium.WebElement;

public class Seleniumhelper {
	
	
	public static void clickonElement(WebElement element) {
		  element.click();
		
	}
	
	public static void typeontextbox(WebElement element,String text) {
		element.sendKeys("polo");
		
	}
	

	
	//describe your pom?
	
	/*:1= what is pom?
	Ans:pom is page object model which works page by page means against every page we will create a class
	 and will keep all the object and services in respective page.
	 
	2= why do u need pom?
	ans: as we know now a days developer keep changing UI very frequently so to keep track and more organized pom take place.
	
			
	3=Benefit of using pom?
			
	Ans:Pom helps to make code 	more business readable means we follow naming convention and the way design test cases
	 easily understandable flow of test case behavior it helps to avoid code means eventhough i am not responsible
	 for all pages but when we design our test cases i can gaiter any service from any classes because we use same driver 
	 through out the whole project
	 
	 3. well maintainable means if some thing goes wrong any where we don have to look for everywhere just check from
	 Which class it coming fix there and it will reflect where ever used.
	 
	 4. How it works in project--> Create class against each page and store all elements using findBy annotation and used 
	 single pattern in project means passing same driver in every class using constructor*/
			
		
	
	
	
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Seleniumhelper;

public class JeansPage {
	 
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"carousel__slide--0--2\"]")WebElement skinyjeans;
	public JeansPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	
	public void skinnyjeans() {
	
		Seleniumhelper.clickonElement(skinyjeans);
		
		
	}
	

}

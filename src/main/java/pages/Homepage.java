package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Seleniumhelper;

public class Homepage {
	
WebDriver dr;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/a/img")WebElement homepagetext;
	@FindBy(xpath="//*[@id=\"root-Men\"]/ol/li[2]/ol/li[14]")WebElement manjeans;
	public Homepage(WebDriver dr) {
		this.dr = dr;
		 PageFactory.initElements(dr, this);
	}
	
   public void clickonmanpage() {
	   Seleniumhelper.clickonElement(homepagetext);
	   
   }
	
	public JeansPage clickonmanjeans() {
		Seleniumhelper.clickonElement(manjeans);
		return new JeansPage(dr);
	}
	
	
	
	
	
}

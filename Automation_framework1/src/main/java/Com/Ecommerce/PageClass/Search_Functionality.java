package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class Search_Functionality extends Ecommerce_BaseClass{

	public Search_Functionality() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="small-searchterms")
	public WebElement Textbox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement SearchButton;



	public void Textbox() {
		Textbox.sendKeys("Mobile");
	}


	public void ClickButton() {
		SearchButton.click();
	}


}


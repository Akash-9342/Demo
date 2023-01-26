package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class Add_To_Cart extends Ecommerce_BaseClass{

	public Add_To_Cart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Computers')]")
	public WebElement Computer;
	
	@FindBy(xpath="//a[contains(text(),'Notebooks')]")
	public WebElement Notebook;
	
	
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".card-title a")
	public List<WebElement> productLinks;

	@FindBy(how = How.LINK_TEXT, using = "Phones")
	public WebElement phonesCategory;

	@FindBy(how = How.LINK_TEXT, using = "Laptops")
	public WebElement laptopsCategory;

	@FindBy(how = How.LINK_TEXT, using = "Monitors")
	public WebElement monitorsCategory;

	public void selectCategory(String categoryName) {
		switch (categoryName.toLowerCase()) {
			case "phones":
				phonesCategory.click();
				break;
			case "laptops":
				laptopsCategory.click();
				break;
			case "monitors":
				monitorsCategory.click();
				break;
			default:
				throw new IllegalArgumentException("Invalid category: " + categoryName);
		}
	}
}

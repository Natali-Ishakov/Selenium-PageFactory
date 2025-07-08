package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "cartur")
	public WebElement cartLink;

	@FindBy(how = How.CSS, using = "tr.success")
	public List<WebElement> cartTableRows;

	@FindBy(how = How.XPATH, using = "//a[text()='Delete']")
	public List<WebElement> deleteButtons;

	@FindBy(how = How.XPATH, using = "//button[text()='Place Order']")
	public WebElement placeOrderButton;

	public void openCart() {
		cartLink.click();
		wait.until(ExpectedConditions.visibilityOf(placeOrderButton));
	}

	public void deleteFirstItem() {
		if (!deleteButtons.isEmpty()) {
			deleteButtons.get(0).click();
		}
	}

	public int getCartItemCount() {
		wait.until(ExpectedConditions.visibilityOfAllElements(cartTableRows));
		return cartTableRows.size();
	}
}

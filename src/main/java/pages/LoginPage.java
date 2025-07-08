package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "login2")
	public WebElement loginButton;

	@FindBy(how = How.ID, using = "loginusername")
	public WebElement usernameField;

	@FindBy(how = How.ID, using = "loginpassword")
	public WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//button[text()='Log in']")
	public WebElement submitLogin;

	@FindBy(how = How.ID, using = "nameofuser")
	public WebElement welcomeMessage;

	public void login(String username, String password) {
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
		passwordField.sendKeys(password);
		submitLogin.click();
	}

	public String getWelcomeText() {
		wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
		return welcomeMessage.getText();
	}
}

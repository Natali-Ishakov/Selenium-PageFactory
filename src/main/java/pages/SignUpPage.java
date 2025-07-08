package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "signin2")
	public WebElement signUpButton;

	@FindBy(how = How.ID, using = "sign-username")
	public WebElement usernameField;

	@FindBy(how = How.ID, using = "sign-password")
	public WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//button[text()='Sign up']")
	public WebElement submitButton;

	public void openSignUpForm() {
		signUpButton.click();
		wait.until(ExpectedConditions.visibilityOf(usernameField));
	}

	public void fillUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void fillPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void submitForm() {
		submitButton.click();
	}

	public void signUp(String username, String password) {
		openSignUpForm();
		fillUsername(username);
		fillPassword(password);
		submitForm();
	}
}

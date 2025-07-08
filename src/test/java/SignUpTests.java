package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SignUpPage;

import java.time.Duration;

import static tests.BaseTest.driver;

public class SignUpTests extends tests.BaseTest {

	@Test
	public void signUpWithValidCredentials() {
		SignUpPage signUpPage = new SignUpPage(driver);

		// יצירת שם יוזר ייחודי לפי הזמן
		String username = "natali" + System.currentTimeMillis();
		String password = "123456";

		// ביצוע הרשמה
		signUpPage.signUp(username, password);

		// המתנה להופעת alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());

		// בדיקה של תוכן ה־alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Sign up successful.", alertText);
		alert.accept(); // לסגירת ה־alert
	}
}

package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTests extends tests.BaseTest {

	@Test
	public void loginWithValidCredentials() {
		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("natali1994", "123456");

		String actualText = loginPage.getWelcomeText();
		assertEquals("Welcome natali1994", actualText);
	}
}

package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomeTest extends tests.BaseTest {

	@Test
	public void selectPhonesCategory() {
		HomePage homePage = new HomePage(driver);
		homePage.selectCategory("phones");
	}

	@Test
	public void selectLaptopsCategory() {
		HomePage homePage = new HomePage(driver);
		homePage.selectCategory("laptops");
	}

	@Test
	public void selectMonitorsCategory() {
		HomePage homePage = new HomePage(driver);
		homePage.selectCategory("monitors");
	}
}

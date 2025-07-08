package tests;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static tests.BaseTest.driver;

public class CartTests extends tests.BaseTest {

	@Test
	public void addProductToCart() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.selectCategory("phones");

		// לחכות שעמוד המוצרים יטען
		Thread.sleep(1000); // להחליף ב־explicit wait אם תרצי

		// נכנס למוצר הראשון
		homePage.productLinks.get(0).click();

		// מחכים לטעינה של עמוד המוצר
		Thread.sleep(1000); // או wait לאלמנט addToCart

		ProductPage productPage = new ProductPage(driver);
		productPage.clickAddToCart();

		Thread.sleep(1000); // המתנה ל־alert
		driver.switchTo().alert().accept();

		CartPage cartPage = new CartPage(driver);
		cartPage.openCart();

		assertTrue(cartPage.getCartItemCount() > 0);
	}



}

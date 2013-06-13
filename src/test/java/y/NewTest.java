package y;

import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.Test;
import junit.framework.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

@Category(IntegrationTest.class)
public class NewTest {

	@Test
	@Category(y.IntegrationTest.class)
	public void emptyTest1() throws Exception {
        HtmlUnitDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}
}

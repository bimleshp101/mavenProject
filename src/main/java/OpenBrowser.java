import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
    public void testBrowser() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
	}
}

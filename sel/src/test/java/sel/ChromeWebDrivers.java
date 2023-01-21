package sel;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
	public class ChromeWebDrivers {

	    public static void main(String[] args) {    
	        System.setProperty("webdriver.chrome.driver", "chromedriver");
	        
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());          
	        driver.close();         
	        
	    }    
	}


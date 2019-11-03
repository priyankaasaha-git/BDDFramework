package oct_bdd_test.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/Automation/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.britishairways.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
		driver.findElement(By.linkText("Book a flight")).click();
		driver.findElement(By.xpath("//body[@id='threeColumnResp']/div[@id='bodyWrapper']/section[@id='baBody']/section[@id='page']/div[@class='large-10 medium-9 small-12 columns']/div[@class='row']/div[@id='pageContentMain']/section[@id='1483931534136']/article[2]/a[1]")).click();
		driver.findElement(By.id("toFilter")).sendKeys("PAR");
		Thread.sleep(3000);
		List<WebElement> toFiltr = driver.findElements(By.xpath("//ul[@id='destChoices']/ul/li"));
		System.out.println(toFiltr.size());
		System.out.println(toFiltr.get(0));
		for(int i = 0 ; i<toFiltr.size() ; i++) {
			String getCountry = toFiltr.get(i).getText();
			if(getCountry.contains("Bahamas")) {
				toFiltr.get(i).click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.className("register")).click();
		 * driver.findElement(By.id("email")).sendKeys("priyankaa.saha@gmail.com");
		 * driver.findElement(By.id("confirm-email")).sendKeys(
		 * "priyankaa.saha@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Password@12345");
		 * driver.findElement(By.id("confirm-password")).sendKeys("Password@12345");
		 * Select title = new Select(driver.findElement(By.id("title")));
		 * title.selectByVisibleText("Mrs");
		 * driver.findElement(By.id("first-name")).sendKeys("Priyanka");
		 * driver.findElement(By.id("family-name")).sendKeys("Saha Dey");
		 * 
		 * WebElement radioBtn =
		 * driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]"
		 * )); radioBtn.click();
		 * 
		 * WebElement radioBtn1 = driver.findElement(By.
		 * xpath("//span[@class='radio-label'][contains(text(),'Join the Executive Club')]"
		 * )); radioBtn1.click();
		 * 
		 * WebElement radioBtn2 = driver.findElement(By.className("use-email-address"));
		 * radioBtn2.click();
		 * 
		 * driver.findElement(By.id("homeaddress1")).sendKeys("Apt 1");
		 * driver.findElement(By.id("homeaddress2")).sendKeys("3rd floor");
		 * driver.findElement(By.id("homeaddress3")).sendKeys("Cherry lane");
		 * driver.findElement(By.id("homecity")).sendKeys("Isleworth");
		 * driver.findElement(By.id("homestate")).sendKeys("London");
		 * driver.findElement(By.id("homepostalcode")).sendKeys("TW34OP");
		 */

		/*
		 * WebElement address1 =driver.findElement(By.id("homeaddress1"));
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrolltoview();";address1);
		 * 
		 */

		Select Country = new Select(driver.findElement(By.id("mobilecountrycode")));
		Country.selectByVisibleText("United Kingdom");

		driver.findElement(By.id("mobilephone")).sendKeys("12345678");

		Select Date = new Select(driver.findElement(By.id("birthday")));
		Date.selectByVisibleText("19");

		Select Month = new Select(driver.findElement(By.id("birthmonth")));
		Month.selectByVisibleText("April");

		Select Year = new Select(driver.findElement(By.id("birthyear")));
		Year.selectByVisibleText("1988");

		WebElement Gender = driver.findElement(By.xpath("//span[contains(text(),'Female')]"));
		Gender.click();

		Select Language = new Select(driver.findElement(By.id("pref_language")));
		Language.selectByVisibleText("English");

		Select DepCity = new Select(driver.findElement(By.id("flexPreferenceQuestionId20")));
		DepCity.selectByVisibleText("Kolkata");

		WebElement Offer = driver.findElement(By.xpath("//label[@class='receive-info-lbl']//span"));
		Offer.click();

		WebElement Info = driver.findElement(By.xpath("//label[@class='receive-partner-info-lbl']//span"));
		Info.click();

		WebElement TC = driver.findElement(By.xpath("//span[@class='align-right']"));
		TC.click();

	};
}

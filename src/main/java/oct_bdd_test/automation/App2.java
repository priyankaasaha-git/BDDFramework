package oct_bdd_test.automation;

import java.awt.Frame;
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
public class App2 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty( "webdriver.gecko.driver","C:/Program Files/Automation/geckodriver.exe");
        driver=new FirefoxDriver();
        
        launchBAURL();
        maximizewindow();
        Thread.sleep(3000);
        
        WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Button')]"));
		driver.switchTo().frame(frameElement);

	
		driver.findElement(By.xpath("//html//body//img")).click();
		
		
		WebElement frameContent = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Form Frame')]//div[@id='contents']"));
		driver.switchTo().frame(frameContent);
		
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Site feedback')]")).getText());
		
		driver.findElement(By.xpath("//h4[contains(text(),'Site feedback')]")).click();
	}
        
        
        
        
        
        
		/*
		 * clickRegister(); enterEmail(); enterConfirmEmail(); enterPassword();
		 * enterConfirmPassword(); enterTitle();
		 */   
    
    
    public static void launchBAURL()
    {
    	   driver.get("https://www.britishairways.com");
    }
    
    public static void maximizewindow()
    {
    	driver.manage().window().maximize();
    }
    
    public static void clickRegister()
    {
    	driver.findElement(By.className("register")).click();
    }
    
    public static void enterEmail()
    {
    	 driver.findElement(By.id("email")).sendKeys("priyankaa.saha@gmail.com");
    }
    
    public static void enterConfirmEmail()
    {
    	driver.findElement(By.id("confirm-email")).sendKeys("priyankaa.saha@gmail.com");
    }
    
    public static void enterPassword()
    {
    	driver.findElement(By.id("pass")).sendKeys("Password@12345");
    }
    
    public static void enterConfirmPassword()
    {
    	driver.findElement(By.id("confirm-password")).sendKeys("Password@12345");
    }
    
    public static void enterTitle()
    {
    	Select title = new Select(driver.findElement(By.id("title")));
        title.selectByVisibleText("Mrs");
    }
    
    public static void enterFirstName()
    {
    	driver.findElement(By.id("first-name")).sendKeys("Priyanka");
    }
    
    public static void enterLastName()
    {
    	driver.findElement(By.id("family-name")).sendKeys("Saha Dey");
    }
}

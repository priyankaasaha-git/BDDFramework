package oct_bdd_test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BritishAirways {
	public static WebDriver driver;
    public static void main( String[] args )
    {
        System.setProperty( "webdriver.gecko.driver","C:/Program Files/Automation/geckodriver.exe");
        driver=new FirefoxDriver();
        
        driver.get("https://www.britishairways.com");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
        
      
        
       
      
        

};
}

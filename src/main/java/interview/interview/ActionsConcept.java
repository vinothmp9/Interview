package interview.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\workspace\\interview\\browser\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjw8fr7BRDSARIsAK0Qqr65GXiWgzt2Zt3jblteLNdjDS0dtREwOmd42adVKhCuoZ7BpAEnNHoaAk8tEALw_wcB");
	WebElement click = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
	WebElement dress = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/div/div/div/li[2]/ul/li[2]/a"));
	Actions a=new Actions(driver);
	a.moveToElement(click).moveToElement(dress).build().perform();
	
	}

}

package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	//C:\selenium\chromedriver_win32
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
//System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("http://www.flipkart.com/");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vinay@123");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9087657890");
			driver.findElement(By.xpath("//button[@name='login']")).click();*/
		driver.findElement(By.xpath("//button[.='✕']")).click();
		/*driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Vinay@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9087657890");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();*/
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		//Actions act = new Actions(driver);
		//act.moveToElement(null)
		//driver.findElement(By.xpath(null)).clear();
		
	}

}


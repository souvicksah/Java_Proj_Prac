package Session1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	ChromeDriver driver;
	public void open()
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\WJP_220940320119\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr474951");
		driver.findElement(By.name("password")).sendKeys("umubyqU");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		//driver.findElement(By.name("dismiss-button")).click();
		driver.findElement(By.name("name")).sendKeys("Subrata");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.name("dob")).sendKeys("16-09-1997");
		driver.findElement(By.name("addr")).sendKeys("WestBengalKolkata");
		driver.findElement(By.name("city")).sendKeys("Kolkata");
		driver.findElement(By.name("state")).sendKeys("West Bengal");
		driver.findElement(By.name("pinno")).sendKeys("700110");
		driver.findElement(By.name("telephoneno")).sendKeys("8420919086");
		driver.findElement(By.name("emailid")).sendKeys("subrata01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Password@1234");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
		driver.findElement(By.linkText("Log out")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Script1 obj=new Script1();
      obj.open();
	}

}

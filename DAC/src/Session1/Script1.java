package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	ChromeDriver driver;
	//to open a browser
	public void Open()	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\WJP_220940320119\\Library\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/v4/");
	    driver.manage().window().maximize();
	    WebElement usrm=driver.findElement(By.name("uid"));
	    usrm.sendKeys("mngr474951");
	    WebElement pass=driver.findElement(By.name("password"));
	    pass.sendKeys("umubyqU");
	    driver.findElement(By.name("btnLogin")).click();
	    driver.findElement(By.linkText("New Customer")).click();
	    driver.findElement(By.name("name")).sendKeys("Timy");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
	    ///html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]
	    driver.findElement(By.name("dob")).sendKeys("16/11/1997");
	    driver.findElement(By.name("addr")).sendKeys("Nepal");
	    driver.findElement(By.name("city")).sendKeys("Kathmandu");
	    driver.findElement(By.name("state")).sendKeys("IdontKnow");
	    driver.findElement(By.name("pinno")).sendKeys("220320");
	    driver.findElement(By.name("telephoneno")).sendKeys("8420919086");
	    driver.findElement(By.name("emailid")).sendKeys("souvicksaha01@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Timy4Christ");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	    
	    //driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Script1 o=new Script1();
        o.Open();
	}

}

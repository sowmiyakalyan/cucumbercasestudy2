package cucumbercasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Registration {
	WebDriver driver;	  
	
	@Given("User enters into Registration page")
	public void user_enters_into_Registration_page() {
	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("enters into {string}, {string}, {string}, {string}, {string},  {string}, {string}, {string}, {string},  {string}")
	public void enters_into(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10){ 
	    	  driver.findElement(By.name("userName")).sendKeys(string);
			  driver.findElement(By.name("firstName")).sendKeys(string2);
			  driver.findElement(By.name("lastName")).sendKeys(string3);
			  driver.findElement(By.name("password")).sendKeys(string4);
			  driver.findElement(By.name("confirmPassword")).sendKeys(string5);
			  driver.findElement(By.xpath("//input[@value='Female']")).click();
			  driver.findElement(By.name("emailAddress")).sendKeys(string6);
			  driver.findElement(By.name("mobileNumber")).sendKeys(string7);
			  driver.findElement(By.name("dob")).sendKeys(string8);
			  driver.findElement(By.name("address")).sendKeys(string9);
			  //Select sel=new Select(driver.findElement(By.name(string10)));
			  //sel.selectByIndex(1);
			  driver.findElement(By.name("answer")).sendKeys(string10);
			  driver.findElement(By.name("Submit")).click(); 
			  //Assert.assertEquals(driver.getTitle(), "ram");
		
	}
	@When("i clicks on register button")
	public void click_on_Registration_button() {
		System.out.println("click on registration button");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User navigates to login page")
	public void registration_successful_page_is_displayed() {
		System.out.println("registration page is displayed");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 //Assert.assertEquals("Login","Login");
	}


}


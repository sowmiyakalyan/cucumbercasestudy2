package casestudy3;




import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;




import io.cucumber.java.en.Given;
 import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;




public class casestudy3 {
  WebDriver driver; 
  
  @Given("User should be on home page")
  public void user_should_be_on_home_page() {
   System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
   driver= new ChromeDriver();
   
   driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
     driver.findElement(By.id("details-button")).click();
     driver.findElement(By.id("proceed-link")).click();
     driver.findElement(By.linkText("SignIn")).click();
  }




 @When("User should be able to search Headphone")
  public void user_should_be_able_to_search_Headphone() {
    driver.findElement(By.name("userName")).sendKeys("Lalitha");
     driver.findElement(By.name("password")).sendKeys("Password123");
     driver.findElement(By.name("Login")).click();
     driver.findElement(By.xpath("//div[@class='autocomplete']/input")).sendKeys("headphone");
     driver.findElement(By.xpath("//*[@type='submit']")).click();
     driver.findElement(By.linkText("Add to cart")).click();
     
     
  }




 @Then("Successfully added headphone into cart")
  public void successfully_added_headphone_into_cart() {
      System.out.println("User searched Headphone successfully");
  }





 }


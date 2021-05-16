package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class RegisterUserStep {

	WebDriver driver;
		@Given("Given user is able to navigate onto the login page")
		public void loginPage() {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\NymishaNunna\\Desktop\\SDET_Training_2021\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
			    driver.get("http://elearningm1.upskills.in/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@When("When user clicks on the sign up button")
		public void clickSignUpButton() {
			driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			
		}
		
		@Then("Then user is on the registation page")
		public void registrationPage() {
			String actualMsg =  driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).getText();
			Assert.assertEquals("Regisration", actualMsg);
		}
		
		@And("user enter the firstname as {string}")
		public void enterFirstName(String string) {
		    driver.findElement(By.id("registration_firstname")).sendKeys(string);
		}
		@When("user enter the lastname {string}")
		public void enterLastName(String string) {
			 driver.findElement(By.id("registration_lastname")).sendKeys(string);
		}
		@And("user enter the e-mail as {string}")
		public void enterMailId(String string) {
			 driver.findElement(By.id("registration_email")).sendKeys(string);
		}
		@And("user enter the username as {string}")
		public void enterUsername(String string) {
			driver.findElement(By.id("username")).sendKeys(string);
		}
		@And("user enter the password ass {string}")
		public void enterPassword(String string) {
		   driver.findElement(By.id("pass1")).sendKeys(string);
		}
		
		@And("user enter the confirmpassword as {string}")
		public void enterConfirmPassword(String string) {
		   driver.findElement(By.id("pass2")).sendKeys(string);
		}
		
		@And("user clicks on the registration button")
		public void registrationButton() {
		    driver.findElement(By.id("registration_submit")).click();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		@And("user clicks on the picture button")
		public void clickPicture() {
		    driver.findElement(By.xpath("(//img[@class='img-circle'])[1]")).click();
		}
		
		@And("user clicks on the inbox button")
		public void clickInbox() {
		   driver.findElement(By.xpath("//a[@title='Inbox']")).click();
		}
		
		@And("user clicks on the compose button")
		public void composeMail() {
			driver.findElement(By.xpath("//img[@alt='Compose message']")).click();
		    
		}
		
		@And("user clicks on sendto as {string}")
		public void sendMail(String string) throws InterruptedException {
			WebElement textbox= driver.findElement(By.cssSelector("input.select2-search__field"));
			textbox.sendKeys("string");
			Thread.sleep(5000);
			textbox.sendKeys(Keys.ENTER);
		}
		
		
		@And("user enter the subject as {string}")
		public void enterSubject(String string)  {
		   	WebElement textbox= driver.findElement(By.id("compose_message_title"));
			textbox.sendKeys(string);
			
		}
	
		@And("user clicks on the Send Confirmaton button")
		public void sendConfirmation() {
			driver.findElement(By.id("compose_message_compose")).click();
		}
		
		@Then("user should see the acknowledgement window as {string}")
		public void confirmationMsg(String string) {
			 	String name = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			    String Actualdata = "Confirmation mail has been sent to Nymisha Nunna's mail id (nunna19)";
			    Assert.assertEquals(name,Actualdata);
			    System.out.println(string);	
			    driver.close();
		}

}

package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions {
	public ChromeDriver driver; //global variable
	@Given("Open the chrome browser")
	public  void openchromebrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("Load the application url")
	public  void Loadtheapplicationurl()  {
		driver.get("http://leaftaps.com/opentaps");
	}
	@Given("Enter the username as Demaosalesmanager" )
	
	public  void enterusername() {
		driver. findElement(By.id("username")).sendKeys("Demosalesmanager");
			}
	@Given("Enter the password")
	
	public  void enterpassword() {
		driver. findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	}
	@When("click on login button")
	public  void clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		}
	@Then("Home page should be displayed")
	public  void verifyHomepage() {
		boolean displayed= driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage is displayed");
		}
		else
			System.out.println("Home page is not displayed");
					}


		
	}



package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.java.en.*;

public class DidntReceive {

	public static WebDriver driver;

	@Given("^user launched browser$")
	public void user_launched_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(12, 12);
		System.out.println("launching Browser");
		String dir = System.getProperty("user.dir");
		
		System.out.println("Directory path: "+dir);
		System.setProperty("webdriver.gecko.driver", dir+"/Driver/geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to login page");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println("Driver maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@And("^Enter (.*) and (.*)$")
	public void enter_and(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter " + username + " and " + password);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();

	}

	@Then("^click on didint recive link$")
	public void click_on_didint_recive_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("navigate to next page and click on didn't recive link");
		String str = driver.getTitle();
		Assert.assertEquals(str,"Facebook");

	}
}

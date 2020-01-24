package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ZigWheels.Pages.ZigWheels_HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ZigWheels_HomePage_StepDefinition {

	public WebDriver driver;
	ZigWheels_HomePage ZigHome;
	
	Actions action;
	
	@When("^User is in Zigwheels home page$")
	public void User_is_in_Zigwheels_home_page()
	{
		ZigHome=new ZigWheels_HomePage(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zigwheels.com/");
	}
	
	@Then("^mouse hover on News & Reviews tab$")
	public void mouse_hover_on_News_and_Reviews_tab()
	{
		ZigHome=new ZigWheels_HomePage(driver);
		ZigHome.MouseHoverNewsAndReviewsTab();

	}

	@Then("^click on Gallery option$")
	public void click_on_Gallery_option()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ZigHome.ClickOnGalleryOption();
	}

	@Then("^verify user navigated to Image Gallery$")
	public void verify_user_navigated_to_Image_Gallery()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Picture Galleries - Cars & Bikes", ZigHome.verifyTextOnImageGallery());
		

	}
	
	@Then("^user quits the browser$")
	public void user_quits_the_browser()
	{
		driver.quit();
	}

	@When("^user selects Bike Gallery from dropdown$")
	public void user_selects_Bike_Gallery_from_dropdown()
	{
		System.out.println("Now in Galleries page");
		ZigHome.selectVehicleTypeDD();
	}

	@Then("^SelectMake dropdown is populated with bike options and select bike from DD$")
	public void SelectMake_dropdown_is_populated_with_bike_options_and_select_bike_from_DD()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ZigHome.selectVehicleMake();
	}

	@Then("^SelectModel dropdown is populated with appropriate bike model and select one bike model from DD$")
	public void SelectModel_dropdown_is_populated_wit_appropriate_bike_model_and_select_one_bike_model_from_DD()
	{
		ZigHome.selectVehicleModel();
	}

	@Then("^Click on Search button to view search related bikes$")
	public void Click_on_Search_button_to_view_search_related_bikes()
	{
		ZigHome.ClickOnSearchButton();
	}
	/*@Then("^user Mouse hover on New Cars$")
	public void user_Mouse_hover_on_New_Cars()
   {		ZigHome=new ZigWheels_HomePage(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ZigHome.newCarsDropdown(driver);
		
   }
	
	@And("^clicked on Tyres$")
	public void clicked_on_Tyres() throws InterruptedException
		{
		ZigHome=new ZigWheels_HomePage(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ZigHome.Tyres();
	   }


	@Then("^Verify that User navigate to TyreDekho page$")
	public void Verify_that_User_navigate_to_TyreDekho_page()
	{
		ZigHome=new ZigWheels_HomePage(driver);
		

	  Assert.assertEquals(ZigHome.currentTitle(),"Car and Bike Tyres in India - Price (2019), Features | TyreDekho");
	}

	*/
}

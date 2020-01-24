package com.ZigWheels.Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZigWheels_HomePage {
	public  WebDriver driver;
	Actions action;
	//Select select;
	
	public ZigWheels_HomePage(WebDriver driver){ 
		 
	    this.driver = driver; 
	    
	    PageFactory.initElements(driver, this);
	 
	    }
	
	@FindBy(xpath="//a[contains(text(),'News & Reviews')]")
	public WebElement NewsAndReviewsTab;
	
	@FindBy(xpath = "//span[@class='menuItemSpan' and contains(text(),'Gallery')]")
	public WebElement GalleryOption;
	
	@FindBy(id="n-askInput")
	public WebElement QuestionSearchBox;
	
	@FindBy (xpath="//a[@id='ui-id-85']")
	public WebElement clickSearch;
	
	@FindBy(xpath="//h1[contains(text(),' Picture Galleries - Cars & Bikes')]")
	public WebElement ImageGalleryText;
	
	@FindBy(id="vehicleType")
	public WebElement VehicleTypeDD;
	
	@FindBy(id="makeId")
	public WebElement VehicleSelectMakeDD;
	
	@FindBy(name="modelId")
	public WebElement VehicleModelDD;
	
	@FindBy(xpath="//a[@class='btn-p ani wth-100' and contains(text(),'Search')]")
	public WebElement searchButton;
	
	public void MouseHoverNewsAndReviewsTab()
	{
		action = new Actions(driver);
		action.moveToElement(NewsAndReviewsTab).perform();
				
	}
	
	public void ClickOnGalleryOption()
	{
		action.moveToElement(GalleryOption).click().build().perform();
		//GalleryOption.click();
	}
	
	public String verifyTextOnImageGallery()
	{
		String TextImageGallery=ImageGalleryText.getText();
		return TextImageGallery;
	}
	
	public void selectVehicleTypeDD()
	{
		Select select = new Select(VehicleTypeDD);
		select.selectByVisibleText("Bike Galleries");
		
	}
	
	public void selectVehicleMake()
	{
		Select select1 = new Select(VehicleSelectMakeDD);
		select1.selectByVisibleText("Honda");
		
	}
	
	public void selectVehicleModel()
	{
		Select select1 = new Select(VehicleModelDD);
		select1.selectByVisibleText("Activa 125");
		
	}
	
	public void ClickOnSearchButton()
	{
		searchButton.click();
	}
	
	
	/*public void SearchQuestion()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		QuestionSearchBox.sendKeys("Tata Nexon");
		clickSearch.click();
		
	} */
	
	/* @FindBy(xpath="//a[@data-track-label='cars']")
	public WebElement NewCarsDD;
	

	@FindBy(xpath="//span[@class='menuItemSpan' and contains(text(),'Tyres')]")
	public WebElement Tyres;

	 
	public void newCarsDropdown(WebDriver driver)
	{
		//WebElement cars = driver.findElement(By.xpath("//a[@data-track-label='cars']"));
		 Actions action = new Actions(driver);
		action.moveToElement(NewCarsDD).build().perform();
		
	}
	public void Tyres() throws InterruptedException
	{	
		//driver.findElement(By.xpath("//span[@class='menuItemSpan' and contains(text(),'Tyres')]")).click();
		//Thread.sleep(5000);
		Tyres.click();
		
	}
	
	public String currentTitle()
	{
		Set<String>windows= driver.getWindowHandles();
		Iterator<String> ite = windows.iterator();
		String PID = ite.next();
		String CID = ite.next();
		driver.switchTo().window(CID);
		
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
*/
	
}
package bookpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookmypkg {
	
	WebDriver driver;
	

	
	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")
	WebElement login;
	
     @FindBy(xpath = "//*[@id=\"nav-menu-item-5731\"]/a")
     WebElement menu;

	@FindBy(xpath = "//*[@id=\"nav-menu-item-5752\"]")
	WebElement products;
	
	@FindBy(xpath = "//*[@id=\"woocommerce_product_categories-2\"]/ul/li[1]")
	WebElement gift;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/ul/li[1]")
	WebElement pen1;
	
	//@FindBy(xpath = "//*[@id=\"pa_available-ink-color\"]/option[2]")
	//WebElement colour;
	
	@FindBy(xpath = "//*[@id=\"product-3883\"]/div/div/div[2]/form/button")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"ttt-pnwc-notice\"]/div/div/div/header/button")
	WebElement close;
	
	@FindBy(xpath = "//*[@id=\"product-3883\"]/div/div/div[2]/form/a")
	WebElement viewcart;
	
	@FindBy(xpath = "//*[@id=\"calc_shipping_city\"]")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"calc_shipping_postcode\"]")
	WebElement pincode;
	
	@FindBy(xpath = "//*[@id=\"panel-cart-total\"]/div/div/a")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"billing_first_name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"billing_last_name\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"billing_company\"]")
	WebElement companyname;
	
	@FindBy(xpath = "//*[@id=\"billing_wooccm11_No\"]")
	WebElement gst;
	
	@FindBy(xpath = "//*[@id=\"billing_address_1\"]")
	WebElement address;
	
	@FindBy(xpath = "//*[@id=\"billing_city\"]")
	WebElement town;
	
	//@FindBy(xpath = "//*[@id=\"select2-billing_state-result-v9q0-KL\"]")
	//WebElement state;
	
	@FindBy(xpath = "//*[@id=\"billing_postcode\"]")
	WebElement pincodes;
	
	@FindBy(xpath = "//*[@id=\"billing_phone\"]")
	WebElement number;
	
	@FindBy(xpath = "//*[@id=\"ship-to-different-address\"]/label")
	WebElement untick;
	
	//@FindBy(xpath = "//*[@id=\"place_order\"]")
	//WebElement placeorder;
	
	//@FindBy(xpath = "//*[@id=\"buttons\"]/span/a[3]")
	//WebElement cancel;
	
	//@FindBy(xpath = "//*[@id=\"buttons\"]/span/a[1]/span")
	//WebElement cancelbank;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/a[1]")
	WebElement profile;
	
	@FindBy(xpath = "//*[@id=\"content\"]/article/div/div/nav/ul/li[8]/a")
	WebElement logout;
	
	
	public Bookmypkg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String usr,String pass)
	{
	
		username.clear();
		username.sendKeys(usr);
		password.clear();
		password.sendKeys(pass);
		
	}
	public void login()
	{
		login.click();
	}
	
	public void product() 
	
	{
		
		menu.click();
		products.click();
		gift.click();
		pen1.click();
		//colour.click();
		cart.click();
		close.click();
		viewcart.click();
		
	}
	
	public void setvalues1(String cit,String pin) throws Exception
	{
		Thread.sleep(2000);
		city.clear();
		pincode.clear();
		city.sendKeys(cit);
		pincode.sendKeys(pin);
	}
	public void checkout()
	{
		checkout.click();
	}
	
	public void setvalues2(String name,String lname,String cmname,String addrs,String twn,String pncod,String nmber) throws Exception
	{
		Thread.sleep(1000);
		firstname.clear();
		lastname.clear();
		companyname.clear();
		address.clear();
		town.clear();
		pincodes.clear();
		number.clear();
		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		companyname.sendKeys(cmname);
		gst.click();
		address.sendKeys(addrs);
		town.sendKeys(twn);
	//	state.click();
		pincodes.sendKeys(pncod);
		number.sendKeys(nmber);
		untick.click();
		
	}
	
	public void placeoder()
	{
	//placeorder.submit();
	}
	
	public void cancel() throws Exception
	{
		Thread.sleep(3000);
		//cancel.click();
		
	}
	public void bankcancel() throws Exception
	{
		//cancelbank.submit();
		Thread.sleep(2000);
	}
	
	public void logout() throws Exception
	{
		Thread.sleep(3000);
		profile.click();
		logout.click();
		driver.navigate().refresh();
	}
}

	
	
	
	
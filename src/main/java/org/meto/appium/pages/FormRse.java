package org.meto.appium.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormRse extends AndroidActions{
	AndroidDriver driver;
	
	public FormRse(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/autoCompleteTextView")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement autoc;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/autoCompleteTextView")).sendKeys("VE");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement autoctext;
	
	//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("10");;
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeone;
	
	//	MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activetwo;
	
	//MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activetree;
	
	//MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activefour;

	//MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activefive;
	
	//MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activesix;
	
	//MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeseven;
	
	//MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeeight;
	
	//MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activenine;
	
	//MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activethen;
	
	//MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activeeleven;
	
	//MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement activetwelv;
	
	//MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pasivocone;
	
	//MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pasivoctwo;
	
	//MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pasivoctree;
	
	//MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pasivocfour;
	
	//MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement pasivolargoplazo;
	
	//MobileElement el20 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/rse_add_product");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rse_add_product")
	private WebElement addprod;
	
	//MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valormat;
	
	//WebElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valorobra;
	
	//MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement precioventa;
	
	//MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement produc;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Unidad de medida']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Unidad de medida']")
	private WebElement unidadm;
	
	//MobileElement el25 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnprod;
	
	//MobileElement el26 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/rse_add_expenses");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/rse_add_expenses")
	private WebElement btndeuda;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Destino de la deuda']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Destino de la deuda']")
	private WebElement destdeuda;
	
	//MobileElement el27 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/autoCompleteTextView");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/autoCompleteTextView")
	private WebElement entidab;
	
	//MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement montot;
	
	//MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement saldoc;
	
	//MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement valorc;

	//MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement cuota;
	
	//MobileElement el32 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText");
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement cpagada;
	
	//MobileElement el33 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btngastos;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Gasto de personal']")).sendKeys("10");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Gasto de personal']")
	private WebElement gastop;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Alquiler']")).sendKeys("10");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Alquiler']")
	private WebElement alquila;

	//driver.findElement(By.xpath("//android.widget.EditText[@text='Transporte']")).sendKeys("10");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Transporte']")
	private WebElement transp;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Mantenimiento (Agua/luz/gas)']")).sendKeys("10");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Mantenimiento (Agua/luz/gas)']")
	private WebElement mant;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Otros servicios (Internet/teléfono/celular)']")).sendKeys("10");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Otros servicios (Internet/teléfono/celular)']")
	private WebElement otross;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Alimentación']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Alimentación']")
	private WebElement alimenta;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Salud']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Salud']")
	private WebElement salud;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Alquiler vivienda']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Alquiler vivienda']")
	private WebElement alquilav;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Servicios públicos vivienda']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Servicios públicos vivienda']")
	private WebElement publicov;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Educación']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Educación']")
	private WebElement educa;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Transporte']")).sendKeys("15");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Transporte']")
	private WebElement transpor;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Entretenimiento']")).sendKeys("20");
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Entretenimiento']")
	private WebElement entret;
	
	//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Sí']")).click(); 
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Sí']")
	private WebElement btnotring;
	
	//MobileElement el32x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/etInputGeneral");
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/etInputGeneral")
	private WebElement otring;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Constancia de otros ingresos']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Constancia de otros ingresos']")
	private WebElement fotoconsing;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Origen de otros ingresos']")).click();
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Origen de otros ingresos']")
	private WebElement origingreso;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement btnextrse;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement btnbusness;
	
	
	public FormRse autoComplit() {
		autoc.click();
		return this;
		
	}
	
	public FormRse giro(String girotext) {
		autoctext.sendKeys(girotext);
		autocompGiro();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		return this;
		
	}
	
	public FormRse activeC1(String active1) {
		activeone.sendKeys(active1);
		return this;
		
	}
	
	public FormRse activeC2(String active2) {
		activetwo.sendKeys(active2);
		return this;
		
	}
	
	public FormRse activeC3(String active3) {
		activetree.sendKeys(active3);
		return this;
		
	}
	
	public FormRse activeC4(String active4) {
		activefour.sendKeys(active4);
		return this;
		
	}
	
	public FormRse activeC5(String active5) {
		activefive.sendKeys(active5);
		return this;
		
	}
	
	public FormRse activeC6(String active6) {
		activesix.sendKeys(active6);
		return this;
		
	}
	
	public FormRse activeC7(String active7) {
		activeseven.sendKeys(active7);
		return this;
		
	}
	
	public FormRse activeC8(String active8) {
		activeeight.sendKeys(active8);
		return this;
		
	}
	
	public FormRse activeC9(String active9) {
		activenine.sendKeys(active9);
		return this;
		
	}
	
	public FormRse activeC10(String active10) {
		activethen.sendKeys(active10);
		return this;
	}
	
	public FormRse activeC11(String active11) {
		activeeleven.sendKeys(active11);
		return this;
		
	}
	
	public FormRse activeC12(String active12) {
		activetwelv.sendKeys(active12);
		return this;
		
	}

	public FormRse pasivoC1(String pasivoc1) {
		pasivocone.sendKeys(pasivoc1);
		return this;
		
	}
	
	public FormRse pasivoC2(String pasivoc2) {
		pasivoctwo.sendKeys(pasivoc2);
		return this;
		
	}
	
	public FormRse pasivoC3(String pasivoc3) {
		pasivoctree.sendKeys(pasivoc3);
		return this;
		
	}
	
	public FormRse pasivoC4(String pasivoc4) {
		pasivocfour.sendKeys(pasivoc4);
		return this;
		
	}
	
	public FormRse pasivoLargoPlazo(String pasivol1) {
		pasivolargoplazo.sendKeys(pasivol1);
		return this;
		
	}
	
	public FormRse addProduct() {
		addprod.click();
		return this;
		
	}
	
	public FormRse valorMateria(String vmateria) {
		valormat.sendKeys(vmateria);
		return this;
		
	}
	
	public FormRse valorObra(String vobra) {
		valorobra.sendKeys(vobra);
		return this;
		
	}
	
	public FormRse precioVenta(String pventa) {
		precioventa.sendKeys(pventa);
		return this;
		
	}
	
	public FormRse product(String elprod) {
		produc.sendKeys(elprod);
		return this;
		
	}
	
	public FormRse unidMeasure() {
		unidadm.click();
		unidaddemedida();
		return this;
		
	}
	
	public FormRse btnproduct() {
		btnprod.click();
		return this;
		
	}
	
	public FormRse btnExpenses() {
		btndeuda.click();
		return this;
		
	}
	
	public FormRse destinydebt() {
		destdeuda.click();
		destinoDeuda();
		return this;
		
	}
	
	public FormRse entityBank(String entidadbanca) {
		entidab.sendKeys(entidadbanca);
		return this;
		
	}
	
	public FormRse totalAmount(String montotot) {
		montot.sendKeys(montotot);
		return this;
		
	}
	
	public FormRse balanceCap(String saldocap) {
		saldoc.sendKeys(saldocap);
		return this;
		
	}
	
	public FormRse quotaValue(String valorcuot) {
		valorc.sendKeys(valorcuot);
		return this;
		
	}
	
	public FormRse feeamount(String cuotas) {
		cuota.sendKeys(cuotas);
		return this;
		
	}
	
	public FormRse payment(String pago) {
		cpagada.sendKeys(pago);
		return this;
		
	}
	
	public FormRse saveExpense() {
		btngastos.click();
		return this;
		
	}
	
	public FormRse expensePersonal(String gpersonal) {
		gastop.sendKeys(gpersonal);
		return this;
		
	}
	
	public FormRse rent(String alquiler) {
		alquila.sendKeys(alquiler);
		return this;
		
	}
	
	public FormRse transport(String transpor) {
		transp.sendKeys(transpor);
		return this;
		
	}
	
	public FormRse maintenance(String mantenim) {
		mant.sendKeys(mantenim);
		return this;
		
	}
	
	public FormRse otherServices(String oserv) {
		otross.sendKeys(oserv);
		return this;
		
	}
	
	public FormRse feeding(String alimentacion) {
		alimenta.sendKeys(alimentacion);
		return this;
		
	}
	
	public FormRse salud(String susalud) {
		salud.sendKeys(susalud);
		return this;
		
	}
	
	public FormRse alquiler(String alquiland) {
		alquilav.sendKeys(alquiland);
		return this;
		
	}
	
	public FormRse servicioPublico(String spublico) {
		publicov.sendKeys(spublico);
		return this;
		
	}
	
	public FormRse educacion(String educando) {
		educa.sendKeys(educando);
		return this;
		
	}
	
	public FormRse transportes(String transporta) {
		transpor.sendKeys(transporta);
		return this;
		
	}
	
	public FormRse entretenimiento(String entretener) {
		entret.sendKeys(entretener);
		return this;
		
	}
		
	public FormRse btnotroingreso() {
		btnotring.click();
		return this;
		
	}
	
	public FormRse otroIngreso(String otroi) {
		otring.sendKeys(otroi);
		return this;
		
	}
	
	public FormRse fotoConstIngreso() {
		fotoconsing.click();
		fotoconsing.click();
		fotoConsOtroIng();
		nListo.click();
		return this;
		
	}
	
	public FormRse origenOtroIngreso() {
		origingreso.click();
		origendeOtroIng();
		return this;
		
	}
	
	public FormRse saveBusiness() {
		btnbusness.click();
		return this;
		
	}
	
	/*
	public FormRse btnNextRse() {
		btnextrse.click();
		return this;
		
	}*/
	
	public FormProposal btnNextRse() throws InterruptedException  {
		btnextrse.click();
		return new FormProposal(driver);
		
	}
	
	
	public FormRse swipeScreenOneRse() {
		swipeScreen();
		return this;
		
	}
	
	public FormRse swipeScreenTwoRse() {
		swipeScreenTwoRsen();
		return this;
		
	}
	
	public FormRse swipeScreenTreeRse() {
		swipeScreenTreeRsen();
		return this;
		
	}
	
	
}

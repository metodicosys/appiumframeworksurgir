package org.meto.appium.pages;

import java.time.Duration;

import org.meto.appium.utils.AndroidActionsGuarantor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class FormGuarantor extends AndroidActionsGuarantor {
	
	AndroidDriver driver;
	
	public FormGuarantor(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

	}
	
	//driver.findElement(By.id("pe.com.surgir.surgirapp:id/list")).click();
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/list")
	private WebElement tipogarant;
	
	//pe.com.surgir.surgirapp:id/btn_continue
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_continue")
	private WebElement nextad;
	
	//Garante
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numDoc;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Verificar']")
	private WebElement nVerifica;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/component_datetime_input")
	private WebElement fecCaducidad;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement firstName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondName;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement firstSurname;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement secondSurname;
	
	@AndroidFindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement FecNa;
		
	//Teléfono
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement nMobile;	
	
	//Correo
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText")
	private WebElement  nMail;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement btnContinuarProspect;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/positive_radio_button")
	private WebElement checkData;
		
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continuar']")
	private WebElement btnContinuarData;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")
	private WebElement btnContinuarValid;
	
	
	
	public FormGuarantor typeGuarantee() {
		tipogarant.click();
		tipgarant();
		return this;
		
	}
	
	public FormGuarantor nextAddGuarantee() {
		nextad.click();
		return this;
		
	}
	
// garante
	public FormGuarantor setNumDoc(String numdoc) {
		numDoc.sendKeys(numdoc);
		return this;
		
	}
		
	public FormGuarantor Verificando() {
		WebElement nverifica = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();

		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
		return this;
		
	}
	
	
	public FormGuarantor setFecCaducidad(String feccaducidad) {
		fecCaducidad.sendKeys(feccaducidad);
		return this;
		
	}
	
	public FormGuarantor setFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
		return this;
		
	}
	
	public FormGuarantor setSecondName(String secondname) {
		secondName.clear();
		secondName.sendKeys(secondname);
		return this;
	}
	
	public FormGuarantor setSurName(String firstsurname) {
		firstSurname.clear();
		firstSurname.sendKeys(firstsurname);
		return this;

	}
	
	public FormGuarantor avance() {
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(560, 789)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(560, 260)).release().perform();
		return this;
		
	}
	
	public FormGuarantor setSecondSureName(String secondsurname) {
		secondSurname.clear();
		secondSurname.sendKeys(secondsurname);
		return this;
		
	}
	
	public FormGuarantor setFecNa(String fecna) {
		FecNa.clear();
		FecNa.sendKeys(fecna);
		return this;
		
	}
	
	public FormGuarantor setnMobile(String nmobile) {
		nMobile.clear();
		nMobile.sendKeys(nmobile);
		return this;
		
	}
	
	
	public FormGuarantor setnMail(String mail) {
		nMail.clear();
		nMail.sendKeys(mail);
		return this;
		
	}

	public FormGuarantor continuarProspect() {
		btnContinuarProspect.click();
		return this;
		
	}
	
	public FormGuarantor scrollData() {
		scrolluseData();
		checkData.click();
		return this;
		
	}
	
	public FormGuarantor continuarData() {
		btnContinuarData.click();
		return this;
		
	}
	
	
	public FormCustomerGuarantor bcontinuarValid() throws InterruptedException {
	//	Thread.sleep(5000);
		btnContinuarValid.isEnabled();
		btnContinuarValid.click();
		return new FormCustomerGuarantor(driver);
		
	}
	
	
	
	

}

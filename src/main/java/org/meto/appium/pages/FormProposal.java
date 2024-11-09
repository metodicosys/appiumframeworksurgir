package org.meto.appium.pages;

import java.time.Duration;
import org.meto.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.DefaultElementByBuilder;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

public class FormProposal extends AndroidActions {
	AndroidDriver driver;
	private String dsegmento;
	
	public FormProposal(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(new AppiumElementLocatorFactory(driver, Duration.ofSeconds(5000), new DefaultElementByBuilder(MobilePlatform.ANDROID, AutomationName.ANDROID_UIAUTOMATOR2)), this);

		
	}
	
	//Contingencia
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"App Surgir en contingencia\"]")
	private WebElement enconting;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='0.00']")
	private WebElement montoaval;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Calcular deuda']")
	private WebElement deudab;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Producto']")
	private WebElement mdesp;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    private WebElement segmentx;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Destino del préstamo']")
	private WebElement destp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Presupuesto de obra']")
	private WebElement fotopresup;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Frecuencia de cuotas']")
	private WebElement fcuot;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Cantidad de cuotas']")
	private WebElement  ccuot;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCalculateRate")
	private WebElement calctas;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCalculateAmount")
	private WebElement calcmont;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnCancel")
	private WebElement botcanc;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnConfirm")
	private WebElement cerrRse;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Fecha del primer vencimiento']")
	private WebElement fecven;
	
	//@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Seleccionar seguros']")
	private WebElement segbasico;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement segoptativ;
		
	@AndroidFindBy(xpath="//*[@text='Agregar']")
	private WebElement agregopt;
	
	@AndroidFindBy(xpath="//android.widget.AutoCompleteTextView[@text='Tipo de documento']")
	private WebElement tipodopt;
		
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Número de documento']")
	private WebElement numdocc;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Primer nombre']")
	private WebElement primernom;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Segundo nombre']")
	private WebElement segundonom;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellido paterno']")
	private WebElement primerapell;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Apellido materno']")
	private WebElement segundoapell;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Fecha de Nacimiento']")
	private WebElement fecnaopt;
	
	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]")
	private WebElement estciv;
	
	@AndroidFindBy(xpath="(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[2]")
	private WebElement gend;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Celular']")
	private WebElement celopt;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/dialog_relationship")
	private WebElement selectparent;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
	private WebElement segas;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement porcopt;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btn_submit_prospect")
	private WebElement addben;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessSave")
	private WebElement saveprop;
	
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/btnFormBusinessNext")
	private WebElement nextprop;
	
	//Contrato
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Contrato\"]/android.widget.TextView")
	private WebElement ncontrato;
	
	//Propuesta
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Propuesta\"]/android.widget.TextView")
	private WebElement npropuesta;
	
	//Botón Listo de galeria
	@AndroidFindBy(id="pe.com.surgir.surgirapp:id/button_gallery_listo")
	private WebElement nListo;
	
	
	public FormProposal debtBtn() {
		deudab.click();
		return this;
		
	}
	
	public FormProposal amountguarantor(String valuen) {
		montoaval.sendKeys(valuen);
		return this;
		
	}
	
	//Validando Responsabilidad de cliente
	public FormProposal validRespCustomer() {
		validResponsabilidad();
		return this;
		
	}
	
	public FormProposal producto() throws InterruptedException {
		mdesp.click();
		product();
		Thread.sleep(15000);
		return this;
		
	}
	
	// aqui capturo el valor del segmento en propuesta
	public FormProposal segmentos() {
		segmentosdat();
		return this;
		
	}
	
	public FormProposal destinoPrest() throws InterruptedException {
	//	Thread.sleep(5000);
		destp.click();
		destinopr();
		Thread.sleep(4000);
		return this;
		
	}
	
	public FormProposal fotoPresupuesto() {
		fotopresup.click();
		fotopresup.click();
		fotoPres();
		nListo.click();
		return this;
		
	}
	
	public FormProposal frecuenciaCuota() {
		fcuot.click();
		freccuota();
		return this;
		
	}
	
	public FormProposal cantidadCuota() {
		ccuot.click();
		canticuota();
		return this;
		
	}
	
	public FormProposal calculaTasa() throws InterruptedException {
		calctas.click();
		Thread.sleep(9000);
		return this;
		
	}
	
	public FormProposal calculaMonto() throws InterruptedException {
		calcmont.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal btnCancelMonto() throws InterruptedException {
		botcanc.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal btnCerrarRse() {
		cerrRse.click();
		return null;
		
	}
	
	public FormProposal fecVencimiento(String fecv) {
		fecven.sendKeys(fecv);
		return this;
		
	}
	
	public FormProposal seguroBasico() {
		segbasico.click();
		segurob();
		return this;
		
	}
	
	public FormProposal seguroOptative() {
		segoptativ.click();
		seguropt();
		return this;
		
	}
	
	
	public FormProposal addOptative() {
		agregopt.click();
		return this;
		
	}
	
	public FormProposal tipoDocOptative() {
		tipodopt.click();
		tipodocumentoptative();
		return this;
		
	}
	
	public FormProposal numberDoc(String dniopt) {
		numdocc.sendKeys(dniopt);
		return this;
		
	}
	
	public FormProposal firstName(String pname) {
		primernom.sendKeys(pname);
		return this;
		
	}
	
	public FormProposal otherName(String sname) {
		segundonom.sendKeys(sname);
		return this;
		
	}
	
	public FormProposal lastName(String apater) {
		primerapell.sendKeys(apater);
		return this;
		
	}
	
	public FormProposal surName(String amater) {
		segundoapell.sendKeys(amater);
		return this;
		
		
	}
	
	public FormProposal fecnaBeneficiaries(String fecnac) {
		fecnaopt.sendKeys(fecnac);
		return this;
		
	}
	
	public FormProposal eCivil() {
		estciv.click();
		sueCivil();
		return this;
		
	}
	
	public FormProposal gender() {
		gend.click();
		suGenero();
		return this;
		
	}
	
	public FormProposal telfBeneficiaries(String celul) {
		celopt.sendKeys(celul);
		return this;
	}
	
	public FormProposal relationship() {
		selectparent.click();
		scrollToTextRelation();
		return this;
		
	}
	
	public FormProposal seguroAsociado() {
		segas.click();
		seguroAsocia();
		return this;
		
	}
	
	public FormProposal percentage(String porcen) {
		porcopt.sendKeys(porcen);
		return this;
		
	}
	
	public FormProposal saveBeneficiaries() throws InterruptedException {
		addben.click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public FormProposal swipeScreenOneProposal() {
		swipeScreen();
		return this;
		
	}
	
	public FormProposal  mextOneResp() {
		crollToPageResp();
		return this;
		
	}
	

	public FormProposal nextOneProposal() {
		scrollToPageProposal();
		return this;
		
	}
	
	public FormProposal nexOneBeneficiaries() {
		scrollToPageBeneficiari();
		return this;
		
	}
	
	
	public FormProposal savePropos() throws InterruptedException {
		saveprop.click();
		Thread.sleep(1000);
		return this;
		
	}
	
	public FormProposal passContract() {
		ncontrato.click();
	//	ncontrato.click();
		return this;
		
	}
	
	public FormProposal passPropuesta() {
		npropuesta.click();
	//	ncontrato.click();
		return this;
		
	}
	
	public FormProposal swipeScreenOneRse() {
		//swipeScreen();
			String toastMessage = enconting.getAttribute("name");
			System.out.println("Continggencia: "+ toastMessage);
			if (toastMessage.contains("contingencia")) {
				swipeScreen2(); //concontingencia
			}else {
				swipeScreen();
			}
			
			return this;
			
	}
	
	public FormContract saveProposal() throws InterruptedException  {
		nextprop.click();
		Thread.sleep(1000);
		return new FormContract(driver);
		
	}
	
	
}

package Lcw_Project.tests;

import Lcw_Project.pages.Lcw;
import Lcw_Project.utilities.ConfigReader;
import Lcw_Project.utilities.Driver;
import Lcw_Project.utilities.ReusableMethods;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

public class Lcw_Urun_Ekleme {
    /*
    @FindBy(xpath = "//a[@class='menu-header-item__title']")
    public WebElement kadın;
    @FindBy(xpath = "(//a[@class='full-width-slider__button'])[1]")
    public WebElement kisaKolluTshirt;
    @FindBy(xpath = "(//*[@class='product-card__title'])[3]")
    public WebElement secilenTshirt;
    @FindBy(xpath = "//*[text()='Tüm Çerezleri Reddet']")
    public WebElement cerez;
    @FindBy(xpath = "(//a[@size='S'])[1]")
    public WebElement bedenS;
    @FindBy(xpath = "//a[@id='pd_add_to_cart']")
    public WebElement ekle;
    @FindBy(xpath ="(//*[@class='cart-dropdown  '])[3]")
    public WebElement sepetim;
    @FindBy(xpath = "(//*[@class='tooltipInfo tooltipInfoFirsText'])[1]")
    public WebElement bosluk;
     */

@Test
    public void Lcw(){
    Lcw lcw=new Lcw();
    Driver.getDriver().get(ConfigReader.getProperty("Lcw_Url"));
    ReusableMethods.bekle(2);
    lcw.cerez.click();
    lcw.kadın.click();
    Assert.assertTrue(lcw.kadın.isDisplayed());
    ReusableMethods.bekle(2);
    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    lcw.kisaKolluTshirt.click();
    Actions actions1=new Actions(Driver.getDriver());
    actions1.sendKeys(Keys.PAGE_DOWN).perform();
    lcw.secilenTshirt.click();
    ReusableMethods.bekle(2);
    Actions actions2=new Actions(Driver.getDriver());
    actions2.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
    lcw.bosluk.click();
    ReusableMethods.bekle(2);
    lcw.bedenS.click();
    Assert.assertTrue(lcw.bedenS.isDisplayed());
    ReusableMethods.bekle(2);
    lcw.ekle.click();
    Assert.assertTrue(lcw.ekle.isDisplayed());
    ReusableMethods.bekle(1);
    lcw.sepetim.click();
    Assert.assertTrue(lcw.sepetim.isDisplayed());
    ReusableMethods.bekle(2);
    Driver.getDriver().navigate().to(ConfigReader.getProperty("Lcw_Url"));
    ReusableMethods.bekle(2);

    Driver.closeDriver();






}

}

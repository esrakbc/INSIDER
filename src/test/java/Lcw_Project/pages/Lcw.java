package Lcw_Project.pages;

import Lcw_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lcw {

    public Lcw(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
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




}

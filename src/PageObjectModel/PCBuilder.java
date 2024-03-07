/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Aleksa
 */
public class PCBuilder {
     
    WebDriver driver;
    
    public PCBuilder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="//body[1]/div[20]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")
    WebElement siteMenu;
    
    @FindBy(xpath="//body[1]/div[20]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement buildOwnPCLabel;
    
    @FindBy(xpath="//body[1]/div[16]/div[2]/div[1]/div[1]/div[6]/div[1]/a[1]")
    WebElement CPU;
    
    @FindBy(xpath="//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/i[1]")
    WebElement changeNameMyList;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement myListInputField;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")
    WebElement updateMyListName;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")
    WebElement arrowList;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]")
    WebElement CPUSelectButton;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]")
    WebElement CPUSelectButton2;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/button[1]")
    WebElement Motherboard;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]/i[1]")
    WebElement MotherboardSelectButton;
    
    @FindBy(xpath = "/html[1]/body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/button[1]")
    WebElement Memory;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/select[1]")
    WebElement sortBy;
    
    @FindBy(css="option[value='2']")
    WebElement highestPriceOption;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/div[2]/div[2]/div[1]/button[1]")
    WebElement MemorySelectButton;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/button[1]")
    WebElement VideoCard;
    
    @FindBy(xpath ="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[2]/dd[1]/ul[1]/li[1]/div[1]/label[1]/span[1]")
    WebElement GPU;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[2]/dd[1]/div[1]/button[1]")
    WebElement GPUApply;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]")
    WebElement GPUSelect;
    
    @FindBy(xpath ="//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[5]/div[2]/div[1]/a[1]/button[1]")
    WebElement Case;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[3]/dd[1]/ul[1]/li[1]/div[1]/label[1]/span[1]")
    WebElement ManufacturerOption;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[3]/dd[1]/div[1]/button[1]")
    WebElement ApplyManufacturer;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[5]/dd[1]/ul[1]/li[3]/div[1]/label[1]/span[1]")
    WebElement PriceOption;
    
    @FindBy(xpath ="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[5]/dd[1]/div[2]/button[1]")
    WebElement ApplyPrice;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/li[3]/button[1]")
    WebElement ResetButton;
    
    @FindBy(xpath ="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]/i[1]")
    WebElement CaseSelecButton;
    
    @FindBy(xpath = "//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[2]/div[1]/a[1]/button[1]")
    WebElement PowerSupply;
            
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[3]/li[1]/div[2]/label[1]")
    WebElement OnSaleOption;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[10]/dt[1]")
    WebElement DiscountPowerSupply;
    
    @FindBy(xpath = "//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[10]/dd[1]/ul[1]/li[1]/div[1]/label[1]/span[1]")
    WebElement DiscountPowerSupplyOption;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[1]/div[1]/dl[10]/dd[1]/div[1]/button[1]")
    WebElement DiscountApply;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/div[2]/div[1]/button[1]")
    WebElement PowerSupplySelectButton;
    
    @FindBy(xpath="//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[7]/div[2]/div[1]/a[1]/button[1]")
    WebElement Storage;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    WebElement HardDriveStorage;
    
    @FindBy(xpath="//body[1]/div[16]/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]/div[2]/span[1]")
    WebElement SelectStorageDetails;
    
    @FindBy(xpath="//body[1]/div[16]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
    WebElement SelectButtonInStorageDetails;
    
    @FindBy(xpath="//body[1]/div[16]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[2]")
    WebElement AddAllToCart;
    
    @FindBy(xpath="//body[1]/div[13]/div[2]/section[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h1[1]/span[1]")
    WebElement ItemNumber;
    
    @FindBy(xpath="//body[1]/div[16]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    WebElement Message;
    
    public void goTo(){
        driver.get("https://www.newegg.com");
    }
    
    public void clickSiteMenu(){
        siteMenu.click();
    }
    
    public void clickBuildOwnPCLabel(){
        buildOwnPCLabel.click();
    }
    
    public void clickCPU(){
        CPU.click();
    }
    
    public void changeListName(String listName){
        changeNameMyList.click();
        myListInputField.click();
        for(int i = 0; i< 15; i++){
            myListInputField.sendKeys(Keys.BACK_SPACE);
        }
        myListInputField.sendKeys(listName);
        updateMyListName.click();
    }
    
    public void clickArrowList(){
        arrowList.click();
    }
    
    public void clickCPUSelectButton(){
        CPUSelectButton.click();
    }
    
    public void clickCPUSelectButton2(){
        CPUSelectButton2.click();
    }
    
    public void clickMotherboard(){
        Motherboard.click();
    }
    
    public void clickMotherBoardSelectButton(){
        MotherboardSelectButton.click();
    }
    
    public void clickMemory(){
        Memory.click();
    }
    
    public void clickMemorySelectButton(){
        sortBy.click();
        highestPriceOption.click();
        MemorySelectButton.click();
    }
    
    public void clickVideoCard(){
        VideoCard.click();
        GPU.click();
        GPUApply.click();
    }
    
    public void clickGPUSelectButton(){
        GPUSelect.click();
    }
    
    public void clickCase(){
        Case.click();
    }
    
    public void selectOptionsManufacturerCase(){
        ManufacturerOption.click();
        ApplyManufacturer.click();
    }
    
    public void selectOptionsPriceCase(){
        PriceOption.click();
        ApplyPrice.click();
    }
    
    public void clickCaseSelectButton(){
        ResetButton.click();
        CaseSelecButton.click();
    }
    
    public void clickPowerSupply(){
        PowerSupply.click();
    }
    
    public void selectOnSaleOptionsPowerSupply(){
        OnSaleOption.click();
    }
    
    public void selectDiscountOptionPowerSupply(){
        DiscountPowerSupply.click();
        DiscountPowerSupplyOption.click();
        DiscountApply.click();
        PowerSupplySelectButton.click();
    }
    
    public void clickStorage(){
        Storage.click();
        HardDriveStorage.click();
    }
    
    public void selectStorage(){
        SelectStorageDetails.click();
        SelectButtonInStorageDetails.click();
    }
    
    public void clickAddAllToCart(){
        AddAllToCart.click();
    }
    
    public void assertPage(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://secure.newegg.com/shop/cart");
    }
    
    public void assertPageItemNumber(){
        Assert.assertEquals(ItemNumber.getText(), "(9 Items)");
    }
    
    public void assertPageBuildListItem(){
        Assert.assertEquals(Message.getText(), "Hmm...there is already a CPU on the build list.");
    }
}


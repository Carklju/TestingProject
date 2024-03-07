/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import PageObjectModel.PCBuilder;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testComp.BaseClass;

/**
 *
 * @author Aleksa
 */
public class TestPCBuilderPass extends BaseClass {
    
    @BeforeTest
    public PCBuilder applicationStart(){
        driver = driverInit();
        PCBuilder pc = new PCBuilder(driver);
        pc.goTo();
        return pc;
    }
    
    @Test
    public void executeTest() throws InterruptedException{
        PCBuilder pcBuilder = new PCBuilder(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        pcBuilder.goTo();
        pcBuilder.clickSiteMenu();
        pcBuilder.clickBuildOwnPCLabel();
        pcBuilder.clickCPU();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/i[1]")));
        Thread.sleep(2000);
        pcBuilder.changeListName("My PC Components List");
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")));
        Thread.sleep(2000);
        pcBuilder.clickArrowList(); 
        pcBuilder.clickCPUSelectButton();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickMotherboard();
        pcBuilder.clickMotherBoardSelectButton();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickMemory();
        pcBuilder.clickMemorySelectButton();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickVideoCard();
        pcBuilder.clickGPUSelectButton();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[5]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickCase();
        pcBuilder.selectOptionsManufacturerCase();
        js.executeScript("window.scroll(0,600)");
        Thread.sleep(2000);
        pcBuilder.selectOptionsPriceCase();
        pcBuilder.clickCaseSelectButton();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickPowerSupply();
        pcBuilder.selectOnSaleOptionsPowerSupply();
        js.executeScript("window.scroll(0,400)");
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")));
        Thread.sleep(2000);
        pcBuilder.selectDiscountOptionPowerSupply();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[7]/div[2]/div[1]/a[1]/button[1]")));
        Thread.sleep(2000);
        pcBuilder.clickStorage();
        pcBuilder.selectStorage();
        //new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[2]")));
        Thread.sleep(2000);
        pcBuilder.clickAddAllToCart();
        pcBuilder.assertPage();
        pcBuilder.assertPageItemNumber();
    }
    
    @AfterTest
    public void closeApplication(){
      //driver.close();  
    }
}

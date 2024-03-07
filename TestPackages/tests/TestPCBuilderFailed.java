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
public class TestPCBuilderFailed extends BaseClass{
 
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
        Thread.sleep(2000);
        pcBuilder.clickArrowList(); 
        pcBuilder.clickCPUSelectButton();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[16]/div[7]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")));
        pcBuilder.clickArrowList();
        pcBuilder.clickCPUSelectButton2();
        pcBuilder.assertPageBuildListItem();
    }
    
    @AfterTest
    public void closeApplication(){
      //driver.close();  
    }
}

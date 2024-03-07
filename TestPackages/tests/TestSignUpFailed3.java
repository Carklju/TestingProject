/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import PageObjectModel.Register;
import java.time.Duration;
import org.openqa.selenium.By;
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
public class TestSignUpFailed3 extends BaseClass{
    
    @BeforeTest
    public Register applicationStart(){
        driver = driverInit();
        register = new Register(driver);
        register.goTo();
        return register;
    }
    
    @Test
    public void executeTest() throws InterruptedException{
        Register reg = new Register(driver);
        reg.clickRegisterButton();
        reg.clickSignUpLink();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='mobilePhoneNumber']")));
        reg.enterFirstAndLastName("asdasd");
        reg.enterEmailAdress("ass2d22212123@gmail.com");
        reg.enterMobilePhone("12312212131");
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/input[1]")));
        reg.enterPassword("aleksa1213123!A");    
        reg.clickSignUpButton();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[10]/p[1]")));
        reg.assertPageAccAlreadyExist();
    }
    
    @AfterTest
     public void closeApplication(){
         //driver.close();
     }
    
}

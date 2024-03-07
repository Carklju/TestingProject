/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import PageObjectModel.Login;
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
public class TestLoginPass extends BaseClass{
    
    @BeforeTest
    public Login applicationStart(){
        driver = driverInit();
        login = new Login(driver);
        login.goTo();
        return login;
    }
    
    @Test
    public void executeTest() throws InterruptedException{
       Login log = new Login(driver); 
       log.goTo();
       log.clickRegisterButton();
       log.enterEmailAdress("aleksa.kljucar2@gmail.com");
       log.clickSignInButton();
       new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.id("labeled-input-password")));
       log.enterPassword("Aleksa1234!");
       log.showPassword();
       log.clickSignInButton();
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("Top gaming PC & laptop savings. PC parts, & more! | Newegg.com"));
       log.assertPage();
    }
    
    @AfterTest
    public void closeApplication(){
        //driver.close();
    }
}

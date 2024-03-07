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
public class TestLoginFailed3 extends BaseClass{
    
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
       log.enterEmailAdress("aleksa211@gmail.com");
       log.clickSignInButton();
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/p[1]")));
       log.assertPageNonRegisteredEmail();
    }
    
    @AfterTest
    public void closeApplication(){
        //driver.close();
    }
}

package testComp;


import PageObjectModel.Login;
import PageObjectModel.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksa
 */
public class BaseClass {
    public WebDriver driver;
    public Login login;
    public Register register;
    
    public WebDriver driverInit(){
        System.getProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}

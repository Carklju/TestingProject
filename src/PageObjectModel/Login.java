/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 *
 * @author Aleksa
 */
public class Login {
    
    WebDriver driver;
    
    public Login (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[contains(text(),'Sign In / Register')]")
    WebElement registerButton;
    
    @FindBy(id="labeled-input-signEmail")
    WebElement emailAdressInputField;
    
    @FindBy(id="signInSubmit")
    WebElement signInButton;
    
    @FindBy(id="labeled-input-password")
    WebElement passwordInputField;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]")
    WebElement showPassword;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement ValidEmailAddressError;
    
    @FindBy(xpath = "/html[1]/body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/p[1]")
    WebElement NoMatchesEmailError;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/p[1]")
    WebElement PassAndEmailNotMatch;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement PasswordRequired;
    
    public void goTo(){
        driver.get("https://www.newegg.com");
    }
    
    public void clickRegisterButton(){
        registerButton.click();
    }
    
    public void enterEmailAdress(String email){
       emailAdressInputField.sendKeys(email);
    }
    
    public void clickSignInButton(){
        signInButton.click();
    }
    
    public void enterPassword(String password){
        passwordInputField.sendKeys(password);
    }
    
    public void showPassword(){
       showPassword.click();
    }
    
    public void assertPage(){
        String url[] = driver.getCurrentUrl().split(Pattern.quote( "=" ), 2);
        Assert.assertEquals(url[0], "https://www.newegg.com/?RandomID");
    }
    
    public void assertPageInvalidEmail(){
        Assert.assertEquals(ValidEmailAddressError.getText(), "Please enter a valid email address.");
    }
    
    public void assertPageEmptyEmail(){
        Assert.assertEquals(ValidEmailAddressError.getText(), "This field is required.");
    }
    
    public void assertPageNonRegisteredEmail(){
        Assert.assertEquals(NoMatchesEmailError.getText(), "We didn't find any matches, please try again.");
    }
    
    public void assertPagePassAndEmailNotMatch(){
        Assert.assertEquals(PassAndEmailNotMatch.getText(), "The email and password do not match, please try again or click here to reset.");        
    }
    
    public void assertPagePasswordRequired(){
        Assert.assertEquals(PasswordRequired.getText(), "This field is required.");
    }
}


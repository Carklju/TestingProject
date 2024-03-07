/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjectModel;

import java.util.Arrays;
import java.util.regex.Pattern;
import static junit.framework.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 *
 * @author Aleksa
 */
public class Register {
    
    WebDriver driver;
    
    public Register (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[contains(text(),'Sign In / Register')]")
    WebElement registerButton;
    
    @FindBy(xpath="//strong[contains(text(),'Sign Up')]")
    WebElement signUpLink;
    
    @FindBy(css="input[tabindex = '1']")
    WebElement firstAndLastNameInputField;
    
    @FindBy(css="input[type='email']")
    WebElement emailAdressInputField;
    
    @FindBy(css="input[name='mobilePhoneNumber']")
    WebElement mobilePhoneInputField;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/input[1]")
    WebElement passwordInputField;
            
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/label[1]/span[1]")
    WebElement checkboxInput;
    
    @FindBy(css="button[type='submit']")
    WebElement signUpButton;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement FirstNameError;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]")
    WebElement EmailError;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]")
    WebElement PasswordError;
    
    @FindBy(xpath="//body[1]/div[11]/div[1]/div[2]/div[1]/form[1]/div[1]/div[10]/p[1]")
    WebElement AlreadyExist;
    
    public void goTo(){
        driver.get("https://www.newegg.com");
    }
    
    public void clickRegisterButton(){
        registerButton.click();
    }
    
    public void clickSignUpLink(){
        signUpLink.click();
    }
    
    public void enterFirstAndLastName(String firstAndLastName){
        firstAndLastNameInputField.sendKeys(firstAndLastName);
    }
    
    public void enterEmailAdress(String email){
        emailAdressInputField.sendKeys(email);
    }
    
    public void enterMobilePhone(String mobilePhoneNumber){
        mobilePhoneInputField.sendKeys(mobilePhoneNumber);
    }
    
    public void enterPassword(String password){
        passwordInputField.sendKeys(password);
    }
    
    public void uncheckCheckBox(){
        checkboxInput.click();
    }
    
    public void clickSignUpButton(){
        signUpButton.click();
    }
    
    public void assertPage(){
        String url[] = driver.getCurrentUrl().split(Pattern.quote( "=" ), 2);
        Assert.assertEquals(url[0], "https://www.newegg.com/?RandomID");
    }
    
    public void assertPageFirstAndLastNameError(){
        Assert.assertEquals(FirstNameError.getText(), "This field is required.");
    }
    
    public void assertPageEmailAddressError(){
        Assert.assertEquals(EmailError.getText(), "This field is required.");
    }
    
    public void assertPagePasswordError(){
        Assert.assertEquals(PasswordError.getText(), "This field is required.");
    }
    
    public void assertPageEmailAddressNotValid(){
        Assert.assertEquals(EmailError.getText(), "Please enter a valid email address.");
    }
    
    public void assertPagePasswordPasswordWeak(){
         Assert.assertEquals(PasswordError.getText(), "Weak password. Please create a strong password with below requirements.");
    }
    
    public void assertPageAccAlreadyExist(){
        Assert.assertEquals(AlreadyExist.getText(), "The email address you entered is already registered with an existing Newegg account. Please Sign In or use another email address.");
    }
}

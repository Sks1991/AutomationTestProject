package com.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericlib.Browser;
import com.genericlib.Project_constants;

public class Login {
@FindBy(xpath = "//div[@class='atProductName']")
private WebElement TitleofLoginPage;

@FindBy(xpath = "//div[@class='atLogoImg']")
private WebElement logoofloginpage;

@FindBy(id="headerContainer")
private WebElement Headertextoflogin;

@FindBy(id="username")
private WebElement usernametxtbox;

@FindBy(id="pwd")
private WebElement passwordtextbox;

@FindBy(id="keepLoggedInLabel")
private WebElement keepmeloggedintext;

@FindBy(id="keepLoggedInCheckBox")
private WebElement keepmeloggedchkbox;

@FindBy(id="loginButton")
private WebElement loginbtn;

@FindBy(id="toPasswordRecoveryPageLink")
private WebElement forgotpasslnk;

public void login_to_app() {
	Browser.driver.get(Project_constants.URL);
	usernametxtbox.sendKeys(Project_constants.username);
	passwordtextbox.sendKeys(Project_constants.Password);
	loginbtn.click();
}


}
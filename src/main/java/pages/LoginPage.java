package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.PropertiesReader;

public class LoginPage extends AbstractComponents{

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='Pos(r) input-wrapper']//input[@name='username'])[1]")
	WebElement email;

	@FindBy(css = "input[name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='js-login-btn']")
	WebElement signButton;

	@FindBy(xpath = "//div[@id='js-notification-box-msg']")
	WebElement errorMsg;


	@FindBy(xpath = "(//button[@title='User menu'])[2]")
	WebElement profileIcon;

	@FindBy(xpath = "//ul[@class='dropdown-menu-list Miw(140px)']//li[normalize-space()='Logout']")
	WebElement logout;

	public String logValid() {
		email.sendKeys(PropertiesReader.getData("Email"));
		password.sendKeys(PropertiesReader.getData("Password"));
		signButton.click();
		waitForElement(profileIcon);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = driver.getTitle();
		return title;
	}

	public DashboardPage aftrLogin() {
		return new DashboardPage(driver);
	}

	public String wrongMailPass() {

		email.sendKeys(PropertiesReader.getData("Email1"));
		password.sendKeys(PropertiesReader.getData("Pass2"));
		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;

	}

	public String BlankInput() {

		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;
	}

	public String passBlank() {
		email.sendKeys(PropertiesReader.getData("Email"));
		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;
	}

	public String emailBlank() {
		password.sendKeys(PropertiesReader.getData("Password"));
		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;
	}

	public String wrongPass() {
		email.sendKeys(PropertiesReader.getData("Email"));
		password.sendKeys(PropertiesReader.getData("Pass2"));
		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;
	}

	public String wrongMail() {
		email.sendKeys(PropertiesReader.getData("Email1"));
		password.sendKeys(PropertiesReader.getData("Password"));
		signButton.click();
		waitForElement(errorMsg);
		String error = errorMsg.getText();
		return error;
	}

	public void logout() {
		profileIcon.click();
		logout.click();
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class PersonelDetailsPage extends CommonMethods {

    @FindBy(id = "btnSave")
    public WebElement editButton;

    @FindBy(id = "personal_txtEmpFirstName")
    public WebElement txt_FirstName;

    @FindBy(id = "personal_txtEmpMiddleName")
    public WebElement txt_MiddleName;

    @FindBy(id = "personal_txtEmpLastName")
    public WebElement txt_LastName;

    @FindBy(id = "personal_txtOtherID")
    public WebElement txt_OtherID;

    @FindBy(id = "personal_txtLicenNo")
    public WebElement txt_DriverLicence;

    @FindBy(id = "personal_txtLicExpDate")
    public WebElement txt_licenseExpiryField;

    @FindBy(xpath = "(//*[@class='ui-datepicker-trigger'])[1]")
    public WebElement licenseExpiryDateCalendarIcon;

    @FindBy(xpath = "//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> LicenceExpiredDate;

    @FindBy(xpath = "//*[@class='ui-datepicker-month']")
    public WebElement txt_LicenceExpiredMonth;

    @FindBy(xpath = "//*[@class='ui-datepicker-year']")
    public WebElement txt_LicenceExpiredYear;

    @FindBy(id = "personal_txtNICNo")
    public WebElement txt_SSN_No;

    @FindBy(id = "personal_txtSINNo")
    public WebElement txt_SIN_No;

    @FindBy(id = "personal_optGender_1")
    public WebElement txt_Gender;

    @FindBy(id = "personal_cmbMarital")
    public WebElement txt_MaritalStatus;

    @FindBy(id = "personal_cmbNation")
    public WebElement txt_Nationality;

    @FindBy(id = "personal_DOB")
    public WebElement txt_DateOfBirthField;

    @FindBy(xpath = "(//*[@class='ui-datepicker-trigger'])[2]")
    public WebElement dateOfBirthIcon;

    @FindBy(xpath = "//*[@class='ui-datepicker-month']")
    public WebElement dateOfBirthMonth;

    @FindBy(xpath = "//*[@class='ui-datepicker-year']")
    public WebElement dateOfBirthYear;

    @FindBy(xpath = "//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> dateOfBirthDay;

    @FindBy(id = "personal_txtEmpNickName")
    public WebElement txt_NickName;

    @FindBy(id = "personal_txtMilitarySer")
    public WebElement txt_Military;

    @FindBy(id = "personal_chkSmokeFlag")
    public WebElement txt_Smoke;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public PersonelDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}

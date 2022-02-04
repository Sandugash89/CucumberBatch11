package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.PersonelDetailsPage;
import utils.CommonMethods;

public class PersonalDetailsSteps extends CommonMethods {


    @When("user clicks on any employee Id or First\\(&middle) Name or Last Name")
    public void user_clicks_on_any_employee_id_or_first_middle_name_or_last_name() {
        click(employeeListPage.employeeSelect);
    }

    @And("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        click(personelDetailsPage.editButton);
    }

    @And("user edits any personal detail about that employee")
    public void user_edits_any_personal_detail_about_that_employee() {
        sendText(personelDetailsPage.txt_FirstName, "ali");
        sendText(personelDetailsPage.txt_MiddleName, "genius");
        sendText(personelDetailsPage.txt_LastName, "kartal");
        sendText(personelDetailsPage.txt_OtherID, "32541652");
        sendText(personelDetailsPage.txt_DriverLicence, "12321456");
        click(personelDetailsPage.licenseExpiryDateCalendarIcon);
        selectDropdown(personelDetailsPage.txt_LicenceExpiredMonth, "May");
        selectDropdown(personelDetailsPage.txt_LicenceExpiredYear, "2027");
        pickDateFromCalendar(personelDetailsPage.LicenceExpiredDate, "20");
        sendText(personelDetailsPage.txt_SSN_No, "3874524587452");
        sendText(personelDetailsPage.txt_SIN_No, "7898532541");
        click(personelDetailsPage.txt_Gender);
        click(personelDetailsPage.txt_MaritalStatus);
        selectDropdown(personelDetailsPage.txt_MaritalStatus, "Married");
        sendText(personelDetailsPage.txt_Military, "Air Force");
        click(personelDetailsPage.txt_Nationality);
        selectDropdown(personelDetailsPage.txt_Nationality, "Turkish");
        sendText(personelDetailsPage.txt_NickName, "Genius");
        click(personelDetailsPage.txt_Smoke);
        click(personelDetailsPage.dateOfBirthIcon);
        selectDropdown(personelDetailsPage.dateOfBirthMonth, "May");
        selectDropdown(personelDetailsPage.dateOfBirthYear, "1987");
        pickDateFromCalendar(personelDetailsPage.dateOfBirthDay, "11");

    }

    @And("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(personelDetailsPage.saveButton);
    }
}

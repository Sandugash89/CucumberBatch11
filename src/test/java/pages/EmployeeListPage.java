package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idEmployeeSearch;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement empSearchStepByName;

   @FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td/a")
   public WebElement employeeSelect;

    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }

}

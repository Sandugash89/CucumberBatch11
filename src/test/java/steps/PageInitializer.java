package steps;

import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dash;
    public  static AddNewEmployeePage addNewEmployeePage;
    public static EmployeeListPage employeeListPage;
    public static PersonelDetailsPage personelDetailsPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dash = new DashboardPage();
        addNewEmployeePage = new AddNewEmployeePage();
        employeeListPage = new EmployeeListPage();
       personelDetailsPage= new PersonelDetailsPage();
    }
}

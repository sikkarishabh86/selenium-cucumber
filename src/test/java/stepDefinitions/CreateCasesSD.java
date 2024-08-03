package stepDefinitions;

import coreFunctions.CoreFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.CasesPagePO;

import static hooks.Hooks.driver;

public class CreateCasesSD extends CoreFunctions{

    // CasesPagePO casesPagePO;
    Actions actions = new Actions(driver);

    @When("user hovers over the case icon")
    public void userHoversOverTheCaseIcon(){
        actions.moveToElement(getElement(CasesPagePO.casesIcon)); //Hovers over Case Icon

    }

    @And("user clicks on the Case plus icon")
    public void userClicksOnTheCasePlusIcon() {
        getElement(CasesPagePO.caseAddIcon).click(); // Clicks the + icon
    }

    @Then("user is redirected to the Create New Case page")
    public void userIsRedirectedToTheCreateNewCasePage() {
        CoreFunctions.verifyElementPresent(CasesPagePO.createNewCase);
        String caseCreationHeading= getElement(CasesPagePO.createNewCase).getText();
        Assert.assertEquals(caseCreationHeading, "Create new Case");

    }

    @When("user fills title")
    public void userFillsTitle() {


    }

    @And("user fills Assigned to")
    public void userFillsAssignedTo() {

    }

    @And("user fills Company")
    public void userFillsCompany() {

    }

    @And("user selects Type")
    public void userSelectsType() {

    }

    @And("user fills Close Date")
    public void userFillsCloseDate() {

    }

    @And("user fills Description")
    public void userFillsDescription() {

    }

    @And("user selects Status")
    public void userSelectsStatus() {

    }

    @And("user selects Contact")
    public void userSelectsContact() {

    }

    @And("user selects Deal")
    public void userSelectsDeal() {

    }

    @And("user fills Deadline date")
    public void userFillsDeadlineDate() {


    }

    @And("user enters and select Tags")
    public void userEntersAndSelectTags() {

    }

    @And("user selects the Priority")
    public void userSelectsThePriority() {

    }

    @And("user enters the Identifier")
    public void userEntersTheIdentifier() {

    }

    @And("Click the Save button")
    public void clickTheSaveButton() {

    }

    @Then("Case should be created successfully")
    public void caseShouldBeCreatedSuccessfully() {
    }
}

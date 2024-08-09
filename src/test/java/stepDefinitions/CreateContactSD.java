package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import coreFunctions.CoreFunctions;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import junit.framework.Assert;
import pageObjects.CreateNewContactPO;
import pageObjects.HomePagePO;
import pageObjects.LoginPagePO;
import utilities.PropertiesFileReader;

public class CreateContactSD extends CoreFunctions {
	
	final String filePath = "./src/test/java/properties/config.properties";
	final String filePathCreateContact = "./src/test/java/properties/CreateContact.properties";
	PropertiesFileReader pfr = new PropertiesFileReader(filePath);
	PropertiesFileReader pfrCreateContact = new PropertiesFileReader(filePathCreateContact);
	CoreFunctions coreFunctions = new CoreFunctions();
	Actions actions = new Actions(Hooks.getDriver());
	@When("user hovers over the contacts icon")
	public void user_hovers_over_the_contacts_icon() {
	   actions.moveToElement(HomePagePO.contactsButton()).build().perform();
	}

	@And("user clicks on the Contacts plus icon")
	public void user_clicks_on_the_contacts_plus_icon() {
	    click(HomePagePO.contactsPlusIcon(), "Contacts plus icon");
	}

	@Then("user is redirected to the Create New Contact page")
	public void user_is_redirected_to_the_create_new_contact_page() {
		String expCreateContactUrl = null;
		String actCreateContactUrl = Hooks.getDriver().getCurrentUrl();
		try {
			expCreateContactUrl = pfr.properties().getProperty("createContactUrl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expCreateContactUrl, actCreateContactUrl);
		actions.moveToElement(CreateNewContactPO.createNewContactHeading());
	}

	@When("user fills first name")
	public void user_fills_first_name() {
	    try {
			sendKeys(CreateNewContactPO.firstNameInput(), pfrCreateContact.properties().getProperty("firstName"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user fills the last name")
	public void user_fills_the_last_name() {
		try {
			sendKeys(CreateNewContactPO.lastNameInput(), pfrCreateContact.properties().getProperty("lastName"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user fills the middle name")
	public void user_fills_the_middle_name() {
		try {
			sendKeys(CreateNewContactPO.middleNameInput(), pfrCreateContact.properties().getProperty("middleName"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user searches and selects a company")
	public void user_searches_and_selects_a_company() {
		try {
			sendKeys(CreateNewContactPO.companyNameInput(), pfrCreateContact.properties().getProperty("companyName"));
			click(CreateNewContactPO.companyNameOption(), "Company Rishabh");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user searches and selects a tag")
	public void user_searches_and_selects_a_tag() throws IOException {
		System.out.println("entered into method");
		click(CreateNewContactPO.tagInput(), "Tag input");
		System.out.println("after clicking");
		JavascriptExecutor jse = (JavascriptExecutor)Hooks.getDriver();
//		jse.executeScript("arguments[0].value = 'Rishabh';", CreateNewContactPO.tagInputSearch());
//		jse.executeScript("arguments[0].value = '';", CreateNewContactPO.tagInputSearch());
		sendKeys(CreateNewContactPO.tagInputSearch(), pfrCreateContact.properties().getProperty("tagName"));
		System.out.println("after send keys");
		click(CreateNewContactPO.tagNameOption(), "Tag Rishabh");
	}

	@And("user enters the email")
	public void user_enters_the_email() {
	    try {
			sendKeys(CreateNewContactPO.emailInput(), pfrCreateContact.properties().getProperty("email"));
			sendKeys(CreateNewContactPO.emailDescriptionInput(), pfrCreateContact.properties().getProperty("emailDescription"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user selects the category")
	public void user_selects_the_category() {
	    click(CreateNewContactPO.categoryListbox(), "Category listbox");
	    click(CreateNewContactPO.leadCategoryOption(), "Lead category option");
	}

	@And("user selects the status")
	public void user_selects_the_status() {
	    click(CreateNewContactPO.statusListbox(), "Status listbox");
	    click(CreateNewContactPO.newStatusOption(), "New status option");
	}

	@And("user enters the description")
	public void user_enters_the_description() {
	    try {
			sendKeys(CreateNewContactPO.descriptionTextarea(), pfrCreateContact.properties().getProperty("description"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user enters the twitter handle")
	public void user_enters_the_twitter_handle() {
	    click(CreateNewContactPO.socialChannelsDropdown(), "Social channels dropdown");
	    click(CreateNewContactPO.facebookOption(), "Facebook option");
	    try {
			sendKeys(CreateNewContactPO.facebookProfileLinkInput(), pfrCreateContact.properties().getProperty("facebookProfileLink"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user enters the address")
	public void user_enters_the_address() {
	   try {
		sendKeys(CreateNewContactPO.streetAddressInput(), pfrCreateContact.properties().getProperty("street"));
		sendKeys(CreateNewContactPO.cityInput(), pfrCreateContact.properties().getProperty("city"));
		sendKeys(CreateNewContactPO.stateInput(), pfrCreateContact.properties().getProperty("state"));
		sendKeys(CreateNewContactPO.postCodeInput(), pfrCreateContact.properties().getProperty("postCode"));
		click(CreateNewContactPO.countryDropdown(), "COuntry dropdown");
		sendKeys(CreateNewContactPO.countryInput(), pfrCreateContact.properties().getProperty("country"));
		click(CreateNewContactPO.indiaOption(), "India option");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@And("user enter the phone number")
	public void user_enter_the_phone_number() {
	    
	    try {
	    	click(CreateNewContactPO.phoneHint(), "Phone dropdown");
			sendKeys(CreateNewContactPO.indiaInputSearch(), pfrCreateContact.properties().getProperty("phoneCountry"));
			click(CreateNewContactPO.indiaOptionHint(), "India option");
			sendKeys(CreateNewContactPO.phoneNumberInput(), pfrCreateContact.properties().getProperty("phoneNumber"));
			sendKeys(CreateNewContactPO.phoneNumberTypeInput(), pfrCreateContact.properties().getProperty("phoneNumberType"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	}

	@And("user enters the position")
	public void user_enters_the_position() {
	    try {
			sendKeys(CreateNewContactPO.positionInput(), pfrCreateContact.properties().getProperty("position"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user enters the department")
	public void user_enters_the_department() {
		try {
			sendKeys(CreateNewContactPO.departmentInput(), pfrCreateContact.properties().getProperty("department"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user searches and selects the supervisor")
	public void user_searches_and_selects_the_supervisor() {
	    click(CreateNewContactPO.supervisorDiv(), "Supervisor");
	    try {
			sendKeys(CreateNewContactPO.supervisorInput(), pfrCreateContact.properties().getProperty("supervisor"));
			click(CreateNewContactPO.supervisorRishaanOption(), "supervisor Rishaan Option");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user searches and selects the assistant")
	public void user_searches_and_selects_the_assistant() {
		click(CreateNewContactPO.assistantDiv(), "Assistant");
	    try {
			sendKeys(CreateNewContactPO.assistantInput(), pfrCreateContact.properties().getProperty("assistant"));
			click(CreateNewContactPO.assistantSupsOption(), "supervisor Sups Option");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user searches and selects the referred by")
	public void user_searches_and_selects_the_referred_by() {
		click(CreateNewContactPO.referredByDiv(), "Referred By");
	    try {
			sendKeys(CreateNewContactPO.referredByInput(), pfrCreateContact.properties().getProperty("referredBy"));
			click(CreateNewContactPO.referredByRishOption(), "ReferredBy rish Option");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user selects the Source")
	public void user_selects_the_source() {
		click(CreateNewContactPO.sourceDropdown(), "Source dropdown");
		click(CreateNewContactPO.sourceWebsiteOption(), "Website Option");
	}

	@And("user selects do not call, do not text and do not email toggle")
	public void user_selects_do_not_call_do_not_text_and_do_not_email_toggle() {
	    click(CreateNewContactPO.doNotCallToggle(), "Do not call Toggle");
	    click(CreateNewContactPO.doNotEmailToggle(), "Do not email Toggle");
	    click(CreateNewContactPO.doNotTextToggle(), "Do not text Toggle");
	}

	@And("user enters the birthday")
	public void user_enters_the_birthday() {
	    try {
			sendKeys(CreateNewContactPO.birthDayInput(), pfrCreateContact.properties().getProperty("birthday"));
			click(CreateNewContactPO.birthMonthDropdown(), "Birth Month dropdown");
			click(CreateNewContactPO.birthMonthNovemberOption(), "Birth Month November option");
			sendKeys(CreateNewContactPO.birthYearInput(), pfrCreateContact.properties().getProperty("birthyear"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("user enters the identifier and uploads the image")
	public void user_enters_the_identifier_and_uploads_the_image() {
	    try {
			sendKeys(CreateNewContactPO.identifierInput(), pfrCreateContact.properties().getProperty("identifier"));
			sendKeys(CreateNewContactPO.imageUploadInput(), pfrCreateContact.properties().getProperty("imagePath"));
//			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("clicks on save button")
	public void clicks_on_save_button() {
	    click(CreateNewContactPO.saveButton(), "Save button");
	}

}

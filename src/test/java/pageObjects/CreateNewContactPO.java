package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hooks.Hooks;
import utilities.CommonWait;

public class CreateNewContactPO extends CommonWait {

	public static WebElement createNewContactHeading() {
		String createNewContactHeading = "//div/span[text()='Create New Contact']";
		waitForPresence(createNewContactHeading);
		return Hooks.getDriver().findElement(By.xpath(createNewContactHeading));
	}
	
	public static WebElement firstNameInput() {
		String firstNameInput = "//input[@name='first_name']";
		waitForPresence(firstNameInput);
		return Hooks.getDriver().findElement(By.xpath(firstNameInput));
	}
	
	public static WebElement lastNameInput() {
		String lastNameInput = "//input[@name='last_name']";
		waitForPresence(lastNameInput);
		return Hooks.getDriver().findElement(By.xpath(lastNameInput));
	}
	
	public static WebElement middleNameInput() {
		String middleNameInput = "//input[@name='middle_name']";
		waitForPresence(middleNameInput);
		return Hooks.getDriver().findElement(By.xpath(middleNameInput));
	}
	
	public static WebElement companyNameInput() {
		String companyNameInput = "//div[@name='company']//input[@type='text']";
		waitForPresence(companyNameInput);
		return Hooks.getDriver().findElement(By.xpath(companyNameInput));
	}
	
	public static WebElement companyNameOption() {
		String companyNameOption = "//div[@name='company']//div[@role='listbox']/div/span[text()='Rishabh']";
		waitForPresence(companyNameOption);
		return Hooks.getDriver().findElement(By.xpath(companyNameOption));
	}
	
	public static WebElement tagInput() {
		String tagInput = "//div/label[text()='Tags']/../div";
		waitForPresence(tagInput);
		waitForClickable(tagInput);
		return Hooks.getDriver().findElement(By.xpath(tagInput));
	}
	
	public static WebElement tagInputSearch() {
		String tagInputSearch = "//div[@class='ui active visible fluid multiple search selection dropdown']//input[@type='text']";
		waitForPresence(tagInputSearch);
		waitForClickable(tagInputSearch);
		return Hooks.getDriver().findElement(By.xpath(tagInputSearch));
	}
	
	public static WebElement tagNameOption() {
		String tagNameOption = "//label[text()='Tags']/../div[@role='combobox']//span[text()='Rishabh' and @class='text']";
		waitForPresence(tagNameOption);
		waitForClickable(tagNameOption);
		return Hooks.getDriver().findElement(By.xpath(tagNameOption));
	}
	
	public static WebElement emailInput() {
		String emailInput = "//input[@placeholder='Email address']";
		waitForPresence(emailInput);
		return Hooks.getDriver().findElement(By.xpath(emailInput));
	}
	
	public static WebElement emailDescriptionInput() {
		String emailDescriptionInput = "//input[@placeholder='Personal email, Business, Alt...']";
		waitForPresence(emailDescriptionInput);
		return Hooks.getDriver().findElement(By.xpath(emailDescriptionInput));
	}
	
	public static WebElement categoryListbox() {
		String categoryListbox = "//label[text()='Category']/../div";
		waitForPresence(categoryListbox);
		return Hooks.getDriver().findElement(By.xpath(categoryListbox));
	}
	
	public static WebElement leadCategoryOption() {
		String leadCategoryOption = "//span[text()='Lead']";
		waitForPresence(leadCategoryOption);
		return Hooks.getDriver().findElement(By.xpath(leadCategoryOption));
	}	
	
	public static WebElement statusListbox() {
		String statusListbox = "//label[text()='Status']/../div";
		waitForPresence(statusListbox);
		return Hooks.getDriver().findElement(By.xpath(statusListbox));
	}
	
	public static WebElement newStatusOption() {
		String newStatusOption = "//span[text()='New']";
		waitForPresence(newStatusOption);
		return Hooks.getDriver().findElement(By.xpath(newStatusOption));
	}	
	
	public static WebElement descriptionTextarea() {
		String descriptionTextarea = "//textarea[@name='description']";
		waitForPresence(descriptionTextarea);
		return Hooks.getDriver().findElement(By.xpath(descriptionTextarea));
	}
	
	public static WebElement socialChannelsDropdown() {
		String socialChannelsDropdown = "//label[text()='Social channels']/../div/div/div";
		waitForPresence(socialChannelsDropdown);
		return Hooks.getDriver().findElement(By.xpath(socialChannelsDropdown));
	}
	
	public static WebElement facebookOption() {
		String facebookOption = "//label[text()='Social channels']/..//span[text()='Facebook']";
		waitForPresence(facebookOption);
		return Hooks.getDriver().findElement(By.xpath(facebookOption));
	}
	
	public static WebElement facebookProfileLinkInput() {
		String facebookProfileLinkInput = "//input[@placeholder='Facebook profile link']";
		waitForPresence(facebookProfileLinkInput);
		return Hooks.getDriver().findElement(By.xpath(facebookProfileLinkInput));
	}
	
	public static WebElement streetAddressInput() {
		String streetAddressInput = "//input[@placeholder='Street Address']";
		waitForPresence(streetAddressInput);
		return Hooks.getDriver().findElement(By.xpath(streetAddressInput));
	}
	
	public static WebElement cityInput() {
		String cityInput = "//input[@placeholder='City']";
		waitForPresence(cityInput);
		return Hooks.getDriver().findElement(By.xpath(cityInput));
	}
	
	public static WebElement stateInput() {
		String stateInput = "//input[@placeholder='State / County']";
		waitForPresence(stateInput);
		return Hooks.getDriver().findElement(By.xpath(stateInput));
	}
	
	public static WebElement postCodeInput() {
		String postCodeInput = "//input[@placeholder='Post Code']";
		waitForPresence(postCodeInput);
		return Hooks.getDriver().findElement(By.xpath(postCodeInput));
	}
	
	public static WebElement countryDropdown() {
		String countryDropdown = "//div[@name='country']";
		waitForPresence(countryDropdown);
		return Hooks.getDriver().findElement(By.xpath(countryDropdown));
	}
	
	public static WebElement countryInput() {
		String countryInput = "//div[@name='country']//input[@type='text']";
		waitForPresence(countryInput);
		return Hooks.getDriver().findElement(By.xpath(countryInput));
	}
	
	public static WebElement indiaOption() {
		String indiaOption = "//div[@class='visible menu transition']//span[@class='text'][normalize-space()='India']";
		waitForPresence(indiaOption);
		return Hooks.getDriver().findElement(By.xpath(indiaOption));
	}
	
	public static WebElement phoneHint() {
		String phoneHint = "//div[@name='hint']";
		waitForPresence(phoneHint);
		return Hooks.getDriver().findElement(By.xpath(phoneHint));
	}
	
	public static WebElement indiaInputSearch() {
		String indiaInputSearch = "//div[@name='hint']//input[@type='text']";
		waitForPresence(indiaInputSearch);
		return Hooks.getDriver().findElement(By.xpath(indiaInputSearch));
	}
	
	public static WebElement indiaOptionHint() {
		String indiaOptionHint = "//label[text()='Phone']/..//span[text()='India']";
		waitForPresence(indiaOptionHint);
		return Hooks.getDriver().findElement(By.xpath(indiaOptionHint));
	}
	
	public static WebElement phoneNumberInput() {
		String phoneNumberInput = "//input[@placeholder='Number']";
		waitForPresence(phoneNumberInput);
		return Hooks.getDriver().findElement(By.xpath(phoneNumberInput));
	}
	
	public static WebElement phoneNumberTypeInput() {
		String phoneNumberTypeInput = "//input[@placeholder='Home, Work, Mobile...']";
		waitForPresence(phoneNumberTypeInput);
		return Hooks.getDriver().findElement(By.xpath(phoneNumberTypeInput));
	}
	
	public static WebElement positionInput() {
		String positionInput = "//input[@name='position']";
		waitForPresence(positionInput);
		return Hooks.getDriver().findElement(By.xpath(positionInput));
	}
	
	public static WebElement departmentInput() {
		String departmentInput = "//input[@name='department']";
		waitForPresence(departmentInput);
		return Hooks.getDriver().findElement(By.xpath(departmentInput));
	}
	
	public static WebElement supervisorDiv() {
		String supervisorDiv = "//div[@name='supervisor']";
		waitForPresence(supervisorDiv);
		return Hooks.getDriver().findElement(By.xpath(supervisorDiv));
	}
	
	public static WebElement supervisorInput() {
		String supervisorInput = "//div[@name='supervisor']//input[@type='text']";
		waitForPresence(supervisorInput);
		return Hooks.getDriver().findElement(By.xpath(supervisorInput));
	}
	
	public static WebElement supervisorRishaanOption() {
		String supervisorRishaanOption = "//div[@name='supervisor']//div[@role='listbox']//span[text()='rishaan ']";
		waitForPresence(supervisorRishaanOption);
		return Hooks.getDriver().findElement(By.xpath(supervisorRishaanOption));
	}
	
	public static WebElement assistantDiv() {
		String assistantDiv = "//div[@name='assistant']";
		waitForPresence(assistantDiv);
		return Hooks.getDriver().findElement(By.xpath(assistantDiv));
	}
	
	public static WebElement assistantInput() {
		String assistantInput = "//div[@name='assistant']//input[@type='text']";
		waitForPresence(assistantInput);
		return Hooks.getDriver().findElement(By.xpath(assistantInput));
	}
	
	public static WebElement assistantSupsOption() {
		String assistantSupsOption = "//div[@name='assistant']//div[@role='listbox']//span[text()='sups ']";
		waitForPresence(assistantSupsOption);
		return Hooks.getDriver().findElement(By.xpath(assistantSupsOption));
	}
	
	public static WebElement referredByDiv() {
		String referredByDiv = "//div[@name='referred_by']";
		waitForPresence(referredByDiv);
		return Hooks.getDriver().findElement(By.xpath(referredByDiv));
	}
	
	public static WebElement referredByInput() {
		String referredByInput = "//div[@name='referred_by']//input[@type='text']";
		waitForPresence(referredByInput);
		return Hooks.getDriver().findElement(By.xpath(referredByInput));
	}
	
	public static WebElement referredByRishOption() {
		String referredByRishOption = "//div[@name='referred_by']//div[@role='listbox']//span[text()='rish ']";
		waitForPresence(referredByRishOption);
		return Hooks.getDriver().findElement(By.xpath(referredByRishOption));
	}
	
	public static WebElement sourceDropdown() {
		String sourceDropdown = "//label[text()='Source']/..//div[@name='source' and @role='listbox']";
		waitForPresence(sourceDropdown);
		return Hooks.getDriver().findElement(By.xpath(sourceDropdown));
	}
	
	public static WebElement sourceWebsiteOption() {
		String sourceWebsiteOption = "//span[text()='Website']";
		waitForPresence(sourceWebsiteOption);
		return Hooks.getDriver().findElement(By.xpath(sourceWebsiteOption));
	}
	
	public static WebElement doNotCallToggle() {
		String doNotCallToggle = "//label[text()='Do not Call']/../div";
		waitForPresence(doNotCallToggle);
		return Hooks.getDriver().findElement(By.xpath(doNotCallToggle));
	}
	
	public static WebElement doNotEmailToggle() {
		String doNotEmailToggle = "//label[text()='Do not Email']/../div";
		waitForPresence(doNotEmailToggle);
		return Hooks.getDriver().findElement(By.xpath(doNotEmailToggle));
	}
	
	public static WebElement doNotTextToggle() {
		String doNotTextToggle = "//label[text()='Do not Text']/../div";
		waitForPresence(doNotTextToggle);
		return Hooks.getDriver().findElement(By.xpath(doNotTextToggle));
	}
	
	public static WebElement birthDayInput() {
		String birthDayInput = "//input[@placeholder='Day']";
		waitForPresence(birthDayInput);
		return Hooks.getDriver().findElement(By.xpath(birthDayInput));
	}
	
	public static WebElement birthMonthDropdown() {
		String birthMonthDropdown = "//div[@name='month']";
		waitForPresence(birthMonthDropdown);
		return Hooks.getDriver().findElement(By.xpath(birthMonthDropdown));
	}
	
	public static WebElement birthMonthNovemberOption() {
		String birthMonthNovemberOption = "//span[text()='November']";
		waitForPresence(birthMonthNovemberOption);
		return Hooks.getDriver().findElement(By.xpath(birthMonthNovemberOption));
	}
	
	public static WebElement birthYearInput() {
		String birthYearInput = "//input[@placeholder='Year']";
		waitForPresence(birthYearInput);
		return Hooks.getDriver().findElement(By.xpath(birthYearInput));
	}
	
	public static WebElement identifierInput() {
		String identifierInput = "//input[@name='identifier']";
		waitForPresence(identifierInput);
		return Hooks.getDriver().findElement(By.xpath(identifierInput));
	}
	
	public static WebElement imageUploadInput() {
		String imageUploadInput = "//input[@name='fileField']";
		waitForPresence(imageUploadInput);
		return Hooks.getDriver().findElement(By.xpath(imageUploadInput));
	}
	
	public static WebElement saveButton() {
		String saveButton = "//button[normalize-space()='Save']";
		waitForPresence(saveButton);
		return Hooks.getDriver().findElement(By.xpath(saveButton));
	}
}

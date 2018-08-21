package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {

	@Given("^Open Flipkart$")
	public void openFlipkart(){
		System.out.println("Flipkart Opened1");
		System.out.println("Flipkart Opened2");
		System.out.println("Flipkart Opened3");
		System.out.println("Flipkart Opened4");
		System.out.println("Flipkart Opened5");
		System.out.println("Flipkart Opened6");
		System.out.println("Flipkart Opened7");
		System.out.println("Flipkart Opened8");
	}
	
	@When("^Check Flipkart$")
	public void checkFlipkart(){
		System.out.println("checkFlipkart");
	}
	
	@Then("^Flipkart Opened$")
	public void openedFlipkart(){
		System.out.println("openedFlipkart");
	}
	
	@Given("^Open Amazon$")
	public void openAmazon(){
		System.out.println("Amazon Opened1");
		System.out.println("Amazon Opened2");
		System.out.println("Amazon Opened3");
		System.out.println("Amazon Opened4");
		System.out.println("Amazon Opened5");
		System.out.println("Amazon Opened6");
		System.out.println("Amazon Opened7");
		System.out.println("Amazon Opened8");
		System.out.println("Amazon Opened9");
	}
	
	@When("^Check Amazon$")
	public void checkAmazon(){
		System.out.println("checkAmazon");
		//Assert.assertTrue(false);
	}
	
	@Then("^Amazon Opened$")
	public void openedAmazon(){
		System.out.println("openedAmazon");
	}
}

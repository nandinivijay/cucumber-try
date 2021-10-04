package multiplication;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition
{
	int x, y, product;
	@Given("^two numbers$")
	public void two_numbers() throws Throwable {
	    x = 5;
	    y = 3;
	}

	@When("^two number are multiplied$")
	public void two_number_are_multiplied() throws Throwable {
	    product = x*y;
	}

	@Then("^validate their product$")
	public void validate_their_product() throws Throwable {
	    Assert.assertEquals(product,15);
	}

	@Then("^display the product$")
	public void display_the_product() throws Throwable {
	    System.out.println("The product is : "+product);
	}


}

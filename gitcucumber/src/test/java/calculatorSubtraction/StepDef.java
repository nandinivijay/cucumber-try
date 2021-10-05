package calculatorSubtraction;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	

	int a=10,b=5;
	int diff;
@Given("^Have Two variables a and b$")
	public void have_Two_variables_a_and_b()  {
		System.out.println("a:"+a +"b: "+b);
	   
	}

@When("^Subtracting a and b$")
public void subtracting_a_and_b()  {
    diff=a-b;
}

@Then("^Verify Difference$")
public void verify_Difference()  {
 System.out.println("Difference of two numbers is: "+diff);
 Assert.assertEquals(diff,5);
}



}

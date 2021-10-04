package ADDITION;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TotalSum {

	int x,y,z=0;
@Given("^two numbers$")
public void two_numbers() throws Throwable {
    x=10;
    y=20;
}

@When("^two numbers added$")
public void two_numbers_added() throws Throwable {
   z=x+y;
}

@Then("^sum is validated$")
public void sum_is_validated() throws Throwable {
   Assert.assertTrue(z==30);
}

@Then("^print sum$")
public void print_sum() throws Throwable {
    System.out.println("Sum of : " +x+y+" ="+z);
}


}

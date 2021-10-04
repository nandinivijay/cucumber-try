package division;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDefinitions {




 
	     int a;
	     int b;
	   int div;
	    @Given("^two numbers$")
	    public void two_numbers() throws Throwable {
	 a=8;
	 b=2;
	        
	    }

	    @When("^division of two numbers$")
	    public void division_of_two_numbers( ) throws Throwable {
	     

		    div =a/b;
		 
	    }

	    @Then("^output $")
	    public void output() throws Throwable {
	    	System.out.println(div);
	      
	    }

	}



package cucumber.example.steps;

import cucumber.api.java8.En;
import cucumber.example.ArithmeticOps;
import junit.framework.Assert;

public class StepDefinitions implements En {
	Integer result;
	ArithmeticOps ops = new ArithmeticOps();
	
	public StepDefinitions() {
		
		Given("I have {int}", (Integer int1) -> {
			result = int1;
		});
		
		When("I add {int} and {int}", (Integer int1, Integer int2) -> {
		    result = ops.add(int1, int2);
		});
		
		When("I subtract {int} and {int}", (Integer int1, Integer int2) -> {
		    result = ops.subtract(int1, int2);
		});
	
		When("I multiply {int} and {int}", (Integer int1, Integer int2) -> {
		    result = ops.multiply(int1, int2);
		});
		
		When("I divide {int} and {int}", (Integer int1, Integer int2) -> {
		    result = ops.divide(int1, int2);
		});
		
		When("I add {int}", (Integer int1) -> {
			result = ops.add(result, int1);
		});
		
		When("I subtract {int}", (Integer int1) -> {
			result = ops.subtract(result, int1);
		});
		
		When("I multiply {int}", (Integer int1) -> {
			result = ops.multiply(result, int1);
		});
		
		When("I divide {int}", (Integer int1) -> {
			result = ops.divide(result, int1);
		});
		
		Then("the result is {int}", (Integer expected) -> {
		    Assert.assertEquals(expected, result);
		});
			
	}
}

package cucumber.example.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.java8.En;
import cucumber.example.ArithmeticOps;
import io.cucumber.datatable.DataTable;
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
		
		When("I divide the following numbers", (DataTable dataTable) -> {
			List<Integer> list = dataTable.asList(Integer.class);
			result = ops.divide(list.get(0), list.get(1));
		});
		
		When("I multiply the following numbers represented as String", (DataTable dataTable) -> {
			List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
			result = ops.multiply(Integer.parseInt(list.get(0).get("Number1")), Integer.parseInt(list.get(0).get("Number2")));
		});
		
		Then("the result is {int}", (Integer expected) -> {
		    Assert.assertEquals(expected, result);
		});	
	}
}

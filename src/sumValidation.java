import org.testng.annotations.Test;

import file.payload;
import io.restassured.path.json.JsonPath;

public class sumValidation {

	@Test
	public void sumOfCources() {
		int sum = 0;
		JsonPath js = new JsonPath(payload.CourcePrice());
		
		int count = js.getInt("courses.size()");
		for (int i = 0; i < count; i++) {
			int price = js.get("courses[" + i + "].price");
			int copies = js.get("courses[" + i + "].copies");
			int totalamt = price * copies;
			sum = sum + totalamt;
		}
		System.out.println(sum);
		
		
		
		
	}
}

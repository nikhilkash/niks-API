import file.payload;
import io.restassured.path.json.JsonPath;

public class complexJsonParse {
	
	public static void main (String ards[]) {
		
		JsonPath js = new JsonPath(payload.CourcePrice());
		
		int count=js.getInt("courses.size()");
		System.out.println(count);
		
	//int totalAmt=js.getInt("dashboard.purchaseAmount");
	//System.out.println(totalAmt);
		
		String firstTitle=js.get("courses[2].title");
		System.out.println(firstTitle);
		
		for(int i =0;i<count;i++) {
			
			;
			String Courcetiltle=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
		}
		
		
		for(int i=0;i<count;i++) {
			
			String Courcetiltle=js.get("courses["+i+"].title");
			if(Courcetiltle.equalsIgnoreCase("Cypress")) {
				
			int copies=	js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
				
			}
			
			
			
			
			
			
		}
		
	}

}

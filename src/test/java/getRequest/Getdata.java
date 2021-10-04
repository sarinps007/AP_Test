package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getdata {

	@Test
	public void testResponsecode()

	{
		Response resp = RestAssured
				.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=61f3eeaa525a6544a78697cfe4a5e8d5");
		int code = resp.getStatusCode();
		System.out.println("Status code is" + code);
		Assert.assertEquals(code, 200);

	}

	@Test
	public void testBody() {
		Response resp = RestAssured
				.get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=61f3eeaa525a6544a78697cfe4a5e8d5");
		String data = resp.asString();
		System.out.println("Data is" + data);
		System.out.println("Response time" + resp.getTime());
		// Assert.assertEquals(code, 200);

	}

}

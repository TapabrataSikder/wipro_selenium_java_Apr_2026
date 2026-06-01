package utilities;

import java.util.HashMap;
import java.util.Map;

public class ExcelReader {
	
	public static Map<String, String> getLoginData(int rowIndex){
		Map<String, String> data = new HashMap<>();
		
		if (rowIndex == 1) {
            data.put("username", "user@phptravels.com");
            data.put("password", "demouser");
        } else if (rowIndex == 2) {
            data.put("username", "invalid@gmail.com");
            data.put("password", "invalid");
        } else if (rowIndex == 3) {
            data.put("username", "demouser");
            data.put("password", "");
        } else {
            data.put("username", "");
            data.put("password", "user@phptravels.com");
        }
		
		return data;
		
	}

}

package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RegRes {
	
		public static void main(String[] args) throws IOException, ParseException {
			FileReader reader = new FileReader(
					"C:\\Users\\vinot\\eclipse-workspace\\Apidemo\\src\\test\\resources\\demoforApi\\demo1.json");
			JSONParser jsonparser = new JSONParser();
			Object obj = jsonparser.parse(reader);
			JSONObject j = (JSONObject) obj;

			Object page = j.get("page");
			System.out.println(page);

			Object perpage = j.get("per_page");
			System.out.println(perpage);

			Object total = j.get("total");
			System.out.println(total);

			Object totalpages = j.get("total_pages");
			System.out.println(totalpages);

			Object data = j.get("data");
			// class cast
			JSONArray a = (JSONArray) data;
			System.out.println(a.size());

			for (int i = 0; i < a.size(); i++) {
				Object jarray = a.get(i);
				JSONObject objArray = (JSONObject) jarray;
				System.out.println(objArray.get("id"));
				System.out.println(objArray.get("email"));
				System.out.println(objArray.get("first_name"));
				System.out.println(objArray.get("last_name"));
				System.out.println(objArray.get("avatar"));
			}

		}
	}


}

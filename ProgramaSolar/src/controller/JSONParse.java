package controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.IOException;

public class JSONParse {

	private Object json;
	private JSONParser parser = new JSONParser();
	
	public JSONParse(String ruta) {
		try {
			Object obj = parser.parse(new FileReader(ruta));
	        if (obj instanceof JSONArray) {
	            json = (JSONArray) obj;
	        } else if (obj instanceof JSONObject) {
	            json = (JSONObject) obj;
	        }
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	public Object getJson() {
		return json;
	}

	public void setJson(String ruta) {
		try {
			Object obj = parser.parse(new FileReader(ruta));
	        if (obj instanceof JSONArray) {
	            json = (JSONArray) obj;
	        } else if (obj instanceof JSONObject) {
	            json = (JSONObject) obj;
	        }
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void setJson(JSONObject pJson) {
		json = pJson;
	}
	
}

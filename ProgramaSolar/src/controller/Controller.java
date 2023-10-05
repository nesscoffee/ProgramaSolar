package controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Controller {

	public static void main(String[] args) {
		/*ejemplo estrategia B: tengo muchas dudas del json, voy a implementar la carga del json y los hilos de ejecución 
		 de forma que el programa logre extraer esa data y generar información usando los parámetros de los json, 
		 imprimiendo todo eso en consola, así dejo para el final todo lo que son pantallas y las otras clases que
		 las puedo implementar más fácilmente pues lo veo más simple.*/
		
		JSONParse parser = new JSONParse("C:\\Users\\Ness\\Documents\\ProgramaSolar\\ProgramaSolar\\src\\json\\MOCK_DATA.json");
		JSONArray json = (JSONArray) parser.getJson();
		
		for (int i = 0; i < json.size(); i++) {
		    JSONObject panel = (JSONObject) json.get(i);
		    String manufacturer = (String) panel.get("panel_manufacturer");
		    String model = (String) panel.get("panel_model");
		    Double capacity = (Double) panel.get("panel_capacity");
		    System.out.println("Panel Manufacturer: " + manufacturer);
		    System.out.println("Panel Model: " + model);
		    System.out.println("Panel Capacity: " + capacity);
		    System.out.println();
		}
	}

}

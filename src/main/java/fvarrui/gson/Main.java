package fvarrui.gson;

import java.time.Instant;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fvarrui.gson.utils.InstantAdapter;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Chuck");
		p.setApellidos("Norris");
		p.setFechaNacimiento(Instant.now());
		
		InstantAdapter ia = new InstantAdapter();
		
		Gson gson = new GsonBuilder()
						.registerTypeAdapter(Instant.class, ia)
						.setPrettyPrinting()
						.create();
		String json = gson.toJson(p);
		
		System.out.println(json);
	}

}

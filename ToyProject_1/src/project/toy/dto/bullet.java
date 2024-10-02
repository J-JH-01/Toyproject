package project.toy.dto;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bullet {

	private List<String> Armo = new ArrayList<String>();
	Random random = new Random();

	public bullet() {
	
	}

	public bullet(List<String> armo, Random random, int red, int blue) {
		super();
		Armo = armo;
		this.random = random;
	
	}

	public List<String> getArmo() {
		return Armo;
	}

	public void setArmo(List<String> armo) {
		Armo = armo;
	}

	
	
}
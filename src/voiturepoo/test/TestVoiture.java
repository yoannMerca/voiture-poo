package voiturepoo.test;

import voiturepoo.classe.Voiture;

public class TestVoiture {

	public static void main(String[] args) {
		
		Voiture voiture1 = new Voiture("bmw", 220, 12);
		Voiture voiture2 = new Voiture("alpha", 180, 6);
		Voiture voiture3 = new Voiture("honda", 230, 11);
		
		
		Voiture[] voitures = {voiture1 ,voiture2,voiture3} ;
		
		
	
		for(int i =0;i<voitures.length;i++) {
			System.out.println(voitures[i].toString()); 
		}

	}

}

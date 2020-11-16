package org.iesalixar.bluisrochag.neomat;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.iesalixar.bluisrochag.neomat.model.Building;
import org.iesalixar.bluisrochag.neomat.model.Planet;
import org.iesalixar.bluisrochag.neomat.model.Research;
import org.iesalixar.bluisrochag.neomat.model.Settlement;
import org.iesalixar.bluisrochag.neomat.model.Troup;
import org.iesalixar.bluisrochag.neomat.model.User;

public class Main {

	public static void main(String[] args) {

		Planet p = new Planet("Tierra", LocalDate.now());

		User u1 = new User("Blas", "VikingoRM", "blasrochagonzalez@gmail.com", "severa2011", "620215579", "admin");
		p.setNumPlayers(p.getNumPlayers() + 1);
		User u2 = new User("Angel", "Kraptor14", "arochag200@gmail.com", "blackmagic", "615872980", "user");
		p.setNumPlayers(p.getNumPlayers() + 1);
		User u3 = new User("Esther", "Virgesther", "virgesther@gmail.com", "12345", "", "user");
		p.setNumPlayers(p.getNumPlayers() + 1);

		Settlement s1 = new Settlement("s1");
		p.setNumSettlements(p.getNumSettlements() + 1);
		Settlement s2 = new Settlement("s2");
		p.setNumSettlements(p.getNumSettlements() + 1);
		Settlement s3 = new Settlement("s3");
		p.setNumSettlements(p.getNumSettlements() + 1);

		Building b1 = new Building("Mina de Wolframio", "Mina utilizada para la recolección de Wolframio");
		Building b2 = new Building("Mina de Grafeno", "Mina utilizada para la recolección de Grafeno");
		Building b3 = new Building("Mina de Carbino", "Mina utilizada para la recolección de Carbino");
		Building b4 = new Building("Mina de Acero", "Mina utilizada para la recolección de Acero");
		Building b5 = new Building("Recolector de Radiación",
				"Construccion especializada en la extraccion y transformacon de la radiacion de la atmosfera en combustible");
		Building b6 = new Building("Planta de Energia Solar", "Edificio dedicado a la generacion de energia");
		Building b7 = new Building("Hangar",
				"Se encarga de la creacion de nuevas tropas, el aumento de su nivel hará que se creen mas rápidas");
		Building b8 = new Building("Laboratorio de Investigación", "Encargado de investigar nuevas tecnologias");

		Research r1 = new Research("Tecnologia de Energia",
				"Tecnologia encargada del aumento de recoleccion de recursos", new HashMap<String, Integer>());
		r1.getBuildsRequired().put("Laboratorio de Investigación", 1);
		Research r2 = new Research("Tecnologia de IA",
				"Tecnologia que introduce nuevos algoritmos y patrones para acelerar los tiempos de construccion de edificios",
				new HashMap<String, Integer>());
		r2.getBuildsRequired().put("Laboratorio de Investigación", 5);
		Research r3 = new Research("Tecnologia de Espionaje",
				"Tecnologia que aumenta la capacidad de espionaje así como la capacidad de hacer expediciones satisfactoriamente",
				new HashMap<String, Integer>());
		r3.getBuildsRequired().put("Laboratorio de Investigación", 3);
		Research r4 = new Research("Tecnologia Militar",
				"Tecnologia que permite crear nuevos tipos de tropas conforma mas alto sea su nivel",
				new HashMap<String, Integer>());
		r4.getBuildsRequired().put("Laboratorio de Investigación", 5);
		Research r5 = new Research("Tecnologia de Blindaje",
				"Tecnologia encargada de mejorar el blindaje de las tropas, proporcionando mas puntos de estructuras cuanto mayor sea su nivel",
				new HashMap<String, Integer>());
		r5.getBuildsRequired().put("Laboratorio de Investigación", 6);
		Research r6 = new Research("Tecnologia Armamentística",
				"Tecnologia encargada de mejorar la capacidad ofensiva de las tropas, aumentando el daño ocasionado cuanto mayor nivel tenga la investigacion",
				new HashMap<String, Integer>());
		r6.getBuildsRequired().put("Laboratorio de Investigación", 6);
		
		Troup t1 = new Troup("Espía","Vehiculo ultra ligero casi indetectable para las defensas enemigas", false, 800, 1000, 900, 1000, 50, 20, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t1.getBuildsRequired().put("Hangar", 3);
		t1.getBuildsRequired().put("Laboratorio de Investigación", 3);
		t1.getResearchsRequired().put("Tecnologia de Energia", 1);
		t1.getResearchsRequired().put("Tecnologia de Espionaje", 1);
		
		Troup t2 = new Troup("Avispa","Vehiculo ágil desarrollado para incursiones tras las fronteras enemigas", false, 1500, 1250, 1200, 1500, 200, 50, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t2.getBuildsRequired().put("Hangar", 3);
		t2.getBuildsRequired().put("Laboratorio de Investigación", 3);
		t2.getResearchsRequired().put("Tecnologia de Energia", 1);
		t2.getResearchsRequired().put("Tecnologia Militar", 1);
		
		Troup t3 = new Troup("Cazador Ligero","Vehiculo básico de ataque, usdo como primera linea de fuego en los combates", false, 2500, 2000, 2500, 3000, 220, 75, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t3.getBuildsRequired().put("Hangar", 5);
		t3.getBuildsRequired().put("Laboratorio de Investigación", 4);
		t3.getResearchsRequired().put("Tecnologia de Energia", 1);
		t3.getResearchsRequired().put("Tecnologia Militar", 2);
		
		Troup t4 = new Troup("Cazador Pesado","Vehiculo de ataque mas robusto que su predecesor", false, 5600, 3400, 3200, 6000, 260, 160, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t4.getBuildsRequired().put("Hangar", 7);
		t4.getBuildsRequired().put("Laboratorio de Investigación", 6);
		t4.getResearchsRequired().put("Tecnologia de Energia", 3);
		t4.getResearchsRequired().put("Tecnologia Militar", 3);
		t4.getResearchsRequired().put("Tecnologia de Blindaje", 1);
		t4.getResearchsRequired().put("Tecnologia Armamentistica", 1);
		
		Troup t5 = new Troup("Nave Pequeña de Carga","Vehiculo de carga que transporta recursos", false, 8000, 5000, 4300, 2000, 300, 75, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t5.getBuildsRequired().put("Hangar", 5);
		t5.getBuildsRequired().put("Laboratorio de Investigación", 5);
		t5.getResearchsRequired().put("Tecnologia de Energia", 1);
		t5.getResearchsRequired().put("Tecnologia Militar", 2);
		t5.getResearchsRequired().put("Tecnologia de Blindaje", 2);
		
		Troup t6 = new Troup("Nave Grande de Carga","Vehiculo pesado con gran capacidad para el transporte", false, 12000, 7500, 6700, 6000, 350, 160, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t6.getBuildsRequired().put("Hangar", 7);
		t6.getBuildsRequired().put("Laboratorio de Investigación", 6);
		t6.getResearchsRequired().put("Tecnologia de Energia", 3);
		t6.getResearchsRequired().put("Tecnologia Militar", 3);
		t6.getResearchsRequired().put("Tecnologia de Blindaje", 4);
		
		Troup t7 = new Troup("Escolta","Vehiculo blindado que sirve de escudo ante el enemigo", false, 10000, 6500, 5000, 17000, 500, 190, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t7.getBuildsRequired().put("Hangar", 8);
		t7.getBuildsRequired().put("Laboratorio de Investigación", 6);
		t7.getResearchsRequired().put("Tecnologia de Energia", 5);
		t7.getResearchsRequired().put("Tecnologia Militar", 4);
		t7.getResearchsRequired().put("Tecnologia de Blindaje", 6);
		t7.getResearchsRequired().put("Tecnologia Armamentistica", 1);
		
		Troup t8 = new Troup("Asaltador Ligero","vehiculo que usa rayos laser a modo de ataque", false, 15000, 10000, 7500, 12000, 1000, 250, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t8.getBuildsRequired().put("Hangar", 8);
		t8.getBuildsRequired().put("Laboratorio de Investigación", 6);
		t8.getResearchsRequired().put("Tecnologia de Energia", 3);
		t8.getResearchsRequired().put("Tecnologia Militar", 5);
		t8.getResearchsRequired().put("Tecnologia de Blindaje", 2);
		t8.getResearchsRequired().put("Tecnologia Armamentistica", 3);
		
		Troup t9 = new Troup("Asaltador Pesado","vehiculo de mayor tamaño que usa un cañon laser doble", false, 22500, 18000, 12500, 15000, 1500, 280, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t9.getBuildsRequired().put("Hangar", 9);
		t9.getBuildsRequired().put("Laboratorio de Investigación", 7);
		t9.getResearchsRequired().put("Tecnologia de Energia", 8);
		t9.getResearchsRequired().put("Tecnologia Militar", 6);
		t9.getResearchsRequired().put("Tecnologia de Blindaje", 3);
		t9.getResearchsRequired().put("Tecnologia Armamentistica", 4);
		
		Troup t10 = new Troup("Acorazado","Vehiculo extremadamente blindado que ataca con impulsos electromagneticos", false, 31000, 20000, 28000, 60000, 3000, 300, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t10.getBuildsRequired().put("Hangar", 11);
		t10.getBuildsRequired().put("Laboratorio de Investigación", 8);
		t10.getResearchsRequired().put("Tecnologia de Energia", 5);
		t10.getResearchsRequired().put("Tecnologia Militar", 7);
		t10.getResearchsRequired().put("Tecnologia de Blindaje", 7);
		t10.getResearchsRequired().put("Tecnologia Armamentistica", 3);
		
		Troup t11 = new Troup("Bombardero","Vehiculo diseñado para lanzar misiles de gran potencia", false, 40000, 24000, 44000, 35000, 5000, 330, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t11.getBuildsRequired().put("Hangar", 13);
		t11.getBuildsRequired().put("Laboratorio de Investigación", 9);
		t11.getResearchsRequired().put("Tecnologia de Energia", 6);
		t11.getResearchsRequired().put("Tecnologia Militar", 8);
		t11.getResearchsRequired().put("Tecnologia de Blindaje", 4);
		t11.getResearchsRequired().put("Tecnologia Armamentistica", 6);
		
		Troup t12 = new Troup("Destructor","Vehiculo con un fuerte blindaje y gran daño con su cañon laser", false, 50000, 30000, 60000, 40000, 7500, 350, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t12.getBuildsRequired().put("Hangar", 15);
		t12.getBuildsRequired().put("Laboratorio de Investigación", 10);
		t12.getResearchsRequired().put("Tecnologia de Energia", 7);
		t12.getResearchsRequired().put("Tecnologia Militar", 9);
		t12.getResearchsRequired().put("Tecnologia de Blindaje", 5);
		t12.getResearchsRequired().put("Tecnologia Armamentistica", 7);
		
		Troup t13 = new Troup("Gran Wick","Vehiculo de dimensiones masivas preparado para la guerra, su ataque es devastador", false, 300000, 220000, 260000, 500000, 100000, 800, new HashMap<String, Integer>(), new HashMap<String, Integer>());
		t13.getBuildsRequired().put("Hangar", 18);
		t13.getBuildsRequired().put("Laboratorio de Investigación", 12);
		t13.getResearchsRequired().put("Tecnologia de Energia", 8);
		t13.getResearchsRequired().put("Tecnologia Militar", 10);
		t13.getResearchsRequired().put("Tecnologia de Blindaje", 8);
		t13.getResearchsRequired().put("Tecnologia Armamentistica", 10);
	}

}

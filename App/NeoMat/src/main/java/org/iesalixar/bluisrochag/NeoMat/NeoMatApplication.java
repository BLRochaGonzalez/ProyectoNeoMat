package org.iesalixar.bluisrochag.neomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NeoMatApplication  /* implements CommandLineRunner */ {

//	@Autowired
//	PlanetRepository planetRepository;
//	@Autowired
//	UserRepository userRepository;
//	@Autowired
//	SettlementRepository settlementRepository;
//	@Autowired
//	LocationRepository locationRepository;
//	@Autowired
//	BuildingRepository buildingRepository;
//	@Autowired
//	ResearchRepository researchRepository;
//	@Autowired
//	TroupRepository troupRepository;

	public static void main(String[] args) {
		SpringApplication.run(NeoMatApplication.class, args);
	}

//	public void run(String... args) throws Exception {
//
//		// ---------- Deleting all Database ----------
//		planetRepository.deleteAll();
//		userRepository.deleteAll();
//		settlementRepository.deleteAll();
//		locationRepository.deleteAll();
//		buildingRepository.deleteAll();
//		researchRepository.deleteAll();
//		troupRepository.deleteAll();
//
//	// ---------- Implementations ----------
//	// ---------- Planets ----------
//		Planet p = new Planet("Tierra", LocalDate.now());
//		// ---------- Buildings ----------
//		Building b1 = new Building("Mina de Wolframio", "Mina utilizada para la recolección de Wolframio");
//		Building b2 = new Building("Mina de Grafeno", "Mina utilizada para la recolección de Grafeno");
//		Building b3 = new Building("Mina de Carbino", "Mina utilizada para la recolección de Carbino");
//		Building b4 = new Building("Mina de Acero", "Mina utilizada para la recolección de Acero");
//		Building b5 = new Building("Recolector de Radiación",
//				"Construccion especializada en la extraccion y transformacon de la radiacion de la atmosfera en combustible");
//		Building b6 = new Building("Planta de Energia Solar", "Edificio dedicado a la generacion de energia");
//		Building b7 = new Building("Hangar",
//				"Se encarga de la creacion de nuevas tropas, el aumento de su nivel hará que se creen mas rápidas");
//		Building b8 = new Building("Laboratorio de Investigación", "Encargado de investigar nuevas tecnologias, el aumento de su nivel hará que se investiguen mas rápido");
//		// ---------- Researches ----------
//		Research r1 = new Research("Tecnologia de Energia",
//				"Tecnologia encargada del aumento de recoleccion de recursos");
//		Research r2 = new Research("Tecnologia de IA",
//				"Tecnologia que introduce nuevos algoritmos y patrones para acelerar los tiempos de construccion de edificios");
//		Research r3 = new Research("Tecnologia de Espionaje",
//				"Tecnologia que aumenta la capacidad de espionaje así como la capacidad de hacer expediciones satisfactoriamente");
//		Research r4 = new Research("Tecnologia Militar",
//				"Tecnologia que permite aumentar los puntos de estructura de las tropas conforme mas alto sea su nivel");
//		Research r5 = new Research("Tecnologia de Blindaje",
//				"Tecnologia encargada de mejorar el blindaje de las tropas, proporcionando mas puntos de escudo cuanto mayor sea su nivel");
//		Research r6 = new Research("Tecnologia Armamentística",
//				"Tecnologia encargada de mejorar la capacidad ofensiva de las tropas, aumentando el daño ocasionado cuanto mayor nivel tenga la investigacion");
//		// ---------- Troups ----------
//		Troup t1 = new Troup("Espía", "Vehiculo ultra ligero casi indetectable para las defensas enemigas", false, 800.0,
//				1000.0, 900.0, 1000.0, 50.0, 20, 0.0, 10.0, 800.0);
//		Troup t2 = new Troup("Avispa", "Vehiculo ágil desarrollado para incursiones tras las fronteras enemigas", false,
//				1500.0, 1250.0, 1200.0, 1500.0, 200.0, 50, 80.0, 50.0, 3200.0);
//		Troup t3 = new Troup("Cazador Ligero",
//				"Vehiculo básico de ataque, usdo como primera linea de fuego en los combates", false, 2500.0, 2000.0, 2500.0,
//				3000.0, 220.0, 75, 240.0, 100.0, 6000.0);
//		Troup t4 = new Troup("Cazador Pesado", "Vehiculo de ataque mas robusto que su predecesor", false, 5600.0, 3400.0,
//				3200.0, 6000.0, 260.0, 160, 500.0, 250.0, 8000.0);
//		Troup t5 = new Troup("Nave Pequeña de Carga", "Vehiculo de carga que transporta recursos", false, 8000.0, 5000.0,
//				4300.0, 2000.0, 300.0, 75, 10.0, 6000.0, 5000.0);
//		Troup t6 = new Troup("Nave Grande de Carga", "Vehiculo pesado con gran capacidad para el transporte", false,
//				12000.0, 7500.0, 6700.0, 6000.0, 350.0, 100, 16015.0, 31000.0, 10000.0);
//		Troup t7 = new Troup("Escolta", "Vehiculo blindado que sirve de escudo ante el enemigo", false, 10000.0, 6500.0,
//				5000.0, 17000.0, 500.0, 190, 5.0, 500.0, 20000.0);
//		Troup t8 = new Troup("Asaltador Ligero", "vehiculo que usa rayos laser a modo de ataque", false, 15000.0, 10000.0,
//				7500.0, 12000.0, 1000.0, 250, 400.0, 250.0, 7000.0);
//		Troup t9 = new Troup("Asaltador Pesado", "vehiculo de mayor tamaño que usa un cañon laser doble", false, 22500.0,
//				18000.0, 12500.0, 15000.0, 1500.0, 280, 750.0, 400.0, 9000.0);
//		Troup t10 = new Troup("Acorazado", "Vehiculo extremadamente blindado que ataca con impulsos electromagneticos",
//				false, 31000.0, 20000.0, 28000.0, 60000.0, 3000.0, 300, 900.0, 1000.0, 40000.0);
//		Troup t11 = new Troup("Bombardero", "Vehiculo diseñado para lanzar misiles de gran potencia", false, 40000.0,
//				24000.0, 44000.0, 35000.0, 5000.0, 330, 1500.0, 600.0, 15000.0);
//		Troup t12 = new Troup("Destructor", "Vehiculo con un fuerte blindaje y gran daño con su cañon laser", false,
//				50000.0, 30000.0, 60000.0, 40000.0, 7500.0, 350, 1200.0, 750.0, 20000.0);
//		Troup t13 = new Troup("Gran Wick",
//				"Vehiculo de dimensiones masivas preparado para la guerra, su ataque es devastador", false, 300000.0,
//				220000.0, 260000.0, 500000.0, 100000.0, 800, 5000.0, 150000.0, 150000.0);
//		Troup t14 = new Troup("El Muro", "Fortaleza que defiende la ciudad de el asedio de los atacantes", true, 45000.0,
//				30000.0, 32000.0, 70000.0, 0.0, 600, 0.0, 0.0, 200000.0);
//		Troup t15 = new Troup("Araña", "Robot de defensa de escasa durabilidad, dará su vida por defender a su pueblo",
//				true, 500.0, 380.0, 300.0, 700.0, 0.0, 30, 50.0, 0.0, 4000.0);
//		Troup t16 = new Troup("Lanzamisiles", "Robot estatico preparado para la defensa del asentamiento", true, 1500.0,
//				700.0, 1700.0, 2000.0, 0.0, 60, 170.0, 0.0, 8000.0);
//		Troup t17 = new Troup("Torre Cañón",
//				"Cañón de gran envergadura, su ataque a traves de rayos laser son eficaces contra los ataques del exterior",
//				true, 2750.0, 1500.0, 3000.0, 3800.0, 0.0, 120, 340.0, 0.0, 9750.0);
//		Troup t18 = new Troup("Defensor",
//				"Robot que reconoce al enemigo a traves de su sistema de rayos infrarojos y despues aniquila lo que se ponga delante",
//				true, 5750.0, 3000.0, 4500.0, 4900.0, 0.0, 150, 875.0, 0.0, 15000.0);
//		Troup t19 = new Troup("Anti Asedio",
//				"Robot masivo de defensa, eficaz en la defensa y con mayor armamento para su labor", true, 9500.0, 6000.0,
//				7800.0, 12500.0, 0.0, 160, 1050.0, 0.0, 23000.0);
//		Troup t20 = new Troup("Tron-X",
//				"Maquina de guerra destinada a la defensa a traves de misiles, balas, sierras cuerpo a cuerpo... es el robot perfecto de defensa... o casi",
//				true, 18000.0, 14000.0, 17000.0, 30000.0, 0.0, 190, 1400.0, 0.0, 30000.0);
//		Troup t21 = new Troup("Laser Dog",
//				"Robot mega masivo altamente veloz y sigiloso, el daño de sus cañónes laseres a poca distancia son letales para aquel que se le ponga en frente",
//				true, 30000.0, 22000.0, 26000.0, 50000.0, 0.0, 250, 3200.0, 0.0, 35000.0);
//
//		// ---------- Persisting Instances ----------
//		// ---------- Planet ----------
//		planetRepository.save(p);
//		// ---------- Buildings ----------
//		buildingRepository.save(b1);
//		buildingRepository.save(b2);
//		buildingRepository.save(b3);
//		buildingRepository.save(b4);
//		buildingRepository.save(b5);
//		buildingRepository.save(b6);
//		buildingRepository.save(b7);
//		buildingRepository.save(b8);
//		// ---------- Researches ----------
//		researchRepository.save(r1);
//		researchRepository.save(r2);
//		researchRepository.save(r3);
//		researchRepository.save(r4);
//		researchRepository.save(r5);
//		researchRepository.save(r6);
//		// ---------- Troups ----------
//		troupRepository.save(t1);
//		troupRepository.save(t2);
//		troupRepository.save(t3);
//		troupRepository.save(t4);
//		troupRepository.save(t5);
//		troupRepository.save(t6);
//		troupRepository.save(t7);
//		troupRepository.save(t8);
//		troupRepository.save(t9);
//		troupRepository.save(t10);
//		troupRepository.save(t11);
//		troupRepository.save(t12);
//		troupRepository.save(t13);
//		troupRepository.save(t14);
//		troupRepository.save(t15);
//		troupRepository.save(t16);
//		troupRepository.save(t17);
//		troupRepository.save(t18);
//		troupRepository.save(t19);
//		troupRepository.save(t20);
//		troupRepository.save(t21);
//	}

}

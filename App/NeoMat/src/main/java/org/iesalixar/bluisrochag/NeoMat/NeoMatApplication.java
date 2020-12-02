package org.iesalixar.bluisrochag.neomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeoMatApplication /*implements CommandLineRunner*/ {

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
//		// ---------- Implementations ----------
//		// ---------- Planets ----------
//		Planet p = new Planet("Tierra", LocalDate.now());
//		// ---------- Users ----------
//		User u1 = new User("Blas", "VikingoRM", "blasrochagonzalez@gmail.com", "severa2011", "620215579", "admin");
//		User u2 = new User("Angel", "Kraptor14", "arochag200@gmail.com", "blackmagic", "615872980", "user");
//		User u3 = new User("Esther", "Virgesther", "virgesther@gmail.com", "12345", "", "user");
//		@SuppressWarnings({ "unchecked", "rawtypes" })
//		List<User> usersList = new ArrayList();
//		usersList.add(u1);
//		usersList.add(u2);
//		usersList.add(u3);
//		// ---------- Settlements ----------
//		Settlement s1 = new Settlement("Asentamiento Principal");
//		Settlement s2 = new Settlement("Asentamiento Principal");
//		Settlement s3 = new Settlement("Asentamiento Principal");
//		@SuppressWarnings({ "unchecked", "rawtypes" })
//		List<Settlement> settlementsList = new ArrayList();
//		settlementsList.add(s1);
//		settlementsList.add(s2);
//		settlementsList.add(s3);
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
//		Building b8 = new Building("Laboratorio de Investigación", "Encargado de investigar nuevas tecnologias");
//		// ---------- Researches ----------
//		Research r1 = new Research("Tecnologia de Energia",
//				"Tecnologia encargada del aumento de recoleccion de recursos", new ArrayList<String>());
//		r1.getBuildsRequired().add("Laboratorio de Investigación/1");
//		Research r2 = new Research("Tecnologia de IA",
//				"Tecnologia que introduce nuevos algoritmos y patrones para acelerar los tiempos de construccion de edificios",
//				new ArrayList<String>());
//		r2.getBuildsRequired().add("Laboratorio de Investigación/5");
//		Research r3 = new Research("Tecnologia de Espionaje",
//				"Tecnologia que aumenta la capacidad de espionaje así como la capacidad de hacer expediciones satisfactoriamente",
//				new ArrayList<String>());
//		r3.getBuildsRequired().add("Laboratorio de Investigación/3");
//		Research r4 = new Research("Tecnologia Militar",
//				"Tecnologia que permite crear nuevos tipos de tropas conforma mas alto sea su nivel",
//				new ArrayList<String>());
//		r4.getBuildsRequired().add("Laboratorio de Investigación/5");
//		Research r5 = new Research("Tecnologia de Blindaje",
//				"Tecnologia encargada de mejorar el blindaje de las tropas, proporcionando mas puntos de estructuras cuanto mayor sea su nivel",
//				new ArrayList<String>());
//		r5.getBuildsRequired().add("Laboratorio de Investigación/6");
//		Research r6 = new Research("Tecnologia Armamentística",
//				"Tecnologia encargada de mejorar la capacidad ofensiva de las tropas, aumentando el daño ocasionado cuanto mayor nivel tenga la investigacion",
//				new ArrayList<String>());
//		r6.getBuildsRequired().add("Laboratorio de Investigación/6");
//		// ---------- Troups ----------
//		Troup t1 = new Troup("Espía", "Vehiculo ultra ligero casi indetectable para las defensas enemigas", false, 800,
//				1000, 900, 1000, 50, 20, new ArrayList<String>(), new ArrayList<String>());
//		t1.getBuildsRequired().add("Hangar/3");
//		t1.getBuildsRequired().add("Laboratorio de Investigación/3");
//		t1.getResearchsRequired().add("Tecnologia de Energia/1");
//		t1.getResearchsRequired().add("Tecnologia de Espionaje/1");
//		Troup t2 = new Troup("Avispa", "Vehiculo ágil desarrollado para incursiones tras las fronteras enemigas", false,
//				1500, 1250, 1200, 1500, 200, 50, new ArrayList<String>(), new ArrayList<String>());
//		t2.getBuildsRequired().add("Hangar/3");
//		t2.getBuildsRequired().add("Laboratorio de Investigación/3");
//		t2.getResearchsRequired().add("Tecnologia de Energia/1");
//		t2.getResearchsRequired().add("Tecnologia Militar/1");
//		Troup t3 = new Troup("Cazador Ligero",
//				"Vehiculo básico de ataque, usdo como primera linea de fuego en los combates", false, 2500, 2000, 2500,
//				3000, 220, 75, new ArrayList<String>(), new ArrayList<String>());
//		t3.getBuildsRequired().add("Hangar/5");
//		t3.getBuildsRequired().add("Laboratorio de Investigación/4");
//		t3.getResearchsRequired().add("Tecnologia de Energia/1");
//		t3.getResearchsRequired().add("Tecnologia Militar/2");
//		Troup t4 = new Troup("Cazador Pesado", "Vehiculo de ataque mas robusto que su predecesor", false, 5600, 3400,
//				3200, 6000, 260, 160, new ArrayList<String>(), new ArrayList<String>());
//		t4.getBuildsRequired().add("Hangar/7");
//		t4.getBuildsRequired().add("Laboratorio de Investigación/6");
//		t4.getResearchsRequired().add("Tecnologia de Energia/3");
//		t4.getResearchsRequired().add("Tecnologia Militar/3");
//		t4.getResearchsRequired().add("Tecnologia de Blindaje/1");
//		t4.getResearchsRequired().add("Tecnologia Armamentistica/1");
//		Troup t5 = new Troup("Nave Pequeña de Carga", "Vehiculo de carga que transporta recursos", false, 8000, 5000,
//				4300, 2000, 300, 75, new ArrayList<String>(), new ArrayList<String>());
//		t5.getBuildsRequired().add("Hangar/5");
//		t5.getBuildsRequired().add("Laboratorio de Investigación/5");
//		t5.getResearchsRequired().add("Tecnologia de Energia/1");
//		t5.getResearchsRequired().add("Tecnologia Militar/2");
//		t5.getResearchsRequired().add("Tecnologia de Blindaje/2");
//		Troup t6 = new Troup("Nave Grande de Carga", "Vehiculo pesado con gran capacidad para el transporte", false,
//				12000, 7500, 6700, 6000, 350, 160, new ArrayList<String>(), new ArrayList<String>());
//		t6.getBuildsRequired().add("Hangar/7");
//		t6.getBuildsRequired().add("Laboratorio de Investigación/6");
//		t6.getResearchsRequired().add("Tecnologia de Energia/3");
//		t6.getResearchsRequired().add("Tecnologia Militar/3");
//		t6.getResearchsRequired().add("Tecnologia de Blindaje/4");
//		Troup t7 = new Troup("Escolta", "Vehiculo blindado que sirve de escudo ante el enemigo", false, 10000, 6500,
//				5000, 17000, 500, 190, new ArrayList<String>(), new ArrayList<String>());
//		t7.getBuildsRequired().add("Hangar/8");
//		t7.getBuildsRequired().add("Laboratorio de Investigación/6");
//		t7.getResearchsRequired().add("Tecnologia de Energia/5");
//		t7.getResearchsRequired().add("Tecnologia Militar/4");
//		t7.getResearchsRequired().add("Tecnologia de Blindaje/6");
//		t7.getResearchsRequired().add("Tecnologia Armamentistica/1");
//		Troup t8 = new Troup("Asaltador Ligero", "vehiculo que usa rayos laser a modo de ataque", false, 15000, 10000,
//				7500, 12000, 1000, 250, new ArrayList<String>(), new ArrayList<String>());
//		t8.getBuildsRequired().add("Hangar/8");
//		t8.getBuildsRequired().add("Laboratorio de Investigación/6");
//		t8.getResearchsRequired().add("Tecnologia de Energia/3");
//		t8.getResearchsRequired().add("Tecnologia Militar/5");
//		t8.getResearchsRequired().add("Tecnologia de Blindaje/2");
//		t8.getResearchsRequired().add("Tecnologia Armamentistica/3");
//		Troup t9 = new Troup("Asaltador Pesado", "vehiculo de mayor tamaño que usa un cañon laser doble", false, 22500,
//				18000, 12500, 15000, 1500, 280, new ArrayList<String>(), new ArrayList<String>());
//		t9.getBuildsRequired().add("Hangar/9");
//		t9.getBuildsRequired().add("Laboratorio de Investigación/7");
//		t9.getResearchsRequired().add("Tecnologia de Energia/8");
//		t9.getResearchsRequired().add("Tecnologia Militar/6");
//		t9.getResearchsRequired().add("Tecnologia de Blindaje/3");
//		t9.getResearchsRequired().add("Tecnologia Armamentistica/4");
//		Troup t10 = new Troup("Acorazado", "Vehiculo extremadamente blindado que ataca con impulsos electromagneticos",
//				false, 31000, 20000, 28000, 60000, 3000, 300, new ArrayList<String>(), new ArrayList<String>());
//		t10.getBuildsRequired().add("Hangar/11");
//		t10.getBuildsRequired().add("Laboratorio de Investigación/8");
//		t10.getResearchsRequired().add("Tecnologia de Energia/5");
//		t10.getResearchsRequired().add("Tecnologia Militar/7");
//		t10.getResearchsRequired().add("Tecnologia de Blindaje/7");
//		t10.getResearchsRequired().add("Tecnologia Armamentistica/3");
//		Troup t11 = new Troup("Bombardero", "Vehiculo diseñado para lanzar misiles de gran potencia", false, 40000,
//				24000, 44000, 35000, 5000, 330, new ArrayList<String>(), new ArrayList<String>());
//		t11.getBuildsRequired().add("Hangar/13");
//		t11.getBuildsRequired().add("Laboratorio de Investigación/9");
//		t11.getResearchsRequired().add("Tecnologia de Energia/6");
//		t11.getResearchsRequired().add("Tecnologia Militar/8");
//		t11.getResearchsRequired().add("Tecnologia de Blindaje/4");
//		t11.getResearchsRequired().add("Tecnologia Armamentistica/6");
//		Troup t12 = new Troup("Destructor", "Vehiculo con un fuerte blindaje y gran daño con su cañon laser", false,
//				50000, 30000, 60000, 40000, 7500, 350, new ArrayList<String>(), new ArrayList<String>());
//		t12.getBuildsRequired().add("Hangar/15");
//		t12.getBuildsRequired().add("Laboratorio de Investigación/10");
//		t12.getResearchsRequired().add("Tecnologia de Energia/7");
//		t12.getResearchsRequired().add("Tecnologia Militar/9");
//		t12.getResearchsRequired().add("Tecnologia de Blindaje/5");
//		t12.getResearchsRequired().add("Tecnologia Armamentistica/7");
//		Troup t13 = new Troup("Gran Wick",
//				"Vehiculo de dimensiones masivas preparado para la guerra, su ataque es devastador", false, 300000,
//				220000, 260000, 500000, 100000, 800, new ArrayList<String>(), new ArrayList<String>());
//		t13.getBuildsRequired().add("Hangar/18");
//		t13.getBuildsRequired().add("Laboratorio de Investigación/12");
//		t13.getResearchsRequired().add("Tecnologia de Energia/8");
//		t13.getResearchsRequired().add("Tecnologia Militar/10");
//		t13.getResearchsRequired().add("Tecnologia de Blindaje/8");
//		t13.getResearchsRequired().add("Tecnologia Armamentistica/10");
//		Troup t14 = new Troup("El Muro", "Fortaleza que defiende la ciudad de el asedio de los atacantes", true, 45000,
//				30000, 32000, 70000, 0, 600, new ArrayList<String>(), new ArrayList<String>());
//		t14.getBuildsRequired().add("Hangar/5");
//		t14.getBuildsRequired().add("Laboratorio de Investigación/5");
//		t14.getResearchsRequired().add("Tecnologia de Energia/3");
//		t14.getResearchsRequired().add("Tecnologia Militar/3");
//		t14.getResearchsRequired().add("Tecnologia de Blindaje/12");
//		Troup t15 = new Troup("Araña", "Robot de defensa de escasa durabilidad, dará su vida por defender a su pueblo",
//				true, 500, 380, 300, 700, 0, 30, new ArrayList<String>(), new ArrayList<String>());
//		t15.getBuildsRequired().add("Hangar/2");
//		t15.getBuildsRequired().add("Laboratorio de Investigación/1");
//		t15.getResearchsRequired().add("Tecnologia de Energia/1");
//		t15.getResearchsRequired().add("Tecnologia Militar/1");
//		Troup t16 = new Troup("Lanzamisiles", "Robot estatico preparado para la defensa del asentamiento", true, 1500,
//				700, 1700, 2000, 0, 60, new ArrayList<String>(), new ArrayList<String>());
//		t16.getBuildsRequired().add("Hangar/3");
//		t16.getBuildsRequired().add("Laboratorio de Investigación/2");
//		t16.getResearchsRequired().add("Tecnologia de Energia/1");
//		t16.getResearchsRequired().add("Tecnologia Militar/3");
//		Troup t17 = new Troup("Torre Cañón",
//				"Cañón de gran envergadura, su ataque a traves de rayos laser son eficaces contra los ataques del exterior",
//				true, 2750, 1500, 3000, 3800, 0, 120, new ArrayList<String>(), new ArrayList<String>());
//		t17.getBuildsRequired().add("Hangar/5");
//		t17.getBuildsRequired().add("Laboratorio de Investigación/4");
//		t17.getResearchsRequired().add("Tecnologia de Energia/3");
//		t17.getResearchsRequired().add("Tecnologia Militar/5");
//		t17.getResearchsRequired().add("Tecnologia de Blindaje/2");
//		t17.getResearchsRequired().add("Tecnologia Armamentística/1");
//		Troup t18 = new Troup("Defensor",
//				"Robot que reconoce al enemigo a traves de su sistema de rayos infrarojos y despues aniquila lo que se ponga delante",
//				true, 5750, 3000, 4500, 4900, 0, 150, new ArrayList<String>(), new ArrayList<String>());
//		t18.getBuildsRequired().add("Hangar/7");
//		t18.getBuildsRequired().add("Laboratorio de Investigación/5");
//		t18.getResearchsRequired().add("Tecnologia de Energia/4");
//		t18.getResearchsRequired().add("Tecnologia Militar/5");
//		t18.getResearchsRequired().add("Tecnologia de Blindaje/3");
//		t18.getResearchsRequired().add("Tecnologia Armamentística/2");
//		Troup t19 = new Troup("Anti Asedio",
//				"Robot masivo de defensa, eficaz en la defensa y con mayor armamento para su labor", true, 9500, 6000,
//				7800, 12500, 0, 160, new ArrayList<String>(), new ArrayList<String>());
//		t19.getBuildsRequired().add("Hangar/8");
//		t19.getBuildsRequired().add("Laboratorio de Investigación/12");
//		t19.getResearchsRequired().add("Tecnologia de Energia/5");
//		t19.getResearchsRequired().add("Tecnologia Militar/6");
//		t19.getResearchsRequired().add("Tecnologia de Blindaje/4");
//		t19.getResearchsRequired().add("Tecnologia Armamentística/3");
//		Troup t20 = new Troup("Tron-X",
//				"Maquina de guerra destinada a la defensa a traves de misiles, balas, sierras cuerpo a cuerpo... es el robot perfecto de defensa... o casi",
//				true, 18000, 14000, 17000, 30000, 0, 190, new ArrayList<String>(), new ArrayList<String>());
//		t20.getBuildsRequired().add("Hangar/9");
//		t20.getBuildsRequired().add("Laboratorio de Investigación/6");
//		t20.getResearchsRequired().add("Tecnologia de Energia/5");
//		t20.getResearchsRequired().add("Tecnologia Militar/7");
//		t20.getResearchsRequired().add("Tecnologia de Blindaje/5");
//		t20.getResearchsRequired().add("Tecnologia Armamentística/4");
//		Troup t21 = new Troup("Laser Dog",
//				"Robot mega masivo altamente veloz y sigiloso, el daño de sus cañónes laseres a poca distancia son letales para aquel que se le ponga en frente",
//				true, 30000, 22000, 26000, 50000, 0, 250, new ArrayList<String>(), new ArrayList<String>());
//		t21.getBuildsRequired().add("Hangar/10");
//		t21.getBuildsRequired().add("Laboratorio de Investigación/8");
//		t21.getResearchsRequired().add("Tecnologia de Energia/6");
//		t21.getResearchsRequired().add("Tecnologia Militar/9");
//		t21.getResearchsRequired().add("Tecnologia de Blindaje/6");
//		t21.getResearchsRequired().add("Tecnologia Armamentística/5");
//
//		// ---------- Persisting Instances ----------
//		// ---------- Users ----------
//
//		// ---------- Settlements && Locations ----------
//		@SuppressWarnings({ "unchecked", "rawtypes" })
//		List<Location> locationsList = new ArrayList();
//		for (int u = 0; u < usersList.size(); u++) {
//			Location l = new Location();
//			for (Integer x = 1; x <= 5; x++) {
//				for (Integer y = 1; y <= 10; y++) {
//					for (Integer z = 1; z <= 25; z++) {
//						Location loc = locationRepository.findLocationFirstByContinentAndCountryAndRegion(x, y, z);
//						if (loc == null) {
//							for (int m = 0; m < locationsList.size(); m++) {
//								if (x != locationsList.get(m).getContinent()
//										|| y != locationsList.get(m).getCountry()
//										|| z != locationsList.get(m).getRegion()) {
//									l.setContinent(x);
//									l.setCountry(y);
//									l.setRegion(z);
//									locationsList.add(l);
//
//									z = 26;
//									y = 11;
//									x = 6;
//
//									p.setNumSettlements(p.getNumSettlements() + 1);
//									usersList.get(u).getSettlementsId().add(settlementsList.get(u));
//									settlementsList.get(u).setLocation(l);
//									l.setSettlement(settlementsList.get(u));
//									settlementsList.get(u).setUser(usersList.get(u));
//									usersList.get(u).setPlanet(p);
//									p.setNumPlayers(p.getNumPlayers() + 1);
//									p.getUsersId().add(usersList.get(u));
//								}
//							}
//						}
//					}
//				}
//			}
//
//		}
//
//		planetRepository.save(p);

//		for (int a = 0; a <= settlementsList.size(); a++) {
//			settlementRepository.save(settlementsList.get(a));
//			locationRepository.save(locationsList.get(a));
//		}
//		// ---------- Users ----------
//		userRepository.save(u1);
//		userRepository.save(u2);
//		userRepository.save(u3);
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

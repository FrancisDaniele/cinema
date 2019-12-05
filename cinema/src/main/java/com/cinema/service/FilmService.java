package com.cinema.service;

import java.time.LocalDate;
import java.util.HashMap;
import com.cinema.dto.Film;
import com.cinema.dto.Genere;

public class FilmService {
	
	HashMap<Integer, Film> llistaFilms = new HashMap<>();

	public FilmService() {
		/* Dades simples amb objectes predefinits per java
	    Map<Integer, String> llistaFilms = new HashMap();
	    llistaFilms.put(1, "Cronicas de narnia");
	    llistaFilms.put(2, "Rey leon");
	    llistaFilms.put(3, "Ripley");
	    llistaFilms.put(3, "Piratas del caribe");
	    */
	    
	    // Dades de pel·lícules
	    
	    llistaFilms.put(1, new Film(1, "Crónicas de narnia", "Un mon dins un armari", "image.jpg", Genere.AVENTURES, LocalDate.of(2017, 03, 1)));
	    llistaFilms.put(2, new Film(2, "Rey León", "Simba es el futur rei", "image.jpg", Genere.INFANTIL,LocalDate.of(2017, 03, 1)));
	    llistaFilms.put(3, new Film(3, "Marvel supereroes", "Nova fase de Marvel" , "image.jpg", Genere.AVENTURES,LocalDate.of(2017, 03, 1)));
	    llistaFilms.put(4, new Film(4, "Blade Runner", "Un policia a de capturar uns replicants" , "image.jpg", Genere.CIENCIA_FICCIO,LocalDate.of(2017, 03, 1)));
	    

	    // Pelis actuals
	    Film peli_5 = new Film(5, "Joker 2", "Origen del personatge de DC", "image.jpg", Genere.DRAMA,LocalDate.of(2017, 03, 1));
	    HashMap<Integer, String> horari_peli_5 = new HashMap<>();
	    // sessió i horari
	    horari_peli_5.put(1, "18.50");
	    horari_peli_5.put(2, "19.50");
	    horari_peli_5.put(3, "22.50");
	    peli_5.setHorari(horari_peli_5);
	    llistaFilms.put(5, peli_5);

	   
	    Film peli_6 = new Film(6, "Massa", "Pelicula de terror", "image.jpg", Genere.TERROR,LocalDate.of(2017, 03, 1));
	    HashMap<Integer, String> horari_peli_6 = new HashMap<>();
	    // sessió i horari
	    horari_peli_6.put(1, "18.50");
	    horari_peli_6.put(2, "19.50");
	    horari_peli_6.put(3, "22.50");
	    peli_6.setHorari(horari_peli_6);
	    llistaFilms.put(6, peli_6);

	    Film peli_7 = new Film(7, "Terminator 3", "Jonh Connor i el T-800 ", "image.jpg", Genere.CIENCIA_FICCIO, LocalDate.of(2017, 03, 1));
	    HashMap<Integer, String> horari_peli_7 = new HashMap<>();
	    // sessió i horari
	    horari_peli_7.put(1, "18.50");
	    horari_peli_7.put(2, "19.50");
	    horari_peli_7.put(3, "22.50");
	    peli_7.setHorari(horari_peli_7);
	    llistaFilms.put(7, peli_7);

	    Film peli_8 = new Film(8, "Los vegadores END GAME", "Secuela de Infinity War", "image.jpg", Genere.AVENTURES, LocalDate.of(2017, 03, 1));
	    HashMap<Integer, String> horari_peli_8 = new HashMap<>();
	    // sessió i horari
	    horari_peli_8.put(1, "18.50");
	    horari_peli_8.put(2, "19.50");
	    horari_peli_8.put(3, "22.50");
	    peli_8.setHorari(horari_peli_8);
	    llistaFilms.put(8, peli_8);	
	}

	public HashMap<Integer, Film> getLlistaFilms() {
		return llistaFilms;
	}

	public void setLlistaFilms(HashMap<Integer, Film> llistaFilms) {
		this.llistaFilms = llistaFilms;
	}
	
	
	
	
	

}

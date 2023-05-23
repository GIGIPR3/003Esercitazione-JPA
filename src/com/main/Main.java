package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dao.FilmActorDAO;
import com.dao.FilmActorDAOImpl;
import com.entity.Actor;
import com.entity.Film;

public class Main {

	public static void main(String[] args) {

		FilmActorDAO filmActorDAO = new FilmActorDAOImpl();

		Map<Film, List<Actor>> filmActorMap = new HashMap<>();

		Film sasso = new Film("sasso"); // id = 1001
		Film sabbia = new Film("sabbia");

		List<Actor> sassoActorsList = new ArrayList<>();
		List<Actor> sabbiaClubActorsList = new ArrayList<>();
	}

}

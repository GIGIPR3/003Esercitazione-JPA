package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Actor;
import com.entity.Film;

public interface FilmActorDAO {

	public void insertFilmActor(Map<Film, List<Actor>> filmActorMap);

	public void deleteActor(Integer actorId);

	public void deleteActorWithAnnotation(Integer actorId);

	public void deleteFilm(Integer filmId);

	public Film getFilm(Integer filmId);

	public Actor getActor(Integer actorId);

}

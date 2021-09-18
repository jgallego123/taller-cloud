package co.com.cloud.movies.serviceshowtime.services;

import co.com.cloud.movies.serviceshowtime.entities.Showtime;

import java.util.List;

public interface ShowtimeService {
    void save(Showtime showtime);
    void delete(Showtime showtime);
    List<Showtime> findAll();
    Showtime findById(Long id);
}

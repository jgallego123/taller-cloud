package co.com.cloud.movies.serviceshowtime.repositories;

import co.com.cloud.movies.serviceshowtime.entities.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime,Long> {
}

package co.com.cloud.movies.servicemovie.repositories;

import co.com.cloud.movies.servicemovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
}

package co.com.cloud.movies.servicemovie;

import co.com.cloud.movies.servicemovie.entities.Movie;
import co.com.cloud.movies.servicemovie.repositories.MovieRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MovieRepositoryMockTest {
	@Autowired
	private MovieRepository movieRepository;

	@Test
	public void when_findMovie_return_ListMovie(){
		Movie movie = Movie.builder()
				.title("Manuel")
				.director("Valencia")
				.rating(5)
				.build();
		movieRepository.save(movie);
		List<Movie> users = movieRepository.findAll();
		Assertions.assertThat(users.size()).isEqualTo(2);
	}

}

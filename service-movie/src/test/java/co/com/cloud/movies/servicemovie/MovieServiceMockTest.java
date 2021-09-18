package co.com.cloud.movies.servicemovie;
import co.com.cloud.movies.servicemovie.entities.Movie;
import co.com.cloud.movies.servicemovie.repositories.MovieRepository;
import co.com.cloud.movies.servicemovie.services.MovieService;
import co.com.cloud.movies.servicemovie.services.MovieServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class MovieServiceMockTest {
    @Mock
    private MovieRepository movieRepository;
    private MovieService movieService;

    @BeforeEach
    public void begin(){
        MockitoAnnotations.initMocks(this);
        movieService = new MovieServiceImpl(movieRepository);

        Movie movie = Movie.builder()
                .id(4L)
                .title("Test")
                .director("Test")
                .rating(4)
                .build();
        Mockito.when(movieRepository.findById(4L))
                .thenReturn(Optional.of(movie));
    }

    @Test
    public void when_findById_return_movie(){
        Movie movie = movieService.findById(4L);
        Assertions.assertThat(movie.getTitle()).isEqualTo("Test");
    }
}

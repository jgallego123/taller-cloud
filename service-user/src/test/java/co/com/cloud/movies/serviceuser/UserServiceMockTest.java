package co.com.cloud.movies.serviceuser;
import co.com.cloud.movies.serviceuser.entities.User;
import co.com.cloud.movies.serviceuser.repositories.UserRepository;
import co.com.cloud.movies.serviceuser.services.UserService;
import co.com.cloud.movies.serviceuser.services.UserServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class UserServiceMockTest {

    @Mock
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    public void begin(){
        MockitoAnnotations.initMocks(this);
        userService = new UserServiceImpl(userRepository);

        User user = User.builder()
                .id(4L)
                .name("Test")
                .lastname("Test")
                .build();
        Mockito.when(userRepository.findById(4L))
                .thenReturn(Optional.of(user));
    }

    @Test
    public void when_findById_return_user(){
        User user = userService.findById(4L);
        Assertions.assertThat(user.getName()).isEqualTo("Test");
    }

}

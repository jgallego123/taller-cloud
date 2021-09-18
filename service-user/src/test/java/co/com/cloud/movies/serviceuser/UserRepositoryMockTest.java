package co.com.cloud.movies.serviceuser;

import co.com.cloud.movies.serviceuser.entities.User;
import co.com.cloud.movies.serviceuser.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
public class UserRepositoryMockTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void when_findUser_return_ListUser(){
        User user = User.builder()
                .name("Manuel")
                .lastname("Valencia")
                .build();
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        Assertions.assertThat(users.size()).isEqualTo(2);
    }
}

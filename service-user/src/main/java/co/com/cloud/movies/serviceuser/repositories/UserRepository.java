package co.com.cloud.movies.serviceuser.repositories;

import co.com.cloud.movies.serviceuser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}

package user_service.user_service.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import user_service.user_service.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
    Optional <User> findByUsername(String username);
    Optional <User> findByEmail(String email);
    boolean existsByUsername (String username);
    boolean existsByEmail (String email);
    
}

package com.agharibi.repositories;


import com.agharibi.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<AppUser, String> {

    Optional<AppUser> findByUsername(String username);
    Optional<AppUser> findByEmail(String email);

}

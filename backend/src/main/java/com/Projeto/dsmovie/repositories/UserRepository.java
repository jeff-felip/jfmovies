package com.Projeto.dsmovie.repositories;

import com.Projeto.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
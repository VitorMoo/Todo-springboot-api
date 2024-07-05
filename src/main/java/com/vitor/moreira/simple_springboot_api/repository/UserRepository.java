package com.vitor.moreira.simple_springboot_api.repository;


import com.vitor.moreira.simple_springboot_api.model.Task;
import com.vitor.moreira.simple_springboot_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
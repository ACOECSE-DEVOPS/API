package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepo extends JpaRepository<Students, Integer> {

}

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domainPlayer;

@Repository
public interface PlayerRepository extends JpaRepository<domainPlayer, Long> {

}
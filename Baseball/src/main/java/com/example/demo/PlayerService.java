package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domainPlayer;
import com.example.demo.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository PlayerRepository;

    public List<domainPlayer> findAll() {
        return PlayerRepository.findAll();
    }

    public domainPlayer findOne(Long id) {
    	return PlayerRepository.findById(id).orElse(null);
    }

    public domainPlayer save(domainPlayer player) {
        return PlayerRepository.save(player);
    }

    public void delete(Long id) {
        PlayerRepository.deleteById(id);
    }
}
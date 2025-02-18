package com.superanimes.com.service;

import com.superanimes.com.model.Anime;
import com.superanimes.com.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> getAll(){
        return animeRepository.findAll();
    }

    public Anime save(Anime anime){
        return animeRepository.save(anime);
    }
}

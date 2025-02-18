package com.superanimes.com.controller;

import com.superanimes.com.model.Anime;
import com.superanimes.com.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping
    public List<Anime> getAllAnime(){
        return animeService.getAll();
    }

    @PostMapping
    public Anime createAnime(@RequestBody Anime anime){
        return animeService.save(anime);
    }
}

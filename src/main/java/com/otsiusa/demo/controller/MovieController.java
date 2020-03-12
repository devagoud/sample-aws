package com.otsiusa.demo.controller;

import com.otsiusa.demo.domain.ClassicMovie;
import com.otsiusa.demo.service.ClassicMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private ClassicMovieService classicMovieService;

    @PostMapping("/movie")
    public ResponseEntity post(@RequestBody ClassicMovie classicMovie) {
        return ResponseEntity.ok(classicMovieService.post(classicMovie));
    }

   @GetMapping("/movies")
    public ResponseEntity get(){
        return ResponseEntity.ok(classicMovieService.get());
   }
}

package com.otsiusa.demo.service;

import com.otsiusa.demo.domain.ClassicMovie;
import com.otsiusa.demo.domain.infrastructure.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassicMovieServiceImpl implements ClassicMovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public ClassicMovie post(ClassicMovie classicMovie) {
        return movieRepository.save(classicMovie);
    }

    @Override
    public ClassicMovie get() {
        return (ClassicMovie) movieRepository.findAll();
    }
}

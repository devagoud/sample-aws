package com.otsiusa.demo.service;

import com.otsiusa.demo.domain.ClassicMovie;
import org.springframework.stereotype.Service;

public interface ClassicMovieService {

    ClassicMovie post(ClassicMovie classicMovie);

    ClassicMovie get();
}

package com.otsiusa.demo;

import com.otsiusa.demo.config.AppConfig;
import com.otsiusa.demo.domain.ClassicMovie;
import com.otsiusa.demo.domain.HorrorMovie;
import com.otsiusa.demo.domain.infrastructure.MovieRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
class DemoApplicationTests {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    void contextLoads() {
        ClassicMovie classicMovie = new ClassicMovie("A", "a", "aa");
        HorrorMovie horrorMovie = new HorrorMovie("B", "b-2");
        ClassicMovie save = movieRepository.save(classicMovie);
        Assertions.assertNotEquals(save, null);
        HorrorMovie save1 = movieRepository.save(horrorMovie);
        Assertions.assertNotEquals(save1, null);
    }

}

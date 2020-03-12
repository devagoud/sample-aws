package com.otsiusa.demo.domain.infrastructure;

import com.otsiusa.demo.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
}

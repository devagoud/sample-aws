package com.otsiusa.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Movie implements Serializable {
    @Id
    private String movieId;
    private String movieName;

    /**
     * @param movieName
     */
    public Movie(String movieName) {
        this.movieId = UUID.randomUUID().toString();
        this.movieName = movieName;
    }


}

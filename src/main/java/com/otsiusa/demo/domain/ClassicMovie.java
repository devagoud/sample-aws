package com.otsiusa.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class ClassicMovie extends Movie {
private String hero;
private String producer;

    /**
     *
     * @param movieName
     * @param hero
     * @param producer
     */
    public ClassicMovie(String movieName,  String hero, String producer) {
    super(movieName);
    this.hero=hero;
    this.producer=producer;
    }
}

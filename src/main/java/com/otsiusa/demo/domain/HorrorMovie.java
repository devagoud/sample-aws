package com.otsiusa.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class HorrorMovie extends Movie {
    private String subPart;

    /**
     * @param movieName
     * @param subPart
     */
    public HorrorMovie(String movieName, String subPart) {
        super(movieName);
        this.subPart = subPart;
    }
}

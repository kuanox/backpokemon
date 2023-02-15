package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LocationDto implements Serializable {

    private static final long serialVersionUID = 6188932214064557476L;
    private String name;
    private String url;

}

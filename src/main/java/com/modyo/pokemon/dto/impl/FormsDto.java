package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FormsDto implements Serializable {

    private static final long serialVersionUID = 5380800058783757597L;
    private String name;
    private String url;
}

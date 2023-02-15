package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatDto implements Serializable {

    private static final long serialVersionUID = 7092261196367198792L;
    private String name;
    private String url;

}

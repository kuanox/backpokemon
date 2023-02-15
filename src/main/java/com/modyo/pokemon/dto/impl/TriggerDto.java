package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TriggerDto implements Serializable {

    private static final long serialVersionUID = 2712488890819202206L;
    private String name;
    private String url;

}

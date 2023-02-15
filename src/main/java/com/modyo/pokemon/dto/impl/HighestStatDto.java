package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HighestStatDto implements Serializable {

    private static final long serialVersionUID = 2352939038450025735L;
    private String name;
    private String url;

}

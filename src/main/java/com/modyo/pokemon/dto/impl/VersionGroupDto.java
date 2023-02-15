package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VersionGroupDto implements Serializable {

    private static final long serialVersionUID = -8811995286352287392L;
    private String name;
    private String url;

}

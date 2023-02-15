package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TypeDto implements Serializable {

    private static final long serialVersionUID = 6109007956563768790L;
    private String name;
    private String url;

}

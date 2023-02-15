package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AbilitiesDto implements Serializable {

    private static final long serialVersionUID = 3922627075039856947L;
    private AbilityDto ability;
    private Boolean is_hidden;
    private int slot;

}

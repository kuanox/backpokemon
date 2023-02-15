package com.modyo.pokemon.dto.impl;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class TypesDto implements Serializable {

    private static final long serialVersionUID = 6622538598632244581L;
    private int slot;
    private TypeDto type;

}

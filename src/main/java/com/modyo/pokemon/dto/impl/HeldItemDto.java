package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HeldItemDto implements Serializable {

    private static final long serialVersionUID = 6908481553744522667L;
    private String name;
    private String url;

}

package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class YellowDto implements Serializable {

    private static final long serialVersionUID = -6142974316005260400L;
    private String back_default;
    private String back_gray;
    private String back_transparent;
    private String front_default;
    private String front_gray;
    private String front_transparent;

}

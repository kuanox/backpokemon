package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationiDto implements Serializable {

    private static final long serialVersionUID = 8426126123814236090L;
    @Name("red-blue")
    private RedBlueDto red_blue;
    private YellowDto yellow;

}

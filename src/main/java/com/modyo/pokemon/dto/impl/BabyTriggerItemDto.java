package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BabyTriggerItemDto implements Serializable {

    private static final long serialVersionUID = -5185373677332161913L;
    private String name;
    private String url;

}

package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto implements Serializable {

    private static final long serialVersionUID = 7014634207581640705L;
    private String name;
    private String url;

}

package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DescriptionsDto implements Serializable {

    private static final long serialVersionUID = 782604065364858703L;
    private String description;
    private LanguageDto language;

}

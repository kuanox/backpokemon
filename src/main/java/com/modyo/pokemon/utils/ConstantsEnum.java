package com.modyo.pokemon.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ConstantsEnum {

    CALLING_TO("Calling to : ");

    @Getter
    private final String value;
}

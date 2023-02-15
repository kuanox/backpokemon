package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OtherDto implements Serializable {

    private static final long serialVersionUID = -9102594721585505019L;
    private DreamWorldDto dream_world;
    private HomeDto home;
    @Name("official-artwork")
    private OfficialArtworkDto official_artwork;

}

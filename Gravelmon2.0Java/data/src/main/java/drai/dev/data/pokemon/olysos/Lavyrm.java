package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lavyrm extends drai.dev.data.pokemon.Pokemon {
    public Lavyrm() {
        super("Lavyrm",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLAME_BODY), Ability.MAGMA_ARMOR,
                5, 150,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("They have a very slimy layer of mucus around their body, which can get up to over 100°C. In oder to keep the mucus layer, they often swim in volcanoes and magma caverns."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lavyrm");

    }


}

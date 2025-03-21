package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boodini extends drai.dev.data.pokemon.Pokemon {
    public Boodini() {
        super("Boodini",
                Type.PSYCHIC, Type.GHOST,
                new Stats(70,
                        60,
                        50,
                        90,
                        50,
                        130),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_GUARD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Boodini");

    }


}

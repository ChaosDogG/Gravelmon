package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kyokinomi extends drai.dev.data.pokemon.Pokemon {
    public Kyokinomi(Stats stats) {
        super("Kyokinomi",
                Type.GHOST, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("kyoto kinomi yokina"),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kyokinomi");

    }


}

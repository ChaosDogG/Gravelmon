package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mawrine extends drai.dev.data.pokemon.Pokemon {
    public Mawrine() {
        super("Mawrine",
                Type.WATER,
                new Stats(64,
                        60,
                        90,
                        70,
                        90,
                        30),
                List.of(Ability.TORRENT), Ability.MOXIE,
                10, 250,
                new Stats(0,0,2,0,0,0), 45,
                0.87,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Mawrine can produce an outstanding speed in the water, which is exactly the opposite on land. With it's echolocation, it can find prey underwater pretty quickly."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mawrine");

    }


}

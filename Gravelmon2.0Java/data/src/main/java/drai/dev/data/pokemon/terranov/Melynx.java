package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Melynx extends drai.dev.data.pokemon.Pokemon {
    public Melynx() {
        super("Melynx",
                Type.DARK,
                new Stats(65,
                        75,
                        55,
                        45,
                        70,
                        60),
                List.of(Ability.PICKPOCKET), Ability.PICKPOCKET,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Melynx");

    }


}

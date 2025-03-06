package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plantid extends drai.dev.data.pokemon.Pokemon {
    public Plantid() {
        super("Plantid",
                Type.BUG, Type.GRASS,
                new Stats(45,
                        50,
                        50,
                        40,
                        30,
                        75),
                List.of(Ability.GLUTTONY,Ability.HARVEST), Ability.PICKUP,
                2, 18,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The seeds and berries it forages for eventually grow into a trailing stalk. As its stalk ripens it leaves behind seeds in the soil it disturbs."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Plantid");

    }


}

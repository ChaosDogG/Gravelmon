package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Audhroch extends drai.dev.data.pokemon.Pokemon {
    public Audhroch(Stats stats) {
        super("Audhroch",
                Type.FIRE, Type.STEEL,
                stats,
                List.of(Ability.BLAZE), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Audhroch");

    }


}

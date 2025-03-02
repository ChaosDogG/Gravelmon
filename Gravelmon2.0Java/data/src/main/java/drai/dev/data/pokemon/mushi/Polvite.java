package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Polvite extends drai.dev.data.pokemon.Pokemon {
    public Polvite() {
        super("Polvite",
                Type.GROUND,
                new Stats(34,
                        69,
                        78,
                        32,
                        32,
                        55),
                List.of(Ability.SAND_FORCE,Ability.SAP_SIPPER), Ability.INFILTRATOR,
                0, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Polvite");

    }


}

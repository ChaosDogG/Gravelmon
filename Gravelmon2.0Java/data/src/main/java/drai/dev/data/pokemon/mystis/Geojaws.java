package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geojaws extends drai.dev.data.pokemon.Pokemon {
    public Geojaws() {
        super("Geojaws",
                Type.WATER, Type.ROCK,
                new Stats(70,
                        120,
                        85,
                        50,
                        70,
                        110),
                List.of(Ability.ROUGH_SKIN), Ability.ADAPTABILITY,
                54, 5200,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its massive stature and powerful attacks make it a threatening Pokémon. It's rather rare, and the threat it poses causes very few to live to tell the tale."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.LIQUIDATION,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Geojaws");

    }


}

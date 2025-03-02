package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bassacre extends drai.dev.data.pokemon.Pokemon {
    public Bassacre() {
        super("Bassacre",
                Type.WATER, Type.DARK,
                new Stats(90,
                        100,
                        90,
                        65,
                        80,
                        75),
                List.of(Ability.REELIN,Ability.STRONG_JAW), Ability.SWIFT_SWIM,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("- Taunt Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bassacre");

    }


}

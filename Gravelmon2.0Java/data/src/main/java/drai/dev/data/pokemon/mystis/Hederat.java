package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hederat extends drai.dev.data.pokemon.Pokemon {
    public Hederat() {
        super("Hederat",
                Type.GRASS,
                new Stats(80,
                        85,
                        70,
                        50,
                        70,
                        95),
                List.of(Ability.HERBALIST,Ability.IMMUNITY), Ability.CHLOROPHYLL,
                0, 0,
                new Stats(1,1,0,0,0,0), 0,
                0.5,
                154, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Hederat are often found scurrying around bushes, looking for berries to snack on."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.VERDANTTAIL,1),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hederat");

    }


}

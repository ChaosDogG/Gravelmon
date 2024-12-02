package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Possion extends drai.dev.data.pokemon.Pokemon {
    public Possion() {
        super("Possion",
                Type.POISON,
                new Stats(45,
                        40,
                        50,
                        100,
                        45,
                        40),
                List.of(Ability.POWER_OF_ALCHEMY), Ability.CURIOUS_MEDICINE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Possion");

    }


}

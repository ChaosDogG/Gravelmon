package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mosstone extends drai.dev.data.pokemon.Pokemon {
    public Mosstone() {
        super("Mosstone",
                Type.ROCK, Type.GRASS,
                new Stats(90,
                        125,
                        120,
                        80,
                        85,
                        50),
                List.of(Ability.GREENTHUMB), Ability.GREENTHUMB,
                20, 3450,
                new Stats(0,2,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mosstone");

    }


}

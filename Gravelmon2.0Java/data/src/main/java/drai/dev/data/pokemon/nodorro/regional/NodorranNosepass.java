package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranNosepass extends drai.dev.data.pokemon.Pokemon {
    public NodorranNosepass(String name, Aspect aspect) {
        super(name, aspect, "Nosepass",
                Type.ROCK, Type.GRASS,
                new Stats(60,
                        50,
                        80,
                        55,
                        105,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 1050,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
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
           setLangFileName("Nosepass");

    }


}

package drai.dev.data.pokemon.mystis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisianMorgrem extends drai.dev.data.pokemon.Pokemon {
    public MystisianMorgrem(String name, Aspect aspect) {
        super(name, aspect, "Morgrem",
                Type.FIRE,Type.STEEL,
                new Stats(65,
                        60,
                        75,
                        75,
                        65,
                        30),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                8, 125,
                new Stats(0,0,0,0,0,0), 120,
                0.75,
                130, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Morgrem");

    }


}

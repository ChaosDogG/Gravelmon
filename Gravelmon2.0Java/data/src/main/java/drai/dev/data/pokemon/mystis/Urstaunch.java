package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Urstaunch extends drai.dev.data.pokemon.Pokemon {
    public Urstaunch() {
        super("Urstaunch",
                Type.WATER, Type.ROCK,
                new Stats(100,
                        100,
                        130,
                        70,
                        90,
                        40),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Urstaunch spend all day lying around in flowing rivers, causing massive blockages. A group of Urstaunch and Bearrier can block even the widest river, so they're led away from their lazing spot with some delicious food, like some fish or berries."),
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
           setLangFileName("Urstaunch");

    }


}

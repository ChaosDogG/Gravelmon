package drai.dev.data.pokemon.orbis.regional;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.kuria.*;
import drai.dev.data.pokemon.ottora.*;

import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.ultraspace.*;
import drai.dev.data.pokemon.urzavos.*;
import drai.dev.data.pokemon.terranov.*;
import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.mystis.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.neonintendo.*;
import drai.dev.data.pokemon.tokas.*;
import drai.dev.data.pokemon.panjaea.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.orbis.*;
import drai.dev.data.pokemon.fliga.*;
import drai.dev.data.pokemon.ruskow.*;
import drai.dev.data.pokemon.otopo.*;
import drai.dev.data.pokemon.goetia.*;
import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.lagoone.*;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.avoris.*;
import drai.dev.data.pokemon.enriko.*;
import drai.dev.data.pokemon.ferroa.*;
import drai.dev.data.pokemon.hiza.*;
import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.interregional.*;
import drai.dev.data.pokemon.isiah.*;
import drai.dev.data.pokemon.junnin.*;
import drai.dev.data.pokemon.lonava.*;
import drai.dev.data.pokemon.mythire.*;
import drai.dev.data.pokemon.nosto.*;
import drai.dev.data.pokemon.novrai.*;
import drai.dev.data.pokemon.oceane.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.qamor.*;
import drai.dev.data.pokemon.rica.*;
import drai.dev.data.pokemon.varitas.*;
import drai.dev.data.pokemon.aristos.*;
import drai.dev.data.pokemon.midamis.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zigzagoon extends drai.dev.data.pokemon.Pokemon {
    public Zigzagoon(String name, Aspect aspect) {
        super(name, aspect, "Zigzagoon",
                Type.DARK, Type.NORMAL,
                new Stats(38,
                        30,
                        41,
                        30,
                        41,
                        60),
                List.of(Ability.PICKUP,Ability.GLUTTONY), Ability.QUICK_FEET,
                4, 175,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its restlessness has it constantly running around. If it sees another Pokémon, it will purposely run into them in order to start a fight. Thought to be the oldest form of Zigzagoon, it moves in zigzags and wreaks havoc upon its surroundings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.SNARL,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,15),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,18),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,27),
                        new MoveLearnSetEntry(Move.COUNTER,30),
                        new MoveLearnSetEntry(Move.TAUNT,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zigzagoon");

    }


}

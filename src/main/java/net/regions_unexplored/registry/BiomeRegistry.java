package net.regions_unexplored.registry;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.config.RuCommonConfig;
import net.regions_unexplored.data.worldgen.biome.RuBiomes;
import net.regions_unexplored.data.worldgen.biome.builder.*;
import net.regions_unexplored.data.worldgen.biome.surface.RuOverworldSurfaceBuilders;
import net.regions_unexplored.world.level.region.RuRegionNether;
import net.regions_unexplored.world.level.region.RuRegionPrimary;
import net.regions_unexplored.world.level.region.RuRegionSecondary;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class BiomeRegistry {

    public static void addBiomes() {
        registerVillagerTypes();
    }

    public static void setupTerrablender() {
        Regions.register(new RuRegionPrimary(RuCommonConfig.REGION_PRIMARY_WEIGHT.get()));
        Regions.register(new RuRegionSecondary(RuCommonConfig.REGION_SECONDARY_WEIGHT.get()));
        Regions.register(new RuRegionNether(RuCommonConfig.REGION_NETHER_WEIGHT.get()));
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, RegionsUnexploredMod.MOD_ID, RuOverworldSurfaceBuilders.makeRules());
    }

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<ConfiguredWorldCarver<?>> carversGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> featuresGetter = context.lookup(Registries.PLACED_FEATURE);
        //TODO:Add biome builder classes

        //FOREST
        register(context, RuBiomes.AUTUMNAL_MAPLE_FOREST, ForestBiomes.autumnalMapleForest(featuresGetter, carversGetter));
        register(context, RuBiomes.BAMBOO_FOREST, ForestBiomes.bambooForest(featuresGetter, carversGetter));
        register(context, RuBiomes.MAGNOLIA_HIGHLANDS, ForestBiomes.magnoliaHighlands(featuresGetter, carversGetter));
        register(context, RuBiomes.DECIDUOUS_FOREST, ForestBiomes.deciduousForest(featuresGetter, carversGetter));
        register(context, RuBiomes.MAPLE_FOREST, ForestBiomes.mapleForest(featuresGetter, carversGetter));
        register(context, RuBiomes.MAUVE_HILLS, ForestBiomes.mauveHills(featuresGetter, carversGetter));
        register(context, RuBiomes.ORCHARD, ForestBiomes.orchard(featuresGetter, carversGetter));
        register(context, RuBiomes.SILVER_BIRCH_FOREST, ForestBiomes.silverBirchForest(featuresGetter, carversGetter));
        register(context, RuBiomes.TEMPERATE_GROVE, ForestBiomes.temperateGrove(featuresGetter, carversGetter));
        register(context, RuBiomes.WILLOW_FOREST, ForestBiomes.willowForest(featuresGetter, carversGetter));
        //TAIGA
        //TODO:rename to taigas
        register(context, RuBiomes.BLACKWOOD_TAIGA, TaigaBiomes.blackwoodTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.BOREAL_TAIGA, TaigaBiomes.borealTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.GOLDEN_BOREAL_TAIGA, TaigaBiomes.goldenBorealTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.PINE_TAIGA, TaigaBiomes.pineTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.REDWOODS, TaigaBiomes.redwoods(featuresGetter, carversGetter));
        register(context, RuBiomes.SPARSE_REDWOODS, TaigaBiomes.sparseRedwoods(featuresGetter, carversGetter));
        //PLAINS
        register(context, RuBiomes.BARLEY_FIELDS, PlainsBiomes.barleyFields(featuresGetter, carversGetter));
        register(context, RuBiomes.FLOWER_FIELDS, PlainsBiomes.flowerFields(featuresGetter, carversGetter));
        register(context, RuBiomes.GRASSLAND, PlainsBiomes.grassland(featuresGetter, carversGetter));
        register(context, RuBiomes.LUPINE_PLAINS, PlainsBiomes.lupinePlains(featuresGetter, carversGetter));
        register(context, RuBiomes.ROCKY_MEADOW, PlainsBiomes.rockyMeadow(featuresGetter, carversGetter));
        register(context, RuBiomes.POPPY_FIELDS, PlainsBiomes.poppyFields(featuresGetter, carversGetter));
        register(context, RuBiomes.PRAIRIE, PlainsBiomes.prairie(featuresGetter, carversGetter));
        register(context, RuBiomes.PUMPKIN_FIELDS, PlainsBiomes.pumpkinFields(featuresGetter, carversGetter));
        register(context, RuBiomes.SHRUBLAND, PlainsBiomes.shrubland(featuresGetter, carversGetter));
        //WET
        register(context, RuBiomes.BAYOU, WetBiomes.bayou(featuresGetter, carversGetter));
        register(context, RuBiomes.EUCALYPTUS_FOREST, WetBiomes.eucalyptusForest(featuresGetter, carversGetter));
        register(context, RuBiomes.FEN, WetBiomes.fen(featuresGetter, carversGetter));
        register(context, RuBiomes.FLOODED_PLAINS, WetBiomes.floodedPlains(featuresGetter, carversGetter));
        register(context, RuBiomes.FUNGAL_FEN, WetBiomes.fungalFen(featuresGetter, carversGetter));
        register(context, RuBiomes.OLD_GROWTH_BAYOU, WetBiomes.oldGrowthBayou(featuresGetter, carversGetter));
        register(context, RuBiomes.OLD_GROWTH_RAINFOREST, WetBiomes.oldGrowthRainforest(featuresGetter, carversGetter));
        register(context, RuBiomes.RAINFOREST, WetBiomes.rainforest(featuresGetter, carversGetter));
        //ARID
        register(context, RuBiomes.BAOBAB_SAVANNA, AridBiomes.baobabSavanna(featuresGetter, carversGetter));
        register(context, RuBiomes.DRY_BUSHLAND, AridBiomes.dryBushland(featuresGetter, carversGetter));
        register(context, RuBiomes.JOSHUA_DESERT, AridBiomes.joshuaDesert(featuresGetter, carversGetter));
        register(context, RuBiomes.OUTBACK, AridBiomes.outback(featuresGetter, carversGetter));
        register(context, RuBiomes.SAGUARO_DESERT, AridBiomes.saguaroDesert(featuresGetter, carversGetter));
        register(context, RuBiomes.STEPPE, AridBiomes.steppe(featuresGetter, carversGetter));
        //MOUNTAIN
        register(context, RuBiomes.ARID_MOUNTAINS, MountainBiomes.aridMountains(featuresGetter, carversGetter));
        register(context, RuBiomes.HIGHLAND_FIELDS, MountainBiomes.highlandFields(featuresGetter, carversGetter));
        register(context, RuBiomes.LUSH_HILLS, MountainBiomes.lushHills(featuresGetter, carversGetter));
        register(context, RuBiomes.MOUNTAINS, MountainBiomes.mountains(featuresGetter, carversGetter));
        register(context, RuBiomes.PINE_SLOPES, MountainBiomes.pineSlopes(featuresGetter, carversGetter));
        register(context, RuBiomes.TOWERING_CLIFFS, MountainBiomes.toweringCliffs(featuresGetter, carversGetter));
        //COASTAL
        register(context, RuBiomes.CHALK_CLIFFS, CoastalBiomes.chalkCliffs(featuresGetter, carversGetter));
        register(context, RuBiomes.GRASSY_BEACH, CoastalBiomes.grassyBeach(featuresGetter, carversGetter));
        register(context, RuBiomes.GRAVEL_BEACH, CoastalBiomes.gravelBeach(featuresGetter, carversGetter));
        //AQUATIC
        register(context, RuBiomes.ALPHA_GROVE, AquaticBiomes.alphaGrove(featuresGetter, carversGetter));
        register(context, RuBiomes.COLD_RIVER, AquaticBiomes.coldRiver(featuresGetter, carversGetter));
        register(context, RuBiomes.HYACINTH_DEEPS, AquaticBiomes.hyacinthDeeps(featuresGetter, carversGetter));
        register(context, RuBiomes.MUDDY_RIVER, AquaticBiomes.muddyRiver(featuresGetter, carversGetter));
        register(context, RuBiomes.ROCKY_REEF, AquaticBiomes.rockyReef(featuresGetter, carversGetter));
        register(context, RuBiomes.ASHEN_WOODLAND, AquaticBiomes.ashenWoodland(featuresGetter, carversGetter));
        register(context, RuBiomes.TROPICS, AquaticBiomes.tropics(featuresGetter, carversGetter));
        //FROZEN
        register(context, RuBiomes.COLD_BOREAL_TAIGA, FrozenBiomes.coldBorealTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.COLD_DECIDUOUS_FOREST, FrozenBiomes.coldDeciduousForest(featuresGetter, carversGetter));
        register(context, RuBiomes.FROZEN_PINE_TAIGA, FrozenBiomes.frozenPineTaiga(featuresGetter, carversGetter));
        register(context, RuBiomes.FROZEN_TUNDRA, FrozenBiomes.frozenTundra(featuresGetter, carversGetter));
        register(context, RuBiomes.ICY_HEIGHTS, FrozenBiomes.icyHeights(featuresGetter, carversGetter));
        register(context, RuBiomes.SPIRES, FrozenBiomes.spires(featuresGetter, carversGetter));
        //CAVE
        register(context, RuBiomes.ANCIENT_DELTA, CaveBiomes.ancientDelta(featuresGetter, carversGetter));
        register(context, RuBiomes.BIOSHROOM_CAVES, CaveBiomes.bioshroomCaves(featuresGetter, carversGetter));
        register(context, RuBiomes.PRISMACHASM, CaveBiomes.prismachasm(featuresGetter, carversGetter));
        register(context, RuBiomes.REDSTONE_CAVES, CaveBiomes.redstoneCaves(featuresGetter, carversGetter));
        register(context, RuBiomes.SCORCHING_CAVES, CaveBiomes.scorchingCaves(featuresGetter, carversGetter));
        //NETHER
        register(context, RuBiomes.BLACKSTONE_BASIN, NetherBiomes.blackstoneBasin(featuresGetter, carversGetter));
        register(context, RuBiomes.CORRUPTED_HOLT, NetherBiomes.corruptedHolt(featuresGetter, carversGetter));
        register(context, RuBiomes.GLISTERING_MEADOW, NetherBiomes.glisteringMeadow(featuresGetter, carversGetter));
        register(context, RuBiomes.MYCOTOXIC_UNDERGROWTH, NetherBiomes.mycotoxicUndergrowth(featuresGetter, carversGetter));
        register(context, RuBiomes.REDSTONE_HELL, NetherBiomes.redstoneHell(featuresGetter, carversGetter));






    }

    private static void registerVillagerTypes() {
        //TODO:set villager types
        //FOREST
        registerVillagers(RuBiomes.AUTUMNAL_MAPLE_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BAMBOO_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MAGNOLIA_HIGHLANDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.DECIDUOUS_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MAPLE_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MAUVE_HILLS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ORCHARD, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SILVER_BIRCH_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.TEMPERATE_GROVE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.WILLOW_FOREST, VillagerType.PLAINS);
        //TAIGA
        registerVillagers(RuBiomes.BLACKWOOD_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.BOREAL_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GOLDEN_BOREAL_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PINE_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.REDWOODS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SPARSE_REDWOODS, VillagerType.PLAINS);
        //PLAINS
        registerVillagers(RuBiomes.BARLEY_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FLOWER_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRASSLAND, VillagerType.PLAINS);
        registerVillagers(RuBiomes.LUPINE_PLAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ROCKY_MEADOW, VillagerType.PLAINS);
        registerVillagers(RuBiomes.POPPY_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PRAIRIE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PUMPKIN_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SHRUBLAND, VillagerType.PLAINS);
        //WET
        registerVillagers(RuBiomes.BAYOU, VillagerType.PLAINS);
        registerVillagers(RuBiomes.EUCALYPTUS_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FEN, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FLOODED_PLAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FUNGAL_FEN, VillagerType.PLAINS);
        registerVillagers(RuBiomes.OLD_GROWTH_BAYOU, VillagerType.PLAINS);
        registerVillagers(RuBiomes.OLD_GROWTH_RAINFOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.RAINFOREST, VillagerType.PLAINS);
        //ARID
        registerVillagers(RuBiomes.BAOBAB_SAVANNA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.DRY_BUSHLAND, VillagerType.PLAINS);
        registerVillagers(RuBiomes.JOSHUA_DESERT, VillagerType.PLAINS);
        registerVillagers(RuBiomes.OUTBACK, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SAGUARO_DESERT, VillagerType.PLAINS);
        registerVillagers(RuBiomes.STEPPE, VillagerType.PLAINS);
        //MOUNTAIN
        registerVillagers(RuBiomes.ARID_MOUNTAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.HIGHLAND_FIELDS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.LUSH_HILLS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MOUNTAINS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PINE_SLOPES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.TOWERING_CLIFFS, VillagerType.PLAINS);
        //COASTAL
        registerVillagers(RuBiomes.CHALK_CLIFFS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRASSY_BEACH, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GRAVEL_BEACH, VillagerType.PLAINS);
        //AQUATIC
        registerVillagers(RuBiomes.ALPHA_GROVE, VillagerType.PLAINS);
        registerVillagers(RuBiomes.COLD_RIVER, VillagerType.PLAINS);
        registerVillagers(RuBiomes.HYACINTH_DEEPS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MUDDY_RIVER, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ROCKY_REEF, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ASHEN_WOODLAND, VillagerType.PLAINS);
        registerVillagers(RuBiomes.TROPICS, VillagerType.PLAINS);
        //FROZEN
        registerVillagers(RuBiomes.COLD_BOREAL_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.COLD_DECIDUOUS_FOREST, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FROZEN_PINE_TAIGA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.FROZEN_TUNDRA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ICY_HEIGHTS, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SPIRES, VillagerType.PLAINS);
        //CAVE
        registerVillagers(RuBiomes.BIOSHROOM_CAVES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.ANCIENT_DELTA, VillagerType.PLAINS);
        registerVillagers(RuBiomes.PRISMACHASM, VillagerType.PLAINS);
        registerVillagers(RuBiomes.REDSTONE_CAVES, VillagerType.PLAINS);
        registerVillagers(RuBiomes.SCORCHING_CAVES, VillagerType.PLAINS);
        //NETHER
        registerVillagers(RuBiomes.BLACKSTONE_BASIN, VillagerType.PLAINS);
        registerVillagers(RuBiomes.CORRUPTED_HOLT, VillagerType.PLAINS);
        registerVillagers(RuBiomes.GLISTERING_MEADOW, VillagerType.PLAINS);
        registerVillagers(RuBiomes.MYCOTOXIC_UNDERGROWTH, VillagerType.PLAINS);
        registerVillagers(RuBiomes.REDSTONE_HELL, VillagerType.PLAINS);

    }

    private static void register(BootstapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

    private static void registerVillagers(ResourceKey<Biome> key, VillagerType type) {
        VillagerType.BY_BIOME.put(key, type);
    }
}

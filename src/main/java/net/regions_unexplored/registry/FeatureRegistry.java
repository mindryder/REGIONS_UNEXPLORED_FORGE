package net.regions_unexplored.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ColumnFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraftforge.registries.RegistryObject;
import net.regions_unexplored.RegionsUnexploredMod;
import net.regions_unexplored.data.worldgen.features.RuTreeFeatures;
import net.regions_unexplored.world.level.feature.*;
import net.regions_unexplored.world.level.feature.bioshroom.GiantBlueBioshroomFeature;
import net.regions_unexplored.world.level.feature.bioshroom.GiantGreenBioshroomFeature;
import net.regions_unexplored.world.level.feature.configuration.*;
import net.regions_unexplored.world.level.feature.tree.*;
import net.regions_unexplored.world.level.feature.tree.nether.BrimWillowFeature;
import net.regions_unexplored.world.level.feature.tree.nether.TallBrimWillowFeature;

public class FeatureRegistry {
    //TODO:Complete Class
    //AQUATIC
    //public static RegistryObject<Feature> ROCK_PILLAR;
    //public static RegistryObject<Feature> AIR_MULTIFACE_GROWTH;
    //public static RegistryObject<Feature> TALL_HYACINTH_STOCK;
    //public static RegistryObject<Feature> HYACINTH_PLANTS;
    //public static RegistryObject<Feature> OCEAN_ROCK;
    //BIOSHROOMS
    public static RegistryObject<Feature> GIANT_BLUE_BIOSHROOM;
    public static RegistryObject<Feature> GIANT_GREEN_BIOSHROOM;
    //public static RegistryObject<Feature> GIANT_PINK_BIOSHROOM;
    //public static RegistryObject<Feature> GIANT_YELLOW_BIOSHROOM;
    //TREES
    public static RegistryObject<Feature> ASHEN_TREE;
    public static RegistryObject<Feature> ASPEN_TREE;
    public static RegistryObject<Feature> BLACKWOOD_TREE;
    public static RegistryObject<Feature> CYPRESS_TREE;
    public static RegistryObject<Feature> EUCALYPTUS_TREE;
    public static RegistryObject<Feature> GIANT_CYPRESS_TREE;
    public static RegistryObject<Feature> LARCH_TREE;
    public static RegistryObject<Feature> LARGE_JOSHUA_TREE;
    public static RegistryObject<Feature> MAPLE_TREE;
    public static RegistryObject<Feature> MEDIUM_JOSHUA_TREE;
    public static RegistryObject<Feature> PALM_TREE;
    public static RegistryObject<Feature> PINE_TREE;
    public static RegistryObject<Feature> STRIPPED_PINE_TREE;
    public static RegistryObject<Feature> REDWOOD_TREE;
    public static RegistryObject<Feature> SAGUARO_CACTUS;
    public static RegistryObject<Feature> SAKURA_TREE;
    public static RegistryObject<Feature> SUPER_REDWOOD_TREE;
    public static RegistryObject<Feature> ULTRA_REDWOOD_TREE;
    //CAVE
    public static RegistryObject<Feature> POINTED_REDSTONE;
    public static RegistryObject<Feature> LARGE_POINTED_REDSTONE;
    public static RegistryObject<Feature> POINTED_REDSTONE_CLUSTER;
    public static RegistryObject<Feature> HANGING_PRISMARITE;
    public static RegistryObject<Feature> DROPLEAF;
    public static RegistryObject<Feature> BASALT_BLOB;
    public static RegistryObject<Feature> ASH_VENT;
    public static RegistryObject<Feature> LAVA_FALL;
    public static RegistryObject<Feature> OVERWORLD_LAVA_DELTA;
    //NETHER
    public static RegistryObject<Feature> BRIM_WILLOW;
    public static RegistryObject<Feature> TALL_BRIM_WILLOW;
    //VEGETATION
    public static RegistryObject<Feature> SHRUB;
    public static RegistryObject<Feature> TREE_SHRUB;
    public static RegistryObject<Feature> GIANT_LILY;
    //DECORATION
    public static RegistryObject<Feature> ICICLE_UP;
    public static RegistryObject<Feature> AIR_MULTIFACE_GROWTH;
    public static RegistryObject<Feature> FALLEN_BLOB_TREE;
    public static RegistryObject<Feature> FALLEN_SNOW_TREE;
    public static RegistryObject<Feature> SMOULDERING_DIRT;
    public static RegistryObject<Feature> MEADOW_ROCK;
    public static RegistryObject<Feature> ROCK;
    public static RegistryObject<Feature> SPIRE;


    //public static RegistryObject<Feature> ICE_SPIRES;
    //public static RegistryObject<Feature> WATER_CATTAIL;
    //public static RegistryObject<Feature> SMALL_BUSH;
    //NETHER
    //public static RegistryObject<Feature> NETHER_MEADOW_ROCK;
    //public static RegistryObject<Feature> GLISTERING_IVY;
    //public static RegistryObject<Feature> HANGING_EARLIGHT;
    //public static RegistryObject<Feature> OBSIDIAN_SPIRE;
    //CAVES
    //public static RegistryObject<Feature> HANGING_PRISMARITE;
    //public static RegistryObject<Feature> BASALT_BLOB;
    //public static RegistryObject<Feature> LAVA_FALL;
    //public static RegistryObject<Feature> OVERWORLD_LAVA_DELTA;
    //public static RegistryObject<Feature> POINTED_REDSTONE;
    //public static RegistryObject<Feature> LARGE_POINTED_REDSTONE;
    //public static RegistryObject<Feature> POINTED_REDSTONE_CLUSTER;
    //OTHER
    //public static RegistryObject<Feature> ASH_VENT;
    //public static RegistryObject<Feature> MEADOW_ROCKS;

    public static void addFeatures() {
        //BIOSHROOMS
        GIANT_BLUE_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_blue_bioshroom", () -> new GiantBlueBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        GIANT_GREEN_BIOSHROOM = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_green_bioshroom", () -> new GiantGreenBioshroomFeature(GiantBioshroomConfiguration.CODEC));
        //TREES
        ASHEN_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("ashen_tree", () -> new AshenTreeFeature(RuTreeConfiguration.CODEC));
        ASPEN_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("aspen_tree", () -> new AspenTreeFeature(RuTreeConfiguration.CODEC));
        BLACKWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("blackwood_tree", () -> new BlackwoodTreeFeature(RuTreeConfiguration.CODEC));
        CYPRESS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("cypress_tree", () -> new CypressTreeFeature(RuTreeConfiguration.CODEC));
        EUCALYPTUS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("eucalyptus_tree", () -> new EucalyptusTreeFeature(RuTreeConfiguration.CODEC));
        GIANT_CYPRESS_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_cypress_tree", () -> new GiantCypressTreeFeature(RuTreeConfiguration.CODEC));
        LARCH_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("larch_tree", () -> new LarchTreeFeature(RuTreeConfiguration.CODEC));
        LARGE_JOSHUA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("large_joshua_tree", () -> new LargeJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        MAPLE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("maple_tree", () -> new MapleTreeFeature(RuTreeConfiguration.CODEC));
        MEDIUM_JOSHUA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("medium_joshua_tree", () -> new MediumJoshuaTreeFeature(NoneFeatureConfiguration.CODEC));
        PALM_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("palm_tree", () -> new PalmTreeFeature(RuTreeConfiguration.CODEC));
        PINE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("pine_tree", () -> new PineTreeFeature(RuTreeConfiguration.CODEC));
        STRIPPED_PINE_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("stripped_pine_tree", () -> new StrippedPineTreeFeature(RuTreeConfiguration.CODEC));
        REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("redwood_tree", () -> new RedwoodTreeFeature(RuTreeConfiguration.CODEC));
        SAGUARO_CACTUS = RegionsUnexploredMod.FEATURE_REGISTRY.register("saguaro_cactus", () -> new SaguaroCactusFeature(RuTreeConfiguration.CODEC));
        SAKURA_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("sakura_tree", () -> new SakuraTreeFeature(RuTreeConfiguration.CODEC));
        SUPER_REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("super_redwood_tree", () -> new SuperRedwoodTreeFeature(RuTreeConfiguration.CODEC));
        ULTRA_REDWOOD_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("ultra_redwood_tree", () -> new UltraRedwoodTreeFeature(RuTreeConfiguration.CODEC));
        //CAVE
        POINTED_REDSTONE = RegionsUnexploredMod.FEATURE_REGISTRY.register("pointed_redstone", () -> new PointedRedstoneFeature(PointedRedstoneConfiguration.CODEC));
        LARGE_POINTED_REDSTONE = RegionsUnexploredMod.FEATURE_REGISTRY.register("large_pointed_redstone", () -> new LargePointedRedstoneFeature(LargePointedRedstoneConfiguration.CODEC));
        POINTED_REDSTONE_CLUSTER = RegionsUnexploredMod.FEATURE_REGISTRY.register("pointed_redstone_cluster", () -> new PointedRedstoneClusterFeature(PointedRedstoneClusterConfiguration.CODEC));
        HANGING_PRISMARITE = RegionsUnexploredMod.FEATURE_REGISTRY.register("hanging_prismarite", () -> new HangingPrismariteFeature(NoneFeatureConfiguration.CODEC));
        DROPLEAF = RegionsUnexploredMod.FEATURE_REGISTRY.register("dropleaf", () -> new DropleafFeature(NoneFeatureConfiguration.CODEC));
        BASALT_BLOB = RegionsUnexploredMod.FEATURE_REGISTRY.register("basalt_blob", () -> new BasaltBlobFeature(ColumnFeatureConfiguration.CODEC));
        ASH_VENT = RegionsUnexploredMod.FEATURE_REGISTRY.register("scorch_vent", () -> new AshVentFeature(NoneFeatureConfiguration.CODEC));
        LAVA_FALL = RegionsUnexploredMod.FEATURE_REGISTRY.register("lava_fall", () -> new LavaFallFeature(NoneFeatureConfiguration.CODEC));
        OVERWORLD_LAVA_DELTA = RegionsUnexploredMod.FEATURE_REGISTRY.register("overworld_lava_delta", () -> new LavaDeltaFeature(VegetationPatchConfiguration.CODEC));
        //NETHER
        BRIM_WILLOW = RegionsUnexploredMod.FEATURE_REGISTRY.register("brim_willow", () -> new BrimWillowFeature(NoneFeatureConfiguration.CODEC));
        TALL_BRIM_WILLOW = RegionsUnexploredMod.FEATURE_REGISTRY.register("tall_brim_willow", () -> new TallBrimWillowFeature(NoneFeatureConfiguration.CODEC));
        //VEGETATION
        SHRUB = RegionsUnexploredMod.FEATURE_REGISTRY.register("shrub", () -> new ShrubFeature(ShrubConfiguration.CODEC));
        TREE_SHRUB = RegionsUnexploredMod.FEATURE_REGISTRY.register("tree_shrub", () -> new TreeShrubFeature(RuTreeConfiguration.CODEC));
        GIANT_LILY = RegionsUnexploredMod.FEATURE_REGISTRY.register("giant_lily", () -> new GiantLilyPadFeature(NoneFeatureConfiguration.CODEC));
        //DECORATION
        ICICLE_UP = RegionsUnexploredMod.FEATURE_REGISTRY.register("icicle_up", () -> new FloorIcicleFeature(NoneFeatureConfiguration.CODEC));
        AIR_MULTIFACE_GROWTH = RegionsUnexploredMod.FEATURE_REGISTRY.register("air_multiface_growth", () -> new AirMultifaceGrowthFeature(MultifaceGrowthConfiguration.CODEC));
        FALLEN_BLOB_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("fallen_blob_tree", () -> new FallenBlobTreeFeature(FallenTreeConfiguration.CODEC));
        FALLEN_SNOW_TREE = RegionsUnexploredMod.FEATURE_REGISTRY.register("fallen_snow_tree", () -> new FallenSnowTreeFeature(FallenTreeConfiguration.CODEC));
        SMOULDERING_DIRT = RegionsUnexploredMod.FEATURE_REGISTRY.register("smouldering_dirt", () -> new SmoulderingDirtFeature(NoneFeatureConfiguration.CODEC));
        MEADOW_ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("meadow_rock", () -> new MeadowRockFeature(NoneFeatureConfiguration.CODEC));
        ROCK = RegionsUnexploredMod.FEATURE_REGISTRY.register("rock", () -> new RockFeature(NoneFeatureConfiguration.CODEC));
        SPIRE = RegionsUnexploredMod.FEATURE_REGISTRY.register("spire", () -> new IceSpireFeature(RuTreeConfiguration.CODEC));
    }
}

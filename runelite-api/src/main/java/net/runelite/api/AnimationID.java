/*
 * Copyright (c) 2016-2017, Abel Briggs
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

/**
 * Utility class used for mapping animation IDs.
 * <p>
 * Note: This class is not complete and may not contain a specific animation
 * required.
 */
public final class AnimationID
{
	public static final int IDLE = -1;
	public static final int HERBLORE_PESTLE_AND_MORTAR = 364;
	public static final int WOODCUTTING_BRONZE = 879;
	public static final int WOODCUTTING_IRON = 877;
	public static final int WOODCUTTING_STEEL = 875;
	public static final int WOODCUTTING_BLACK = 873;
	public static final int WOODCUTTING_MITHRIL = 871;
	public static final int WOODCUTTING_ADAMANT = 869;
	public static final int WOODCUTTING_RUNE = 867;
	public static final int WOODCUTTING_GILDED = 8303;
	public static final int WOODCUTTING_DRAGON = 2846;
	public static final int WOODCUTTING_INFERNAL = 2117;
	public static final int WOODCUTTING_3A_AXE = 7264;
	public static final int WOODCUTTING_CRYSTAL = 8324;
	public static final int WOODCUTTING_TRAILBLAZER = 8778;
	public static final int CONSUMING = 829; // consuming consumables
	public static final int FIREMAKING = 733;
	public static final int DEATH = 836;
	public static final int COOKING_FIRE = 897;
	public static final int COOKING_RANGE = 896;
	public static final int COOKING_WINE = 7529;
	public static final int FLETCHING_BOW_CUTTING = 1248;
	public static final int HUNTER_LAY_BOXTRAP_BIRDSNARE = 5208; //same for laying bird snares and box traps
	public static final int HUNTER_LAY_DEADFALLTRAP = 5212; //setting up deadfall trap
	public static final int HUNTER_LAY_NETTRAP = 5215; //setting up net trap
	public static final int HUNTER_LAY_MANIACAL_MONKEY_BOULDER_TRAP = 7259; // setting up maniacal monkey boulder trap
	public static final int HUNTER_CHECK_BIRD_SNARE = 5207;
	public static final int HUNTER_CHECK_BOX_TRAP = 5212;
	public static final int HERBLORE_MAKE_TAR = 5249;
	public static final int FLETCHING_STRING_NORMAL_SHORTBOW = 6678;
	public static final int FLETCHING_STRING_NORMAL_LONGBOW = 6684;
	public static final int FLETCHING_STRING_OAK_SHORTBOW = 6679;
	public static final int FLETCHING_STRING_OAK_LONGBOW = 6685;
	public static final int FLETCHING_STRING_WILLOW_SHORTBOW = 6680;
	public static final int FLETCHING_STRING_WILLOW_LONGBOW = 6686;
	public static final int FLETCHING_STRING_MAPLE_SHORTBOW = 6681;
	public static final int FLETCHING_STRING_MAPLE_LONGBOW = 6687;
	public static final int FLETCHING_STRING_YEW_SHORTBOW = 6682;
	public static final int FLETCHING_STRING_YEW_LONGBOW = 6688;
	public static final int FLETCHING_STRING_MAGIC_SHORTBOW = 6683;
	public static final int FLETCHING_STRING_MAGIC_LONGBOW = 6689;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_BRONZE_BOLT = 8472;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_IRON_BROAD_BOLT = 8473;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_BLURITE_BOLT = 8474;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_STEEL_BOLT = 8475;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_MITHRIL_BOLT = 8476;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_ADAMANT_BOLT = 8477;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_RUNE_BOLT = 8478;
	public static final int FLETCHING_ATTACH_BOLT_TIPS_TO_DRAGON_BOLT = 8479;
	public static final int FLETCHING_ATTACH_HEADS = 8480;
	public static final int FLETCHING_ATTACH_FEATHERS_TO_ARROWSHAFT = 8481;
	public static final int GEM_CUTTING_OPAL = 890;
	public static final int GEM_CUTTING_JADE = 891;
	public static final int GEM_CUTTING_REDTOPAZ = 892;
	public static final int GEM_CUTTING_SAPPHIRE = 888;
	public static final int GEM_CUTTING_EMERALD = 889;
	public static final int GEM_CUTTING_RUBY = 887;
	public static final int GEM_CUTTING_DIAMOND = 886;
	public static final int GEM_CUTTING_AMETHYST = 6295;
	public static final int CRAFTING_LEATHER = 1249;
	public static final int CRAFTING_GLASSBLOWING = 884;
	public static final int CRAFTING_SPINNING = 894;
	public static final int CRAFTING_POTTERS_WHEEL = 883;
	public static final int CRAFTING_POTTERY_OVEN = 24975;
	public static final int SMITHING_SMELTING = 899;
	public static final int SMITHING_CANNONBALL = 827; //cball smithing uses this and SMITHING_SMELTING
	public static final int SMITHING_ANVIL = 898;
	public static final int FISHING_BIG_NET = 620;
	public static final int FISHING_NET = 621;
	public static final int FISHING_POLE_CAST = 623; // pole is in the water
	public static final int FISHING_CAGE = 619;
	public static final int FISHING_HARPOON = 618;
	public static final int FISHING_BARBTAIL_HARPOON = 5108;
	public static final int FISHING_DRAGON_HARPOON = 7401;
	public static final int FISHING_INFERNAL_HARPOON = 7402;
	public static final int FISHING_CRYSTAL_HARPOON = 8336;
	public static final int FISHING_TRAILBLAZER_HARPOON = 8784;
	public static final int FISHING_TRAILBLAZER_HARPOON_2 = 8785;
	public static final int FISHING_OILY_ROD = 622;
	public static final int FISHING_KARAMBWAN = 1193;
	public static final int FISHING_CRUSHING_INFERNAL_EELS = 7553;
	public static final int FISHING_CUTTING_SACRED_EELS = 7151;
	public static final int FISHING_BAREHAND = 6709;
	public static final int FISHING_BAREHAND_WINDUP_1 = 6703;
	public static final int FISHING_BAREHAND_WINDUP_2 = 6704;
	public static final int FISHING_BAREHAND_CAUGHT_SHARK_1 = 6705;
	public static final int FISHING_BAREHAND_CAUGHT_SHARK_2 = 6706;
	public static final int FISHING_BAREHAND_CAUGHT_SWORDFISH_1 = 6707;
	public static final int FISHING_BAREHAND_CAUGHT_SWORDFISH_2 = 6708;
	public static final int FISHING_BAREHAND_CAUGHT_TUNA_1 = 6710;
	public static final int FISHING_BAREHAND_CAUGHT_TUNA_2 = 6711;
	public static final int FISHING_PEARL_ROD = 8188;
	public static final int FISHING_PEARL_FLY_ROD = 8189;
	public static final int FISHING_PEARL_BARBARIAN_ROD = 8190;
	public static final int FISHING_PEARL_ROD_2 = 8191;
	public static final int FISHING_PEARL_FLY_ROD_2 = 8192;
	public static final int FISHING_PEARL_BARBARIAN_ROD_2 = 8193;
	public static final int FISHING_PEARL_OILY_ROD = 6932;
	public static final int MINING_BRONZE_PICKAXE = 625;
	public static final int MINING_IRON_PICKAXE = 626;
	public static final int MINING_STEEL_PICKAXE = 627;
	public static final int MINING_BLACK_PICKAXE = 3873;
	public static final int MINING_MITHRIL_PICKAXE = 629;
	public static final int MINING_ADAMANT_PICKAXE = 628;
	public static final int MINING_RUNE_PICKAXE = 624;
	public static final int MINING_GILDED_PICKAXE = 8313;
	public static final int MINING_DRAGON_PICKAXE = 7139;
	public static final int MINING_DRAGON_PICKAXE_UPGRADED = 642;
	public static final int MINING_DRAGON_PICKAXE_OR = 8346;
	public static final int MINING_INFERNAL_PICKAXE = 4482;
	public static final int MINING_3A_PICKAXE = 7283;
	public static final int MINING_CRYSTAL_PICKAXE = 8347;
	public static final int MINING_TRAILBLAZER_PICKAXE = 8787;
	public static final int MINING_TRAILBLAZER_PICKAXE_2 = 8788;
	public static final int MINING_TRAILBLAZER_PICKAXE_3 = 8789;
	public static final int MINING_MOTHERLODE_BRONZE = 6753;
	public static final int MINING_MOTHERLODE_IRON = 6754;
	public static final int MINING_MOTHERLODE_STEEL = 6755;
	public static final int MINING_MOTHERLODE_BLACK = 3866;
	public static final int MINING_MOTHERLODE_MITHRIL = 6757;
	public static final int MINING_MOTHERLODE_ADAMANT = 6756;
	public static final int MINING_MOTHERLODE_RUNE = 6752;
	public static final int MINING_MOTHERLODE_GILDED = 8312;
	public static final int MINING_MOTHERLODE_DRAGON = 6758;
	public static final int MINING_MOTHERLODE_DRAGON_UPGRADED = 335;
	public static final int MINING_MOTHERLODE_DRAGON_OR = 8344;
	public static final int MINING_MOTHERLODE_INFERNAL = 4481;
	public static final int MINING_MOTHERLODE_3A = 7282;
	public static final int MINING_MOTHERLODE_CRYSTAL = 8345;
	public static final int MINING_MOTHERLODE_TRAILBLAZER = 8786;
	public static final int DENSE_ESSENCE_CHIPPING = 7201;
	public static final int DENSE_ESSENCE_CHISELING = 7202;
	public static final int HERBLORE_POTIONMAKING = 363; //used for both herb and secondary
	public static final int MAGIC_CHARGING_ORBS = 726;
	public static final int MAGIC_MAKE_TABLET = 4068;
	public static final int TABLET_TELEPORT = 4069;
	public static final int MAGIC_ENCHANTING_JEWELRY = 931;
	public static final int MAGIC_ENCHANTING_AMULET_1 = 719; // sapphire, opal, diamond
	public static final int MAGIC_ENCHANTING_AMULET_2 = 720; // emerald, jade, dragonstone
	public static final int MAGIC_ENCHANTING_AMULET_3 = 721; // ruby, topaz, onyx, zenyte
	public static final int MAGIC_ENCHANTING_BOLTS = 4462;
	public static final int BURYING_BONES = 827;
	public static final int USING_GILDED_ALTAR = 3705;
	public static final int LOOKING_INTO = 832;
	public static final int DIG = 830;
	public static final int DEMONIC_GORILLA_MAGIC_ATTACK = 7225;
	public static final int DEMONIC_GORILLA_MELEE_ATTACK = 7226;
	public static final int DEMONIC_GORILLA_RANGED_ATTACK = 7227;
	public static final int DEMONIC_GORILLA_AOE_ATTACK = 7228;
	public static final int DEMONIC_GORILLA_PRAYER_SWITCH = 7228;
	public static final int DEMONIC_GORILLA_DEFEND = 7224;
	public static final int BOOK_HOME_TELEPORT_1 = 4847;
	public static final int BOOK_HOME_TELEPORT_2 = 4850;
	public static final int BOOK_HOME_TELEPORT_3 = 4853;
	public static final int BOOK_HOME_TELEPORT_4 = 4855;
	public static final int BOOK_HOME_TELEPORT_5 = 4857;
	public static final int COW_HOME_TELEPORT_1 = 1696;
	public static final int COW_HOME_TELEPORT_2 = 1697;
	public static final int COW_HOME_TELEPORT_3 = 1698;
	public static final int COW_HOME_TELEPORT_4 = 1699;
	public static final int COW_HOME_TELEPORT_5 = 1700;
	public static final int COW_HOME_TELEPORT_6 = 1701;
	public static final int LEAGUE_HOME_TELEPORT_1 = 8798;
	public static final int LEAGUE_HOME_TELEPORT_2 = 8799;
	public static final int LEAGUE_HOME_TELEPORT_3 = 8801;
	public static final int LEAGUE_HOME_TELEPORT_4 = 8803;
	public static final int LEAGUE_HOME_TELEPORT_5 = 8805;
	public static final int LEAGUE_HOME_TELEPORT_6 = 8807;

	public static final int CONSTRUCTION = 3676;
	public static final int SAND_COLLECTION = 895;
	public static final int PISCARILIUS_CRANE_REPAIR = 7199;
	public static final int HOME_MAKE_TABLET = 4067;
	public static final int PULL_LEVER = 2140;
	public static final int DRAGONFIRE_SHIELD_SPECIAL = 6696;
	public static final int STANDARD_PURPLE_TELEPORT = 714;
	public static final int ECTOPHIAL_TELEPORT = 878;
	public static final int FAIRY_RING_TELEPORT = 3265;
	public static final int SCROLL_TELEPORT = 3864;
	public static final int XERICS_TALISMAN_TELEPORT = 3865;
	public static final int WILDERNESS_OBELISK_TELEPORT = 3945;
	public static final int SEED_POD_TELEPORT = 4544;
	public static final int BARRAGE_ANIMATION = 1979;
	public static final int CHIN_ANIMATION = 7618;

	// Farming
	public static final int FARMING_HARVEST_FRUIT_TREE = 2280;
	public static final int FARMING_HARVEST_BUSH = 2281;
	public static final int FARMING_HARVEST_HERB = 2282;
	public static final int FARMING_USE_COMPOST = 2283;
	public static final int FARMING_CURE_WITH_POTION = 2288;
	public static final int FARMING_PLANT_SEED = 2291;
	public static final int FARMING_HARVEST_FLOWER = 2292;
	public static final int FARMING_MIX_ULTRACOMPOST = 7699;
	public static final int FARMING_HARVEST_ALLOTMENT = 830;

	// Lunar spellbook
	public static final int ENERGY_TRANSFER_VENGEANCE_OTHER = 4411;
	public static final int MAGIC_LUNAR_SHARED = 4413; // Utilized by Fertile Soil, Boost/Stat Potion Share, NPC Contact, Bake Pie
	public static final int MAGIC_LUNAR_CURE_PLANT = 4432;
	public static final int MAGIC_LUNAR_GEOMANCY = 7118;
	public static final int MAGIC_LUNAR_PLANK_MAKE = 6298;
	public static final int MAGIC_LUNAR_STRING_JEWELRY = 4412;

	// Arceuus spellbook
	public static final int MAGIC_ARCEUUS_RESURRECT_CROPS = 7118;

	// Battlestaff Crafting
	public static final int CRAFTING_BATTLESTAVES = 7531;

	// Death Animations
	public static final int CAVE_KRAKEN_DEATH = 3993;
	public static final int WIZARD_DEATH = 2553;
	public static final int GARGOYLE_DEATH = 1520;
	public static final int MARBLE_GARGOYLE_DEATH = 7813;
	public static final int LIZARD_DEATH = 2778;
	public static final int ROCKSLUG_DEATH = 1568;
	public static final int ZYGOMITE_DEATH = 3327;
	public static final int IMP_DEATH = 172;

	// POH Animations
	public static final int INCENSE_BURNER = 3687;
	public static final int LOW_LEVEL_MAGIC_ATTACK = 1162;
	public static final int HIGH_LEVEL_MAGIC_ATTACK = 1167;
	public static final int BLOWPIPE_ATTACK = 5061;

	// NPC animations
	public static final int HELLHOUND_DEFENCE = 6566;
	public static final int BLACKJACK_KO = 838;

	// Fight Caves
	public static final int TZTOK_JAD_RANGE_ATTACK = 2652;
	public static final int TZTOK_JAD_MELEE_ATTACK = 2655;
	public static final int TZTOK_JAD_MAGIC_ATTACK = 2656;
	public static final int TOK_XIL_RANGE_ATTACK = 2633;
	public static final int TOK_XIL_MELEE_ATTACK = 2628;
	public static final int KET_ZEK_MELEE_ATTACK = 2644;
	public static final int KET_ZEK_MAGE_ATTACK = 2647;
	public static final int MEJ_KOT_MELEE_ATTACK = 2637;
	public static final int MEJ_KOT_HEAL_ATTACK = 2639;

	// Dagannoth Kings
	public static final int DAGANNOTH_REX_ATTACK = 2853;
	public static final int DAGANNOTH_PRIME_ATTACK = 2854;
	public static final int DAGANNOTH_SUPREME_ATTACK = 2855;

	// General Graardor
	public static final int MINION_AUTO1 = 6154;
	public static final int MINION_AUTO2 = 6156;
	public static final int MINION_AUTO3 = 7071;
	public static final int MINION_AUTO4 = 7073;
	public static final int GENERAL_AUTO1 = 7018;
	public static final int GENERAL_AUTO2 = 7020;
	public static final int GENERAL_AUTO3 = 7021;

	// Kr'il Tsutsaroth
	public static final int KRIL_GENERIC_ATTACK = 64;
	public static final int KRIL_ATTACK = 6948;
	public static final int KRIL_SPECIAL_ATTACK = 6950;
	public static final int ZAKL_ATTACK = 7077;
	public static final int BALFRUG_ATTACK = 4630;

	// Commander Zilyana
	public static final int ZILYANA_MELEE_ATTACK = 6964;
	public static final int ZILYANA_ATTACK = 6967;
	public static final int ZILYANA_SPECIAL_ATTACK = 6970;
	public static final int STARLIGHT_ATTACK = 6376;
	public static final int BREE_ATTACK = 7026;
	public static final int GROWLER_ATTACK = 7037;

	// Kree'arra
	public static final int KREE_RANGED_ATTACK = 6978;
	public static final int SKREE_ATTACK = 6955;
	public static final int GEERIN_ATTACK = 6956;
	public static final int GEERIN_FLINCH = 6958;
	public static final int KILISA_ATTACK = 6957;

	// Vetion
	public static final int VETION_EARTHQUAKE = 5507;

	// Zulrah
	public static final int ZULRAH_DEATH = 5804;
	public static final int ZULRAH_PHASE = 5072;

	// Cerberus
	public static final int CERBERUS_MAGIC_ATTACK = 4489;
	public static final int CERBERUS_RANGED_ATTACK = 4490;
	public static final int CERBERUS_MELEE_ATTACK = 4491;
	public static final int CERBERUS_LAVA_ATTACK = 4493;
	public static final int CERBERUS_SUMMON_GHOSTS = 4494;

	// Lizardman Shamans
	public static final int LIZARDMAN_SHAMAN_SPAWN = 7157;

	// Chambers of Xeric - Tekton
	public static final int TEKTON_ANVIL = 7475;
	public static final int TEKTON_AUTO1 = 7482;
	public static final int TEKTON_AUTO2 = 7483;
	public static final int TEKTON_AUTO3 = 7484;
	public static final int TEKTON_FAST_AUTO1 = 7478;
	public static final int TEKTON_FAST_AUTO2 = 7488;
	public static final int TEKTON_ENRAGE_AUTO1 = 7492;
	public static final int TEKTON_ENRAGE_AUTO2 = 7493;
	public static final int TEKTON_ENRAGE_AUTO3 = 7494;

	// The Inferno
	public static final int JAL_NIB = 7574;
	public static final int JAL_MEJRAH = 7578;
	public static final int JAL_MEJRAH_STAND = 7577;
	public static final int JAL_AK_RANGE_ATTACK = 7581;
	public static final int JAL_AK_MELEE_ATTACK = 7582;
	public static final int JAL_AK_MAGIC_ATTACK = 7583;
	public static final int JAL_IMKOT = 7597;
	public static final int JAL_XIL_MELEE_ATTACK = 7604;
	public static final int JAL_XIL_RANGE_ATTACK = 7605;
	public static final int JAL_ZEK_MAGE_ATTACK = 7610;
	public static final int JAL_ZEK_MELEE_ATTACK = 7612;
	public static final int JALTOK_JAD_MELEE_ATTACK = 7590;
	public static final int JALTOK_JAD_MAGE_ATTACK = 7592;
	public static final int JALTOK_JAD_RANGE_ATTACK = 7593;
	public static final int TZKAL_ZUK = 7566;
	public static final int JAL_MEJJAK = 2858;

	// Vorkath
	public static final int VORKATH_DEATH = 7949;
	public static final int VORKATH_WAKE_UP = 7950;
	public static final int VORKATH_SLASH_ATTACK = 7951;
	public static final int VORKATH_ATTACK = 7952;
	public static final int VORKATH_ACID_ATTACK = 7957;
	public static final int VORKATH_FIRE_BOMB_OR_SPAWN_ATTACK = 7960;

	// Theatre of Blood - Sugadinti Maiden
	public static final int SUGADINTI_MAIDEN_BLOOD_SPLAT_ATTACK = 8091;
	public static final int SUGADINTI_MAIDEN_MAGIC_ATTACK = 8092;
	public static final int SUGADINTI_MAIDEN_DEATH = 8094;

	// Theatre of Blood - Pestilent Bloat
	public static final int BLOAT_SLEEP = 8082;

	// Theatre of Blood - Sotetseg
	public static final int SOTETSEG_MELEE_ATTACK = 8138;
	public static final int SOTETSEG_REGULAR_PROJECTILE_ATTACK = 8139;

	// Theatre of Blood - Verzik Vitur
	public static final int VERZIK_PHASE_1_MAGIC_ATTACK = 8109;
	public static final int VERZIK_PHASE_1_MAGIC_ATTACK_CHANNEL = 8110;
	public static final int VERZIK_CHANGE_TO_PHASE_2 = 8111;
	public static final int VERZIK_PHASE_2_MAGIC_ATTACK = 8114;
	public static final int VERZIK_PHASE_2_BELLY_FLOP_ATTACK_1 = 8116;
	public static final int VERZIK_PHASE_2_HEALING_CHANNEL = 8117;
	public static final int VERZIK_PHASE_2_BELLY_FLOP_ATTACK_2 = 8118;
	public static final int VERZIK_CHANGE_TO_PHASE_3 = 8119;
	public static final int VERZIK_PHASE_3_MELEE_ATTACK = 8123;
	public static final int VERZIK_PHASE_3_MAGIC_ATTACK = 8124;
	public static final int VERZIK_PHASE_3_RANGED_ATTACK = 8125;
	public static final int VERZIK_PHASE_3_GREEN_POOL_ATTACK = 8126;
	public static final int VERZIK_PHASE_3_WEB_ATTACK = 8127;
	public static final int VERZIK_DEATH_1 = 8128;
	public static final int VERZIK_DEATH_2 = 8129;

	// Alchemical Hydra
	public static final int ALCHEMICAL_HYDRA_GREEN_PHASE_WALKING = 8232;
	public static final int ALCHEMICAL_HYDRA_GREEN_PHASE_IDLE = 8233;
	public static final int ALCHEMICAL_HYDRA_GREEN_PHASE_POISON_ATTACK = 8234;
	public static final int ALCHEMICAL_HYDRA_GREEN_PHASE_RANGED_ATTACK = 8235;
	public static final int ALCHEMICAL_HYDRA_GREEN_PHASE_MAGIC_ATTACK = 8236;
	public static final int ALCHEMICAL_HYDRA_SWITCH_TO_BLUE_PHASE = 8237;
	public static final int ALCHEMICAL_HYDRA_BLUE_PHASE_LIGHTNING_ATTACK = 8241;
	public static final int ALCHEMICAL_HYDRA_BLUE_PHASE_RANGED_ATTACK = 8242;
	public static final int ALCHEMICAL_HYDRA_BLUE_PHASE_MAGIC_ATTACK = 8243;
	public static final int ALCHEMICAL_HYDRA_SWITCH_TO_RED_PHASE = 8244;
	public static final int ALCHEMICAL_HYDRA_RED_PHASE_FIRE_ATTACK = 8248;
	public static final int ALCHEMICAL_HYDRA_RED_PHASE_RANGED_ATTACK = 8249;
	public static final int ALCHEMICAL_HYDRA_RED_PHASE_MAGIC_ATTACK = 8250;
	public static final int ALCHEMICAL_HYDRA_SWITCH_TO_JAD_PHASE = 8251;
	public static final int ALCHEMICAL_HYDRA_JAD_PHASE_MAGIC_ATTACK = 8255;
	public static final int ALCHEMICAL_HYDRA_JAD_PHASE_RANGED_OR_POISON_ATTACK = 8256;
	public static final int ALCHEMICAL_HYDRA_JAD_DEATH = 8257;
	public static final int ALCHEMICAL_HYDRA_JAD_DEATH_2 = 8258;

	// The Gauntlet - Crystalline/Corrupted Hunllef
	public static final int HUNLLEF_SUMMON_CRYSTAL_NPC = 8418;
	public static final int HUNLLEF_PROJECTILE_ATTACK = 8419;
	public static final int HUNLLEF_TRAMPLE_ATTACK = 8420;
	public static final int HUNLLEF_SWITCH_TO_MAGIC = 8754;
	public static final int HUNLLEF_SWITCH_TO_RANGED = 8755;

	// Zalcano
	public static final int ZALCANO_KNOCKED_DOWN = 8437;
	public static final int ZALCANO_WAKE_UP = 8439;
	public static final int ZALCANO_ROCK_GLOWING = 8448;

	// The Nightmare of Ashihama
	public static final int NIGHTMARE_SPAWN_SLEEPWALKERS = 8572;
	public static final int NIGHTMARE_FLOATY = 8592;
	public static final int NIGHTMARE_WALKING = 8592;
	public static final int NIGHTMARE_IDLE = 8593;
	public static final int NIGHTMARE_MELEE_ATTACK = 8594;
	public static final int NIGHTMARE_MAGIC_ATTACK = 8595;
	public static final int NIGHTMARE_RANGED_ATTACK = 8596;
	public static final int NIGHTMARE_SURGE_ATTACK = 8597;
	public static final int NIGHTMARE_GHOST_AOE_ATTACK = 8598;
	public static final int NIGHTMARE_CURSE_PRAYERS_ATTACK = 8599;
	public static final int NIGHTMARE_SPAWN_INFECTIOUS_SPORES = 8600;
	public static final int NIGHTMARE_SPAWN_ROOM_SECTION_FLOWERS = 8601;
	public static final int NIGHTMARE_CHANNEL_DEVASTATING_ATTACK = 8604;
	public static final int NIGHTMARE_SWITCH_TO_DEVIL_PHASE = 8605;
	public static final int NIGHTMARE_PARASITE_ATTACK = 8606;
	public static final int NIGHTMARE_JUMP_DOWN = 8607;
	public static final int NIGHTMARE_SINK_DOWN = 8608;
	public static final int NIGHTMARE_JUMP_UP = 8609;
	public static final int NIGHTMARE_JUMP_UP_2 = 8610;
	public static final int NIGHTMARE_WAKE_UP = 8611;
	public static final int NIGHTMARE_DEATH = 8612;
}
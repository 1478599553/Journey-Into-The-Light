package net.journey.init.items;

import net.journey.entity.projectile.*;
import net.journey.entity.projectile.arrow.EntityEssenceArrow;
import net.journey.entity.projectile.knife.*;
import net.journey.entity.projectile.launcher.EntityEyeBlaster;
import net.journey.entity.projectile.launcher.EntityNetherPlasma;
import net.journey.entity.projectile.launcher.EntityRock;
import net.journey.entity.projectile.piercer.*;
import net.journey.entity.projectile.staff.*;
import net.journey.entity.projectile.throwable.EntityDemonicBomb;
import net.journey.entity.projectile.throwable.EntityFireBomb;
import net.journey.entity.projectile.throwable.EntityMagicBomb;
import net.journey.entity.projectile.throwable.EntityMagicPot;
import net.journey.enums.EnumSwordType;
import net.journey.init.JourneyTabs;
import net.journey.items.bows.ItemModBow;
import net.journey.items.interactive.ItemTeleport;
import net.journey.items.ranged.*;
import net.journey.items.swords.ItemBattleAxe;
import net.journey.items.swords.ItemBubbleSword;
import net.journey.items.swords.ItemLoggersSword;
import net.journey.util.JourneyToolMaterial;
import net.minecraft.item.Item;
import net.slayer.api.item.ItemModSword;

public class JourneyWeapons {

    public static Item demonicBomb;
    public static Item fireBomb;
    public static Item boilingPiercer;
    public static Item nethicPiercer;
    public static Item frozenPiercer;
    public static Item eucaPiercer;
    public static Item depthsPiercer;
    public static Item corbaPiercer;
    public static Item frostbittenPiercer;
    public static Item frostyPiercer;
    public static Item sunsetPiercer;
    public static Item skyPiercer;
    public static Item MAGIC_POT_OF_DESTRUCTION;
    public static Item MAGIC_BOMB;
    public static Item ESSENCE_SHURIKEN;

    public static Item moltenKnife;
    public static Item aquaticKnife;
    public static Item bloodKnife;
    public static Item charredKnife;
    public static Item sizzlingKnife;

    public static Item flameBow;
    public static Item poisonBow;
    public static Item darknessBow;
    public static Item frozenBow;
    public static Item staringBow;
    public static Item deathPiercerBow;
    public static Item fusionBow;
    public static Item springBow;
    public static Item starlightBow;
    public static Item wastefulBow;
    public static Item flamingBow;
    public static Item blazingBow;
    public static Item darkEnforcer;
    public static Item depthsBow;
    public static Item frostbittenBow;
    public static Item frostyBow;
    public static Item charredBow;
    public static Item fluffyBow;
    public static Item golemBow;
    public static Item loggersBow;
    public static Item overgrownBow;
    public static Item overseerBow;
    public static Item woodlandBow;
    public static Item rocsWing;
    public static Item scaleBow;
    public static Item mantleBow;
    public static Item coreExpender;
    public static Item royalBow;
    public static Item darkTerraBow;
    public static Item lavenderBow;
    public static Item terralightBow;
    public static Item terrianBow;

    public static Item fireWand;
    public static Item iceWand;
    public static Item lightningWand;

    public static Item creativeHammer;
    public static Item earthenHammer;
    public static Item flamingHammer;
    public static Item nethicHammer;
    public static Item withicHammer;
    public static Item royalHammer;
    public static Item overgrownHammer;
    public static Item rockyHammer;
    public static Item crystallizedHammer;

    public static Item rockyBattleaxe;
    public static Item crystalizedBattleaxe;
    public static Item backBiter;
    public static Item dawnBreaker;
    public static Item tempestBattleaxe;
    public static Item bronzedBattleaxe;
    public static Item celestiteBattleaxe;
    public static Item storumBattleaxe;
    public static Item celekiumBattleaxe;
    public static Item thunderbirdBattleaxe;

    public static ItemStaff staffOfCrystal;
    public static ItemStaff staffOfDivineStone;
    public static ItemStaff staffOfHellstone;
    public static ItemStaff doomsBringer;
    public static ItemStaff conjuringStaff;
    public static ItemStaff staffOfEnlightenment;
    public static ItemStaff staffOfGreenpace;
    public static ItemStaff wizardsStar;
    public static Item teleportationStaff;
    public static ItemStaff overgrownStaff;

    public static Item chaosCannon;
    public static Item rockLauncher;
    public static Item netherPlasma;
    public static Item oceanPlasma;
    public static Item forestPlasma;
    public static Item eyeBlaster;

    public static Item hellstoneSword;
    public static Item shadiumSword;
    public static Item celestiumSword;
    public static Item luniumSword;
    public static Item flairiumSword;
    public static Item desSword;
    public static Item sapphireSword;
    public static Item gorbiteSword;
    public static Item orbaditeSword;
    public static Item poisonSword;
    public static Item cloudSlicer;
    public static Item dragonsTooth;
    public static Item netherBeastSword;
    public static Item witheringBeastSword;
    public static Item calciaSword;
    public static Item championsSword;
    public static Item theWraith;
    public static Item bubbleSword;
    public static Item boilingBlade;
    public static Item loggersSword;
    public static Item naturesBlade;
    public static Item depthsDarksword;
    public static Item depthsSlayer;
    public static Item snowShoveler;
    public static Item frostySword;
    public static Item frostbittenSword;
    public static Item treeHugger;
    public static Item coreMender;
    public static Item royalBlade;
    public static Item royalStabber;
    public static Item rocSword;
    public static Item swordOfTheThunderbird;
    public static Item bloodwieldSword;
    public static Item charredBlade;
    public static Item sizzlerSword;
    public static Item fluffyBlade;
    public static Item golemSword;
    public static Item thunderblade;
    public static Item sentrySword;
    public static Item crystalBlade;
    public static Item starlightBlade;
    public static Item koriteSword;
    public static Item storonSword;
    public static Item mekyumSword;
    public static Item pedalSword;
    public static Item withicBlade;
    public static Item reinforcedCrystalSword;
    public static Item reinforcedStoneSword;
    public static Item terralightBlade;
    public static Item terranaSword;
    public static Item terrolicaSword;
    public static Item voliteSword;
    public static Item kingsSword;
    public static Item demonicSword;
    public static Item vinestrandBlade;
    public static Item darkPineSword;
    public static Item healersBlade;
    public static Item terronicBlade;
    public static Item developerSword;

    public static void init() {


        poisonSword = new ItemModSword("poisonSword", "Poison Sword", EnumSwordType.POISON, JourneyToolMaterial.POISON_SWORD);
        cloudSlicer = new ItemModSword("cloudSlicer", "Cloud Slicer", JourneyToolMaterial.CLOUD_SLICER);
        dragonsTooth = new ItemModSword("dragonsTooth", "Dragons Tooth", JourneyToolMaterial.DRAGONS_TOOTH);
        netherBeastSword = new ItemModSword("netherBeastSword", "Netherbeast Sword", EnumSwordType.REGEN, JourneyToolMaterial.NETHER_BEAST_SWORD);
        witheringBeastSword = new ItemModSword("witheringBeastSword", "Witheringbeast Sword", EnumSwordType.WITHER, JourneyToolMaterial.WITHERING_BEAST_SWORD);
        calciaSword = new ItemModSword("calciaSword", "Calcia Sword", JourneyToolMaterial.CALCIA_SWORD);
        championsSword = new ItemModSword("championsSword", "Champions Sword", JourneyToolMaterial.CHAMPIONS_SWORD);
        theWraith = new ItemModSword("theWraith", "The Wraith", JourneyToolMaterial.THE_WRAITH);
        bubbleSword = new ItemBubbleSword("bubbleSword", "Bubble Sword", JourneyToolMaterial.BUBBLE_SWORD);
        boilingBlade = new ItemModSword("boilingBlade", "Boiling Blade", EnumSwordType.FIRE, JourneyToolMaterial.BOILING_BLADE);
        loggersSword = new ItemLoggersSword("loggersSword", "Loggers Sword", JourneyToolMaterial.LOGGERS_SWORD);
        naturesBlade = new ItemModSword("naturesBlade", "Natures Blade", EnumSwordType.STUN_WITHER, JourneyToolMaterial.NATURES_BLADE);
        depthsDarksword = new ItemModSword("depthsDarksword", "Depths Darksword", EnumSwordType.STUN_WITHER, JourneyToolMaterial.DEPTHS_DARKSWORD);
        depthsSlayer = new ItemModSword("depthsSlayer", "Depths Slayer", EnumSwordType.STUN, JourneyToolMaterial.DEPTHS_SLAYER);
        snowShoveler = new ItemModSword("snowShoveler", "Snow Shoveler", EnumSwordType.STUN_WITHER,JourneyToolMaterial.SNOW_SHOVELER);
        frostySword = new ItemModSword("frostySword", "Frosty Sword", EnumSwordType.STUN, JourneyToolMaterial.FROSTY_SWORD);
        frostbittenSword = new ItemModSword("frostbittenSword", "Frostbitten Sword", EnumSwordType.STUN, JourneyToolMaterial.FROSTBITTEN_SWORD);
        treeHugger = new ItemModSword("treeHugger", "Tree Hugger", EnumSwordType.POISON, JourneyToolMaterial.TREE_HUGGER);
        coreMender = new ItemModSword("coreMender", "Core Mender", EnumSwordType.FIRE, JourneyToolMaterial.CORE_MENDER);
        royalBlade = new ItemModSword("royalBlade", "Royal Blade", EnumSwordType.POISON, JourneyToolMaterial.ROYAL_BLADE);
        royalStabber = new ItemModSword("royalStabber", "Royal Stabber", EnumSwordType.POISON, JourneyToolMaterial.ROYAL_STABBER);
        rocSword = new ItemModSword("rocSword", "Roc Sword", JourneyToolMaterial.ROC_SWORD);
        swordOfTheThunderbird = new ItemModSword("swordOfTheThunderbird", "Sword of the Thunderbird", JourneyToolMaterial.SWORD_THUNDERBIRD);
        bloodwieldSword = new ItemModSword("bloodWieldSword", "Blood Wielder", EnumSwordType.HEALTH, JourneyToolMaterial.BLOODWIELD_SWORD, 1);
        charredBlade = new ItemModSword("charredBlade", "Charred Blade", EnumSwordType.WITHER, JourneyToolMaterial.CHARRED_BLADE);
        sizzlerSword = new ItemModSword("sizzlerSword", "Sizzler Sword", EnumSwordType.FIRE_WITHER, JourneyToolMaterial.SIZZLER_SWORD);
        fluffyBlade = new ItemModSword("fluffyBlade", "Fluffy Blade", EnumSwordType.NIGHTVISION_HEALTH, JourneyToolMaterial.FLUFFY_BLADE);
        golemSword = new ItemModSword("golemSword", "Golem Sword", JourneyToolMaterial.GOLEM_SWORD);
        thunderblade = new ItemModSword("thunderblade", "Thunder Blade", EnumSwordType.POISON_HEALTH, JourneyToolMaterial.THUNDERBLADE, 1.5F);
        sentrySword = new ItemModSword("sentrySword", "Sentry Sword", EnumSwordType.FIRE_HEALTH, JourneyToolMaterial.SENTRY_SWORD, 2);
        crystalBlade = new ItemModSword("crystalBlade", "Crystal Blade", JourneyToolMaterial.CRYSTAL_BLADE);
        starlightBlade = new ItemModSword("starlightBlade", "Starlight Blade", JourneyToolMaterial.STARLIGHT_BLADE);
        koriteSword = new ItemModSword("koriteSword", "Korite Sword", JourneyToolMaterial.KORITE_SWORD);
        storonSword = new ItemModSword("storonSword", "Storon Sword", JourneyToolMaterial.STORON_SWORD);
        mekyumSword = new ItemModSword("mekyumSword", "Mekyum Sword", JourneyToolMaterial.MEKYUM_SWORD);
        hellstoneSword = new ItemModSword("hellstoneSword", "Bloodcrust Sword", EnumSwordType.FIRE, JourneyToolMaterial.HELLSTONE_SWORD);
        shadiumSword = new ItemModSword("shadiumSword", "Shadium Sword", EnumSwordType.FREEZE, JourneyToolMaterial.SHADIUM_SWORD);
        celestiumSword = new ItemModSword("celestiumSword", "Celestium Sword", JourneyToolMaterial.CELESTIUM_SWORD);
        luniumSword = new ItemModSword("luniumSword", "Lunium Sword", JourneyToolMaterial.LUNIUM_SWORD);
        flairiumSword = new ItemModSword("flairiumSword", "Flairium Sword", EnumSwordType.FIRE, JourneyToolMaterial.FLAIRIUM_SWORD);
        desSword = new ItemModSword("desSword", "Des Sword", JourneyToolMaterial.DES_SWORD);
        sapphireSword = new ItemModSword("sapphireSword", "Sapphire Sword", JourneyToolMaterial.SAPPHIRE_SWORD);
        gorbiteSword = new ItemModSword("gorbiteSword", "Gorbite Sword", JourneyToolMaterial.GORBITE_SWORD);
        orbaditeSword = new ItemModSword("orbaditeSword", "Orbadite Sword", JourneyToolMaterial.ORBADITE_SWORD);

        pedalSword = new ItemModSword("pedalSword", "Pedal Sword", JourneyToolMaterial.PEDAL_SWORD);
        withicBlade = new ItemModSword("withicBlade", "Withic Blade", JourneyToolMaterial.WITHIC_BLADE);
        reinforcedCrystalSword = new ItemModSword("reinforcedCrystalSword", "Reinforced Crystal Sword", JourneyToolMaterial.RE_CRYSTAL_SWORD);
        reinforcedStoneSword = new ItemModSword("reinforcedStoneSword", "Reinforced Stone Sword", JourneyToolMaterial.RE_STONE_SWORD);
        terralightBlade = new ItemModSword("terralightBlade", "Terralight Blade", JourneyToolMaterial.TERRALIGHT_BLADE);
        terranaSword = new ItemModSword("terranaSword", "Terrana Sword", JourneyToolMaterial.TERRANA_SWORD);
        terrolicaSword = new ItemModSword("terrolicaSword", "Terrolica Sword", EnumSwordType.NIGHTVISION, JourneyToolMaterial.TERROLICA_SWORD);
        voliteSword = new ItemModSword("voliteSword", "Volite Sword", JourneyToolMaterial.VOLITE_SWORD);
        kingsSword = new ItemModSword("kingsSword", "Kings Sword", EnumSwordType.FIRE_HEALTH, JourneyToolMaterial.KINGS_SWORD, 1);
        demonicSword = new ItemModSword("demonicSword", "Wither Sword", EnumSwordType.WITHER, JourneyToolMaterial.DEMONIC_SWORD);
        vinestrandBlade = new ItemModSword("vinestrandBlade", "Vinestrand Blade", EnumSwordType.POISON, JourneyToolMaterial.VINESTRAND_BLADE);
        darkPineSword = new ItemModSword("darkPineSword", "Dark Pine Sword", EnumSwordType.WITHER, JourneyToolMaterial.DARK_PINE_SWORD);
        healersBlade = new ItemModSword("healersBlade", "Healers Blade", EnumSwordType.HEALTH, JourneyToolMaterial.HEALERS_BLADE, 1);
        terronicBlade = new ItemModSword("terronicBlade", "Terronic Blade", EnumSwordType.HEALTH, JourneyToolMaterial.TERRONIC_BLADE, 2);
        developerSword = new ItemModSword("developerSword", "Creative Sword", JourneyToolMaterial.DEVELOPER_SWORD).setCreativeTab(JourneyTabs.UTIL);

        rockyBattleaxe = new ItemBattleAxe("rockyBattleaxe", "Rocky Battleaxe", JourneyToolMaterial.ROCKY_BATTLEAXE);
        crystalizedBattleaxe = new ItemBattleAxe("crystalizedBattleaxe", "Crystalized Battleaxe", JourneyToolMaterial.CRYSTAL_BATTLEAXE);
        backBiter = new ItemBattleAxe("backBiter", "Back Biter", JourneyToolMaterial.BACK_BITER);
        dawnBreaker = new ItemBattleAxe("dawnBreaker", "Dawn Breaker", JourneyToolMaterial.DAWN_BREAKER);
        tempestBattleaxe = new ItemBattleAxe("tempestBattleaxe", "Tempest Battleaxe", JourneyToolMaterial.TEMPEST_BATTLEAXE);
        bronzedBattleaxe = new ItemBattleAxe("bronzedBattleaxe", "Bronzed Battleaxe", JourneyToolMaterial.BRONZED_BATTLEAXE);
        celestiteBattleaxe = new ItemBattleAxe("celestiteBattleaxe", "Celestite Battleaxe", JourneyToolMaterial.CELESTITE_BATTLEAXE);
        storumBattleaxe = new ItemBattleAxe("storumBattleaxe", "Storum Battleaxe", JourneyToolMaterial.STORUM_BATTLEAXE);
        celekiumBattleaxe = new ItemBattleAxe("celekiumBattleaxe", "Celekium Battleaxe", JourneyToolMaterial.CELEKIUM_BATTLEAXE);
        thunderbirdBattleaxe = new ItemBattleAxe("thunderbirdBattleaxe", "Thunderbird Battleaxe", JourneyToolMaterial.THUNDERBIRD_BATTLEAXE);

        staffOfCrystal = new ItemStaff("staffOfCrystal", "Staff of Crystal", 3, 1000, 10, false, EntityIceBall.class);
        staffOfDivineStone = new ItemStaff("staffOfDivineStone", "Staff of Divine Stone", 3, 1000, 9, false, EntityRock.class);
        staffOfHellstone = new ItemStaff("staffOfHellstone", "Staff of Hellstone", 3, 1000, 7, false, EntityHellstone.class);
        doomsBringer = new ItemStaff("doomsBringer", "Dooms Bringer", 3, 1000, 12, false, EntityDoomsBringer.class);
        conjuringStaff = new ItemStaff("conjuringStaff", "Conjuring Staff", 3, 1000, 18, false, EntityConjuring.class);
        staffOfEnlightenment = new ItemStaff("staffOfEnlightenment", "Staff Of Enlightenment", 3, 1000, 14, false, EntityEnlightenment.class);
        staffOfGreenpace = new ItemStaff("staffOfGreenpace", "Staff Of Greenpace", 3, 1000, 10, false, EntityGreenpace.class);
        wizardsStar = new ItemStaff("wizardsStar", "Wizards Star", 3, 1000, 5, false, EntityWizardsStar.class);
        teleportationStaff = new ItemTeleport("teleportationStaff", "Teleportation Staff");
        overgrownStaff = new ItemStaff("overgrownStaff", "Overgrown Staff", 3, 1000, 5, false, EntityOvergrown.class);
        fireWand = new ItemWand("fireWand", "Fire Wand", true, 5, 600, 5, false, EntityFireBall.class);
        iceWand = new ItemWand("iceWand", "Ice Wand", true, 5, 600, 5, false, EntityIceBall.class);
        lightningWand = new ItemWand("lightningWand", "Lightning Wand", true, 10, 600, 5, false, EntityLightningBall.class);

        //Overworld
        flameBow = new ItemModBow("flameBow", "Flame Bow", 2, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 72000);
        poisonBow = new ItemModBow("poisonBow", "Poison Bow", 2, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 72000);
        darknessBow = new ItemModBow("darknessBow", "Darkness Bow", 2, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 72000);
        frozenBow = new ItemModBow("frozenBow", "Frozen Bow", 2, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 72000);
        
        //Frozen
        frostbittenBow = new ItemModBow("frostbittenBow", "Frostbitten Bow", 2.5F, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 64000);
        frostyBow = new ItemModBow("frostyBow", "Frosty Bow", 2.5F, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 64000);
        
        //Nether
        staringBow = new ItemModBow("staringBow", "Staring Bow", 2.5F, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 56000);
        
        //Boil
        charredBow = new ItemModBow("charredBow", "Charred Bow", 2.75F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 64000);
        flamingBow = new ItemModBow("flamingBow", "Flaming Bow", 2.75F, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 64000);
        blazingBow = new ItemModBow("blazingBow", "Blazing Bow", 2.75F, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 56000);
        
        //Euca
        mantleBow = new ItemModBow("mantleBow", "Mantle Bow", 3.5F, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 48000);
        coreExpender = new ItemModBow("coreExpender", "Core Expender", 3.5F, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 48000);
        royalBow = new ItemModBow("royalBow", "Royal Bow", 3.0F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 64000);
        
        //Depths
        darkEnforcer = new ItemModBow("darkEnforcer", "Dark Enforcer", 4.0F, 384, EntityEssenceArrow.BowEffects.ESSENCE_BOW, 64000);
        depthsBow = new ItemModBow("depthsBow", "Depths Bow", 4.0F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 64000);
        rocsWing = new ItemModBow("rocsWing", "Roc's Wing", 4.0F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 54000);
        scaleBow = new ItemModBow("scaleBow", "Scale Bow", 4.0F, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 54000);
        
        //Corba
        loggersBow = new ItemModBow("loggersBow", "Logger's Bow", 4.5F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 48000);
        overgrownBow = new ItemModBow("overgrownBow", "Overgrown Bow", 4.5F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 54000);
        overseerBow = new ItemModBow("overseerBow", "Overseer Bow", 4.5F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 38000);
        woodlandBow = new ItemModBow("woodlandBow", "Woodland Bow", 4.5F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 54000);
        
        //Terrania
        darkTerraBow = new ItemModBow("darkTerraBow", "Dark Terra Bow", 5.0F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 48000);
        lavenderBow = new ItemModBow("lavenderBow", "Lavender Bow", 5.0F, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 36000);
        terralightBow = new ItemModBow("terralightBow", "Terralight Bow", 5.0F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 32000);
        terrianBow = new ItemModBow("terrianBow", "Terrian Bow", 5.0F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 40000);
        
        //Cloudia
        starlightBow = new ItemModBow("starlightBow", "Starlight Bow", 5.5F, 384, EntityEssenceArrow.BowEffects.POISON_BOW, 24000);
        fluffyBow = new ItemModBow("fluffyBow", "Fluffy Bow", 5.5F, 384, EntityEssenceArrow.BowEffects.FROZEN_BOW, 18000);
        golemBow = new ItemModBow("golemBow", "Golem Bow", 5.5F, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 36000);

        //Unobtainable
        deathPiercerBow = new ItemModBow("deathPiercerBow", "Death Piercer", 3, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 72000);
        fusionBow = new ItemModBow("fusionBow", "Fusion Bow", 3, 384, EntityEssenceArrow.BowEffects.DARKNESS_BOW, 72000);
        springBow = new ItemModBow("springBow", "Spring Bow", 5, 384, EntityEssenceArrow.BowEffects.FLAME_BOW, 72000);
        wastefulBow = new ItemModBow("wastefulBow", "Wasteful Bow", 3, 384, EntityEssenceArrow.BowEffects.DOUBLE_ARROW, 72000);

        creativeHammer = new ItemCreativeHammer("creative_hammer", "Hammer of Creative Spellbinding", JourneyToolMaterial.CREATIVE, false, EntityLightningBall.class);
        earthenHammer = new ItemHammer("earthen_hammer", "Earthen Hammer", JourneyToolMaterial.EARTHEN_HAMMER, false, EntityEarthen.class, 4, 4, 642);
        flamingHammer = new ItemHammer("flaming_hammer", "Flaming Hammer", JourneyToolMaterial.FLAMING_HAMMER, false, EntityFireBall.class, 10, 4, 1230);
        nethicHammer = new ItemHammer("nethic_hammer", "Nethic Hammer", JourneyToolMaterial.NETHIC_HAMMER, false, EntityFireBall.class, 8, 4, 825);
        withicHammer = new ItemHammer("withic_hammer", "Withic Hammer", JourneyToolMaterial.WITHIC_HAMMER, false, EntityWithic.class, 9, 4, 1230);
        royalHammer = new ItemHammer("royal_hammer", "Royal Hammer", JourneyToolMaterial.ROYAL_HAMMER, false, EntityFireBall.class, 12, 4, 1320);
        overgrownHammer = new ItemHammer("overgrown_hammer", "Overgrown Hammer", JourneyToolMaterial.OVERGROWN_HAMMER, false, EntityOvergrown.class, 12, 4, 1320);
        rockyHammer = new ItemHammer("rocky_hammer", "Rocky Hammer", JourneyToolMaterial.ROCKY_HAMMER, false, EntityRock.class, 6, 4, 2230);
        crystallizedHammer = new ItemHammer("crystallized_hammer", "Crystallized Hammer", JourneyToolMaterial.CRYSTALLIZED_HAMMER, false, EntityIceBall.class, 7, 4, 3320);

        chaosCannon = new ItemGun("chaosCannon", "Chaos Cannon", 6, "Shoots a bouncing projectile", null);
        rockLauncher = new ItemGun("rockLauncher", "Rock Launcher", 4, "Stuns mobs for 10 seconds", EntityRock.class);
        netherPlasma = new ItemGun("netherPlasma", "Nether Plasma", 10, "Burns mobs for 10 seconds", EntityNetherPlasma.class);
        oceanPlasma = new ItemGun("oceanPlasma", "Ocean Plasma", 4, "Harms mobs", EntityFloroDirtProjectile.class);
        forestPlasma = new ItemGun("forestPlasma", "Forest Plasma", 4, "Poisons Mobs for 10 seconds", EntityOvergrown.class);
        eyeBlaster = new ItemGun("eyeBlaster", "Eye Blaster", 12, "Harms and burns mobs for 10 seconds", EntityEyeBlaster.class);

        demonicBomb = new ItemThrowable("demonicBomb", "Demonic Bomb", 4F, EntityDemonicBomb.class);
        fireBomb = new ItemThrowable("fireBomb", "Fire Bomb", 6F, EntityFireBomb.class);

        boilingPiercer = new ItemPiercer("boilingPiercer", "Boiling Piercer", 15F, 4, EntityBoilingPiercer.class);
        nethicPiercer = new ItemPiercer("nethicPiercer", "Nethic Piercer", 11F, 3, EntityNethicPiercer.class);
        frozenPiercer = new ItemPiercer("frozenPiercer", "Frozen Piercer", 9F, 2, EntityFrozenPiercer.class);
        eucaPiercer = new ItemPiercer("eucaPiercer", "Euca Piercer", 14F, 4, EntityEucaPiercer.class);
        depthsPiercer = new ItemPiercer("depthsPiercer", "Depths Piercer", 18F, 5, EntityDepthsPiercer.class);
        corbaPiercer = new ItemPiercer("corbaPiercer", "Corba Piercer", 20F, 6, EntityCorbaPiercer.class);
        frostbittenPiercer = new ItemPiercer("frostbittenPiercer", "Frostbitten Piercer", 12F, 2, EntityFrostbittenPiercer.class);
        frostyPiercer = new ItemPiercer("frostyPiercer", "Frosty Piercer", 10F, 2, EntityFrostyPiercer.class);
        sunsetPiercer = new ItemPiercer("sunsetPiercer", "Sunset Piercer", 7F, 1, EntitySunsetPiercer.class);
        skyPiercer = new ItemPiercer("skyPiercer", "Sky Piercer", 29F, 6, EntitySkyPiercer.class);
        ESSENCE_SHURIKEN = new ItemEssenceShuriken("essence_shuriken", "Essence Shuriken");
        MAGIC_POT_OF_DESTRUCTION = new ItemMagicPot("magic_pot_of_destruction", "Magic Pot of Destruction", 4F, 4, EntityMagicPot.class);

        MAGIC_BOMB = new ItemThrowableArrow("magic_bomb", "Magic Bomb", 1D, EntityMagicBomb.class, "Sticks to surfaces, explodes upon collision");        
        moltenKnife = new ItemThrowableArrow("moltenKnife", "Molten Knife", 3D, EntityMoltenKnife.class, "Englufs enemies in flames for 5 seconds");
        aquaticKnife = new ItemThrowableArrow("aquaticKnife", "Aquatic Knife", 2D, EntityAquaticKnife.class, "Slows enemies for 5 seconds");
        bloodKnife = new ItemThrowableArrow("bloodKnife", "Blood Knife", 3D, EntityBloodKnife.class, "Stuns enemies for 10 seconds");
        charredKnife = new ItemThrowableArrow("charredKnife", "Charred Knife", 2D, EntityCharredKnife.class, "Poisons and englufs enemies in flames for 5 seconds");
        sizzlingKnife = new ItemThrowableArrow("sizzlingKnife", "Sizzling Knife", 4D, EntitySizzlingKnife.class, "Stuns and englufs enemies in flames for 10 seconds");

    }
}
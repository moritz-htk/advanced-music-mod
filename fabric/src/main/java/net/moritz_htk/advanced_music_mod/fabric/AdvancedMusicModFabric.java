package net.moritz_htk.advanced_music_mod.fabric;

import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.fabricmc.api.ModInitializer;
import net.moritz_htk.advanced_music_mod.fabric.loot.AMMLootTableModifiers;

public class AdvancedMusicModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdvancedMusicMod.init();
        AMMLootTableModifiers.modifyLootTables();
    }
}
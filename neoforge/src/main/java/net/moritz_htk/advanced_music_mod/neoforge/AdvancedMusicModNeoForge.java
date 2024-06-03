package net.moritz_htk.advanced_music_mod.neoforge;

import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.neoforge.loot.AMMLootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(AdvancedMusicMod.MOD_ID)
public class AdvancedMusicModNeoForge {
    public AdvancedMusicModNeoForge(IEventBus modEventBus) {
        AdvancedMusicMod.init();
        AMMLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
    }
}
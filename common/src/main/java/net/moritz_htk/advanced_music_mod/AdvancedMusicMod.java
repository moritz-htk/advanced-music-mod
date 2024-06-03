package net.moritz_htk.advanced_music_mod;

import net.moritz_htk.advanced_music_mod.registry.AMMCreativeTabs;
import net.moritz_htk.advanced_music_mod.registry.AMMItems;
import net.moritz_htk.advanced_music_mod.registry.AMMSoundEvents;

public class AdvancedMusicMod {
    public static final String MOD_ID = "advanced_music_mod";

    public static void init() {
        AMMCreativeTabs.TABS.register();
        AMMItems.ITEMS.register();
        AMMSoundEvents.SOUND_EVENTS.register();
    }
}
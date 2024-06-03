package net.moritz_htk.advanced_music_mod.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;

public class AMMCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(AdvancedMusicMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> ADVANCED_MUSIC_MOD_MAIN = TABS.register(AdvancedMusicMod.MOD_ID + "_main", () -> CreativeTabRegistry.create(Component.literal("Advanced Music Mod"), () -> new ItemStack(AMMItems.MUSIC_DISC_AUGUST.get())));
}
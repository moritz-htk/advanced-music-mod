package net.moritz_htk.advanced_music_mod.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.registry.AMMJukeboxSongs;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AMMJukeboxGenProvider extends DatapackBuiltinEntriesProvider {
    public AMMJukeboxGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AdvancedMusicMod.MOD_ID));
    }

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().add(Registries.JUKEBOX_SONG, AMMJukeboxSongs::bootstrap);
}
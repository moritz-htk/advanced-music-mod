package net.moritz_htk.advanced_music_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.datagen.provider.AMMGlobalLootModifierProvider;
import net.moritz_htk.advanced_music_mod.datagen.provider.AMMItemModelProvider;
import net.moritz_htk.advanced_music_mod.datagen.provider.AMMJukeboxGenProvider;
import net.moritz_htk.advanced_music_mod.datagen.provider.AMMSoundProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AdvancedMusicMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class AMMDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new AMMItemModelProvider(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new AMMSoundProvider(packOutput, fileHelper));

        generator.addProvider(event.includeServer(), new AMMGlobalLootModifierProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new AMMJukeboxGenProvider(packOutput, lookupProvider));
    }
}
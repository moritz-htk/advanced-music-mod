package net.moritz_htk.advanced_music_mod.datagen.provider;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.registry.AMMItems;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AMMItemTagsProvider extends TagsProvider<Item> {
    public AMMItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.ITEM, registries, AdvancedMusicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        for (RegistrySupplier<Item> item : AMMItems.ITEMS) {
            tag(ItemTags.MUSIC_DISCS).replace(false).add(item.getKey());
        }
    }
}
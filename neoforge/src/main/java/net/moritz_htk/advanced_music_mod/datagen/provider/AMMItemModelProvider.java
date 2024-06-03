package net.moritz_htk.advanced_music_mod.datagen.provider;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.registry.AMMItems;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class AMMItemModelProvider extends ItemModelProvider {
    public AMMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdvancedMusicMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistrySupplier<Item> item : AMMItems.ITEMS) {
            basicItem(item.get());
        }
    }
}
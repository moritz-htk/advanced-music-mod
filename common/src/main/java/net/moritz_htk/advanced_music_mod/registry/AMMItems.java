package net.moritz_htk.advanced_music_mod.registry;

import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;

public class AMMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(AdvancedMusicMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MUSIC_DISC_AUGUST = registerItem("music_disc_august", AMMSoundEvents.MUSIC_DISC_AUGUST, 191);
    public static final RegistrySupplier<Item> MUSIC_DISC_CATTAILS = registerItem("music_disc_cattails", AMMSoundEvents.MUSIC_DISC_CATTAILS, 156);
    public static final RegistrySupplier<Item> MUSIC_DISC_CHERRY_BLOSSOM = registerItem("music_disc_cherry_blossom", AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, 127);
    public static final RegistrySupplier<Item> MUSIC_DISC_DEATH_OF_KINGS = registerItem("music_disc_death_of_kings", AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, 143);
    public static final RegistrySupplier<Item> MUSIC_DISC_HEDWIG = registerItem("music_disc_hedwig", AMMSoundEvents.MUSIC_DISC_HEDWIG, 175);
    public static final RegistrySupplier<Item> MUSIC_DISC_JUST_IN_TIME = registerItem("music_disc_just_in_time", AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, 202);
    public static final RegistrySupplier<Item> MUSIC_DISC_LAPSE = registerItem("music_disc_lapse", AMMSoundEvents.MUSIC_DISC_LAPSE, 117);
    public static final RegistrySupplier<Item> MUSIC_DISC_MIDNIGHT_TALE = registerItem("music_disc_midnight_tale", AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, 153);
    public static final RegistrySupplier<Item> MUSIC_DISC_PAIN = registerItem("music_disc_pain", AMMSoundEvents.MUSIC_DISC_PAIN, 174);
    public static final RegistrySupplier<Item> MUSIC_DISC_QUIET = registerItem("music_disc_quiet", AMMSoundEvents.MUSIC_DISC_QUIET, 148);
    public static final RegistrySupplier<Item> MUSIC_DISC_SCREEN_SAVER = registerItem("music_disc_screen_saver", AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, 176);
    public static final RegistrySupplier<Item> MUSIC_DISC_SLEEP = registerItem("music_disc_sleep", AMMSoundEvents.MUSIC_DISC_SLEEP, 203);
    public static final RegistrySupplier<Item> MUSIC_DISC_TABUK = registerItem("music_disc_tabuk", AMMSoundEvents.MUSIC_DISC_TABUK, 156);
    public static final RegistrySupplier<Item> MUSIC_DISC_WITH_REGARDS = registerItem("music_disc_with_regards", AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, 175);

    private static RegistrySupplier<Item> registerItem(String name, RegistrySupplier<SoundEvent> event, int lengthInSeconds) {
        return ITEMS.register(name, () -> new ArchitecturyRecordItem(9, event, new Item.Properties().stacksTo(1).rarity(Rarity.RARE).arch$tab(AMMCreativeTabs.ADVANCED_MUSIC_MOD_MAIN), lengthInSeconds));
    }
}
package net.moritz_htk.advanced_music_mod.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.Rarity;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;

public class AMMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(AdvancedMusicMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MUSIC_DISC_AUGUST = registerItem("music_disc_august", AMMJukeboxSongs.MUSIC_DISC_AUGUST);
    public static final RegistrySupplier<Item> MUSIC_DISC_CATTAILS = registerItem("music_disc_cattails", AMMJukeboxSongs.MUSIC_DISC_CATTAILS);
    public static final RegistrySupplier<Item> MUSIC_DISC_CHERRY_BLOSSOM = registerItem("music_disc_cherry_blossom", AMMJukeboxSongs.MUSIC_DISC_CHERRY_BLOSSOM);
    public static final RegistrySupplier<Item> MUSIC_DISC_DEATH_OF_KINGS = registerItem("music_disc_death_of_kings", AMMJukeboxSongs.MUSIC_DISC_DEATH_OF_KINGS);
    public static final RegistrySupplier<Item> MUSIC_DISC_HEDWIG = registerItem("music_disc_hedwig", AMMJukeboxSongs.MUSIC_DISC_HEDWIG);
    public static final RegistrySupplier<Item> MUSIC_DISC_JUST_IN_TIME = registerItem("music_disc_just_in_time", AMMJukeboxSongs.MUSIC_DISC_JUST_IN_TIME);
    public static final RegistrySupplier<Item> MUSIC_DISC_LAPSE = registerItem("music_disc_lapse", AMMJukeboxSongs.MUSIC_DISC_LAPSE);
    public static final RegistrySupplier<Item> MUSIC_DISC_MIDNIGHT_TALE = registerItem("music_disc_midnight_tale", AMMJukeboxSongs.MUSIC_DISC_MIDNIGHT_TALE);
    public static final RegistrySupplier<Item> MUSIC_DISC_PAIN = registerItem("music_disc_pain", AMMJukeboxSongs.MUSIC_DISC_PAIN);
    public static final RegistrySupplier<Item> MUSIC_DISC_QUIET = registerItem("music_disc_quiet", AMMJukeboxSongs.MUSIC_DISC_QUIET);
    public static final RegistrySupplier<Item> MUSIC_DISC_SCREEN_SAVER = registerItem("music_disc_screen_saver", AMMJukeboxSongs.MUSIC_DISC_SCREEN_SAVER);
    public static final RegistrySupplier<Item> MUSIC_DISC_SLEEP = registerItem("music_disc_sleep", AMMJukeboxSongs.MUSIC_DISC_SLEEP);
    public static final RegistrySupplier<Item> MUSIC_DISC_TABUK = registerItem("music_disc_tabuk", AMMJukeboxSongs.MUSIC_DISC_TABUK);
    public static final RegistrySupplier<Item> MUSIC_DISC_WITH_REGARDS = registerItem("music_disc_with_regards", AMMJukeboxSongs.MUSIC_DISC_WITH_REGARDS);

    private static RegistrySupplier<Item> registerItem(String name, ResourceKey<JukeboxSong> jukeboxSong) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().jukeboxPlayable(jukeboxSong).stacksTo(1).rarity(Rarity.RARE).arch$tab(AMMCreativeTabs.ADVANCED_MUSIC_MOD_MAIN)));
    }
}
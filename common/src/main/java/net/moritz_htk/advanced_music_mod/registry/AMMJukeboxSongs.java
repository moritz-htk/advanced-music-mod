package net.moritz_htk.advanced_music_mod.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;

public class AMMJukeboxSongs {
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_AUGUST = registerKey("music_disc_august");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_CATTAILS = registerKey("music_disc_cattails");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_CHERRY_BLOSSOM = registerKey("music_disc_cherry_blossom");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_DEATH_OF_KINGS = registerKey("music_disc_death_of_kings");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_HEDWIG = registerKey("music_disc_hedwig");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_JUST_IN_TIME = registerKey("music_disc_just_in_time");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_LAPSE = registerKey("music_disc_lapse");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_MIDNIGHT_TALE = registerKey("music_disc_midnight_tale");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_PAIN = registerKey("music_disc_pain");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_QUIET = registerKey("music_disc_quiet");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_SCREEN_SAVER = registerKey("music_disc_screen_saver");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_SLEEP = registerKey("music_disc_sleep");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_TABUK = registerKey("music_disc_tabuk");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_WITH_REGARDS = registerKey("music_disc_with_regards");

    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        context.register(MUSIC_DISC_AUGUST, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_AUGUST, "Lucas King - August", 191));
        context.register(MUSIC_DISC_CATTAILS, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_CATTAILS, "Kevin MacLeod - Cattails", 156));
        context.register(MUSIC_DISC_CHERRY_BLOSSOM, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, "Kevin MacLeod - Cherry Blossom", 127));
        context.register(MUSIC_DISC_DEATH_OF_KINGS, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, "Kevin MacLeod - Death of Kings", 143));
        context.register(MUSIC_DISC_HEDWIG, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_HEDWIG, "Lucas King - Hedwig", 175));
        context.register(MUSIC_DISC_JUST_IN_TIME, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, "Lucas King - Just In Time", 202));
        context.register(MUSIC_DISC_LAPSE, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_LAPSE, "Lucas King - Lapse", 117));
        context.register(MUSIC_DISC_MIDNIGHT_TALE, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, "Kevin MacLeod - Midnight Tale", 153));
        context.register(MUSIC_DISC_PAIN, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_PAIN, "Lucas King - Pain", 174));
        context.register(MUSIC_DISC_QUIET, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_QUIET, "Lucas King - Quiet", 148));
        context.register(MUSIC_DISC_SCREEN_SAVER, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, "Kevin MacLeod - Screen Saver", 176));
        context.register(MUSIC_DISC_SLEEP, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_SLEEP, "Lucas King - Sleep", 203));
        context.register(MUSIC_DISC_TABUK, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_TABUK, "Kevin MacLeod - Tabuk", 156));
        context.register(MUSIC_DISC_WITH_REGARDS, registerJukeboxSong(AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, "Kevin MacLeod - With Regards", 175));
    }

    private static ResourceKey<JukeboxSong> registerKey(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AdvancedMusicMod.MOD_ID, name));
    }

    private static JukeboxSong registerJukeboxSong(Holder<SoundEvent> soundEvent, String description, float lengthInSeconds) {
        return new JukeboxSong(soundEvent, Component.literal(description), lengthInSeconds, 9);
    }
}
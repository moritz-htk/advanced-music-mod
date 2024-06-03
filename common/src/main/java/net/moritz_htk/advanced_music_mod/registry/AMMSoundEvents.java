package net.moritz_htk.advanced_music_mod.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;

public class AMMSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(AdvancedMusicMod.MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_AUGUST = registerSoundEvent("music_disc.august");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CATTAILS = registerSoundEvent("music_disc.cattails");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_CHERRY_BLOSSOM = registerSoundEvent("music_disc.cherry_blossom");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_DEATH_OF_KINGS = registerSoundEvent("music_disc.death_of_kings");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_HEDWIG = registerSoundEvent("music_disc.hedwig");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_JUST_IN_TIME = registerSoundEvent("music_disc.just_in_time");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_LAPSE = registerSoundEvent("music_disc.lapse");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_MIDNIGHT_TALE = registerSoundEvent("music_disc.midnight_tale");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_PAIN = registerSoundEvent("music_disc.pain");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_QUIET = registerSoundEvent("music_disc.quiet");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SCREEN_SAVER = registerSoundEvent("music_disc.screen_saver");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_SLEEP = registerSoundEvent("music_disc.sleep");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_TABUK = registerSoundEvent("music_disc.tabuk");
    public static final RegistrySupplier<SoundEvent> MUSIC_DISC_WITH_REGARDS = registerSoundEvent("music_disc.with_regards");
    
    private static RegistrySupplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(AdvancedMusicMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }
}
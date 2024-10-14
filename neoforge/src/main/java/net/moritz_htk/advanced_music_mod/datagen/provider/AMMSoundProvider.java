package net.moritz_htk.advanced_music_mod.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.registry.AMMSoundEvents;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

import java.util.function.Supplier;

public class AMMSoundProvider extends SoundDefinitionsProvider {
    public AMMSoundProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, AdvancedMusicMod.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        addSound(AMMSoundEvents.MUSIC_DISC_AUGUST, "records/august");
        addSound(AMMSoundEvents.MUSIC_DISC_CATTAILS, "records/cattails");
        addSound(AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, "records/cherry_blossom");
        addSound(AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, "records/death_of_kings");
        addSound(AMMSoundEvents.MUSIC_DISC_GUZHENG_CITY, "records/guzheng_city");
        addSound(AMMSoundEvents.MUSIC_DISC_HEDWIG, "records/hedwig");
        addSound(AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, "records/just_in_time");
        addSound(AMMSoundEvents.MUSIC_DISC_LAPSE, "records/lapse");
        addSound(AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, "records/midnight_tale");
        addSound(AMMSoundEvents.MUSIC_DISC_NIGHT_CAVE, "records/night_cave");
        addSound(AMMSoundEvents.MUSIC_DISC_PAIN, "records/pain");
        addSound(AMMSoundEvents.MUSIC_DISC_QUIET, "records/quiet");
        addSound(AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, "records/screen_saver");
        addSound(AMMSoundEvents.MUSIC_DISC_SLEEP, "records/sleep");
        addSound(AMMSoundEvents.MUSIC_DISC_TABUK, "records/tabuk");
        addSound(AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, "records/with_regards");
    }
    
    private void addSound(final Supplier<SoundEvent> soundEvent, String path) {
        add(soundEvent, definition().with(sound(new ResourceLocation(AdvancedMusicMod.MOD_ID, path)).stream(true)));
    }
}
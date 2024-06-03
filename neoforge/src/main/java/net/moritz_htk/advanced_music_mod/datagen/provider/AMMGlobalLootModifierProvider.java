package net.moritz_htk.advanced_music_mod.datagen.provider;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.moritz_htk.advanced_music_mod.AdvancedMusicMod;
import net.moritz_htk.advanced_music_mod.neoforge.loot.AMMAddItemModifier;
import net.moritz_htk.advanced_music_mod.registry.AMMItems;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AMMGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public AMMGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, AdvancedMusicMod.MOD_ID);
    }

    @Override
    protected void start() {
        addLoot("music_disc_august_igloo_chest", AMMItems.MUSIC_DISC_AUGUST.get(), BuiltInLootTables.IGLOO_CHEST);
        addLoot("music_disc_cattails_village_plains_house", AMMItems.MUSIC_DISC_CATTAILS.get(), BuiltInLootTables.VILLAGE_PLAINS_HOUSE);
        addLoot("music_disc_cattails_village_taiga_house", AMMItems.MUSIC_DISC_CATTAILS.get(), BuiltInLootTables.VILLAGE_TAIGA_HOUSE);
        addLoot("music_disc_cattails_village_snowy_house", AMMItems.MUSIC_DISC_CATTAILS.get(), BuiltInLootTables.VILLAGE_SNOWY_HOUSE);
        addLoot("music_disc_cattails_village_savanna_house", AMMItems.MUSIC_DISC_CATTAILS.get(), BuiltInLootTables.VILLAGE_SAVANNA_HOUSE);
        addLoot("music_disc_cattails_village_desert_house", AMMItems.MUSIC_DISC_CATTAILS.get(), BuiltInLootTables.VILLAGE_DESERT_HOUSE);
        addLoot("music_disc_cherry_blossom_woodland_mansion", AMMItems.MUSIC_DISC_CHERRY_BLOSSOM.get(), BuiltInLootTables.WOODLAND_MANSION);
        addLoot("music_disc_death_of_kings_stronghold_corridor", AMMItems.MUSIC_DISC_DEATH_OF_KINGS.get(), BuiltInLootTables.STRONGHOLD_CORRIDOR);
        addLoot("music_disc_hedwig_underwater_ruin_big", AMMItems.MUSIC_DISC_HEDWIG.get(), BuiltInLootTables.UNDERWATER_RUIN_BIG);
        addLoot("music_disc_just_in_time_shipwreck_treasure", AMMItems.MUSIC_DISC_JUST_IN_TIME.get(), BuiltInLootTables.SHIPWRECK_TREASURE);
        addLoot("music_disc_lapse_ruined_portal", AMMItems.MUSIC_DISC_LAPSE.get(), BuiltInLootTables.RUINED_PORTAL);
        addLoot("music_disc_midnight_tale_pillager_outpost", AMMItems.MUSIC_DISC_MIDNIGHT_TALE.get(), BuiltInLootTables.PILLAGER_OUTPOST);
        addLoot("music_disc_pain_ancient_city", AMMItems.MUSIC_DISC_PAIN.get(), BuiltInLootTables.ANCIENT_CITY);
        addLoot("music_disc_quiet_buried_treasure", AMMItems.MUSIC_DISC_QUIET.get(), BuiltInLootTables.BURIED_TREASURE);
        addLoot("music_disc_screen_save_jungle_temple", AMMItems.MUSIC_DISC_SCREEN_SAVER.get(), BuiltInLootTables.JUNGLE_TEMPLE);
        addLoot("music_disc_sleep_abandoned_mineshaft", AMMItems.MUSIC_DISC_SLEEP.get(), BuiltInLootTables.ABANDONED_MINESHAFT);
        addLoot("music_disc_tabuk_desert_pyramid", AMMItems.MUSIC_DISC_TABUK.get(), BuiltInLootTables.DESERT_PYRAMID);
        addLoot("music_disc_with_regards_simple_dungeon", AMMItems.MUSIC_DISC_WITH_REGARDS.get(), BuiltInLootTables.SIMPLE_DUNGEON);
    }

    private void addLoot(String id, Item item, ResourceKey<LootTable> lootTable) {
        add(id, new AMMAddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(0.65f).build(),
                new LootTableIdCondition.Builder(lootTable.location()).build()
        }, item, List.of(Holder.direct(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build()))));
    }
}
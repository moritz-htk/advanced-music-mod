package net.moritz_htk.advanced_music_mod.fabric.loot;

import net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.moritz_htk.advanced_music_mod.registry.AMMItems;

public class AMMLootTableModifiers {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            addLoot(key, BuiltInLootTables.IGLOO_CHEST, tableBuilder, AMMItems.MUSIC_DISC_AUGUST.get());
            addLoot(key, BuiltInLootTables.VILLAGE_PLAINS_HOUSE, tableBuilder, AMMItems.MUSIC_DISC_CATTAILS.get());
            addLoot(key, BuiltInLootTables.VILLAGE_TAIGA_HOUSE, tableBuilder, AMMItems.MUSIC_DISC_CATTAILS.get());
            addLoot(key, BuiltInLootTables.VILLAGE_SNOWY_HOUSE, tableBuilder, AMMItems.MUSIC_DISC_CATTAILS.get());
            addLoot(key, BuiltInLootTables.VILLAGE_SAVANNA_HOUSE, tableBuilder, AMMItems.MUSIC_DISC_CATTAILS.get());
            addLoot(key, BuiltInLootTables.VILLAGE_DESERT_HOUSE, tableBuilder, AMMItems.MUSIC_DISC_CATTAILS.get());
            addLoot(key, BuiltInLootTables.WOODLAND_MANSION, tableBuilder, AMMItems.MUSIC_DISC_CHERRY_BLOSSOM.get());
            addLoot(key, BuiltInLootTables.STRONGHOLD_CORRIDOR, tableBuilder, AMMItems.MUSIC_DISC_DEATH_OF_KINGS.get());
            addLoot(key, BuiltInLootTables.VILLAGE_TOOLSMITH, tableBuilder, AMMItems.MUSIC_DISC_GUZHENG_CITY.get());
            addLoot(key, BuiltInLootTables.UNDERWATER_RUIN_BIG, tableBuilder, AMMItems.MUSIC_DISC_HEDWIG.get());
            addLoot(key, BuiltInLootTables.SHIPWRECK_TREASURE, tableBuilder, AMMItems.MUSIC_DISC_JUST_IN_TIME.get());
            addLoot(key, BuiltInLootTables.RUINED_PORTAL, tableBuilder, AMMItems.MUSIC_DISC_LAPSE.get());
            addLoot(key, BuiltInLootTables.PILLAGER_OUTPOST, tableBuilder, AMMItems.MUSIC_DISC_MIDNIGHT_TALE.get());
            addLoot(key, BuiltInLootTables.STRONGHOLD_LIBRARY, tableBuilder, AMMItems.MUSIC_DISC_NIGHT_CAVE.get());
            addLoot(key, BuiltInLootTables.ANCIENT_CITY, tableBuilder, AMMItems.MUSIC_DISC_PAIN.get());
            addLoot(key, BuiltInLootTables.BURIED_TREASURE, tableBuilder, AMMItems.MUSIC_DISC_QUIET.get());
            addLoot(key, BuiltInLootTables.JUNGLE_TEMPLE, tableBuilder, AMMItems.MUSIC_DISC_SCREEN_SAVER.get());
            addLoot(key, BuiltInLootTables.ABANDONED_MINESHAFT, tableBuilder, AMMItems.MUSIC_DISC_SLEEP.get());
            addLoot(key, BuiltInLootTables.DESERT_PYRAMID, tableBuilder, AMMItems.MUSIC_DISC_TABUK.get());
            addLoot(key, BuiltInLootTables.SIMPLE_DUNGEON, tableBuilder, AMMItems.MUSIC_DISC_WITH_REGARDS.get());
        });
    }

    private static void addLoot(ResourceKey<LootTable> lootTable, ResourceKey<LootTable> id, FabricLootTableBuilder tableBuilder, Item item) {
        if (!lootTable.equals(id)) return;
        tableBuilder.pool(LootPool.lootPool().when(LootItemRandomChanceCondition.randomChance(0.65f)).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1))).build());
    }
}
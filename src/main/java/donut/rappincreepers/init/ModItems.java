package donut.rappincreepers.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static donut.rappincreepers.RappingCreepers.MODID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final ResourceKey<net.minecraft.world.item.JukeboxSong> CREEPER_RAP_SONG_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("rappingcreepers", "creeper_rap"));
    public static final ResourceKey<net.minecraft.world.item.JukeboxSong> CREEPER_RAP_INSTRUMENTAl_SONG_KEY = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("rappingcreepers", "creeper_rap_instrumental"));


    public static final DeferredItem<Item> MUSIC_DISC_CREEPER_RAP = ITEMS.register("music_disc_creeper_rap", () -> new Item(new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.RARE)
            .jukeboxPlayable(CREEPER_RAP_SONG_KEY)
    ));
    public static final DeferredItem<Item> MUSIC_DISC_CREEPER_RAP_INSTRUMENTAL = ITEMS.register("music_disc_creeper_rap_instrumental", () -> new Item(new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.RARE).
            jukeboxPlayable(CREEPER_RAP_INSTRUMENTAl_SONG_KEY)));

    public static final DeferredItem<Item> RAPPING_CREEPER_SPAWN_EGG = ITEMS.register("rapping_creeper_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RAPPING_CREEPER, 0x0DA70B, 0x1A1A1A, new Item.Properties()));

    public static final DeferredItem<Item> CREEPER_CLOCK = ITEMS.register("creeper_clock", ()-> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

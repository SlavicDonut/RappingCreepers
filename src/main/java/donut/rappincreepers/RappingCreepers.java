package donut.rappincreepers;

import donut.rappincreepers.init.ModBlocks;
import donut.rappincreepers.init.ModEntities;
import donut.rappincreepers.init.ModItems;
import donut.rappincreepers.init.ModSounds;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(RappingCreepers.MODID)
public class RappingCreepers {

    public static final String MODID = "rappingcreepers";
    public static final Logger LOGGER = LogUtils.getLogger();


    public RappingCreepers(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::registerAttributes);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.MUSIC_DISC_CREEPER_RAP);
            event.accept(ModItems.MUSIC_DISC_CREEPER_RAP_INSTRUMENTAL);
        }

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.RAPPING_CREEPER_SPAWN_EGG);
        }
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RAPPING_CREEPER.get(), net.minecraft.world.entity.monster.Creeper.createAttributes().build());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("IMA CREEPER, MINECRAFT GRIM REAPER");
    }
}

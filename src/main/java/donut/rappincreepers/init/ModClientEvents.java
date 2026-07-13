package donut.rappincreepers.init;

import donut.rappincreepers.RappingCreepers;
import donut.rappincreepers.client.model.RappingCreeperModel;
import donut.rappincreepers.entity.RappingCreeperRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = RappingCreepers.MODID, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void registerRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RAPPING_CREEPER.get(), RappingCreeperRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RappingCreeperModel.LAYER_LOCATION, RappingCreeperModel::createBodyLayer);
    }
}

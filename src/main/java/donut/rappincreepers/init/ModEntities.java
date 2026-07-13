package donut.rappincreepers.init;

import donut.rappincreepers.RappingCreepers;
import donut.rappincreepers.entity.RappingCreeperEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, RappingCreepers.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<RappingCreeperEntity>> RAPPING_CREEPER =
            ENTITY_TYPES.register("rapping_creeper",
                    () -> EntityType.Builder.of(RappingCreeperEntity::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.7F)
                            .build("rapping_creeper")

            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

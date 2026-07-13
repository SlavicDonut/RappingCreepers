package donut.rappincreepers.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "rappingcreepers");

    public static final DeferredHolder<SoundEvent, SoundEvent> CREEPER_RAP = SOUND_EVENTS.register("creeper_rap",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rappingcreepers", "creeper_rap")));

    public static final DeferredHolder<SoundEvent, SoundEvent> CREEPER_RAP_INSTRUMENTAL = SOUND_EVENTS.register("creeper_rap_instrumental",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rappingcreepers", "creeper_rap_instrumental")));

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

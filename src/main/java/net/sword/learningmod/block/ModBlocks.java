package net.sword.learningmod.block;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sword.learningmod.LearningMod;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LearningMod.MODID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

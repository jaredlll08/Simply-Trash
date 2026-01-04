package com.blamejared.simplytrash;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.world.meta.state.ItemContainerState;

import javax.annotation.Nonnull;

public class SimplyTrash extends JavaPlugin {

    public SimplyTrash(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        this.getBlockStateRegistry().registerBlockState(TrashCanBlockState.class, "BlameJared_SimplyTrash_TrashCan", TrashCanBlockState.CODEC, ItemContainerState.ItemContainerStateData.class, ItemContainerState.ItemContainerStateData.CODEC);
    }
}

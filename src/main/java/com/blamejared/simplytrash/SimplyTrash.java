package com.blamejared.simplytrash;

import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;

import javax.annotation.Nonnull;

public class SimplyTrash extends JavaPlugin {

    private ComponentType<ChunkStore, TrashCanBlock> trashCanBlockComponentType;

    public static SimplyTrash instance;

    public SimplyTrash(@Nonnull JavaPluginInit init) {
        super(init);
        SimplyTrash.instance = this;
    }

    @Override
    protected void setup() {
        super.setup();
        this.trashCanBlockComponentType = this.getChunkStoreRegistry().registerComponent(TrashCanBlock.class, "BlameJared_SimplyTrash_TrashCan", TrashCanBlock.CODEC);
        this.getChunkStoreRegistry().registerSystem(new TrashCanSystem(this.trashCanBlockComponentType));
    }

    public ComponentType<ChunkStore, TrashCanBlock> getTrashCanBlockComponentType() {
        return this.trashCanBlockComponentType;
    }

}

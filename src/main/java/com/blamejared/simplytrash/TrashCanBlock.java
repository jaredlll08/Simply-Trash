package com.blamejared.simplytrash;

import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;

import javax.annotation.Nullable;

public class TrashCanBlock implements Component<ChunkStore> {
    public static final BuilderCodec<TrashCanBlock> CODEC = BuilderCodec.builder(TrashCanBlock.class, TrashCanBlock::new).build();

    public static ComponentType<ChunkStore, TrashCanBlock> getComponentType() {
        return SimplyTrash.instance.getTrashCanBlockComponentType();
    }

    private TrashCanBlock() {
    }

    @Nullable
    public Component<ChunkStore> clone() {
        return new TrashCanBlock();
    }

}

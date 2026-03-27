package com.blamejared.simplytrash;

import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.component.system.tick.EntityTickingSystem;
import com.hypixel.hytale.server.core.modules.block.components.ItemContainerBlock;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class TrashCanSystem extends EntityTickingSystem<ChunkStore> {

    private final ComponentType<ChunkStore, TrashCanBlock> componentType;

    public TrashCanSystem(ComponentType<ChunkStore, TrashCanBlock> componentType) {
        this.componentType = componentType;
    }

    @Override
    public void tick(float v, int i, @NonNullDecl ArchetypeChunk<ChunkStore> archetypeChunk, @NonNullDecl Store<ChunkStore> store, @NonNullDecl CommandBuffer<ChunkStore> commandBuffer) {
        if (archetypeChunk.getComponent(i, ItemContainerBlock.getComponentType()) instanceof ItemContainerBlock icb && icb.getWindows().isEmpty()) {
            icb.getItemContainer().clear();
        }
    }

    @NullableDecl
    @Override
    public Query<ChunkStore> getQuery() {
        return this.componentType;
    }
}

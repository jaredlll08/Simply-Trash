package com.blamejared.simplytrash;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.universe.world.chunk.state.TickableBlockState;
import com.hypixel.hytale.server.core.universe.world.meta.state.ItemContainerState;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;

@SuppressWarnings("removal")
public class TrashCanBlockState extends ItemContainerState implements TickableBlockState {
    public static final Codec<TrashCanBlockState> CODEC = BuilderCodec.builder(TrashCanBlockState.class, TrashCanBlockState::new)
            .build();

    @Override
    public void tick(float v, int i, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer) {
        if (this.getWindows().isEmpty()) {
            this.getItemContainer().clear();
        }
    }

}

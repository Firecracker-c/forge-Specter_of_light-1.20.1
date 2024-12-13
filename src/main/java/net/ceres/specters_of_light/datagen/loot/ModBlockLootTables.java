package net.ceres.specters_of_light.datagen.loot;

import net.ceres.specters_of_light.Block.ModBlocks;
import net.ceres.specters_of_light.item.Moditems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables  extends BlockLootSubProvider {
    public ModBlockLootTables()
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.DEEPSLATE_LIGHT_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_LIGHT_ORE.get(), Moditems.SHARD_OF_LIGHT.get()));
        this.add(ModBlocks.LIGHT_ORE.get(),
                block -> createOreDrop(ModBlocks.LIGHT_ORE.get(), Moditems.SHARD_OF_LIGHT.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

package net.ceres.specters_of_light.datagen;

import net.ceres.specters_of_light.Block.ModBlocks;
import net.ceres.specters_of_light.SpectersOfLight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SpectersOfLight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider)
    {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LIGHT_ORE.get(),
                        ModBlocks.DEEPSLATE_LIGHT_ORE.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LIGHT_ORE.get(),
                        ModBlocks.DEEPSLATE_LIGHT_ORE.get());
    }
}

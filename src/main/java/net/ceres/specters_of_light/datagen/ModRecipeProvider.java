package net.ceres.specters_of_light.datagen;

import net.ceres.specters_of_light.Block.ModBlocks;
import net.ceres.specters_of_light.item.Moditems;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.PEARL_OF_LIGHT.get())
                .pattern("XXX")
                .pattern("XoX")
                .pattern("XXX")
                .define('X', Moditems.SHARD_OF_LIGHT.get())
                .define('o', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Moditems.SHARD_OF_LIGHT.get()), has (Moditems.SHARD_OF_LIGHT.get()))
                .save(pWriter);
    }
}

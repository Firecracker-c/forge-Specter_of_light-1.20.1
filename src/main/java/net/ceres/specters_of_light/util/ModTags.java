package net.ceres.specters_of_light.util;

import net.ceres.specters_of_light.SpectersOfLight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> NEEDS_LIGHT_TOOL = tag("needs_light_tool");


        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(SpectersOfLight.MOD_ID, name));
        }
    }
    public  static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(SpectersOfLight.MOD_ID, name));
        }
    }
}

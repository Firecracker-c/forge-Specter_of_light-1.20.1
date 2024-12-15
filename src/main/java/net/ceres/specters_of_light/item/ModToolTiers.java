package net.ceres.specters_of_light.item;

import net.ceres.specters_of_light.SpectersOfLight;
import net.ceres.specters_of_light.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier LIGHT = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3000, 9f, 5f, 25,
                    ModTags.Blocks.NEEDS_LIGHT_TOOL, () -> Ingredient.of(Moditems.SPECTER.get())),
            new ResourceLocation(SpectersOfLight.MOD_ID, "light"), List.of(Tiers.NETHERITE), List.of());
}

package net.ceres.specters_of_light.item;

import net.ceres.specters_of_light.Block.ModBlocks;
import net.ceres.specters_of_light.SpectersOfLight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpectersOfLight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPECTERS_OF_LIGHT_TAB = CREATIVE_MODE_TABS.register("specters_of_light_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SHARD_OF_LIGHT.get()))
                    .title(Component.translatable("creativetab.specters_of_light_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.LIGHT_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_LIGHT_ORE.get());
                        output.accept(Moditems.SHARD_OF_LIGHT.get());
                        output.accept(Moditems.PEARL_OF_LIGHT.get());
                        output.accept(Moditems.SPECTER.get());



                    } )
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package net.ceres.specters_of_light.item;

import net.ceres.specters_of_light.SpectersOfLight;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpectersOfLight.MOD_ID);

    public static final RegistryObject<Item> SHARD_OF_LIGHT = ITEMS.register( "shard_of_light",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL_OF_LIGHT = ITEMS.register("pearl_of_light",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPECTER = ITEMS.register("specter",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus)
    {
         ITEMS.register(eventBus);
    }
}

package com.tuormithrandir.myfirstmod.init;

import com.google.common.eventbus.Subscribe;
import com.tuormithrandir.myfirstmod.MyFirstMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MyFirstMod.MOD_ID, bus = Bus.MOD)

@ObjectHolder(MyFirstMod.MOD_ID)
public class ItemInit 
{
	public static final Item example_item = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));	
	}
}

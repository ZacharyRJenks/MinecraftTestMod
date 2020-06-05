package com.tuormithrandir.myfirstmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tuormithrandir.myfirstmod.init.BlockInit;

import java.util.stream.Collectors;

@Mod("mfm")
public class MyFirstMod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mfm";
    public static MyFirstMod instance;
    
    public MyFirstMod() {
      
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
       
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        
    }
    public static class newItemGroup extends ItemGroup{
    	
    	public static final newItemGroup instance = new newItemGroup(ItemGroup.GROUPS.length, "My Item Tab");
    	
    	private newItemGroup(int index, String label) {
    		
    		super(index,label);
    	}

		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return new ItemStack(BlockInit.example_block);
		}
    }

}

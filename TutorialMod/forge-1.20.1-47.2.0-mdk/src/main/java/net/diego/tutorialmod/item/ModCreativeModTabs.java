package net.diego.tutorialmod.item;

import net.diego.tutorialmod.TutorialMod;
import net.diego.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> SPANISH_TAB = CREATIVE_MODE_TABS.register("spanish_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.NATIONAL.get()))
                    .title(Component.translatable("creativetab.spanish_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NATIONAL.get());
                        pOutput.accept(ModItems.MOTOS_BALL.get());
                        pOutput.accept(ModItems.RULETA_RUSA.get());
                        pOutput.accept(ModBlocks.ENDONGO_BLOCK.get());
                        pOutput.accept(ModBlocks.NN_BLOCK.get());
                        pOutput.accept(ModBlocks.PABLO_MOTOS.get());
                        pOutput.accept(ModBlocks.AMOR.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

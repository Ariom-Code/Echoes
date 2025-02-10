package net.ariom.echoes.item;

import net.ariom.echoes.Echoes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.EnderChestBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Echoes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECHOES_TAB = CREATIVE_MODE_TABS.register("echoes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAGE.get()))
                    .title(Component.translatable("creativetab.echoes_tab"))
                    .displayItems((pParameters, pOutput) ->  {
                        pOutput.accept(ModItems.PAGE.get());
                        pOutput.accept(ModItems.AETHER_EYE.get());
                        pOutput.accept(ModItems.TEST_HELMET.get());

                        pOutput.accept(ModItems.EXPLORER_HELMET.get());
                        pOutput.accept(ModItems.EXPLORER_CHESTPLATE.get());
                        pOutput.accept(ModItems.EXPLORER_LEGGINGS.get());
                        pOutput.accept(ModItems.EXPLORER_BOOTS.get());

                        pOutput.accept(ModItems.MAGE_BOOTS.get());
                        pOutput.accept(ModItems.MAGE_CHESTPLATE.get());
                        pOutput.accept(ModItems.MAGE_LEGGINGS.get());
                        pOutput.accept(ModItems.MAGE_HELMET.get());

                        pOutput.accept(ModItems.ULTIMATE_BOOTS.get());
                        pOutput.accept(ModItems.ULTIMATE_CHESTPLATE.get());
                        pOutput.accept(ModItems.ULTIMATE_LEGGINGS.get());
                        pOutput.accept(ModItems.ULTIMATE_HELMET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

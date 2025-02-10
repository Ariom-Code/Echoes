package net.ariom.echoes.item;

import net.ariom.echoes.Echoes;
import net.ariom.echoes.item.armor.ExplorerArmorItem;
import net.ariom.echoes.item.armor.MageArmorItem;
import net.ariom.echoes.item.armor.UltimateArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Echoes.MOD_ID);

    public static final RegistryObject<Item> PAGE = ITEMS.register("page",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> AETHER_EYE = ITEMS.register("aether_eye",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TEST_HELMET = ITEMS.register("test_helmet",
            () -> new ArmorItem(ModArmorMaterials.TEST, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> EXPLORER_HELMET = ITEMS.register("explorer_helmet",
            () -> new ExplorerArmorItem(ArmorItem.Type.HELMET));
    public static final RegistryObject<Item> EXPLORER_CHESTPLATE = ITEMS.register("explorer_chestplate",
            () -> new ExplorerArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistryObject<Item> EXPLORER_LEGGINGS = ITEMS.register("explorer_leggings",
            () -> new ExplorerArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistryObject<Item> EXPLORER_BOOTS = ITEMS.register("explorer_boots",
            () -> new ExplorerArmorItem(ArmorItem.Type.BOOTS));

    public static final RegistryObject<Item> MAGE_HELMET = ITEMS.register("mage_helmet",
            () -> new MageArmorItem(ArmorItem.Type.HELMET));
    public static final RegistryObject<Item> MAGE_CHESTPLATE = ITEMS.register("mage_chestplate",
            () -> new MageArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistryObject<Item> MAGE_LEGGINGS = ITEMS.register("mage_leggings",
            () -> new MageArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistryObject<Item> MAGE_BOOTS = ITEMS.register("mage_boots",
            () -> new MageArmorItem(ArmorItem.Type.BOOTS));

    public static final RegistryObject<Item> ULTIMATE_HELMET = ITEMS.register("ultimate_helmet",
            () -> new UltimateArmorItem(ArmorItem.Type.HELMET));
    public static final RegistryObject<Item> ULTIMATE_CHESTPLATE = ITEMS.register("ultimate_chestplate",
            () -> new UltimateArmorItem(ArmorItem.Type.CHESTPLATE));
    public static final RegistryObject<Item> ULTIMATE_LEGGINGS = ITEMS.register("ultimate_leggings",
            () -> new UltimateArmorItem(ArmorItem.Type.LEGGINGS));
    public static final RegistryObject<Item> ULTIMATE_BOOTS = ITEMS.register("ultimate_boots",
            () -> new UltimateArmorItem(ArmorItem.Type.BOOTS));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

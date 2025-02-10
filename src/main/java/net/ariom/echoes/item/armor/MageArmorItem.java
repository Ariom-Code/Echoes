package net.ariom.echoes.item.armor;

import net.ariom.echoes.Echoes;
import net.ariom.echoes.item.armor.client.model.ExplorerArmorModel;
import net.ariom.echoes.item.armor.client.model.MageArmorModel;
import net.ariom.echoes.item.armor.client.renderer.ArmorRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public class MageArmorItem extends ModArmorItem {
    public MageArmorItem(Type pType) {
        super(ArmorMaterials.NETHERITE, pType, new Properties());
    }

    @Override
    protected boolean withCustomModel() {
        return true;
    }

    @Override
    protected ArmorRenderer<?> getRenderer(LivingEntity living, ItemStack stack, EquipmentSlot slot) {
        return new ArmorRenderer<>(MageArmorModel::createBodyLayer, MageArmorModel::new);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return makeCustomTextureLocation(Echoes.MOD_ID, "mage_armor");
    }
}
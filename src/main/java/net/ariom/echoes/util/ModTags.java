package net.ariom.echoes.util;

import net.ariom.echoes.Echoes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks{

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Echoes.MOD_ID, name));
        }
    }


    public static class Items{

        public static final TagKey<Item> EYES = tag("eyes");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Echoes.MOD_ID, name));
        }
    }
}

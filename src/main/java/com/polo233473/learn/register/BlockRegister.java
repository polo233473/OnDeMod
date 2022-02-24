package com.polo233473.learn.register;

import com.polo233473.learn.blocks.AuraStoneBlock;
import com.polo233473.learn.items.blockItems.AuraStoneBlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import static com.polo233473.learn.utils.Utils.*;

public class BlockRegister{
    public static final AuraStoneBlock AURA_STONE_BLOCK = new AuraStoneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(8.0f));
    //blockItem
    private static final AuraStoneBlockItem AURA_STONE_BLOCK_ITEM = new AuraStoneBlockItem(AURA_STONE_BLOCK,new FabricItemSettings().group(ItemGroup.MISC));

    public void blockInitialize(){
//        Registry.register(Registry.BLOCK,id("learn","aura_stone_block"),AURA_STONE_BLOCK);
        register(Registry.BLOCK,AURA_STONE_BLOCK);
        //blockItem
        Registry.register(Registry.ITEM,id("learn","aura_stone_block"),AURA_STONE_BLOCK_ITEM);
    }
}

package com.polo233473.learn.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static com.polo233473.learn.utils.ScreenUtil.createScreenHandlerFactory;

public class TestItem extends Item {
    InGameHud hud = new InGameHud(MinecraftClient.getInstance());

    public TestItem(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
//        user.openHandledScreen(createScreenHandlerFactory(stack));
        hud.clear();
        return TypedActionResult.success(stack);
    }
}
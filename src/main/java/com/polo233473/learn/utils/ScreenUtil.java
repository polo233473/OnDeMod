package com.polo233473.learn.utils;

import com.polo233473.learn.screen.TestScreenHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;

public class ScreenUtil {
    public static NamedScreenHandlerFactory createScreenHandlerFactory(ItemStack stack){
        return new SimpleNamedScreenHandlerFactory((syncId, inv, player) -> {
            return new TestScreenHandler(syncId,player.getInventory(),inv);
        },stack.getName());
    }
}

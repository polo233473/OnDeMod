package com.polo233473.learn.screen;

import com.polo233473.learn.register.ScreenRegister;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class TestScreenHandler extends ScreenHandler {
    private final Inventory inventory;

    public TestScreenHandler(int syncId,PlayerInventory playerInventory) {
        this(syncId,playerInventory,new SimpleInventory(9));
    }

    public TestScreenHandler(int syncId,PlayerInventory playerInventory,Inventory inventory){
        super(ScreenRegister.TEST_SCREEN_HANDLER,syncId);
        checkSize(inventory,9);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        int i,j;

        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                this.addSlot(new Slot(inventory, j + i * 3, 62 + j * 18, 17 + i * 18));
            }
        }
        //The player inventory
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        //The player Hotbar
        for (i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }
}

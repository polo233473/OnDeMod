package com.polo233473.learn.register;

import com.polo233473.learn.items.TestItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import static com.polo233473.learn.utils.Utils.*;

public class ItemRegister {
    private static final TestItem TEST_ITEM = new TestItem(new FabricItemSettings().group(ItemGroup.MISC));

    public void itemInitialize(){
        register(Registry.ITEM,TEST_ITEM);
    }
}
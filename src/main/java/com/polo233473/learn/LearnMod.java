package com.polo233473.learn;

import com.polo233473.learn.register.BlockRegister;
import com.polo233473.learn.register.ItemRegister;
import com.polo233473.learn.register.ScreenRegister;
import com.polo233473.learn.register.WorldRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    private static final ItemRegister itemRegister = new ItemRegister();
    private static final WorldRegister worldRegister = new WorldRegister();
    private static final BlockRegister blockRegister = new BlockRegister();
    static ScreenRegister screenRegister = new ScreenRegister();

    @Override
    public void onInitialize() {
        itemRegister.itemInitialize();
        blockRegister.blockInitialize();
        worldRegister.WorldInitialize();
    }
}

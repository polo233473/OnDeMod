package com.polo233473.learn.client;

import com.polo233473.learn.screen.TestScreen;
import com.polo233473.learn.register.ScreenRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class ClientLearnMod implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ScreenRegister.TEST_SCREEN_HANDLER, TestScreen::new);
    }
}

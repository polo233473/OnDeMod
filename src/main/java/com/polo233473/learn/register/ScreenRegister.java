package com.polo233473.learn.register;

import com.polo233473.learn.screen.TestScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import static com.polo233473.learn.utils.Utils.*;

public class ScreenRegister{
    public static ScreenHandlerType<TestScreenHandler> TEST_SCREEN_HANDLER;

    public ScreenRegister(){
        TEST_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(id("test"),TestScreenHandler::new);
    }
}

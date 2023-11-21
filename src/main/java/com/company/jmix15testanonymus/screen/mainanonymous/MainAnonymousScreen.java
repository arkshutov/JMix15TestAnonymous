package com.company.jmix15testanonymus.screen.mainanonymous;

import io.jmix.ui.ScreenTools;
import io.jmix.ui.Screens;
import io.jmix.ui.UiProperties;
import io.jmix.ui.component.AppWorkArea;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Window;
import io.jmix.ui.component.mainwindow.Drawer;
import io.jmix.ui.icon.JmixIcon;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("MainAnonymousScreen")
@UiDescriptor("main-anonymous-screen.xml")
@Route(path = "anonymous")
public class MainAnonymousScreen extends Screen {
    @Autowired
    private Screens screens;

    @Autowired
    private UiProperties uiProperties;

    @Subscribe("showLoginScreenBtn")
    protected void onShowLoginScreenBtnClick(Button.ClickEvent event) {
        String loginScreenId = uiProperties.getLoginScreenId();
        Screen loginScreen = screens.create(loginScreenId, OpenMode.ROOT);
        loginScreen.show();
    }
}
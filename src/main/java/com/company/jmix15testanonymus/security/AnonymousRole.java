package com.company.jmix15testanonymus.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "AnonymousRole", code = AnonymousRole.CODE, scope = "UI")
public interface AnonymousRole {
    String CODE = "anonymous-role";

    @MenuPolicy(menuIds = {"anonymousScreen"})
    @ScreenPolicy(screenIds = {"MainScreenSideMenu", "MainAnonymousScreen"})
    void screens();

    @MenuPolicy(menuIds = {"application"})
    void commonMenus();
}
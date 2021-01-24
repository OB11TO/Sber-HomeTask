package org.ob11to.pluginManager.plugins.plugin2;

import org.ob11to.pluginManager.Plugin;

public class MyPlugin implements Plugin {
    @Override
    public void doUsefull() {
            System.out.println("Plugin 2: Загрузился! ");
    }
}

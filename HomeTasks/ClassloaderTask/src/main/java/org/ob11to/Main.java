package org.ob11to;

import org.ob11to.pluginManager.Plugin;
import org.ob11to.pluginManager.PluginManager;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        PluginManager manager = new PluginManager("/home/obiito/c/java/full_day/sber_java/Sber-HomeTask/HomeTasks/ClassloaderTask/src/main/java/org/ob11to/pluginManager/plugins\n");
        Plugin plugin1 = manager.load("MyPlugin", "org.ob11to.pluginManager.plugins.plugin1");
        plugin1.doUsefull();
    }
}

package org.ob11to;

import org.ob11to.pluginManager.Plugin;
import org.ob11to.pluginManager.PluginManager;
import org.ob11to.pluginManager.plugins.plugin1.MyPlugin;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        PluginManager manager = new PluginManager("/home/obiito/c/java/full_day/sber_java/Sber-HomeTask/HomeTasks/ClassloaderTask/src/main/java/org/ob11to/pluginManager/plugins\n");
        Plugin plugin1 = manager.load("plugin1", "org.ob11to.pluginManager.plugins.plugin1.MyPlugin");
      //  Plugin plugin2 = manager.load("plugin1", "org.ob11to.pluginManager.plugins.plugin1.MyPlugin");
        plugin1.doUsefull();
        //plugin1.doUsefull();
        Plugin plugin2 = manager.load("plugin2", "org.ob11to.pluginManager.plugins.plugin2.MyPlugin");
        plugin2.doUsefull();


    }
}

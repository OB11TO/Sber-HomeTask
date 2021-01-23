package org.ob11to.pluginManager;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginManager {
    private final String pluginRootDirectory;  //корневой каталог плагина


    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName)  {
        File file = new File(pluginRootDirectory + "/" + pluginName);
        Plugin plugin = null;
        try {
            URLClassLoader url = getURLClassLoader(file, true);
        } catch (MalformedURLException e) {
            System.out.println("Введён неверный путь к папке с плагинами");
            e.printStackTrace();
        }


        return plugin;
    }
    private URLClassLoader getURLClassLoader(File file, boolean parent) throws MalformedURLException {
        if (!parent) {
            return new URLClassLoader(new URL[]{file.toURL()}, null);
        } else {
            return new URLClassLoader(new URL[]{file.toURL()});
        }
    }
}
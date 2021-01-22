package org.ob11to.plaginMeneger;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginManager {
    private final String pluginRootDirectory;


    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) {
        File file = new File(pluginRootDirectory + "/" + pluginName);
        Plugin plugin = null;
        URLClassLoader urlClassLoader = null;
    }
}
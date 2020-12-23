import org.apache.commons.io.FileUtils;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File tempDirectory = FileUtils.getTempDirectory();
    }
}
package matlab.util;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\king\\Desktop\\project2\\cr_0_5");
        File[] files = dir.listFiles();
        for (File f : files) {
            String absolutePath = f.getAbsolutePath();
            int i = absolutePath.lastIndexOf("\\");
            f.renameTo(new File(absolutePath.substring(0, i + 1) + "cr_0_5_" + absolutePath.substring(i + 1)));
        }

    }

}

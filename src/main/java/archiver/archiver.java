package archiver;

import java.io.File;
import java.util.List;

public class archiver {
    public static void main(String[] args) {

    }

    public static void getFile(File rootFile, List<File> fileList){
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for(File file: directoryFiles) {
                    if (file.isDirectory()) {
                        getFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")){
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}

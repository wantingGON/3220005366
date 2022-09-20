package com.azhu.utils;

import java.io.File;

public class GetFileNameUtils {
    public  static String getName(String sourcefile){
        File sourceFile = new File(sourcefile.trim());
        String sourceName = sourceFile.getName();
        return sourceName;
    }

}

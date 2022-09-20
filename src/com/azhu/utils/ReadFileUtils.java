package com.azhu.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 读写txt文件的工具类
 */
public class ReadFileUtils {

    /**
     * 读出txt文件
     * 传入文件绝对路径，将文件内容转化为 String字符串输出
     */
    public static String readTxt(String txtPath) {
        StringBuilder str = new StringBuilder();
        String strLine;
        // 将 txt文件按行读入 str中
        File file = new File(txtPath);
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str.append(strLine);
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    /**
     * 写入txt文件 向结果txt中写入重复率
     * 传入内容、文件全路径名，将内容写入文件并换行
     * txtElem 传入的内容  txtPath 写入的文件路径
     */
    public static void writeTxt(double txtElem, String txtPath, String sourcefile, String copy) {
        String str = Double.toString(txtElem);
        File file = new File(txtPath);
        //用utils打包读取文件名的方法
       // File sourceFile = new File(sourcefile.trim());
        String sourceName =GetFileNameUtils.getName(sourcefile);

        //File CopyFile = new File(copy.trim());
        String CopyName = GetFileNameUtils.getName(copy);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(sourceName + "和" + CopyName + "的重复率是");
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");

            // 关闭资源
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
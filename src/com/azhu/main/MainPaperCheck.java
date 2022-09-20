package com.azhu.main;


import com.azhu.utils.ReadFileUtils;

import java.util.Scanner;

public class MainPaperCheck {

    public static void main(String[] args) {

        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        // 根据路径名读取对应的文件，将文件的内容转化为对应的字符串
        Scanner line = new Scanner(System.in);
        System.out.print("请输入原文件地址：");
        String sourcefile = line.nextLine();
        String Sourcefile = ReadFileUtils.readTxt(sourcefile);
        System.out.print("请输入测试文件地址：");

        String copyfile = line.nextLine();
        String Copyfile = ReadFileUtils.readTxt(copyfile);

        System.out.print("请输入输出结果地址：");
        String FileName = line.nextLine();
        String resultFileName = FileName;
    }

}
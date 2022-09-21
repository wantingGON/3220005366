package com.azhu.main;


import com.azhu.utils.GetFileNameUtils;
import com.azhu.utils.HammingUtils;
import com.azhu.utils.ReadFileUtils;
import com.azhu.utils.SimHashUtils;

public class MainPaperCheck {

    public static void main(String[] args) {

 //从面板输入      (看错要求了)
//        Scanner line = new Scanner(System.in);
//        System.out.print("请输入原文件地址：");
//        String sourcefile = line.nextLine();
//        String Sourcefile = ReadFileUtils.readTxt(sourcefile);
//        System.out.print("请输入测试文件地址：");
//
//        String copyfile = line.nextLine();
//        String Copyfile = ReadFileUtils.readTxt(copyfile);
//
//        System.out.print("请输入输出结果地址：");
//        String FileName = line.nextLine();
//        String resultFileName = FileName;
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        // 根据路径名读取对应的文件，将文件的内容转化为对应的字符串
        String Sourcefile =ReadFileUtils.readTxt(args[0]);
        String Copyfile = ReadFileUtils.readTxt(args[1]);
        String resultFileName =args[2];
        System.out.println("读取文件中... ...");

        // 由字符串得出对应的 simHash值
        String simHashSourse = SimHashUtils.getSimHash(Sourcefile);
        System.out.println("正在计算"+ GetFileNameUtils.getName(args[0])+"的simHash值");
        String simHashCopy = SimHashUtils.getSimHash(Copyfile);
        System.out.println("正在计算"+ GetFileNameUtils.getName(args[1])+"的simHash值");

        // 由 simHash值求出相似度
        double similarity = HammingUtils.getSimilarity(simHashSourse, simHashCopy);
        // 把相似度写入最后的结果文件中
        ReadFileUtils.writeTxt(similarity, resultFileName,args[0],args[1]);
        //输出结果
        System.out.print("输出结果：");
        System.out.println(ReadFileUtils.readTxt(args[2]));
        //退出程序
        System.exit(0);
    }

}
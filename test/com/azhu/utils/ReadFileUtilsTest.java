package com.azhu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileUtilsTest {

    @Test
    void readTxt() {
        String A=ReadFileUtils.readTxt("D:\\Java\\data\\papercheck\\wenjian\\orig.txt");
        System.out.println(A);

    }
    @Test
    void writeTxt() {
        String txtA=ReadFileUtils.readTxt("D:\\Java\\data\\papercheck\\wenjian\\orig.txt");
        String txtB=ReadFileUtils.readTxt("D:\\Java\\data\\papercheck\\wenjian\\orig_0.8_del.txt");
        //0.233333只是测试值，不是真值
        ReadFileUtils.writeTxt(Double.parseDouble("0.2333333"),"D:\\Java\\data\\papercheck\\wenjian\\Repeat_rate.txt",txtA,txtB);
    }
}
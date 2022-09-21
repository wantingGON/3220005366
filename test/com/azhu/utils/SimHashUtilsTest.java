package com.azhu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimHashUtilsTest {

    @Test
    void CountTest() {
        String txtA=ReadFileUtils.readTxt("D:\\Java\\data\\papercheck\\wenjian\\orig.txt");
        String txtB=ReadFileUtils.readTxt("D:\\Java\\data\\papercheck\\wenjian\\orig_0.8_add.txt");
        String simhashA=SimHashUtils.getSimHash(txtA);
        String simhashB=SimHashUtils.getSimHash(txtB);
        System.out.println("哈希值A:"+simhashA);
        System.out.println("哈希值B:"+simhashB);



    }

}
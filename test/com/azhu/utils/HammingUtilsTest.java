package com.azhu.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingUtilsTest {



    @Test
    void Test() {
        String hash1="011111100011110001110011";
        String hash2="011001100011110001110011";
        System.out.println("海明距离："+HammingUtils.getHammingDistance(hash1, hash2));
        System.out.println("相似率："+HammingUtils.getSimilarity(hash1, hash2));
    }
}
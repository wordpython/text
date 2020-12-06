package com.wordpython.nowcoder;


import java.nio.Buffer;

public class AI反转字符串 {
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public String solve (String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}

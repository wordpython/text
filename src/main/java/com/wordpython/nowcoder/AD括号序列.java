package com.wordpython.nowcoder;

import org.junit.Test;

import java.util.Stack;

/**
 * 给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
 * 括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
 */
public class AD括号序列 {
    /**
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'&&stack.size()==0
                    || s.charAt(i)==')'&&stack.pop()!='('){
                return false;
            }else if(s.charAt(i)=='}'&&stack.size()==0
                    || s.charAt(i)=='}'&&stack.pop()!='{'){
                return false;
            }else if(s.charAt(i)==']'&&stack.size()==0
                    || s.charAt(i)==']'&&stack.pop()!='['){
                return false;
            }
        }
        return stack.empty();
    }
    @Test
    public void test(){
        Stack<String> strings = new Stack<>();
        if(strings.size()==0||strings.pop()=="a"){
            System.out.println("lasfjl");
        }
    }
}

package com.xiongdada.extend_5;

import org.apache.logging.log4j.util.Chars;

import java.util.Optional;

/**
 * auth : xiongdada
 * date : 2024/6/5
 **/
public class TestHash {
    public static void main(String[] args) {
        String s = "ok";
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb.hashCode());
        System.out.println(s.hashCode());
        System.out.println();

        String t = new String(s);

        Optional<Object> empty = Optional.empty();


        System.out.println();
        StringBuilder tb= new StringBuilder(t);
        System.out.println(tb.hashCode());
        System.out.println(t.hashCode());
    }

}

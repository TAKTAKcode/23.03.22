package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //=========================
        /* 진행 순서 */
        //1. 단어를 입력
        //2. 단어의 글자 수 출력
        //=========================

        Scanner sc = new Scanner(System.in);

        //1. 단어를 입력
        String word = sc.nextLine();

        //2. 단어의 글자 수 출력
        System.out.println(word.length());

    }

}

package com.example.letter.demo.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Test Class;
 *
 * @author guweifeng
 * @date 2021-03-13 21:57:46
 */
public class LetterCode {
    static LetterUtils letterUtils;

    String code = "56";

    @BeforeEach
    public  void letterBefore(){
        letterUtils = new LetterUtils();
    }

    @AfterEach
    public  void letterAfter(){
        letterUtils = null;
    }

    @Test
    public void codeTest(){
        List<String> resultList = letterUtils.letterCombinations(code);
        if (resultList != null && resultList.size() > 0){
            for (String str : resultList){
                System.out.println("" + str);
            }
        }
    }



    @Test
    public void codeTestInteger(){
        Integer[] input0 = new Integer[]{1,5,6};
        Integer[] input1 = new Integer[]{0,5,6,1};
        Integer[] input2 = new Integer[]{35,55,44};
        Integer[] input3 = new Integer[]{2,8,9,00,10,11,99};

        List<String> output0 = letterUtils.letterCombinations(input0);
        List<String> output1 = letterUtils.letterCombinations(input1);
        List<String> output2 = letterUtils.letterCombinations(input2);
        List<String> output3 = letterUtils.letterCombinations(input3);


        System.out.println(output0.toString());
        System.out.println(output1.toString());
        System.out.println(output2.toString());
        System.out.println(output3.toString());

    }

}

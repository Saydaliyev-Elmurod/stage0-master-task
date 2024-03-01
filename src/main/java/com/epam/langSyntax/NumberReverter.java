package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        //467
        System.out.println(number%10+""+(number-number/10*10)+number/100);
    }

}

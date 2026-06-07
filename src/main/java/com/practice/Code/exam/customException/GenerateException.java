package com.practice.Code.exam.customException;

public class GenerateException {

    public static void main(String[] args) throws CustomException {

        if(4%2==0)
        {
            throw new CustomException("Arithmetic Exception");
        }
    }
}

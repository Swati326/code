package com.practice.Code.interview.ignorepackage;

public class GenerateExp {

    public static void main(String[] args) {

        if (5 % 2 != 0) {
            CustomException customException=new CustomException("Exception Occured");
            System.out.println(customException);
        }
    }
}


// Write an SQL query to find duplicate records in a table

//select * from patient group by name having count()>1;

package com.suraj.srp.refactor;

public class ViolationChecker {
        public static boolean validate(Pair pair){

            if(pair.getFirst() == null || pair.getSecond() == null){
                System.out.println("Input Not Valid, one of the Inputs is null");
                return false;
            }
            try{
                Integer.parseInt(pair.getFirst());
                Integer.parseInt(pair.getSecond());
            }catch(NumberFormatException ex){
                return false;
            }
            return true;
        }
}

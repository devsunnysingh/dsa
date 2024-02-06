package com.algorithmpractice.algos.search.linear;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Sunny is a boy. And sunny likes flying kites.";
        char target='s';
        System.out.println("Element is at "+searchinString(name,target));

        System.out.println("Result using for each is "+searchStringUsingForEach(name,target));

    }
    static boolean searchStringUsingForEach(String str, char target){
        String lowerStr=str.toLowerCase();
        for(char ch : lowerStr.toCharArray()){
            if(ch==target){
                return  true;
            }
        }
        return false;
    }
    static int searchinString(String str, char target){
        String lowerStr=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(lowerStr.charAt(i)==target){
                return i+1;
            }
        }
        return -1;
    }
}

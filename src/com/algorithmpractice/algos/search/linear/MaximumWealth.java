package com.algorithmpractice.algos.search.linear;

public class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int customer=0;customer<accounts.length;customer++){
            int amt=0;
            for(int bank=0;bank<accounts[customer].length;bank++){
                amt=amt+accounts[customer][bank];
            }
            if(amt>max){
                max=amt;
            }
        }

        return max  ;
    }

    public static void main(String[] args) {
        int[][] accounts = { {1, 2, 3, 4}, {5, 6, 7} };
        int balance=maximumWealth(accounts);
        System.out.println(balance);
    }
}

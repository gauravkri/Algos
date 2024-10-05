package com.gauravkri.algos.arrays;

public class BinanryGap {

    int maxGap(int num){
        String binary = Integer.toBinaryString(num);
        int maxGap =0, currentGap=0;
        boolean counting = false;
        for(char c : binary.toCharArray()){

            if( c =='1'){
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }

                counting=true;
                currentGap=0;
            }else if(counting){
                currentGap++;
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        int num = 529;
        BinanryGap bg = new BinanryGap();
        System.out.println(bg.maxGap(num));
    }

}

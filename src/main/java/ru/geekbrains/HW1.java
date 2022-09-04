package ru.geekbrains;
public class HW1 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        for(int i = 1; i< nums.length-2;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int x = 0; x < i;x++){
                sum1+=nums[x];
            }
            for(int x = i+1;x< nums.length;x++){
                sum2+=nums[x];
            }
            if(sum1==sum2){
                System.out.println("Сумма элементов < и > индекса "+ i + " равна " + sum1);
            }
        }
    }
}

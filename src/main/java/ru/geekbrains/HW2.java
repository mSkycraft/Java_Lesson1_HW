package ru.geekbrains;


public final class HW2 {
    private HW2() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] old = {"asdfwed", "asdfghdf", "asdfbcht", "asdvbqwe"};
        StringBuilder newStr = new StringBuilder("");
        int maxlen = 1;
        for(int i = 0; i<old.length;i++){
            for(int j = 0; j< maxlen;j++)
                if(i==0){
                    newStr.append(old[i].charAt(j));
                    maxlen = old[i].length();
                }
                else if(old[i].charAt(j)!= newStr.charAt(j)){
                    newStr.delete(j,newStr.length()-1);
                    newStr.reverse();
                    newStr.deleteCharAt(0);
                    newStr.reverse();
                    maxlen = newStr.length();
                }
        }
        System.out.println("Результат: " + newStr.toString());
    }
}
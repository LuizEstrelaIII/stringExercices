public class letraF {
    public static void main(String [] args){
        String str1 = "0 1 2  3 4   5 6 7 8 9";
        int contDig = 0;
        for(int i = 0; i < str1.length();i++){
            char caractere = str1.charAt(i);
            if(Character.isDigit(caractere)){
                contDig++;
            }
        }
        System.out.println("tem " + contDig + " digitos");
    }
    
}

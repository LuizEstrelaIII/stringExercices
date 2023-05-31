public class letraH {
    public static void main(String [] args){
        String str1 = "frase para teste";
        int count = countWords(str1);
        System.out.println(count);
    }

    public static int countWords(String str) {
        int count = 0;
        String[] words = str.split("\\s+");
            for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

    


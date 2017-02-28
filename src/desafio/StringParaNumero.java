package desafio;

public class StringParaNumero {

    public static void main(String[] args) {
        String s = "7682";
        int num = 0;
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {   
            num = Character.getNumericValue(s.charAt(i));
            int var = s.length() - i;
            while (var > 1) {
                num = num * 10;
                var--;
            }
            total = num + total;
        }
        System.out.println(total);
    }
}

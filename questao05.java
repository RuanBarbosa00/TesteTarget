public class questao05 {
    public static void main(String[] args) {
        String original = "Exemplo de string para inverter";
        String invertida = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}

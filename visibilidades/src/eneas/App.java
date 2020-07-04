package eneas;

public class App {
//    escopo padrão (default)
    static double y=20;
//    visibilidade publica/ para todos os packages
    public static double x=25;
//    visibilidade private/ privada para todos os packages
    private static double z=15;

    public static void main(String[] args) {
//        tipos primitivos
        String a="eae";  //não é tipo primitivo, e sim um objeto
        int b=5; //inteiros
        double c=5.5; //quebrados
        byte d=127; //espaço de um byte
        short e=12; //int só que com menos espaço
        long f=11; //int só que com mais espaço
        float g=12.1f; //double com menos espaço
        char h='a'; //apenas um caractere
    }
}

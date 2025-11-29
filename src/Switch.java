public class Switch {
    public static void main(String[] args) {
    /*Imprima o dia da semana, considerando 1 como domingo
    * switch aceita char, int, byte, short, enum, String
    * */
        int dia = 5;
        switch (dia){
            case 1 :
                System.out.println("doming");
                break;
            case 2 :
                System.out.println("segunda");
                break;
            case 3 :
                System.out.println("terça");
                break;
            case 4 :
                System.out.println("quarta");
                break;
            case 5 :
                System.out.println("quinta");
                break;
            case 6 :
                System.out.println("sexta");
                break;
            case 7 :
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opção invávlida");
        }

        char sexo = 'M';
        switch (sexo){
            case 'M' :
                System.out.println("Homem");
                break;
            case 'F' :
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Char inválido");
                break;
        }
    }
}

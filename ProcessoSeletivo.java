import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = {"Samuel", "Gabriel", "Lorena", "Márcia", "Nathália"};
                for (String candidato:candidatos){
                    entrarEmContato(candidato);
                }
    }

    static void entrarEmContato(String candidato){

        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{

            atendeu=atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativaRealizada++;
            }else {
                System.out.println("Contato Realizado com sucesso");
            }

        }while (continuarTentando && tentativaRealizada <3);

        if (atendeu){
            System.out.println("Conseguimos contato com "+candidato+" na "+tentativaRealizada+" tentativa");
        }else {
            System.out.println("Não conseguimos contato com "+candidato+", número de tentativas realizadas "+tentativaRealizada+" realizadas");
        }
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos() {

        String[] candidatos = {"Samuel", "Gabriel", "Lorena", "Márcia", "Nathália"};

        System.out.println("Imprimindo candidatos selecionados informando o índice");

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de N° "+ i+" é "+candidatos[i]);
        }
    }

    static String[] candidatos = {"Samuel", "Gabriel", "Lorena", "Márcia", "Nathália", "Luciana", "Marcos", "Victor", "Arthur", "Rafael"};
    private static double salárioBase = 2000.0;

    static void seleçãoCandidatos() {

        int candidatosSelecionados = 0;
        int numeroCandidato = 0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[numeroCandidato];
            double salároPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salároPretendido);
            if (salárioBase >= salároPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }
            numeroCandidato++;
        }

    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarSalario(double salárioPretendido) {

        double salárioBase = 2000.0;

        if (salárioBase > salárioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salárioBase == salárioPretendido) {
            System.out.println("Ligar para o candidato e fazer contra proposta");

        } else {
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }

    ;


}
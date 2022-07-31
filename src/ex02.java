import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // variáveis
        double hora, remuneracao, custo, cargaHoraria;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        //entrada
        System.out.println("Calculo do valor da hora de um serviço");
        System.out.print("Remuneração mensal pretendida: ");
        remuneracao = teclado.nextDouble();
        System.out.print("Custo operacional mensal: ");
        custo = teclado.nextDouble();
        System.out.print("Carga horária mensal de trabalho: ");
        cargaHoraria = teclado.nextDouble();
        // processamento
        hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.02)) / cargaHoraria;
        //saida
        System.out.println("Valor da hora: " + formatador.format(hora));
        teclado.close();


    }

}

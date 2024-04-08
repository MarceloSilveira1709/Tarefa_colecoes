import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite os nomes separados por vírgula: ");
        String nomesInput = scanner.nextLine();

        // ordená-los e imprimi-los
        String[] nomes = nomesInput.split(",");
        Arrays.sort(nomes);
        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        // separar por gênero e imprimir
        System.out.print("Digite os nomes e sexos separados por vírgula-sexo: ");
        String nomesSexosInput = scanner.nextLine();
        String[] paresNomeSexo = nomesSexosInput.split(",");
        System.out.println("Nomes masculinos:");
        for (String par : paresNomeSexo) {
            String[] nomeSexo = par.split("-");
            if (nomeSexo.length == 2) {
                if (nomeSexo[1].trim().equalsIgnoreCase("m")) {
                    System.out.println(nomeSexo[0].trim());
                }
            }
        }
        System.out.println("Nomes femininos:");
        for (String par : paresNomeSexo) {
            String[] nomeSexo = par.split("-");
            if (nomeSexo.length == 2) {
                if (nomeSexo[1].trim().equalsIgnoreCase("f")) {
                    System.out.println(nomeSexo[0].trim());
                }
            }
        }

        scanner.close();
    }
}




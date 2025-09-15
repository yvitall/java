import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String namePaciente;
        char sexoPaciente;
        int qtdPacientes = 0, idadePaciente, escolha1;
        double alturaPaciente, kgPaciente;
        int idadePacientes18a25 = 0;
        double mediaH;
        double qtdH = 0;
        ArrayList<Integer> idadePacientesH = new ArrayList<>();
        double somaIdadesH = 0;
        double mediaIdadeH =0;
        double qtdMulheresKgAlt = 0;
        String hVelho;

        while(true){
            System.out.print("----- CLÍNICA TASGC -----\n1.Digite 1 para cadastrar um paciente novo\n2.Digite 0 para encerrar cadastros e receber relatório geral\n");
            escolha1 = input.nextInt();
            input.nextLine();

            if (escolha1 == 1) {

                System.out.print("Digite o nome do paciente: ");
                namePaciente = input.nextLine();

                System.out.print("Qual o sexo: ");
                sexoPaciente = input.next().charAt(0);
                if  (sexoPaciente == 'm' || sexoPaciente == 'M') {
                    qtdH += 1;
                }

                System.out.print("Qual idade do paciente: ");
                idadePaciente = input.nextInt();
                if (idadePaciente >= 18 && idadePaciente <= 25) {
                    idadePacientes18a25 += 1;
                }
                if (sexoPaciente == 'm'||sexoPaciente == 'M') {
                    idadePacientesH.add(idadePaciente);
                    somaIdadesH += idadePaciente;
                    }

                System.out.print("Digite altura do paciente: ");
                alturaPaciente = input.nextDouble();

                System.out.print("Digite o peso do paciente: ");
                kgPaciente = input.nextDouble();
                if ((sexoPaciente == 'f' || sexoPaciente == 'F')
                        && kgPaciente > 70
                        && alturaPaciente > 1.60
                        && alturaPaciente < 1.70) {
                    qtdMulheresKgAlt += 1;
                }

                System.out.print("Paciente cadastrado!\n");

                qtdPacientes += 1;
                if (qtdH > 0) {
                    mediaIdadeH = somaIdadesH / qtdH;
                }
            } else if (escolha1 == 0) {
                System.out.print("----- RELATÓRIO GERAL -----\n");
                System.out.print("Quantidade de Pacientes: " + qtdPacientes +"\n");
                System.out.print("Quantidade Pacientes com idades entre 18 - 25: " + idadePacientes18a25 +"\n");
                System.out.print("Quantidade de Pacientes Homens: " + qtdH +"\nMédia de idades dos pacientes homens: " + mediaIdadeH + "\n");
                System.out.print("Mulheres com altura > 1.60 e < 1.70 com + 70kg: " + qtdMulheresKgAlt +"\n");
                System.out.println("O paciente Homem mais velho é: " + hVelho);
                break;
            }

        }
    }
}
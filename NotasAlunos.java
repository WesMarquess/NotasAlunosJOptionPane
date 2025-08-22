import javax.swing.*;

public class NotasAlunos {

    public static int total = 0;
    public static Aluno[] arrayAlunos;
    public static int contadorAlunos = 0;

    // Função menu
    public static void menu() {

        String menu = "\nMENU\n\n1 - Qtd Alunos\n2 - Novo aluno\n3 - Exibir\n4 - Sair";

        while (true) {
            int item = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            if (item == 1) {
                total = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite total de alunos"));
                arrayAlunos = new Aluno[total];
                contadorAlunos = 0;

            } else if (item == 2) {

                if (arrayAlunos == null) {
                    JOptionPane.showMessageDialog(null, "Defina primeiro a quantidade de alunos (opção 1).");
                    continue;
                }

                if (contadorAlunos >= total) {
                    JOptionPane.showMessageDialog(null, "Número máximo de alunos atingido.");
                    continue;
                }

                Aluno novoAluno = new Aluno(); // inicialização do objeto

                //Seta o nome do novoAluno
                String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
                novoAluno.setNome(nomeAluno);

                //Seta notas de P1 até ADO
                double notaP1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota P1"));
                novoAluno.setP1(notaP1);

                double notaP2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota P2"));
                novoAluno.setP2(notaP2);

                double ado = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota ADO"));
                novoAluno.setAdo(ado);

                //Guarda o valor dentro do Array
                arrayAlunos[contadorAlunos] = novoAluno;
                contadorAlunos++;

                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");

            } else if (item == 3) {
                listar();

            } else if (item == 4) {

                System.exit(0);

            } else {

                JOptionPane.showMessageDialog(null, "Opção inválida.");

            }
        }
    }

    public static void listar() {

        if (arrayAlunos == null || contadorAlunos == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado ainda.");
            return;
        }

        for (int i = 0; i < contadorAlunos; i++) {

            Aluno aluno = arrayAlunos[i];

            String mensagem = "Aluno " + (i + 1) + ":\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "P1: " + aluno.getP1() + "\n" +
                    "P2: " + aluno.getP2() + "\n" +
                    "ADO: " + aluno.getAdo() + "\n" +
                    "Média: " + String.format("%.2f", aluno.getMedia());

            JOptionPane.showMessageDialog(null, mensagem);

        }
    }

    public static void main(String[] args) {

        menu();

    }
}

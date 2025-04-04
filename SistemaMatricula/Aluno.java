import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aluno {
    private long matricula;
    private String nome;
    private String email;
    private int anoIngresso;
    private int notaEnade;

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public Aluno(String nome, String email, int anoIngresso) {
        this.nome = nome;
        this.email = email;
        this.anoIngresso = anoIngresso;
        setMatricula();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", anoIngresso=" + anoIngresso +
                ", notaEnade=" + notaEnade +
                '}';
    }

    public String[] fazerProva(String[][] prova) {
        System.out.println("Hora de fazer a prova " + getNomeAluno());
        String[] resposta = new String[prova[0].length];

        for (int i = 0; i < prova[0].length; i++) {
            System.out.print(prova[0][i] + " ");

            resposta[i] = sc.nextLine().toLowerCase();
        }


        return resposta;
    }

    public String[] fazerProvaAutomatica(String[][] prova){
        System.out.println("Prova de " + getNomeAluno() + " feita");
        String[] resposta = new String[prova[0].length];

        for (int i = 0; i < prova[0].length; i++) {
            resposta[i] = prova[2][i].split("_")[rand.nextInt(3)];
        }

        System.out.println("Resposta: " + Arrays.toString(resposta));

        return resposta;
    }


    //gets e sets
    public long getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        this.matricula = 1000 + rand.nextInt(99);
    }

    public String getNomeAluno() {
        return nome;
    }

    public void setNomeAluno(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoingresso() {
        return anoIngresso;
    }

    public void setAnoingresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getNotaEnade() {
        return notaEnade;
    }

    public void setNotaEnade(int notaEnade) {
        this.notaEnade = notaEnade;
    }
}
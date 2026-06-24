public class Main{
    public static void main (String[]args){
        Universidade aluno1 = new Universidade ("Ana","psicologia");

        aluno1.exibirInformacoes();
        aluno1.matricular();
        aluno1.exibirInformacoes();
        aluno1.trocarCurso("direito");
    }
}
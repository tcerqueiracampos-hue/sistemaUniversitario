public class Universidade{
    private String nome;
    private String curso;
    private boolean matricula;


    public Universidade(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
        this.matricula = true;
    }
    
    
    public void cancelarMatricula(){
        if(matricula) {
            matricula = false;
            System.out.println("não tem matricula!");
        }else{
            System.out.println("Sem vaga na turma");
        }
    }
        public void matricular(){
            matricula = true;
            System.out.println("está matriculado!");
        }

         public boolean estaMatriculado() {
        return matricula;
    }
        public void trocarCurso(String novoCurso){
            if(matricula) {
                this.curso = novoCurso;
                System.out.println("voce trocou de curso para de " + this.curso);
            }else{
                System.out.println("Não é possível trocar de curso porque o aluno não está matriculado.");
            }
        }

        public void exibirInformacoes(){
            System.out.println("nome do aluno: " + nome);
            System.out.println("curso: " + curso);
            System.out.println("status de matricula "+ matricula);
        }

    }
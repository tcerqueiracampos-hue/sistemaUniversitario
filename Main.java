import java.util.ArrayList; 
public class Main{
    public static void main (String[]args){
     ArrayList<Universidade> alunos = new ArrayList<>();

     Universidade aluno1 = new Universidade("Ana", "Psicologia");
     Universidade aluno2 = new Universidade("isa", "adm");
     Universidade aluno3 = new Universidade("Susy", "design");
     Universidade aluno4 = new Universidade("Noah", "desing");
     Universidade aluno5 = new Universidade("brino", "Psicologia");
     Universidade aluno6 = new Universidade("Gabriel", "adm");
     Universidade aluno7 = new Universidade("yasmin", "Psicologia");
       
     // aqui adiciona no sistema os alunos da universidade
     alunos.add(aluno1);
     alunos.add(aluno2);
     alunos.add(aluno3);
     alunos.add(aluno4);
     alunos.add(aluno5);
     alunos.add(aluno6);
     alunos.add(aluno7);
       
     System.out.println("");
     System.out.println("Sistema de Salas na Universidade");
     System.out.println("");
    
     // aqui o codigo abaixo lista e exibi as informações 
     System.out.println("Alunos de Psicologia: ");
     System.out.println("");
        for(Universidade aluno : alunos){
            if(aluno.getCurso().equals("Psicologia")){
              aluno.exibirInformacoes();
            }
        }
     // aqui cancelei a matricula
        aluno2.cancelarMatricula();
        aluno4.cancelarMatricula();
        System.out.println("---------------------------------");
        
     // aqui mostra os alunos com matricula ativa
        for(Universidade aluno : alunos){
            if(aluno.estaMatriculado()){
                aluno.exibirInformacoes();
            }
        }
        System.out.println("----------------------------------");
        System.out.println("alunos com matricula cancelada");
         System.out.println("----------------------------------");
       
     // esse é o oposto do anterior ele só mostra os que cancelaram
        for(Universidade aluno : alunos){
            if(!aluno.estaMatriculado()){
                aluno.exibirInformacoes();
            }
        }
        
     // variavel que conta quantos alunos tem do curso
        int quantidadePsicologia = 0;
       for(Universidade aluno : alunos){
           if(aluno.getCurso().equals("Psicologia")){
             quantidadePsicologia ++;
        }
       }

        System.out.println("Quantidade de alunos de Psicologia: " + quantidadePsicologia);
        System.out.println("---------------------------------");

        int quantidadeAdm = 0;
       for(Universidade aluno : alunos){
            if(aluno.getCurso().equals("adm")){
             quantidadeAdm ++;
        }
       }

        System.out.println("Quantidade de alunos em Adiministração: " + quantidadeAdm);
        System.out.println("---------------------------------");

        int quantidadeDesign = 0;
       for(Universidade aluno : alunos){
           if(aluno.getCurso().equals("design")){
             quantidadeDesign ++;
        }
       }

        System.out.println("Quantidade de alunos em Desing: " + quantidadeDesign);
        System.out.println("---------------------------------");

    }
}

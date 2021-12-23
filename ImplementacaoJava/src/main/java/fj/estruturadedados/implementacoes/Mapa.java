package fj.estruturadedados.implementacoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map< String , String> aluno = new HashMap<>();

        // criar alunos

        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "Noturna");

        System.out.println( "Mapa de Aluno : "+ aluno );

        // quais as chaves que tenho no Map aluno
        System.out.println( "Estrutura de  Aluno : "+ aluno.keySet() );

        // quais os valores  que tenho no Map aluno
        System.out.println( "Valores de  Aluno : "+ aluno.values() );

        // criar uma lista de maps de alunos
        List< Map< String , String> > listaAlunos  = new ArrayList<>();

        // criando novos alunos
        Map< String , String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "9.0");
        aluno2.put("Turma", "Noturna");

        // inserir alunos na lista
        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);
        System.out.println( "Lista  de  Aluno : "+ listaAlunos );

        // existe um determinado chave  ?
        System.out.println("Contem a chave ? : " + aluno.containsKey("Nome"));
        System.out.println("Contem a chave ? : " + aluno.containsValue("Joao"));







    }
}

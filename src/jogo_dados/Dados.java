/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo_dados;
import java.util.Random;

/**
 *
 * @author João Vitor
 */
public class Dados {
    // inicializa o objeto Random para gerar números aleatórios
    private Random random;

    // construtor da classe Dados, inicializa o objeto Random
    public Dados() {
        random = new Random();
    }

    // método para lançar os dados, retorna um array com os resultados
    public int[] lancarDados() {
        // cria um array para armazenar os resultados dos lançamentos dos dados
        int[] resultados = new int[2];

        // gera números aleatórios entre 1 e 6 para representar as faces dos dados
        resultados[0] = random.nextInt(6) + 1; // dado 1
        resultados[1] = random.nextInt(6) + 1; // dado 2

        // retorna o array com os resultados dos lançamentos dos dados
        return resultados;
    }

    // método para calcular a soma das faces dos dados
    public int somarFaces(int[] resultados) {
        // calcula a soma das faces dos dados
        int soma = resultados[0] + resultados[1];

        // retorna a soma das faces
        return soma;
    }

    // método para determinar o resultado com base na soma das faces dos dados
    public String[] resultado(int soma){
        // verifica se a soma das faces é igual a 7
        if(soma == 7){
            // se sim, retorna uma mensagem indicando que o jogador ganhou
            String[] mensagem = {"Ganhou", "Você ganhou."};
            return mensagem;
        } else {
            // se não, retorna uma mensagem indicando que o jogador perdeu
            // a mensagem é centralizada horizontalmente usando HTML e CSS
            String[] mensagem = {"Perdeu", "<html><div style='text-align: center;'>Você perdeu. Tente somar<br> 7 na próxima vez.</div></html>"};
            return mensagem;
        }
    }


}


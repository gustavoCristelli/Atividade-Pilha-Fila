import java.util.LinkedList;
import java.util.Queue;

public class gerenciadorSenhas {

    // Criação de uma Queue para armazenar as senhas; Int para controlar a próxima senha.
    private Queue<Integer> filaSenhas;
    private int proximaSenha;

    public gerenciadorSenhas() {
        // Inicializa a fila de senhas como uma LinkedList e a próxima senha como 1.
        this.filaSenhas = new LinkedList<>();
        this.proximaSenha = 1;
    }

    public int gerarSenha() {
        // Adiciona a próxima senha à fila.
        filaSenhas.add(proximaSenha);
        // Incrementa o contador da próxima senha e retorna a senha gerada.
        return proximaSenha++;
    }

    public Integer chamarProximo() {
        // Verifica se a fila de senhas não está vazia.
        if (!filaSenhas.isEmpty()) {
            // Remove e retorna a próxima senha da fila.
            return filaSenhas.poll();
        }
        // Se a fila estiver vazia, retorna null.
        return null;
    }

    public boolean filaVazia() {
        // Retorna true se a fila estiver vazia; False caso contrário.
        return filaSenhas.isEmpty();
    }

    // Método para reiniciar o sistema de senhas.
    public void reiniciarSenhas() {
        // Limpa a fila de senhas.
        this.filaSenhas.clear();
        // Reinicia o contador da próxima senha para 1.
        this.proximaSenha = 1;
    }

    public static void main(String[] args) {
        gerenciadorSenhas gerenciador = new gerenciadorSenhas();

        gerenciador.gerarSenha(); // Gera senha 1
        gerenciador.gerarSenha(); // Gera senha 2
        gerenciador.gerarSenha(); // Gera senha 3

        System.out.println(gerenciador.chamarProximo()); // Imprime 1
        System.out.println(gerenciador.chamarProximo()); // Imprime 2
        System.out.println(gerenciador.chamarProximo()); // Imprime 3
        System.out.println(gerenciador.chamarProximo()); // Imprime null

        gerenciador.reiniciarSenhas();

        gerenciador.gerarSenha(); // Gera senha 1 novamente
        System.out.println(gerenciador.chamarProximo()); // Imprime 1
    }
}
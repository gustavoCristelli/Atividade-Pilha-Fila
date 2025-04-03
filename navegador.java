import java.util.Stack;

public class navegador {

    //Criação de duas pilhas: Pilha Voltar e Pilha Avançar; Criação de uma string: Página atual
    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;
    private String paginaAtual;

    public navegador() {
        //Igualando as variáveis a null
        this.pilhaVoltar = new Stack<>();
        this.pilhaAvancar = new Stack<>();
        this.paginaAtual = null;
    }

    public void navegarPara(String url) {
        //Se a Página atual for diferente de null, paginaAtual é movida para pilhaVoltar 
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual);
        }
        //Se a Página atual for igual a null, paginaAtual = url
        paginaAtual = url;
        pilhaAvancar.clear();
        System.out.println("Navegando para: " + paginaAtual);
    }

    public void voltar() {
        //Garante que o código seja executado apenas se houver pelo menos uma página no histórico de navegação anterior
        if (!pilhaVoltar.isEmpty()) {
            //pilhaAvancar puxa o valor da Página atual
            pilhaAvancar.push(paginaAtual);
            //Página atual passa a ser o primeiro (pop) que estava na pilha anterior
            paginaAtual = pilhaVoltar.pop();
            System.out.println("Voltando para: " + paginaAtual);
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void avancar() {
        //Garante que o código seja executado apenas se houver pelo menos uma página no histórico avançar
        if (!pilhaAvancar.isEmpty()) {
            //pilhaVoltar puxa o valor da Página atual
            pilhaVoltar.push(paginaAtual);
            //Página atual passa a ser o primeiro (pop) que estava na pilha avançar
            paginaAtual = pilhaAvancar.pop();
            System.out.println("Avançando para: " + paginaAtual);
        } else {
            System.out.println("Não há páginas futuras.");
        }
    }

    public static void main(String[] args) {
        navegador navegador = new navegador();
        navegador.navegarPara("www.google.com");
        navegador.navegarPara("www.mozilla.org");
        navegador.navegarPara("www.wikipedia.org");
        navegador.avancar();
        navegador.voltar();
        navegador.avancar();
        navegador.voltar();
        navegador.voltar();
        navegador.voltar();
    }
}
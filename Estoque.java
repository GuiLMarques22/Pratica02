public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdminima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdminima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdminima = qtdminima;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdminima() {
        return qtdminima;
    }

    public void setQtdminima(int qtdminima) {
        this.qtdminima = qtdminima;
    }
    public void darBaixa(intqtde){
        qtdAtual = qtde;
    }
    public string mostra(){
        return "nome: " + nome + "\nQuantidade atual" +qtdAtual+ "\nQuantidade"
    }
    public boolean precisaRepor() {
        return qtdAtual = qtdMinima;
    }
    public void darBaixa(int qtde) {
        int novaQtd = this.qtdAtual - qtde;
        if (novaQtd < 0) {
            System.out.println("Não é possível dar baixa nessa quantidade. Estoque ficaria negativo.");
        } else {
            this.qtdAtual = novaQtd;

            public String mostra() {
                String infoEstoque = "Nome: " + this.nome + "\nQuantidade mínima: " + this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual;
                return infoEstoque;

                public boolean precisaRepor() {
                    return (this.qtdAtual <= this.qtdMinima);

}

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private int trabalhos;

    public Pessoa(String nome, int idade, float altura, int trabalhos) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.trabalhos = trabalhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }

    public void trabalhar(int trabalhos) {
        int trabalhosAtuais = getTrabalhos();
        setTrabalhos(trabalhosAtuais + trabalhos);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %s\nAltura: %s\nTrabalhos: %s\n", nome, idade, altura, trabalhos);
    }
}
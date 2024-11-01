public class Main {
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("Pedro", 20, 1.2F, 0);


        System.out.println(pedro);
        pedro.trabalhar(10);

        System.out.println(pedro.getTrabalhos());

        pedro.trabalhar(5);

        System.out.println(pedro.getTrabalhos());
    }
}
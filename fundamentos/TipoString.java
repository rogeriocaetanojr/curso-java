package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá, pessoal".charAt(2)); // .charAt mostra qual a letra no indice escolhido

        String s = "Boa noite";
        System.out.println(s.concat("!!!")); // .concat adicionando algo com concat
        System.out.println(s + "!!!!!!"); // adicionando sem concat
        System.out.println(s.startsWith("Boa")); // .startsWith inicia ou nao com a palavra "Boa" = true
        System.out.println(s.startsWith("boa")); // .startsWith inicia ou nao com a palavra "boa" = false
        System.out.println(s.toLowerCase().startsWith("boa")); // .toLowerCase().startsWith inicia ou nao com a palavra "boa" = true pois antes de saber foi transformado p lowercase
        System.out.println(s.length()); // para saber quantos caracteres tem uma string
        System.out.println(s.endsWith("noite")); // para ver se termina com noite a string
        System.out.println(s.equals("boa noite")); // .equals compara igualdade da variavel
        System.out.println(s.equalsIgnoreCase("Boa noite")); // .equalsIgnodeCase compara igualdade da variavel ignorando maiusculas ou minisculas

        var nome = "Rogério";
        var sobrenome = "Caetano";
        var idade = 26;
        var salario = 1000.00;

        System.out.printf("Meu nome é: %s %s tenho %s e meu salário é de R$%.2f ", nome, sobrenome, idade, salario); //printf para concatenar tudo e nao precisar fazer tudo na mao, puxando variaveis
    }
}

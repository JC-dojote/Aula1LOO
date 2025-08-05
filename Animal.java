import java.time.LocalDate;
public class Animal { 
    
    // Atributos da classe
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    String raca;
    String barulho;
    
    //Método para imprimir os atributos do animal
    public void printStatus(){
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Número de patas: " +numeroDePatas);
        System.out.println("Tem rabo? " +temRabo);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Genero: " + genero);
        System.out.println("O animal é da raça: " + raca);
        System.out.println("O som do animal é: " + barulho);
        System.out.println("------------------------------------------------");
    }
    
    //Método principal main
    public static void main(String[] args){
        //Criando o primeiro animal
        Animal cachorro = new Animal();
        cachorro.nomeAnimal = "Rubens";
        cachorro.numeroDePatas = 3;
        cachorro.temRabo = true;
        cachorro.cor = "Caramelo";
        cachorro.idade = 4;
        cachorro.tipoAlimentacao = "Ração";
        cachorro.genero = 'M';
        cachorro.raca = "Vira lata";
        cachorro.barulho = "Auu auu";
        
        
    
        Animal cavalo = new Animal();
        cavalo.nomeAnimal = "Ronaldo";
        cavalo.numeroDePatas = 4;
        cavalo.temRabo = true;
        cavalo.cor = "Castanho";
        cavalo.idade = 8;
        cavalo.tipoAlimentacao = "Ração";
        cavalo.genero = 'M';
        cavalo.raca = "Mustangue";
        cavalo.barulho = "e heee hee";
        
        
        Animal papagaio= new Animal();
        papagaio.nomeAnimal = "José";
        papagaio.numeroDePatas = 2;
        papagaio.temRabo = true;
        papagaio.cor = "Verde";
        papagaio.idade = 4;
        papagaio.tipoAlimentacao = "Sementes";
        papagaio.genero = 'M';
        papagaio.raca = "Papagaio verdadeiro";
        papagaio.barulho = "curupaco paco";
        
        //Chamando os métodos para imprimir os atributos
        cachorro.printStatus();
        cavalo.printStatus();
        papagaio.printStatus();
    
    
    }
    
    
}
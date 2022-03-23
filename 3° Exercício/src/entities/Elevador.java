package entities;

public class Elevador {

    //Atributos
    private int terreo, totalAndares, capacidadeElevador, quantidadePessoas;


    //Método Construtor
    public Elevador(int totalAndares, int capacidadeElevador, int quantidadePessoas) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadePessoas = quantidadePessoas;
    }

    //Sobrecarga
    public Elevador(int capacidadeElevador, int quantidadePessoas) {
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadePessoas = quantidadePessoas;
    }


    //Métodos de acesso set e get

    //Terreo
    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getTerreo() {
        return this.terreo;
    }

    //Total Andares
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    //Capacidade Elevador
    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getCapacidadeElevador() {
        return this.capacidadeElevador;
    }

    //Quantidade Pessoas
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadePessoas() {
        return this.quantidadePessoas;
    }


    //Métodos

    //Inicializar
    public int inicializa(int capacidadeElevador, int totalAndares) {
        this.terreo = 0;
        System.out.println("Inicializando o Elevador");
        System.out.println("Andar Terreo: " + this.terreo + "\n");
        return terreo;
    }

    //Entrar
    public int entra(int pessoas) {
        pessoas += this.quantidadePessoas;
        if (pessoas <= this.capacidadeElevador) {
            System.out.println("Total de pessoas dentro do Elevador: " + pessoas + "\n");
        } else {
            System.out.println("Capacidade maxíma do Elevador é: " + this.capacidadeElevador);
        }
        return pessoas;
    }

    //Sair
    public int sai(int pessoas) {
        pessoas = this.quantidadePessoas - pessoas;
        if (pessoas > 0) {
            System.out.println("Total de pessoas dentro do Elevador: " + pessoas + "\n");
        } else {
            System.out.println("Não tem ninguem no elevador\n");
        }

        return this.quantidadePessoas;
    }

    //Subir
    public int sobe() {

        if (this.terreo < this.totalAndares) {
            System.out.println("Elevador Subindo");
            this.terreo++;
            System.out.println(this.terreo + "° Andar\n");
        }else{
            System.out.println("Este é o ultimo andar");
        }
        return this.terreo;
    }

    //Descer
    public int desce() {
        if (this.terreo > 0) {
            System.out.println("Elevador Descendo");
            this.terreo--;
            System.out.println(this.terreo + "° Andar\n");
        }else {
            System.out.println("Este é o andar Terreo");
        }

        return this.terreo;
    }
}

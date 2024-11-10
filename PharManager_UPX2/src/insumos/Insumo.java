package insumos;

import java.time.LocalDate;

abstract class Insumo {
    protected String nome;
    protected String material;
    protected String uso;
    protected String tamanhoCapacidade;
    protected LocalDate dataDeValidade;
    protected String fabricante;
    protected String esterilizacao;
    protected String categoria;

    public Insumo(String nome, String material, String uso, String tamanhoCapacidade, LocalDate dataDeValidade, 
                  String fabricante, String esterilizacao, String categoria) {
        this.nome = nome;
        this.material = material;
        this.uso = uso;
        this.tamanhoCapacidade = tamanhoCapacidade;
        this.dataDeValidade = dataDeValidade;
        this.fabricante = fabricante;
        this.esterilizacao = esterilizacao;
        this.categoria = categoria;
    }

    public abstract void exibirInformacoes();
}

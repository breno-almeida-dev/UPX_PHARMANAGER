package insumos;

import java.time.LocalDate;

class Luva extends Insumo {
    private String tipoMaterial;
    private boolean esteril;
    private String tipoUso;

    public Luva(String nome, String material, String uso, String tamanhoCapacidade, LocalDate validade,
                String fabricante, String esterilizacao, String categoria, String tipoMaterial, boolean esteril, String tipoUso) {
        super(nome, material, uso, tamanhoCapacidade, validade, fabricante, esterilizacao, categoria);
        this.tipoMaterial = tipoMaterial;
        this.esteril = esteril;
        this.tipoUso = tipoUso;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Material: " + material + ", Esterilização: " + esterilizacao +
                           ", Tipo de material: " + tipoMaterial + ", Tipo de uso: " + tipoUso);
    }
}

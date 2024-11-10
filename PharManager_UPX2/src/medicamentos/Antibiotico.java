package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Antibiotico extends Medicamento {
    private String espectroDeAcao; // Amplo ou estreito
    private String tipoBacteriaAlvo; // Gram-positiva ou Gram-negativa
    private String resistenciaBacteriana; // Sensível ou resistente

    public Antibiotico(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao, 
                       String espectroDeAcao, String tipoBacteriaAlvo, String resistenciaBacteriana) {
        super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, 
              fabricante, efeitosColaterais, indicacao);
        this.espectroDeAcao = espectroDeAcao;
        this.tipoBacteriaAlvo = tipoBacteriaAlvo;
        this.resistenciaBacteriana = resistenciaBacteriana;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Espectro de ação: " + espectroDeAcao + 
                           ", Tipo de bactéria alvo: " + tipoBacteriaAlvo + ", Resistência: " + resistenciaBacteriana);
    }

}
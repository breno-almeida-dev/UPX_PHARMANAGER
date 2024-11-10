package medicamentos;

import java.time.LocalDate;
import java.util.List;

public class Antidepressivo extends Medicamento {
	private String tipo; // Esteroidal ou não esteroidal (AINE).
	private String neurotransmissorAfetado; // Redução de dor, inflamação ou ambos.
	
	public Antidepressivo(String nome, String categoria, List<String> composicao, int dosagem, String viaDeAdministracao,
            LocalDate dataDeValidade, String fabricante, List<String> efeitosColaterais, String indicacao,
            String tipo, String neurotransmissorAfetado) {
		super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
		this.tipo = tipo;
		this.neurotransmissorAfetado = neurotransmissorAfetado;
	}
	
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Categoria: " + categoria + ", Tipo: " + tipo + ", Neurotransmissor afetado: " + neurotransmissorAfetado);
    }
}

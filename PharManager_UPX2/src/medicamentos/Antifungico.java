package medicamentos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Antifungico extends Medicamento {
    private String tipoDeFungo;
    private String localDeAplicacao;

    public Antifungico(String nome, String categoria, List<String> composicao, int dosagem, 
                       String viaDeAdministracao, LocalDate dataDeValidade, String fabricante, 
                       List<String> efeitosColaterais, String indicacao, String tipoDeFungo, 
                       String localDeAplicacao) {
        super(nome, categoria, composicao, dosagem, viaDeAdministracao, dataDeValidade, fabricante, efeitosColaterais, indicacao);
        this.tipoDeFungo = tipoDeFungo;
        this.localDeAplicacao = localDeAplicacao;
    }

    @Override
    public void inserirDados(Connection conexao) throws SQLException {
        String sqlMedicamento = "INSERT INTO medicamentos (nome, categoria, dosagem, viaDeAdministracao, dataDeValidade, fabricante, indicacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlAntifungico = "INSERT INTO antifungicos (tipoDeFungo, localDeAplicacao) VALUES (?, ?)";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAntifungico = conexao.prepareStatement(sqlAntifungico)) {
            
            // Inserir dados na tabela medicamentos
            stmtMedicamento.setString(1, getNome());
            stmtMedicamento.setString(2, getCategoria());
            stmtMedicamento.setInt(3, getDosagem());
            stmtMedicamento.setString(4, getViaDeAdministracao());
            stmtMedicamento.setObject(5, getDataDeValidade());
            stmtMedicamento.setString(6, getFabricante());
            stmtMedicamento.setString(7, getIndicacao());
            stmtMedicamento.executeUpdate();

            // Inserir dados na tabela antifungicos
            stmtAntifungico.setString(1, tipoDeFungo);
            stmtAntifungico.setString(2, localDeAplicacao);
            stmtAntifungico.executeUpdate();
        }
    }

    @Override
    public void atualizarDados(Connection conexao, int id) throws SQLException {
        String sqlMedicamento = "UPDATE medicamentos SET nome = ?, categoria = ?, dosagem = ?, viaDeAdministracao = ?, dataDeValidade = ?, fabricante = ?, indicacao = ? WHERE id = ?";
        String sqlAntifungico = "UPDATE antifungicos SET tipoDeFungo = ?, localDeAplicacao = ? WHERE id = ?";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAntifungico = conexao.prepareStatement(sqlAntifungico)) {
            
            // Atualizar dados na tabela medicamentos
            stmtMedicamento.setString(1, getNome());
            stmtMedicamento.setString(2, getCategoria());
            stmtMedicamento.setInt(3, getDosagem());
            stmtMedicamento.setString(4, getViaDeAdministracao());
            stmtMedicamento.setObject(5, getDataDeValidade());
            stmtMedicamento.setString(6, getFabricante());
            stmtMedicamento.setString(7, getIndicacao());
            stmtMedicamento.setInt(8, id);
            stmtMedicamento.executeUpdate();

            // Atualizar dados na tabela antifungicos
            stmtAntifungico.setString(1, tipoDeFungo);
            stmtAntifungico.setString(2, localDeAplicacao);
            stmtAntifungico.setInt(3, id);
            stmtAntifungico.executeUpdate();
        }
    }

    @Override
    public void deletarDados(Connection conexao, int id) throws SQLException {
        String sqlMedicamento = "DELETE FROM medicamentos WHERE id = ?";
        String sqlAntifungico = "DELETE FROM antifungicos WHERE id = ?";

        try (PreparedStatement stmtMedicamento = conexao.prepareStatement(sqlMedicamento);
             PreparedStatement stmtAntifungico = conexao.prepareStatement(sqlAntifungico)) {
            
            // Deletar dados na tabela medicamentos
            stmtMedicamento.setInt(1, id);
            stmtMedicamento.executeUpdate();

            // Deletar dados na tabela antifungicos
            stmtAntifungico.setInt(1, id);
            stmtAntifungico.executeUpdate();
        }
    }

    @Override
    public void lerDados(Connection conexao) throws SQLException {
        String sql = "SELECT m.*, a.tipoDeFungo, a.localDeAplicacao FROM medicamentos m JOIN antifungicos a ON m.id = a.id";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Categoria: " + rs.getString("categoria"));
                System.out.println("Tipo de Fungo: " + rs.getString("tipoDeFungo"));
                System.out.println("Local de Aplicação: " + rs.getString("localDeAplicacao"));
            }
        }
    }
}
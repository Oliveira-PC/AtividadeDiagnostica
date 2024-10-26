package Atividade1;

public class Professor extends Pessoa {
    private int siape;

    public Professor(String nome, String cpf, String endereco, String telefone, int siape) {
        super(nome, cpf, endereco, telefone);
        this.siape = siape;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor " + getNome() + " - Cpf: " + getCpf() + " - End. " + getEndereco() +
                " - Tel.: " + getTelefone() + ". SIAPE: " + siape);
    }
}

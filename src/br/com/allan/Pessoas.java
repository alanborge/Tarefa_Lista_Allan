package br.com.allan;

/**
 * @author  Allan Borges
 */
public class Pessoas implements Comparable<Pessoas> {
    private String nome;
    private String sexo;

    public Pessoas() {
    }
    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String setSexo(String sexo) {
        this.sexo = sexo;
        return sexo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "br.com.allan.Pessoas{" +
                "nome='" + nome + '\'' +
                " ; sexo='" + sexo + '\'' +
                '}' + "\n";
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoas)) return false;

        Pessoas pessoas = (Pessoas) o;

        if (getNome() != null ? !getNome().equals(pessoas.getNome()) : pessoas.getNome() != null) return false;
        return getSexo() != null ? getSexo().equals(pessoas.getSexo()) : pessoas.getSexo() == null;
    }

    /**
     *
     * @return sobreescrita do hash
     */
    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getSexo() != null ? getSexo().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Pessoas pessoas) {
        return this.nome.compareTo(pessoas.getNome());
    }
}

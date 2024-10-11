package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.table;

@Entity
@Table(name = "categorias")
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = True, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos = new HashSet

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(Spring nome) {
        this.nome = nome;
    }

    public Set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<jogo> jogos) {
        this.jogos = jogos
    }
}

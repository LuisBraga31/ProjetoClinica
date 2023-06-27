package checkpoint;

import java.util.ArrayList;

public class Dono {

    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Animal> animais;

    public Dono(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }
}

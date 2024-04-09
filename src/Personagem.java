public class Personagem {
    private String nome; // Atributo para o nome do personagem
    private String classe; // Atributo para a classe do personagem
    private int hp; // Atributo para os pontos de vida (HP)
    private int mana; // Atributo para os pontos de mana
    private int nivel; // Atributo para o nível do personagem
    private String habilidades; // Atributo para as habilidades do personagem

    // Construtor para criar um personagem com nome e classe
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.hp = 100; // Pontos de vida iniciais
        this.mana = 50; // Pontos de mana iniciais
        this.nivel = 1; // Começamos no nível 1
        this.habilidades = "Ataque básico"; // Habilidades iniciais
    }

    // Método para exibir informações do personagem
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("Nível: " + nivel);
        System.out.println("Habilidades: " + habilidades);
    }

    // Método para atualizar o nível do personagem
    public void subirNivel() {
        nivel++;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }
    
    // Métodos para obter informações do personagem
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getNivel() {
        return nivel;
    }

    public String getHabilidades() {
        return habilidades;
    }
}
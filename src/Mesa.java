import javax.swing.JOptionPane;

public class Mesa {
    public static void main(String[] args) throws Exception {
         // Criando um personagem
         Personagem Personagem1 = new Personagem("Aragorn", "Guerreiro");

         // Exibindo informações
         Personagem1.exibirInfo();
 
          // Criando um cenário de aventura
        String nomeCenario = JOptionPane.showInputDialog("Digite o nome do cenário:");
        String descricaoCenario = JOptionPane.showInputDialog("Descreva o cenário:");

        // Criando um NPC (personagem não jogável)
        String nomeNPC = JOptionPane.showInputDialog("Digite o nome do NPC:");
        String descricaoNPC = JOptionPane.showInputDialog("Descreva o NPC:");

        // Criando um conflito
        String conflito = JOptionPane.showInputDialog("Digite um conflito:");

        // Apresentando a narrativa
        JOptionPane.showMessageDialog(null,
                "Bem-vindos ao cenário de " + nomeCenario + "!\n\n" +
                "Descrição do cenário:\n" + descricaoCenario + "\n\n" +
                "Vocês encontram " + nomeNPC + ", um " + descricaoNPC + ". Ele diz:\n" +
                "\"Preparem-se para o seguinte desafio: " + conflito + "\"");

                boolean continuarJogo = true;
                int hp = 100; // Pontos de vida iniciais
    
                JOptionPane.showMessageDialog(null, "Bem-vindo à Floresta Sombria!");
        
                while (continuarJogo) {
                    String escolhaTexto = JOptionPane.showInputDialog(
                            "Você está em uma clareira. O que deseja fazer?\n" +
                            "1. Andar mais fundo na floresta\n" +
                            "2. Investigar a árvore à sua direita\n" +
                            "3. Descansar\n" +
                            "4. Sair do jogo");
        
                    int escolha = Integer.parseInt(escolhaTexto);
                    switch (escolha) {
                        case 1:
                            int escolhaTrilha = JOptionPane.showConfirmDialog(null, "Você encontrou uma trilha sinuosa. Continuar?");
                            if (escolhaTrilha == JOptionPane.YES_OPTION) {
                                JOptionPane.showMessageDialog(null, "Você se perdeu na floresta. Fim de jogo!");
                                continuarJogo = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Você voltou para a clareira.");
                            }
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Você encontrou um dragão!");
                            Personagem1.subirNivel();
                            int escolhaDragao = JOptionPane.showConfirmDialog(null,
                                    "1. Lutar contra o dragão\n" +
                                    "2. Fugir");
                            if (escolhaDragao == JOptionPane.YES_OPTION) {
                                int danoDragao = 20; // Dano do dragão
                                hp -= danoDragao;
                                JOptionPane.showMessageDialog(null, "Você foi atingido pelo dragão e perdeu " + danoDragao + " de HP.");
                                Personagem1.subirNivel();
                                if (hp <= 0) {
                                    JOptionPane.showMessageDialog(null, "Seu HP chegou a zero. Fim de jogo!");
                                    continuarJogo = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Você derrotou o dragão! Parabéns!");
                                    Personagem1.subirNivel();
                                    continuarJogo = false;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Você fugiu do dragão.");
                            }
                            break;
                        case 3:
                            hp += 10; // Recuperação de HP
                            JOptionPane.showMessageDialog(null, "Você descansou e recuperou HP. Seu HP atual: " + hp);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Até logo! Obrigado por jogar.");
                            continuarJogo = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                                    }
                                }
                }
}

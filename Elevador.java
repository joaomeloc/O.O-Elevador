public class Elevador {
      int capacidade;
      int totalAndares;
      int andarAtual;
      int numPessoas;

      public Elevador(int capacidade, int totalAndares) {
          this.capacidade = capacidade;
          this.totalAndares = totalAndares;
          this.andarAtual = 0;  
          this.numPessoas = 0;  
      }

      public void entrar() {
          if (numPessoas < capacidade) {
              numPessoas++;
              System.out.println("Uma pessoa entrou no elevador.");
          } else {
              System.out.println("O elevador está lotado.");
          }
      }

      public void sair() {
          if (numPessoas > 0) {
              numPessoas--;
              System.out.println("Uma pessoa saiu do elevador.");
          } else {
              System.out.println("O elevador está vazio.");
          }
      }

      public void subir() {
          if (andarAtual < totalAndares) {
              andarAtual++;
              System.out.println("Elevador subiu para o andar " + andarAtual);
          } else {
              System.out.println("O elevador está no último andar.");
          }
      }

      public void descer() {
          if (andarAtual > 0) {
              andarAtual--;
              System.out.println("Elevador desceu para o andar " + andarAtual);
          } else {
              System.out.println("O elevador está no térreo.");
          }
      }
  }
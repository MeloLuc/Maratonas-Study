package livro_EntAlgoritmos_Aditya;

import java.util.ArrayList;
import java.util.List;

public class RecursaoExemploCaixas {

    public interface Item {
        boolean eUmaCaixa();
        boolean eUmaChave();
    }

    public static class Chave implements Item {

        @Override
        public boolean eUmaCaixa() {
            return false; // Não é uma caixa
        }

        @Override
        public boolean eUmaChave() {
            return true; // Sim, é uma chave
        }

    }

    public static class Caixa implements Item, Iterable<Item> {
        private List<Item> itensDentroDaCaixa = new ArrayList<>();

        public void adicionarItem(Item item) {
            this.itensDentroDaCaixa.add(item);
        }

        @Override
        public boolean eUmaCaixa() {
            return true; // Sim, é uma caixa
        }

        @Override
        public boolean eUmaChave() {
            return false; // Não é uma chave
        }

        // Isso permite usar 'for (var item : caixa)'
        @Override
        public java.util.Iterator<Item> iterator() {
            return this.itensDentroDaCaixa.iterator();
        }
    }

    public static void procurePelaChave(Caixa caixa) {
        for (Item item : caixa) {
            if(item.eUmaCaixa()) {
                procurePelaChave((Caixa) item);
            }
            else if (item.eUmaChave()) {
                System.out.println("Achei a chave!");
            }
        }
    }

    public static void main(String[] args) {

        // caixa principal
        Caixa caixaPrincipal = new Caixa();

        // 5 caixas que vão dentro da principal
        Caixa caixaA = new Caixa();
        Caixa caixaB = new Caixa();
        Caixa caixaC = new Caixa(); // <- A chave estará dentro desta
        Caixa caixaD = new Caixa();
        Caixa caixaE = new Caixa();

        caixaPrincipal.adicionarItem(caixaA);
        caixaPrincipal.adicionarItem(caixaB);
        caixaPrincipal.adicionarItem(caixaC);
        caixaPrincipal.adicionarItem(caixaD);
        caixaPrincipal.adicionarItem(caixaE);

        caixaA.adicionarItem(new Caixa());
        caixaB.adicionarItem(new Caixa());
        caixaB.adicionarItem(new Caixa());
        caixaD.adicionarItem(new Caixa());
        caixaE.adicionarItem(new Caixa());


        Caixa caixaC_nivel1 = new Caixa();
        caixaC.adicionarItem(caixaC_nivel1);

        Caixa caixaC_nivel2 = new Caixa();
        caixaC_nivel1.adicionarItem(caixaC_nivel2);

        // (Aqui está a chave)
        Caixa caixaC_nivel3_comChave = new Caixa();
        caixaC_nivel2.adicionarItem(caixaC_nivel3_comChave);

        Chave chave = new Chave();
        caixaC_nivel3_comChave.adicionarItem(chave);

        procurePelaChave(caixaPrincipal);

        System.out.println("--- Busca terminada. ---");
    }

}

/* Os loops podem melhorar o desempenho do seu programa. A recursão melhora o desempenho do seu programador.
Escolha o que for mais importante para a sua situação -Leigh Caldwell
 */

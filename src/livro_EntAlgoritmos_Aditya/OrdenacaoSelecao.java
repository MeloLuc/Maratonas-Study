package livro_EntAlgoritmos_Aditya;

import java.util.ArrayList;

public class OrdenacaoSelecao {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(9);
        arr.add(2);
        arr.add(1);
        System.out.println("Lista: " + arr);
        System.out.println("Lista ordenada: " + ordenacaoSelecao(arr));

    }

    public static ArrayList<Integer> ordenacaoSelecao (ArrayList<Integer> arr) {
        ArrayList<Integer> novoArr = new ArrayList<>();
        int tamanhoArray = arr.size();
        for (int i = 0; i < tamanhoArray; i++) {
            int menor = buscaMenor(arr);
            novoArr.add(arr.remove(menor));
        }
        return novoArr;
    }

    public static int buscaMenor (ArrayList<Integer> arr) {
        int menor_indice = 0;
        int menor = arr.get(menor_indice);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < menor) {
                menor_indice = i;
                menor = arr.get(i);
            }
        }
        return menor_indice;
    }

}

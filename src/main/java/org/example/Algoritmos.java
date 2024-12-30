package org.example;

import java.util.ArrayList;
import java.util.List;

public class Algoritmos {
    public boolean verificaNumeroPrimo(Integer numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> retornaQuantidadeDeNumerosPrimos(Integer quantidade) {
        List<Integer> primos = new ArrayList<>();
        Integer contador = 0;
        for (int i = 2; contador <= quantidade; i++) {
            if (verificaNumeroPrimo(i)) {
                primos.add(i);
                contador++;
            }
        }
        return primos;
    }

    public List<Integer> retornaTodosNumerosPrimosAtéOCriterioDeParada(Integer numero) {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            if (verificaNumeroPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    public List<Integer> numerosDaSequenciaDeFibonacci(Integer quantidade) {
        int primeiro = 0;
        int segundo = 1;
        int swap = 0;
        List<Integer> numerosFibonacci = new ArrayList<>(quantidade);
        numerosFibonacci.add(primeiro);
        numerosFibonacci.add(segundo);

        for (int i = 0; i < quantidade - 2; i++) {
            swap = primeiro;
            primeiro = segundo;
            segundo = swap + primeiro;
            numerosFibonacci.add(segundo);
        }

        return numerosFibonacci;
    }

    public List<Integer> swapList(List<Integer> list) {
        Integer swap = list.get(0);

        list.set(0, list.get(1));
        list.set(1, swap);

        return list;
    }

    public List<Integer> numerosDaSequenciaDeFibonacci2(Integer quantidade) {
        List<Integer> numerosFibonacci = new ArrayList<>(quantidade);
        numerosFibonacci.add(0);
        numerosFibonacci.add(1);

        for (int i = 0; i < quantidade - 2; i++) {
            int primeiro = numerosFibonacci.get(i);
            int segundo = numerosFibonacci.get(i + 1);
            numerosFibonacci.add(primeiro + segundo);
        }

        return numerosFibonacci;
    }

    public String inverteString(String palavra) {
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            char c = palavra.charAt(i);
            palavraInvertida += String.valueOf(c);
        }
        return palavraInvertida;
    }

    public String inverteString2(String palavra) {

        String swap = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            char c = palavra.charAt(i);
            swap += c;

        }
        palavra = swap;
        return palavra;
    }

    public Integer maiorElemento(List<Integer> list) {
        Integer maior = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maior) {
                maior = list.get(i);
            }
        }
        return maior;
    }

    public Integer menorElemento(List<Integer> list) {
        Integer menor = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < menor) {
                menor = list.get(i);
            }
        }
        return menor;
    }

    public List<Integer> inverterLista(List<Integer> list) {

        Integer swap;
        for (int i = list.size() - 1, j = 0; i >= list.size() / 2; i--, j++) {
            swap = list.get(j);
            list.set(j, list.get(i));
            list.set(i, swap);
        }
        return list;
    }

    public List<Integer> inverterLista3(List<Integer> list) {
        int i = list.size() - 1, j = 0;

        while (i >= list.size() / 2) {
            var swap = list.get(j);
            list.set(j, list.get(i));
            list.set(i, swap);

            i--;
            j++;
        }
        return list;
    }

    public List<Integer> inverteLista2(List<Integer> list) {
        Integer contador = 0;
        Integer swap;
        for (int i = list.size() - 1; i > list.size() / 2; i--) {
            swap = list.get(contador);
            list.set(contador, list.get(i));
            list.set(i, swap);
            contador++;
        }
        return list;
    }

    public Integer[] inverteArray(Integer[] array) {
        for (int i = 0, j = array.length - 1; i <= array.length / 2; i++, j--) {
            Integer swap = array[i];
            array[i] = array[j];
            array[j] = swap;
        }
        return array;
    }

    public Integer somarElementos(List<Integer> list) {
        Integer soma = 0;
        for (int i = 0; i < list.size(); i++) {
            soma += list.get(i);
        }
        return soma;
    }

    public String concatenarListaDeChar(List<Character> list) {
        String palavra = "";
        for (int i = 0; i < list.size(); i++) {
            palavra += String.valueOf(list.get(i));
        }
        return palavra;
    }

    public Integer retornaValorDaPorcentagem(Integer valor, Integer porcentagem) {
        return porcentagem * valor / 100;
    }


    public Boolean verificaSeEpalindromo(String palavra) {
        String s = palavra.toLowerCase()
                .replace(" ", "");

        for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public String[] split(String texto, Character character) {
        String palavra = "";
        String[] array = new String[3];
        int contador = 0;

        for (int i = 0; i <= texto.length() - 1; i++) {
            if (texto.charAt(i) != character) {
                palavra += texto.charAt(i);
            }
            if (texto.charAt(i) == character || i == texto.length() - 1) {
                array[contador] = palavra;
                contador++;
                palavra = "";
            }
        }
        return array;
    }

    public Boolean eAnagrama(String palavra1, String palavra2) {

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();
        String letrasIguais = "";

        if (letras1.length != letras2.length) {
            return false;
        }

        for (int i = 0; i <= letras1.length - 1; i++) {
            for (int j = 0; j <= letras2.length - 1; j++) {
                if (letras1[i] == letras2[j]) {
                    letrasIguais += letras1[i];
                    letras2[j] = ' ';
                    break;
                }
            }
        }
        if (letrasIguais.length() == palavra2.length()) {
            return true;
        }
        return false;
    }

    public Boolean eAnagrama2(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        var letras = new ArrayList<Character>();
        for (char letra : palavra1.toCharArray()) {
            letras.add(letra);
        }

        for (char letra : palavra2.toCharArray()) {
            letras.remove(Character.valueOf(letra));
        }

        return letras.isEmpty();
    }

    public Boolean eAnagrama3(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()){
            return false;
        }

        List<Character> letras1 = new ArrayList<>();
        List<Character> letras2 = new ArrayList<>();
        List<Character> letrasIguais = new ArrayList<>();

        for (int i = 0; i <= palavra1.length() - 1; i++) {
            letras1.add(palavra1.charAt(i));
            letras2.add(palavra2.charAt(i));
        }

        for (int i = 0; i <= letras1.size()-1; i++) {
            for (int j = 0; j <= letras2.size()-1; j++) {
                if (letras1.get(i) == letras2.get(j)) {
                    letrasIguais.add(letras1.get(i));
                    letras2.remove(j);
                    break;
                }
            }
        }

        if (palavra1.length() == letrasIguais.size()) {
            return true;
        }
        return false;
    }
}

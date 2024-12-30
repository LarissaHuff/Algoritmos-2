package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Algoritmos algoritmos = new Algoritmos();

        String palavra1 = "asco";
        String palavra2 = "caso";

        Boolean eAnagrama3 = algoritmos.eAnagrama3(palavra1, palavra2);
        System.out.println(eAnagrama3);

        //Boolean eAnagrama = algoritmos.eAnagrama2(palavra1, palavra2);
        //System.out.println(eAnagrama);

        //String[] strings = algoritmos.split("andei muito ontem", ' ');

        //for (String string : strings) {
        //    System.out.println(string);
        // }

        //Subi no oNIBUs
        //Boolean aBoolean = algoritmos.verificaSeEpalindromo("CartoLa");
        //System.out.println(aBoolean);

        //nteger valorDaPorcentagem = algoritmos.retornaValorDaPorcentagem(70, 20);

        //System.out.println(valorDaPorcentagem);

        /*List<Integer>numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Integer[]array = new Integer[4];
        array[0] = 3;
        array[1] = 7;
        array[2] = 1;
        array[3] = 9;

        List<Character>list = new ArrayList<>();
        list.add('b');
        list.add('a');
        list.add('l');
        list.add('a');*/

        //System.out.println(list);

        //String s = algoritmos.concatenarListaDeChar(list);
        //System.out.println(s);


        //Integer[] arrayInvertido = algoritmos.inverteArray(array);

        //Integer soma = algoritmos.somarElementos(numeros);
        //System.out.println(soma);


        //for (int i = 0; i <arrayInvertido.length; i++) {
        //    System.out.println(arrayInvertido[i]);}


        //List<Integer> listaInvertida = algoritmos.inverterLista(numeros);
        //System.out.println(listaInvertida);


        //Integer integer = algoritmos.menorElemento(numeros);
        //System.out.println(integer);

        //String palavra = "larissa";

        //String s = algoritmos.inverteString2(palavra);
        //System.out.println(s);

        //List<Integer> list = algoritmos.numerosDaSequenciaDeFibonacci2(10);
        //System.out.println(list);

        //Boolean verificaNumeroPrimo = numeroPrimoOuNao.verificaNumeroPrimo(11);

        //List<Integer> numerosPrimos = numeroPrimoOuNao.retornaQuantidadeDeNumerosPrimos(5);
        //System.out.println(numerosPrimos);

        //System.out.println(verificaNumeroPrimo);



        /*List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("0 ");
            }
            System.out.print("\n");
        }

        int[][] matriz = new int[4][4];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = 9;
            }
        }

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print(" (" + j + " , " + i+ ") " + matriz[j][i]) ;
            }
            System.out.print("\n");
        }

    }*/
    }
}
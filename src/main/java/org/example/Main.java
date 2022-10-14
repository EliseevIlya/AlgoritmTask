package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> linkedList = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        //0 стоп слово
        // первое решение (оптимальное)
        while(nNumber !=0){
            linkedList.add(nNumber);
            sNumber = reader.readLine();
            nNumber = Integer.parseInt(sNumber);
        }
        int result=0;
        for(int number : linkedList){
            result ^=number;
        }
        System.out.println(result);
        // второе решение ( оптимизация 1 если ввод с клавиатуры)
        /*int result=nNumber;
        while(nNumber !=0){
            sNumber = reader.readLine();
            nNumber = Integer.parseInt(sNumber);
            result ^= nNumber;
        }
        System.out.println(result);*/


        //3 решение
        /*while(nNumber !=0){
            linkedList.add(nNumber);
            sNumber = reader.readLine();
            nNumber = Integer.parseInt(sNumber);
        }
        for(int number : linkedList){
            if (linkedList.indexOf(number) == linkedList.lastIndexOf(number)) {
                System.out.println(number);
            }
        }*/

        //4 решение
        /*int count=0,index =0;
        while(nNumber !=0){
            linkedList.add(nNumber);
            sNumber = reader.readLine();
            nNumber = Integer.parseInt(sNumber);
        }
        for (int i =0; i< linkedList.size(); i++){
            count=0;
            for (int j = 0; j<linkedList.size(); j++){
                if (i != j && linkedList.get(i)==linkedList.get(j)){
                    count++;
                    linkedList.remove(j);
                    linkedList.remove(i);
                }
            }
        }
        System.out.println(linkedList.getFirst());*/

    }
}

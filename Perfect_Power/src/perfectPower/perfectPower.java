/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectPower;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ömer Faruk KAAN
 */
public class perfectPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> sayilar = new ArrayList();

        Scanner s = new Scanner(System.in);
        System.out.println("Perfect Power için sınır değer giriniz...");
        int girilen = s.nextInt();

        boolean bittiMi = true;
        boolean devamEt = true;

        int kuvvet = 2, carpim = 1, sayi = 2, count = 0;

        while (devamEt == true) {
            while (bittiMi == true) {
                for (int k = 0; k < kuvvet; k++) {
                    carpim = carpim * sayi;
                }
                if (carpim <= girilen) {
                    count++;
                    sayilar.add(carpim);
                    System.out.println(carpim);
                    sayi++;
                    carpim = 1;
                } else {
                    bittiMi = false;
                }
            }
            kuvvet++;
            sayi = 2;
            carpim = 1;
            bittiMi = true;
            if (count == 0) {
                devamEt = false;
            }
            count = 0;
        }
        for (Integer integer : sayilar) {
            for (int i = 0; i < sayilar.size(); i++) {
                if (integer - sayilar.get(i) == 1) {
                    System.out.println("perfect powers :" + sayilar.get(i) + "-" + integer);
                }
            }
        }
    }
}

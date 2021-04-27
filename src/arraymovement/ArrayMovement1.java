package arraymovement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class ArrayMovement1 {

    /*
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        5, 1, 2, 3, 4
        4, 5, 1, 2, 3
        3, 4, 5, 1, 2
        2, 3, 4, 5, 1
        atspausdinti
     */
    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4, 5}; //5
        int temp;
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------");
        while (k < m.length - 1) {

            temp = m[m.length - 1];
            for (int i = m.length - 1; i > 0; i--) {
                m[i] = m[i - 1];
            }
            m[0] = temp;
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i] + " ");

            }
            System.out.println();
            k++;
        }

    }
}

import com.sun.jmx.snmp.SnmpStatusException;

import java.util.Scanner;

/**
 * Created by admin on 21.07.2017.
 */
public class TaskArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int arrayLength = in.nextInt();
        in.nextLine();

        int[] arrayData = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.println("Введите элемент массива: ");
            arrayData[i] = in.nextInt();
            in.nextLine();
        }

        System.out.println("Значения массива:");
        for (int el: arrayData
             ) {
            System.out.println(el);
        }
    }
}

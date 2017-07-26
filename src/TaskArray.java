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

        int maxValue = maxArrayValue(arrayData);
        int minValue = minArrayValue(arrayData);
        int coutRepeat = coutRepeat5(arrayData);

        System.out.println("Минимальное значения массива: " + minValue);
        System.out.println("Максимальное значения массива: " + maxValue);
        System.out.println("Количество повторений числа 5: " + coutRepeat);

        bubleSortMax(arrayData);
        System.out.println("");
        bubleSortMin(arrayData);

    }

    public static int maxArrayValue(int[] arrayData){

        int maxValue = 0;

        for (int el: arrayData
                ) {
            if (maxValue < el){
                maxValue = el;
            }
        }

        return maxValue;
    }

    public static int minArrayValue(int[] arrayData){

        int minValue = 999999999;

        for (int el: arrayData
                ) {
            if (minValue > el){
                minValue = el;
            }
        }

        return minValue;
    }

    public static int coutRepeat5(int[] arrayData){

        int coutRepeat = 0;

        for (int el:arrayData
             ) {
            if(el==5){
                coutRepeat++;
            }

        }
        return coutRepeat;

    }

    public static void bubleSortMax(int[] arrayData){

        for (int i = 0; i < arrayData.length; i++){
            for (int j = 0; j < arrayData.length - 1; j++){
                int el = arrayData[i];
                if (el > arrayData[j]){
                    arrayData[i] = arrayData[j];
                    arrayData[j] = el;
                }
            }
        }

        System.out.println("Отсортированный массив (по спаданию): ");
        for (int el: arrayData
             ) {
            System.out.print(" " + el);
        }
    }

    public static void bubleSortMin(int[] arrayData){

        for (int i = 0; i < arrayData.length; i++){
            for (int j = 0; j < arrayData.length - 1; j++){
                int el = arrayData[j];
                if (el > arrayData[i]){
                    arrayData[j] = arrayData[i];
                    arrayData[i] = el;
                }
            }
        }

        System.out.println("Отсортированный массив (по возрастанию): ");
        for (int el: arrayData
                ) {
            System.out.print(" " + el);
        }
    }
}

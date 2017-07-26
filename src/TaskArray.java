import com.sun.jmx.snmp.SnmpStatusException;

import javax.xml.transform.dom.DOMResult;
import java.util.Scanner;

/**
 * Created by admin on 21.07.2017.
 */
public class TaskArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*System.out.println("Введите размер массива:");
        int arrayLength = in.nextInt();
        in.nextLine();*/

        System.out.println("Введите с клавиатуры 777, чтоб закончить ввод элементов массива");

        int[] arrayDataIn = new int[10000000];
        int countStep = 0;

        for (int i = 0; i < 10000000; i++){
            System.out.println("Введите элемент массива (777, чтоб остановить ввод данных): ");
            int dataIn = in.nextInt();
            if (dataIn == 777){
                break;}
            else{
                arrayDataIn[i] = dataIn;
                countStep++;
                }

            in.nextLine();
        }

        int[] arrayData = new int[countStep];
        for (int i = 0; i < countStep; i++){
            arrayData[i] = arrayDataIn[i];
        }

        //----------
        //ЗАДАНИЕ 1
        //----------
        int maxValue = maxArrayValue(arrayData);
        int minValue = minArrayValue(arrayData);
        int coutRepeat = coutRepeat5(arrayData);

        System.out.println("Минимальное значения массива: " + minValue);
        System.out.println("Максимальное значения массива: " + maxValue);
        System.out.println("Количество повторений числа 5: " + coutRepeat);

        bubleSortMax(arrayData);
        System.out.println("");
        bubleSortMin(arrayData);
        System.out.println("");

        //----------
        //ЗАДАНИЕ 2
        //----------
        countMaxRepeat(arrayData);
        countMinRepeat(arrayData);

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

    public static void countMaxRepeat(int[] arrayData){

        int maxRepeat = 0;
        for (int el: arrayData
             ) {
            int repeatElement = 0;
            for (int i = 0; i < arrayData.length; i++){
                if (el == arrayData[i]){
                    repeatElement++;
                }
            }
            if (repeatElement > maxRepeat){
                maxRepeat = repeatElement;
            }
        }

        System.out.println("Максимальное кол-во повторений чисел в массиве: " + maxRepeat);
    }

    public static void countMinRepeat(int[] arrayData){

        int minRepeat = 10000;
        for (int el: arrayData
                ) {
            int repeatElement = 0;
            for (int i = 0; i < arrayData.length; i++){
                if (el == arrayData[i]){
                    repeatElement++;
                }
            }
            if (repeatElement < minRepeat){
                minRepeat = repeatElement;
            }
        }

        System.out.println("Минимальное кол-во повторений чисел в массиве: " + minRepeat);
    }
}

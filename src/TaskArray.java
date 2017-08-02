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

        System.out.println("Введите длину массива:");
        int maxInt = in.nextInt();

        int[] arrayDataIn = new int[maxInt];
        int countStep = 0;

        for (int i = 0; i < maxInt; i++){
            System.out.println("Введите элемент массива: ");

            if (!in.hasNextInt()){
                break;}
            else{
                int dataIn = in.nextInt();
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

        //----------
        //ЗАДАНИЕ 2
        //----------
        countMaxRepeat(arrayData);
        countMinRepeat(arrayData);

    }

    public static int maxArrayValue(int[] arrayData){

        int maxValue = arrayData[0];

        for (int el: arrayData
                ) {
            if (maxValue < el){
                maxValue = el;
            }
        }

        return maxValue;
    }

    public static int minArrayValue(int[] arrayData){

        int minValue = arrayData[0];

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

        int tempEl = 0;
        boolean makeSort = false;

        for (int i = 0; i < arrayData.length; i++){

            if ( (i + 1) > arrayData.length - 1)
                break;

            if (arrayData[i] < arrayData[i + 1]){
                makeSort = true;
                tempEl = arrayData[i];
                arrayData[i] = arrayData[i + 1];
                arrayData[i + 1] = tempEl;
            }
        }

        if (makeSort){
            bubleSortMax(arrayData);
        }
        else{

            System.out.println("Отсортированный массив (по спаданию): ");
            for (int el: arrayData
                    ) {
                System.out.print(" " + el);
            }
            return;

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

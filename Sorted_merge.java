public class Sorted_merge {
    public static int[] sortArray(int[] array) {
        int length_arr = array.length / 2;

        if (array.length < 2) { return array;} //условие выхода из рекурсии. дробим пока длина массива больше 2
        if (array.length % 2 != 0){length_arr += 1;}

        int[] arrayR = new int[length_arr]; // длина правой части
        int[] arrayL = new int[array.length / 2]; // длина левой части
        System.out.println();
        System.out.print("Left arr: ");
        for (int i = 0; i < array.length / 2; i++) {
            arrayL[i] = array[i];
            System.out.print(arrayL[i] + " ");
        }
        System.out.println();
        System.out.print("Right arr: ");
        for (int i = array.length / 2; i < array.length; i++) {
            arrayR[i - array.length / 2] = array[i];
                System.out.print(arrayR[i - array.length / 2] + " ");
        }

        arrayL = sortArray(arrayL); // дробим левые части
        arrayR = sortArray(arrayR); // дробим правые части
        return mergeArray(arrayL, arrayR); // сортируем  и склеиваем
    }

    public static int[] mergeArray(int[] arrayL, int[] arrayR) {

        int[] arrayC = new int[arrayL.length + arrayR.length]; // задаем размер массива
        int posL = 0, posR = 0;
        // в цикле сортируем части массивов по эелементно(элемент левой и элемент правой) и слкеиваем в массив
        for (int i = 0; i < arrayC.length; i++) {
            if (posL < arrayL.length && posR < arrayR.length) {
                if (arrayL[posL] < arrayR[posR]) {
                    arrayC[i] = arrayL[posL];
                    posL++;
                } else {
                    arrayC[i] = arrayR[posR];
                    posR++;
                }
            } else if (posL == arrayL.length && posR < arrayR.length) {
                arrayC[i] = arrayR[posR];
                posR++;
            }
            else if (posL < arrayL.length && posR == arrayR.length) {
                arrayC[i] = arrayL[posL];
                posL++;
            }
        }
        return arrayC;
    }
}
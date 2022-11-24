public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[] { 5, 1, 12, 3, 5, 23, 632, 4, 5, 67, 66, 55, 74, 12, 89,6, 9, 8, 7, 18, 91,2, 77, 14 };

        System.out.println("Source array:");
        for (int item: array) {
            System.out.print(item + " ");
        }

        array = Sorted_merge.sortArray(array);

        System.out.println();
        System.out.println("Sorted array");
        for (int item: array) {
            System.out.print(item + " ");
        }
    }
}

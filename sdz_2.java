public class sdz_2 {
    class sdz {
        public static void main(String[] args) {
            int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 
            int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    
            System.out.println("Задача 1: ");
            task1(replaceValues);
            System.out.println("\nЗадача 2: ");
            task2(multiplyOn2);
            System.out.println("\nЗадача 3: ");
            task3(5, 3);
        }
    
    //Task 1.
    //Задать целочисленный массив, состоящий из элементов 0 и 1. 
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    
        public static void task1(int[] replaceValues) {
            for (int i = 0; i < replaceValues.length; i++) {
                replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
                System.out.print(replaceValues[i] + " ");
            }
        }
    

    // Task 2.
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    
        public static void task2(int[] multiplyOn2) {
            for (int i = 0; i < multiplyOn2.length; i++) {
                if (multiplyOn2[i] < 6) {
                    multiplyOn2[i] = multiplyOn2[i] * 2;
                }
                System.out.print(multiplyOn2[i] + " ");
            }
        }
    

    // Task 3.
    // Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого 
    // равна initialValue;
    
        public static void task3(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }
    
    }
}
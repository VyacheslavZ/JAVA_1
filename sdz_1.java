public class sdz_1 {

    public static void main(String[] args) {
        System.out.println (expressionCheck(11, 8) + "\n");
        printWordNTimes("source repeat", 8);
        System.out.println(checkLeapYear(2020));
    }
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), 
    // если да – вернуть true, в противном случае – false.

    public static boolean expressionCheck(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    
    }

    // 2. Напечатать строку source repeat 8 раз

    public static void printWordNTimes(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println("[" + i + "]" + str);
        }

    }

    // 3. Проверить, является ли год високосным. если да - return true
    //return false;

    public static boolean checkLeapYear (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
    
}
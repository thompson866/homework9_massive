public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("task 1");
        int[] random = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int monthMoney = 0;
        for (int i = 0; i < random.length; i++) {
            monthMoney = monthMoney + random[i];

        }
        System.out.println("Сумма трат за месяц составила " + monthMoney + " рублей");
        // Далее пишем код для задачи
    }

    public static void task2() {
        System.out.println("task 2");
        int[] random = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int minMoney = random[0];
        int maxMoney = random[0];
        for (int i = 0; i < random.length; i++) {
            if (random[i] < minMoney) ;
            {
                minMoney = random[i];
            }

            if (random[i] > maxMoney) {
                maxMoney = random[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. Максимальная сумма трат за день составила " + maxMoney + " рублей");
    }


}
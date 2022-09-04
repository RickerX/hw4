public class Main {
    public static void main(String[] args) {
        // 4. Условный оператор 2
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        // Задание 2
        System.out.println("Задание 2");
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        // Задание 3
        System.out.println("Задание 3");
        int year = 2024;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if ((year100 == 0 || year4 != 0) && year400 != 0) {
            System.out.println("Год не високосный.");
        } else {
            System.out.println("Год високосный.");
        }
        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int oneDay = 1;
        int twoDays = 2;
        int threeDays = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:"+oneDay);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:"+twoDays);
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:"+threeDays);
        }
        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
    }
}
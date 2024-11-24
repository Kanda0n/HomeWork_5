public class Main {
    public static void main(String[] args) {
        System.out.println("Homework Условный оператор2.");

        System.out.println("Task 1");
        var clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка!");
        }

        System.out.println("Task 2"); // использовал switch case, интересно, корректно ли это сделано
        int clientDeviceYear = 2015;  // и можно ли (стоит ли) так использовать эту конструкцию в принципе?
        switch (clientOS) {           // могу ещё раз попробовать написать уже только с if else
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Ошибка версии клиента!");
        }

        System.out.println("Task 3");
        boolean contrast = false;
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            contrast = true;
        }
        if (year >= 1584) {
            if (contrast) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("В григорианском календаре ещё не ввели високосность.");
        }

        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 1;
            if (deliveryDistance > 20) {
                deliveryTime = deliveryTime + 1;
            }
            if (deliveryDistance > 60) {
                deliveryTime = deliveryTime + 1;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        System.out.println("Task 5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                ;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                ;
            case 4:
                ;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                ;
            case 7:
                ;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Некорректный номер месяца!");

        }
    }
}
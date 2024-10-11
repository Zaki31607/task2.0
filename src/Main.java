public class Main {
    public static void main(String[] args) {
        // Начальный баланс на счету
        int initialBalance = 100;

        // Сумма пополнения
        int refillAmount = 1100;

        // Порог для начисления бонусов
        int bonusThreshold = 1000;

        // Рассчитываем бонус
        int bonus;
        if (refillAmount > bonusThreshold) {
            bonus = refillAmount / 100;
        } else {
            bonus = 0;
        }

        // Рассчитываем итоговый баланс
        int finalBalance = initialBalance + refillAmount + bonus;

        // Выводим итоговый баланс и количество бонусных рублей на экран
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}
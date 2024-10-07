package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Количество денег на счету

        for (int month = 0; month < 12; month++) {
            // Если денег хватает на отдых
            if (money >= threshold) {
                count++; // Увеличиваем счетчик месяцев отдыха
                money = (money - expenses) / 3; // Тратим деньги на отдых
            } else {
                // Если денег не хватает, то работаем
                money += income - expenses; // Заработали и потратили
            }
        }

        return count; // Возвращаем количество месяцев отдыха
    }
}

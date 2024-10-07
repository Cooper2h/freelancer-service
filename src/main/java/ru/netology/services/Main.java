package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelancerService service = new FreelancerService();

        // Пример параметров для расчета
        int income = 10000; // Ежемесячный доход
        int expenses = 3000; // Ежемесячные траты
        int threshold = 20000; // Порог для отдыха

        // Расчет количества месяцев отдыха
        int monthsOfRest = service.calculate(income, expenses, threshold);

        // Вывод результата в консоль
        System.out.println("Количество месяцев отдыха в году: " + monthsOfRest);
    }
}
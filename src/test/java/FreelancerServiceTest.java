package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelancerServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //        "10000, 3000, 20000, 3", // Первый набор данных: доход, траты, порог, ожидаемый результат
    //       "100000, 60000, 150000, 2" // Второй набор данных: доход, траты, порог, ожидаемый результат
    //    })
    @CsvFileSource(files="src/test/resources/test-data.csv")
    public void testCalculate(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        // Фактический результат
        int actual = service.calculate(income, expenses, threshold);
        // Сравнение ожидаемого и фактического результатов
        Assertions.assertEquals(expected, actual);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancerService;


public class FreelancerServiceTest {

    @Test
    public void testCalculateExample1() {
        FreelancerService service = new FreelancerService();
        int income = 10000; // Ежемесячный доход
        int expenses = 3000; // Ежемесячные траты
        int threshold = 20000; // Порог для отдыха

        int expected = 3; // Ожидаемое количество месяцев отдыха
        int actual = service.calculate(income, expenses, threshold); // Фактический результат

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateExample2() {
        FreelancerService service = new FreelancerService();
        int income = 100000; // Ежемесячный доход
        int expenses = 60000; // Ежемесячные траты
        int threshold = 150000; // Порог для отдыха

        int expected = 2; // Ожидаемое количество месяцев отдыха
        int actual = service.calculate(income, expenses, threshold); // Фактический результат

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.servis;


import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class CashBackHackerTest {
    CashBackHacker service = new CashBackHacker();

    @Test
    public void testBorder() {
        //1.подгтовка данных2.выполнение целевого действия3.сравние факт и ожид результ.
        //создаем сервис и объект куда будем передавать данные

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }


    @Test
    public void amountAfterWound() {

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void amountBeforeBorder() {

        int actual = service.remain(999);
        int expected = 1001;
        assertEquals(actual, expected);
    }
    @Test
    public void amountBorderIfMore() {


        int actual = service.remain(2001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}

package ru.netology.servis;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashBackHackerTest {


        CashBackHacker service = new CashBackHacker();

        @Test
        public void testBorder() {
            //1.подгтовка данных2.выполнение целевого действия3.сравние факт и ожид результ.
            //создаем сервис и объект куда будем передавать данные

            int actual = service.remain(0);
            int expected = 1000;
            assertEquals(actual, expected);
        }

        @Test
        public void amountAfterWound() {

            int actual = service.remain(1);
            int expected = 999;
            assertEquals(actual, expected);
        }

        @Test
        public void amountBeforeBorder() {

            int actual = service.remain(999);
            int expected = 1;
            assertEquals(actual, expected);
        }
        @Test
        public void amountBorderIfMore() {

            int actual = service.remain(300);
            int expected = 700;

            assertEquals(actual, expected);
        }
    }

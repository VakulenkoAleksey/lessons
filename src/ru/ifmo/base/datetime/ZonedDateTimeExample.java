package ru.ifmo.base.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ZonedDateTimeExample {
    public static void getZonedDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH:mm");
        // Работа с временными зонами - класс ZonedDateTime (основные методы):
        // ZonedDateTime просто содержит внутри себя LocalDateTime и ZoneId
//        ZoneId - является представлением часового пояса , например Europe/Moscow

        // Все часовые пояса
        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
        zones.forEach(System.out::println);

        // Допустим, есть объект LocalDateTime без приязки к временной зоне
        LocalDateTime someDateTime = LocalDateTime.now();

        // Чтобы привязать объект LocalDateTime к временной зоне (например, "Europe/Moscow") необходимо:
        ZonedDateTime msk = someDateTime.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println("в Москве сейчас " + formatter.format(msk)); // в Москве сейчас

        // Чтобы определить ZonedDateTime в другом часовом поясе (например, "America/New_York")
        // относительно существующего необходимо:
        ZonedDateTime ny = msk.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("в Нью-Йорке сейчас " + formatter.format(ny)); // в Нью-Йорке сейчас

        // с ZonedDateTime можно работать, как с LocalDateTime, например:
        System.out.println(ny.plusHours(8).plusMinutes(30).format(formatter));

        // TODO: задача на работу с датой и временем
        /*Самолет летит из Сиднея в Оттаву с двумя остановками в Хьюстоне и Вашингтоне.
        Самолет вылетает из Сиднея (дата любая, например 16 июня 2020) в 19:00 (время местное для Сиднея).

        Время в пути Сидней -  Хьюстон - 15 часов 35 минут
        Время ожидания в аэропорту Хьюстона - 1 час
        Время в пути  Хьюстон - Вашингтон - 2 часа 49 минут
        Время ожидания в аэропорту Вашингтона - 1 час 10 минут
        Время в пути Вашингтон - Оттава - 1 час 40 минут

        Вывести в консоль:
        Время прибытия! в аэропорт Оттавы (время местное для Оттавы)
        Время вылета! из аэропорта Хьюстона (время местное для Хьюстона)
        Время вылета! из аэропорта Вашингтона (время местное для Вашингтона)

        Часовые пояса:
        Сидней - Australia/Sydney
        Хьюстон - America/Chicago
        Вашингтон - America/New_York
        Оттава - America/Toronto*/

    }
}

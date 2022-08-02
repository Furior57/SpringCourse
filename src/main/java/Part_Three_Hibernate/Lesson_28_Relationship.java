package Part_Three_Hibernate;

public class Lesson_28_Relationship {
    // Мы изучили все CRUD команды, теперь поговорим об отношениях таблиц. Как мы помним из SQL,
    // существует три основных типа отношений таблиц.
    //  One-to-one - один к одному, например у нас есть две талицы School и Director, у каждой
    // школы может быть только один директор и каждый директор может работать только
    // в одной школе. То есть данный термин указывает на то, что для одной строки в таблице, есть
    // одна связная строка в зависимой таблице. Это отношение имеет еще одни подвид "ноль-или-один-
    // к-одному" При этом отношении необязательно указывать связную строку в зависимой таблице,
    // то есть одной строке в главной таблице может как соответствовать строка, так ее может и не
    // быть.
    //  One-to-many - один-ко-многим, когда одной строке из главной(родительской) таблицы может
    // соответствовать несколько строк в зависимой таблице. Самое частое отношение таблиц
    // в базе данных.
    //  Many-to-many - многие ко многим, используется когда множество записей из родительской
    // таблицы может соответствовать записи в зависимой таблице и наоборот, когда множество
    // записей в зависимой таблице, может соответствовать одной записи в родительской.
    // Для такого отношения таблиц создается третья таблица куда записываются первичные ключи
    // из первых двух, как ключ-пара, такие ключ-пары всегда должны быть уникальны в этой таблице.
}

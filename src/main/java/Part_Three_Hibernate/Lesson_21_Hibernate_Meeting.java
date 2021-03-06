package Part_Three_Hibernate;

public class Lesson_21_Hibernate_Meeting {
    // Hibernate - это фреймворк который используется
    // для сохранения, получения, изменения и удаления Java объектов из базы данных.

    // В ходе работы нашей программы мы скорее всего захотим сохранить прогресс ее выполнения,
    // вот в этом случае нам и нужен Hibernate.

    // Плюсы использования:
    //  Предоставляет функционал ORM(Object-to_Relations Mapping) - то есть преобразовывает
    // java объект в строку в таблице и обратно(что-то типа сериализации).
    //  Умеет регулировать SQL запросы - то есть нам не надо вручную писать SQL запросы для того, чтобы
    // добавить какой-то объект в таблицу, все это происходит под капотом.
    //  Как следствие из прошлых пунктов - уменьшает количество кода для написания.

    // В своей работе Hibernate основывается на JDBC, однако все взаимодействие скрыто от пользователя.

    // Весь принцип работы состоит в аббревиатуре CRUD:
    // CREATE - INSERT
    // READ - SELECT
    // UPDATE - UPDATE
    // DELETE - DELETE

    // Мы в наших лекциях будем работать с MySQL, установку и настройку оставим за кадром, отметим
    // только важнейшее. Мы задали пароль для root - springcourse, создали нового пользователя
    // bestuser пароль у него такой же, как и имя. Создали базу данных my_db, в ней создали
    // таблицу, id - автоинкремент, остальные поля имя, фамилия, отдел, зарплата, все notnull,
    // типы данных думаю не нужно указывать :).

    // На этом подготовительная часть окончена, продолжение в следующей лекции.
}

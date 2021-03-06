package Part_one_Spring_introduction.lessons;

import Part_one_Spring_introduction.animal.Cat;
import Part_one_Spring_introduction.animal.Dog;
import Part_one_Spring_introduction.animal.Pet;

public class Lesson_1_IoC_meeting {
    // Итак, мы приступаем к изучению Spring, это фреймворк значительно облегчающий жизнь
    // программистов. Для начала разберемся, что такое фреймворк? Мы знаем такое понятие "библиотека"
    // это набор каких то классов, интерфейсов и их методов в которых реализована какая-то логика,
    // что позволяет нам избежать изобретения велосипеда и пользоваться уже готовыми решениями.
    // Все что мы до этого импортировали из java core было библиотеками. Но что же такое тогда фреймворк?
    // Ведь он тоже содержит классы, интерфейсы, методы, абстракции, в чем отличие от библиотеки?
    // Inversion of control, что по-русски - инверсия контроля. Когда мы пишем код, мы ждем какие-то
    // события(ввод), обрабатываем их, выводим на экран, может быть работаем в несколько потоков, мы
    // сами контролируем процесс работы нашей программы. Так вот фреймворк, это некая библиотека,
    // которая не только предоставляет нам некие абстракции и готовые реализации, но и перехватывает
    // управление над потоком программы(inversion of control), получая от нас какие-то данные и под
    // капотом обрабатывая их. Одним из самых популярных фреймворков как раз является Spring, его
    // популярность обусловлена модульностью, мы можем не подключать ненужные нам фреймворки, что
    // обеспечивает быстродействие и простоту использования, нет необходимости в подтягивании
    // кучи зависимостей для какого то простейшего проекта. Но оставим пока эту тему, сейчас мы говорим
    // об инверсии контроля.
    public static void main(String[] args) {
        // У нас есть два класса, Dog и Cat, у обоих классов есть метод say() отвечающий за то, кто как
        // подает голос, оба класса находятся в пакете animal.
        Dog dog = new Dog();
        dog.say();
        Cat cat = new Cat();
        cat.say();
        // вспоминаем про полиморфизм и понимаем что для двух классов с одним по функционалу
        // методом мы можем написать интерфейс, назовем его Pet, теперь мы можем создавать
        // инстансы класса такой записью и пользоваться одним методом по разному
        // определенным в наших классах
        Pet dogPet = new Dog();
        // Однако когда нам нужен объект другого класса мы должны снова его инициализировать записью
        // и снова для третьего, четвертого и т.д. Здесь нам на помощь проходит Spring и Inversion of
        // Control(IoC). В спринге есть понятие: Spring Container, как мы можем догадаться из названия
        // это некий контейнер, в нем будут храниться объекты наших классов, которые буду созданы
        // спрингом в соответствии с конфигурационным файлом. В этот конфигурационный файл мы
        // записываем правила по которым контейнер будет создавать объекты. Сложно? Объясним
        // попроще. Наш main метод будет обращаться к контейнеру и говорить "Мне нужен обьект Pet",
        // контейнер смотрит в конфиг и понимает какой именно обьект нужен сейчас. Магия.
        // Основные функции которые выполняет Spring Container:
        // IoC - инверсия управления, спринг сам создает и управляет объектами. То есть мы,
        // как уже было выше сказано, передаем права на создание и управление объектами стороннему
        // фреймворку.
        // DI - Dependency Injection(внедрение зависимостей)

        // Способы конфигурации Spring Container:
        // XML file (устаревший способ), начнем изучение именно с него, во многих компаниях
        // существует legacy код, необходимо понимать как это работает.
        // Аннотации + XML file (современный способ)
        // Java code (современный способ)

    }
}

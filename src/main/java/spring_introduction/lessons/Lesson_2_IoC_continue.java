package spring_introduction.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.animal.Pet;

public class Lesson_2_IoC_continue {
    // В прошлом уроке мы закончили на основных способах конфигурации работы контейнера. Повторим.
    // Способы конфигурации Spring Container:
    // XML file (устаревший способ)
    // Аннотации + XML file (современный способ)
    // Java code (современный способ)

    // Начнем знакомство с первого способа, для этого в папке resources создадим файл с названием
    // applicationContext.xml, перейдем туда
    public static void main(String[] args) {
        // Прежде чем брать обьекты из контейнера, нам необходимо его создать
        // его стандартное название ApplicationContext, файл конфигурации назван так же.
        // Сейчас мы создаем конфигурацию из xml файла, поэтому инициализация контейнера будет
        // отличаться от той которой мы будем пользоваться дальше.
        // Инициализируем контейнер из xml файла. Параметром передаем название файла с расширением
        // в формате string
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Здесь мы с помощью метода getBean() создаем обьект интерфейса Pet, параметрами передаем
        // id класса и его тип, мы могли сразу указать Dog.class, однако при записи Pet.class, мы
        // всегда можем поменять класс в конфигураторе и не вносить никаких изменений в main методе
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        // контейнер это такой же ресурс, не забываем закрывать его
        context.close();
        // первым впечатлением может показаться, что мы только усложнили простейшую операцию, однако
        // это не так, мы сейчас не будем говорить о зависимостях классов, которые гораздо легче
        // контролировать с использованием Spring, мы только отметим, для того чтобы создать
        // экземпляр класса Cat, нам не нужно менять код в методе main(), нам достаточно поменять
        // bean в файле конфигурации и нет необходимости перекомпилировать класс main(), в случае
        // работы с большими проектами это может занять довольно много времени, на, условно,
        // обычный тест.
    }
}
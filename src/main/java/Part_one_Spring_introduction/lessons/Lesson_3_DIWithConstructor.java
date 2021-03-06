package Part_one_Spring_introduction.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import Part_one_Spring_introduction.animal.Person;

public class Lesson_3_DIWithConstructor {
    // В прошлом уроке мы упоминали, что Spring позволяет удобно работать с объектами
    // имеющими много зависимостей. Этот механизм называется Dependency Injection(DI) -
    // внедрение зависимостей. Представим какой-то абстрактный класс Employee, у которого есть поля
    // Car, Home, Pet, это все является классами, а теперь представим что у класса Home полями
    // тоже являются классы Window, Door, Wall. А теперь представим сколько объектов нам необходимо
    // инициализировать только для того, чтобы создать одного Employee, и сколько строк кода это
    // займет. Здесь то нам и приходит на помощь DI Spring-а. Все это мы можем прописать
    // в конфигурации. Усложним пример из прошлого урока
    public static void main(String[] args) {
        // Здесь все будет точно так же, создаем контейнер, указываем файл конфигурации,
        // однако в этот раз мы укажем зависимость. У каждого Pet
        // есть хозяин, это будет класс Person, создадим его там же, в пакете Animal.
        // В этом классе создадим поле типа Pet, инициализируем конструктор в который передаем это поле
        // и определим метод подзывания питомца. В этом методе используем pet.say(), чтобы питомец
        // ответил в зависимости от своего класса.
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Так же создаем обьект из контейнера
//        Pet pet = context.getBean("myPet", Pet.class);
        // Инициализируем хозяина, ну и соответственно если хотим поменять животное, меняем конфиг-файл.
        // Пока ничего особенно нового. Никаких преимуществ мы не видим. Однако мы не использовали
        // все возможности Spring в этом плане, мы просто ослабили зависимость, сделав возможным
        // изменение поведения программы, не переписывая код.
//        Person person = new Person(pet);
//        person.callYourPet();
        // Теперь перейдем в applicationContext, на 35 строку и посмотрим как внедрять зависимости в
        // конструктор класса.
        // Первым делом закомментируем все что мы написали, кроме инициализации контейнера.
        // А теперь инициализируем Person. Как видите нам хватило всего двух строчек, чтобы создать
        // этот объект и вызвать метод. А теперь представим насколько нужно меньше писать кода
        // если мы используем Employee, описанного выше. Важным моментом является то, что
        // ide не может проверить правильный ли id мы указываем в методе getBean() и в случае
        // если мы ошибемся, то получим исключение NoSuchBeanDefinitionException при попытке запустить
        // этот код.
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
        // Теперь мы знаем как внедрять зависимости с помощью конструктора.

    }
}

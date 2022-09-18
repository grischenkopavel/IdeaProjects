package lessons.lesson8;/*
Created by Pavel Gryshchenko on 04.08.2022
*/

/*
Три принципа ООП:
    Наследование
    Инкапсуляция
    Полиморфизм

    Наследование - это процесс перенимания классом свойств (методов и полей) другого класса.
Чтобы объявить один класс наследником от другого, надо использовать после имени класса-наследника ключевое слово "extends",
после которого идет имя базового класса.
Класс, являющийся основой, называют: базовым, супер, родительским.
Класс, который создают, называют: потомок, наследник или производный класс.

    Полиморфизм- это возможность/принцип применения одноименных методов с одинаковыми или различными наборами параметров в одном классе или в группе классов, связанных отношением наследования.
 */
class Main {

    static int a = 5; //поле класса

    public static void main(String[] args) {
        Cat cat = new Cat(); //Создание нового обьекта или Экземпляра класса Cat
        cat.sayMay();
        catActions();

    }

    public static void catActions() {
        Cat cat2 = new Cat();
        cat2.jump();
        cat2.run();
    }
}

package level3.lesson3.path2.Task8;
// Создать класс Человек, Танцор, Певец, Доктор. У класса Человек есть метод
// зарабатывать деньги, в нём выводить “работаю на обычной работе”. Классы Танцор, Певец и Доктор
// наследуют класс Человек и переопределяют метод зарабатывать деньги, каждый переопределяет метод по своему,
// написать свою реализацию, например для доктора вывод на экран “Лечу людей, помогаю быть здоровыми”. В методе main
// создать массив с типом Человек, туда записать несколько объектов разных типов Человека. Пройтись по массиву че
//рез цикл вызвать у каждого объекта метод зарабатывания денег.
public class Human {
    void earnMoney() {
        System.out.println("работаю на обычной работе!");
    }

    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[1] = new Dancer();
        humans[2] = new Dancer();
        humans[3] = new Human();
        humans[4] = new Singer();
        humans[0] = new Doctor();

        for (Human currHum: humans) {
            currHum.earnMoney();
        }
    }
}
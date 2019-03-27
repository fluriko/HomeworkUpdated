package mate.academy.hw2;

// задание 2.2

// класс для наследования анонимным классом
class Parent {
    public void go() {
        System.out.println("Parent's method");
    }
}

// внешний класс для всех внутренних
public class Outer {
    // анонимный класс
    static Parent parent = new Parent() {
        @Override
        public void go() {
            super.go();
            System.out.println("Anonymous's method");
        }
    };

    // вложенный класс
    class Nested {
        public void go() {
            System.out.println("Nested's method");
        }
    }

    // внутренний статический класс
    static class StaticNested {
        public void go() {
            System.out.println("StaticNested's method");
        }
    }

    // метода для локального класса
    void goLocal() {
        System.out.println("Outer's method uses local inner class");

        //локальный класс
        class Local {
            public void go() {
                System.out.println("Local's method");
            }
        }
        Local local = new Local();
        local.go();
    }

    public static void main(String[] args) {
        // тестировка анонимного класса
        parent.go();

        // тестировка вложенного класса
        Outer.Nested nested = new Outer().new Nested();
        nested.go();

        // тестировка внутреннего статического класса
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.go();

        // тестировка локального класса
        Outer outer = new Outer();
        outer.goLocal();
    }
}

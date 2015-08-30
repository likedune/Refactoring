package ch10.making.method.calls.simpler;

public class ReplaceParameterWithExplictMethods {

    public class Employee {
        private static final int ENGINEER = 0;
        private static final int SALESMAN = 1;
        private static final int MANAGER = 2;

        public Employee create(int type) {
            // 원래는 static method. 현재는 편의상 이런 방식의 코드를 사용
            switch (type) {
                case ENGINEER:
                    return new Engineer();
                case SALESMAN:
                    return new Salesman();
                case MANAGER:
                    return new Manager();
            }
            return null;
        }
    }

    public class Engineer extends Employee {}
    public class Salesman extends Employee {}
    public class Manager extends Employee {}
}

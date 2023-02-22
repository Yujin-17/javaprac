package chap01_2;

class A {}
class B extends A{}
class Instanceof {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println("a instanceof A = " + (a instanceof A));

        // a 객체는 B 클래스의 부모 클래스 입니다.
        // 따라서 아래는 false 입니다.
        System.out.println("a instanceof B = " + (a instanceof B));

        System.out.println("b instanceof A = " + (b instanceof A));

        System.out.println("b instanceof B = " + (b instanceof B));
    }
}

public class Variable1 {

    static int classVal = 100; // 클래스 변수
    int instanceVal = 200; // 인스턴스 변수

    public static void main(String[] args) {
        int num; // 지역 변수
//        System.out.println("int = " + num); // Error 발생
        num = 300;
        System.out.println("int = " + num); // 300

        // 인스턴스 변수
//        System.out.println("instanceVal = " + instanceVal); // Error 발생
        Variable1 instance = new Variable1(); // 인스턴스 변수 사용을 위해 객체 생성
        System.out.println("instanceVal = " + instance.instanceVal); // 200

        // 클래스 변수
        System.out.println("classVal = " + classVal);
        // 같은 클래스 내부는 바로 접근 가능
        System.out.println("Main.classVal = " + Variable1.classVal);
        // 클래스 변수 : 클래스명.클래스변수명 으로 접근 or
    }
}

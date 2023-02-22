package chap01_2;

class Whale extends Mammalia{
    // 고래는 포유류 이면서 바다에 살며 수영이 가능하다.
    public void swimming() {
        System.out.println("수영 하다.");
    }

    @Override
    public void feeding() {
        System.out.println("고래는 모유 수유를 합니다.");
    }

    @Override
    public void giveBirth() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
}

class Mammalia {
    // 포유류는 새끼를 낳고 수유를 한다.
    public void feeding() {
        System.out.println("모유 수유를 합니다.");
    }

    public void giveBirth() {
        System.out.println("새끼를 낳습니다.");
    }
}

class PolyTest1 {
    public static void main(String[] args) {
        // 고래는 포유류이기 때문에 Mammalia 에 담길 수 있다.
        Mammalia mammalia = new Whale();

        // 하지만 포유류 전부가 바다에 살고 수영을 할 수 있는 것은 아니기 때문에
        // 수영 하다 메서드는 실행 불가
//         mammalia.swimming(); // Error 발생

        // 또한 모든 포유류가 전부 고래 처럼 수영이 가능한 것이 아니기 때문에 아래 상황은 불가능 하다.
//         Whale whale = new Mammalia(); // Error 발생

        mammalia.giveBirth();
        mammalia.feeding();
    }
}
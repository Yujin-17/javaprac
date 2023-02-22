package chap01_2;

abstract class Player {
    boolean pause; // 일시정지 상태를 저장하기 위한 변수
    int currentPos; // 현재 Play 되고 있는 위치 저장하기 위한 변수

    Player() {
        pause = true;
        currentPos = 0;
    }

    abstract void play(int pos); // 추상 메서드 (몸통 {} 블럭이 없음)
    abstract void stop(); // 추상 메서드

    // 일반 인스턴스 메서드
    void play() {
        System.out.println();
        System.out.println("play() 일반 인스턴스 메서드");
        play(currentPos);
    }
}

class AudioPlayer extends Player {
    @Override
    void play(int pos) {
        System.out.println();
        this.currentPos =  pos;
        this.pause = false;
        System.out.println("추상클래스 Player 의 play(int pos) 구현");
        System.out.println("현재 위치 = " + this.currentPos);
        System.out.println("다시 시작합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
        this.pause = true;
    }
}

class AudioPlayerTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(100);
        audioPlayer.stop();
        audioPlayer.play();

    }
}
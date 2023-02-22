package chap01_2;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void onomatopoeia(){
        System.out.println("동물이 소리냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("강아지가 달립니다.");
    }

    @Override
    public void onomatopoeia() {
        System.out.println("멍멍!");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("새가 날아다닙니다.");
    }

    @Override
    public void onomatopoeia() {
        System.out.println("짹짹!");
    }
}

class Action{
    static void doMove(Animal animal){
        animal.move();
    }

    static void doCry(Animal animal){
        animal.onomatopoeia();
    }
}

public class ParPoly1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        Action.doMove(dog);
        Action.doCry(dog);

        System.out.println();

        Action.doMove(bird);
        Action.doCry(bird);
    }
}
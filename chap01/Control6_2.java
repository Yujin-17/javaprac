class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 3의 배수는 건너뜀 : 3, 6, 9
            if (i % 3 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}
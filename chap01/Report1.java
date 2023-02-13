import org.w3c.dom.ls.LSOutput;


    //2-4. 다음 중 변수를 잘못 초기화 한 것은?

//    byte b = 256;  byte의 길이는 = -128~127
//    char c = '';  빈 문자 불가능
//    char answer = 'no';    char는 한 문자만 저장가능
//    float f = 3.14f;
//    double d = 1.4e3;


    //2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
    public class Report1 {
        public static void main(String[] args) {
            int x = 1;
            int y = 2;
            int z = 3;

            x = y;
            y = z;
            z = y-x;

            System.out.println("x=" + x);
            System.out.println("y=" + y);
            System.out.println("z=" + z);

            //예상 결과 : x=2, y=3, z=1


            //2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
            System.out.println("1"+"2");  // 12
            System.out.println(true+"");   // true
            System.out.println('A'+'B');    // 131  -> ASCII 코드 A:65 B:66
            System.out.println('1'+2);      // 51 -> ASCII 코드 '1':49
            System.out.println('1'+'2');    // 99 -> ASCII 코드 '1':49, '2':50
            System.out.println('J'+"ava");  // Java
//            System.out.println(true+null); //오류
        }
    }

# 
6-8. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)   b, e 
a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
b. 생성자는 객체를 생성하기 위한 것이다.  -> 생성자가 객체를 생성할 때 사용되기는 하지만, 객체를 초기화할 목적으로 사용되는 것. 
                                          객체를 생성하는 것은 new 연산자이다. 
c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
e. 생성자는 오버로딩 할 수 없다.    

6-9. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)  b
a. 객체 자신을 가리키는 참조변수이다.
b. 클래스 내에서라면 어디서든 사용할 수 있다.    ->인스턴스메서드에서만 사용 가능. 클래스 멤버(static이 붙은 변수나 메서드)에는 사용x 
c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
d. 클래스 메서드 내에서는 사용할 수 없다.

6-10. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)  c, d
a. 메서드의 이름이 같아야 한다.
b. 매개변수의 개수나 타입이 달라야 한다.
c. 리턴타입이 달라야 한다.      -> 리턴 타입은 오버로딩에 영향을 주지 않는다. 
d. 매개변수의 이름이 달라야 한다.

6-11. 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)      b, c, d
> long add(int a, int b) { return a+b; }

a. long add(int x, int y) { return x+y; }
b. long add(long a, long b) { return a+b; }
c. int add(byte a, byte b) { return a+b; }
d. int add(long a, int b) { return (int)(a+b); }

6-12. 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)     c, e 
a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
c. 초기화 블럭보다 생성자가 먼저 수행된다.  -> 초기화 블럭이 먼저 수행
d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
e. 클래스변수보다 인스턴스변수가 먼저 초기화된다    -> 클래스 변수가 먼저 초기화 된다. 
클래스 변수는 클래스가 처음 메모리에 로딩될  때 ,자동 초기화.
인스턴스 변수보다 먼저 초기화된다. 
그리고 생성자는 초기화 블럭이 수행된 다음에 수행된다. 

6-13. 다음 중 인스턴스변수의 초기화 순서가 올바른 것은?      a
a. 기본값-명시적초기화-초기화블럭-생성자  
b. 기본값-명시적초기화-생성자-초기화블럭
c. 기본값-초기화블럭-명시적초기화-생성자
d. 기본값-초기화블럭-생성자-명시적초기화
변수의 초기화 순서
클래스변수의 초기화시점: 클래스가 처음 로딩될때 단 한번 초기화된다.
인스턴스변수 초기화 시점: 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
클래스변수의 초기화 순서 : 기본값 명시적초기화 클래스초기화블럭


6-14. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)   a, e
a. 자동 초기화되므로 별도의 초기화가 필요없다.   -> 지역변수는 자동초기화 되지 않아 사용하기 전에 반드시 적절값으로 초기화해야함
b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.  -> 힙영역에는 인스턴스가 생성되는 영역, 지역변수는 호출스택에 생성

![image](https://user-images.githubusercontent.com/74438259/220271185-49ab43a7-f51c-49ab-bbfa-87e18313954e.png)
6-15. 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)   b
a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.   -> 호출스택의 제일 위에 있는 메서드가 현재 수행중인 메서드이며, 호출스택 안의 나머지 메서드들은 대기상태.
c. method2메서드를 호출한 것은 main메서드이다.
d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
e. main-method2-method1-println의 순서로 호출되었다.
f. 현재 실행중인 메서드는 println뿐이다.

//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_16 {
    public static void change(String str) {
        str += "456";
    }
    
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}
ABC123
After change: ABC123


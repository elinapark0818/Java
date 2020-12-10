# 2일차
Java는 고급언어 'ㅅ' 사람이 이해하기 쉽다
- 파이썬이 훨씬 고급언어인 것 같다. 왜냐하면 이해하기 매우 쉽다.
   
한 번 작성하면, 어디서든 돌아간다(write once, run anywhere)
- Python : Life is too short, You need Python

플랫폼에 종속되지 않기 때문에 여러 플랫폼에서 실행할 수 있다.   
[운영체제(리눅스,IOS,안드로이드...)에 종속되지 않음]   
Java를 설치하면, 자바 가상 머신(Java Virtual Machine:JVM)도 함께 설치된다."   

바이트 코드(.class) : 중간 기계어   
JIT(Just in time) 컴파일 방식? >> 자바 프로그램 실행 속도 증가"   
- 윤정(한국말, 일본어) - 이누야샤(일본어, 요괴어) - 요괴(요괴어)
    - 한국어 : Java
    - 일본어 : 중간단계 언어 바이트 코드
    - 요괴어 : 기계어 (바이너리코드 0과 1로 이루어진)

자바 가상 머신(Java Virtual Machine) : 자바 프로그램 실행 환경을 만들어주는 소프트웨어   
[ 자바 코드를 컴파일 > .class 바이트 코드 생성 > 자바 가상 머신 환경에서 실행 ]   
- JIT(Just in time) 컴파일러 :    
실행 시점에 기계어 코드를 생성하는 방식이며, 같은 코드가 반복될 경우 이전에 만들어진 기계어를 재사용한다.   
운영체제에 맞게 바이트 코드로 변환 및 실행한다. 때문에 자바 해석기(Java interpreter)보다 성능이 뛰어나다."
   
객체 지향 언어 : 여러 객체의 협력을 통해 프로그램을 구현하는 것. (강점=유지보수, 확장성)   
동적 메모리 수거를 가비지 콜렉터를 이용한다.(=메모리를 효율적으로 관리할 수 있다.)   
자바 개발 키트(Java Development Kit :JDK)로 라이브러리 제공한다. (=오픈소스)"   
- 파이썬도 객체 지향 언어
- C언어는 메모리를 직접 관리해야 한다

자바 기본 개발 환경 Java SE(Standard Edition)   
서버 기반 프로그램 개발 환경 Java EE(Enterprise Edition)    
모바일 및 임베디드 시스템 개발 환경Java ME(Micro Edition)"   

이클립스, 통합 개발 환경 (Intergrated Development Environment:IDE)
- 파이썬은 Pycharm
- 회사에선 이클립스 말고 Intellij 쓴다.

##### Java
```
package hello;
public class HelloJava {
  public static void main(String[ ] args) {
    System.out.println("Hello, Java");
  }
}
```
> public static void main(String[ ] args) 이 함수를 실행한다.   
HelloJava : class 이름   
public : 접근제어자      
static : 메모리에 먼저 올린다   
void : return 타입이 없다    
main : 함수 이름   
String[] : String 배열을 파라미터로 받는다   
args : 파라미터 이름"
##### Python
```
print("Hello Java")
```
> 파이썬은 중괄호 대신 indent로 구분한다

// :한 줄 주석    
/* ~ */ :~여러 줄 주석처리
- Python : #, Ctrl + /(PyCharm 단축키)

##### Java
```
package chapter2;
public class Variable1 {
  public static void main(String[ ] args) {
    int level; 
    level = 10; 
    System.out.println(level);
  }
}
```
##### Python
```
level = 10
print(level)
```
##### Java
```
pachage practice;
public class Variable1 {
  public static void main(String[ ] args) {
    int age; 
    age = 29; 
    System.out.println(age);
  }
}
```
##### Python
```
age = 29
print(age)
```
초기화 : 변수 선언과 동시에 값을 대입하는 것
```
package chapter2;
public class Variable2 {
    public static void main(String[ ] args) {
        int level = 10; System.out.println(level);
    }
}
```   
변수 이름 : 영문자(대/소문자) or '$', '_'로 시작해야하며 숫자 사용 가능하다. 예약어 사용불가(for, while 등등)   
예약어(Reserved Word) : 프로그래밍 언어에서 특별한 의미로 미리 약속되어 있는 단어   
카멜 표기법(Camel Notation) : 다른 뜻의 단어가 등장할 때 첫 글자를 대문자로~~   

변수를 선언한다는 것 = 선언한 변수 이름으로 어떤 위치에 있는 메모리를 얼마만큼의 크기로 사용하겠다는 뜻   

문자 : 작은 따옴표('), 문자열 : 큰 따옴표("") > char  string 차이...   
char 는 한글자다..문자 하나하나...   
string 은 char의 배열.   

Java는 UTF-16 인코딩을 사용한다. (문자를 2byte로 표현한다.)   
- html은 utf-8로 지정하더라

지역 변수 자료형 추론(Local Variable Type Inference) : 자료형을 쓰지않고 변수 사용   

var 로 자료형 없이 변수를 선언하는 방법은 '지역변수' 만 가능하다.   
- 지역변수 : 프로그램의 { }내에서 사용할 수 있는 변수"

상수(Constant) : 항상 변하지 않는 값   
Java에서는 final 예약어를 사용해 선언한다.


상수이름은 대문자를 주로 사용, 단어 연결 시 _사용하면 보기 좋다.    
한번 선언한 상수는 변하지 않기 때문에 선언과 동시에 값을 지정하는 것이 좋다!

```
public class Constant {
  public static void main(String[ ] args) {
    final int MY_AGE = 29;
    System.out.println(MY_AGE);
  }
}
```
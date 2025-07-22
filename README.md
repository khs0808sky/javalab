# javalab - JAVA의 기초 및 심화

## 📅 목차

- [2025-07-03](#2025-07-03)
- [2025-07-04](#2025-07-04)
- [2025-07-07](#2025-07-07)
- [2025-07-08](#2025-07-08)
- [2025-07-09](#2025-07-09)
- [2025-07-10](#2025-07-10)
- [2025-07-11](#2025-07-11)
- [2025-07-14](#2025-07-14)
- [2025-07-15](#2025-07-15)
- [2025-07-16](#2025-07-16)

<br><br><br>

---

# 2025-07-03

## 📘 Java - 변수, 자료형, 연산자, 제어문과 반복문

---

### ✅ 변수와 자료형

* **변수**는 데이터를 저장하는 공간. 자바는 사용 전에 반드시 자료형을 지정해야 함.
* 자주 쓰는 **기본 자료형**들:

  * `int`: 정수 (예: `int age = 25;`)
  * `double`: 실수 (예: `double pi = 3.14;`)
  * `boolean`: 참/거짓 (예: `boolean isJavaFun = true;`)
  * `char`: 문자 하나 (예: `char grade = 'A';`)
  * `String`: 문자열 (예: `String name = "현수";`)

---

### ✅ 연산자

* **산술 연산자**: `+`, `-`, `*`, `/`, `%`
  → 예: `int sum = 10 + 5;`

* **비교 연산자**: `==`, `!=`, `<`, `>`, `<=`, `>=`
  → 예: `if (a > b)`

* **논리 연산자**: `&&`(그리고), `||`(또는), `!`(부정)
  → 예: `if (a > 0 && b > 0)`

* **대입 연산자**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
  → 예: `x += 5;` (x에 5 더하기)

---

### ✅ 조건문 (if / else if / else)

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

* 조건이 위에서부터 순서대로 검사됨
* 해당 조건이 **참**이면 실행되고, 나머지는 건너뜀
* `else`는 **모든 조건이 거짓**일 때 실행

---

### ✅ switch문

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("월요일");
        break;
    case 2:
        System.out.println("화요일");
        break;
    case 3:
        System.out.println("수요일");
        break;
    default:
        System.out.println("주말 또는 잘못된 입력");
}
```

* 값이 **정확히 나뉘는 경우**에 유용
* `break`를 빼면 밑으로 계속 실행됨 (주의)

---

### 🔁 반복문

#### ▶️ for문

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

* 반복 횟수가 **정해져 있을 때** 적합
* 초기화 → 조건 검사 → 실행 → 증감 순서

#### ▶️ while문

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

* 조건을 먼저 검사
* **조건이 참인 동안** 계속 실행됨

#### ▶️ do-while문

```java
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
```

* `while`과 비슷하지만
* **조건과 관계없이 최소 1번은 실행됨**
---

📅[목차로 돌아가기](#-목차)

---
# 2025-07-04

## 📘 Java - 클래스(class)

---

### ✅ 클래스란?

* 클래스는 하나의 설계도 같은 것.
* 변수(=필드)랑 함수(=메서드)를 묶어 놓은 단위.
* 이걸 바탕으로 실제 사용할 수 있는 객체(인스턴스)를 만들 수 있음.

```java
public class Person {
    String name;    // 이름
    int age;        // 나이

    void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}
```

---

### ✅ 객체 생성과 사용

```java
Person chulsu = new Person();  // 객체 생성
chulsu.name = "철수";
chulsu.age = 29;
chulsu.sayHello();
```

* `new` 키워드로 실제 객체를 만든다.
* 만든 객체는 점(`.`)을 이용해서 변수나 메서드에 접근 가능.
* 위 예시는 "철수"라는 사람을 만든 거라고 보면 됨.

---

### ✅ 생성자(Constructor)

* 객체가 만들어질 때 자동으로 실행되는 함수
* 주로 변수 초기화에 사용됨
* 이름은 클래스 이름과 똑같고, 리턴값 없음

```java
public class Person {
    String name;
    int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}
```

```java
Person younghee = new Person("영희", 25);
younghee.sayHello();
```

* `this.name = name;`은 매개변수랑 필드 이름이 같을 때 구분하기 위한 것
* `new Person("영희", 25);` → 영희라는 이름과 25살로 객체 초기화

---

### ✅ 접근 제어자 (Access Modifier)

클래스 안의 변수나 메서드에 **누가 접근할 수 있는지** 정해주는 키워드.

| 한정자         | 설명                      |
| ----------- | ----------------------- |
| `public`    | 어디서든 접근 가능              |
| `private`   | 클래스 내부에서만 접근 가능         |
| `protected` | 같은 패키지 or 상속받은 클래스에서 가능 |
| (default)   | 같은 패키지 내에서만 접근 가능       |

```java
private String password;
```

* `private`는 클래스 밖에서 직접 접근 불가.
* 대신 `getter`/`setter` 같은 메서드를 따로 만들어서 접근하게 만듦.

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-07

## 📘 Java - Getter / Setter

---

### ✅ Getter와 Setter란?

* 클래스의 **private** 필드에 외부에서 바로 접근하지 못하게 막고,
  대신 메서드를 통해 안전하게 값을 가져오거나(setter), 읽어오게(getter) 함
* 이런 방식이 자바에서 말하는 캡슐화(encapsulation)의 핵심

---

### ✅ Getter 메서드

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }
}
```

* 보통 필드 이름 앞에 `get`을 붙여서 만듦
* 반환형은 필드의 자료형과 동일함

---

### ✅ Setter 메서드

```java
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

* `set` + 필드 이름으로 만듦
* 매개변수로 받은 값을 해당 필드에 저장
* 여기서 `this.name = name;`은 **인스턴스 변수와 매개변수 이름이 같아서** 구분하기 위해 사용

---

### ✅ 사용 예시

```java
Person chulsu = new Person();
chulsu.setName("철수");
System.out.println(chulsu.getName());
```

* 철수라는 이름을 setter로 저장하고, getter로 꺼내 출력하는 예시

---

## 📘 Java - static 키워드

---

### ✅ static이란?

* `static`은 **클래스에 소속된 변수나 메서드**를 의미
* 객체를 만들지 않아도 접근할 수 있음
* 대표적인 예: `Math.random()`, `System.out.println()` 등

---

### ✅ static 변수

```java
public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }
}
```

* `static` 변수는 모든 객체가 **공유**
* 객체가 여러 개 만들어져도 하나의 `count` 값을 같이 씀

---

### ✅ static 메서드

```java
public class Util {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

```java
int result = Util.add(3, 5);
```

* 객체를 만들지 않고 `클래스명.메서드()` 형식으로 호출 가능
* 주의: `static` 메서드 안에서는 `this` 사용 불가 (객체 정보가 없기 때문)

---

## 📘 Java - this 키워드

---

### ✅ this란?

* 현재 객체 자기 자신을 가리키는 키워드
* 지역 변수와 필드 이름이 같을 때 구분 용도로 자주 사용

```java
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;  // 여기서 this.name은 필드, name은 매개변수
    }
}
```

---

### ✅ this의 다른 사용 예

* 생성자에서 **다른 생성자 호출할 때도** `this()` 사용 가능

```java
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this(name, 0); // 아래 생성자 호출
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-08

## 📘 Java - Builder 패턴

---

### ✅ Builder 패턴이란?

- 복잡한 객체 생성 과정을 단계별로 나누어 처리하는 디자인 패턴  
- 생성자의 매개변수가 많거나, 선택적 파라미터가 많을 때 유용  
- 코드 가독성 향상과 객체 생성 안정성 증대

---

### ✅ Builder 패턴 기본 구조

    public class Person {
        private String name;
        private int age;
        private String address;

        private Person(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.address = builder.address;
        }

        public static class Builder {
            private String name;
            private int age;
            private String address;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public Builder setAddress(String address) {
                this.address = address;
                return this;
            }

            public Person build() {
                return new Person(this);
            }
        }
    }

---

### ✅ 사용 예시

    Person p = new Person.Builder()
                    .setName("철수")
                    .setAge(30)
                    .setAddress("서울")
                    .build();

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-09

## 📘 Java - 싱글톤 패턴과 ArrayList

---

### ✅ 싱글톤(Singleton) 패턴이란?

- 애플리케이션에서 **오직 하나의 인스턴스만 생성**되도록 보장하는 디자인 패턴  
- 전역에서 하나의 객체를 공유할 때 사용  
- 생성자를 `private`으로 선언하고, 내부에 static 인스턴스를 만들어서 외부에 제공

---

### ✅ 싱글톤 패턴 예시

    public class Singleton {
        private static Singleton instance;

        private Singleton() {
            // 생성자 은닉
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

---

### ✅ ArrayList란?

- Java에서 제공하는 동적 크기 배열 클래스  
- 배열과 달리 크기 조절 가능  
- `java.util` 패키지에 포함되어 있음

---

### ✅ ArrayList 기본 사용법

    import java.util.ArrayList;

    ArrayList<String> list = new ArrayList<>();

    // 요소 추가
    list.add("철수");
    list.add("영희");

    // 요소 접근
    String name = list.get(0);  // "철수"

    // 요소 삭제
    list.remove(1);  // "영희" 삭제

    // 크기 확인
    int size = list.size();

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-10

## 📘 Java - 상속(Inheritance)

---

### ✅ 상속이란?

- 기존 클래스(부모 클래스, 슈퍼클래스)의 속성과 메서드를 **재사용**하여 새로운 클래스(자식 클래스, 서브클래스)를 만드는 것  
- 코드의 재사용성과 유지보수성을 높여줌  
- 자식 클래스는 부모 클래스의 모든 public, protected 멤버를 상속받음

---

### ✅ 기본 문법

    public class Parent {
        public void greet() {
            System.out.println("안녕하세요, 부모입니다.");
        }
    }

    public class Child extends Parent {
        public void sayBye() {
            System.out.println("안녕히 가세요, 자식입니다.");
        }
    }

---

### ✅ 사용 예시

    Child c = new Child();
    c.greet();   // 부모 클래스 메서드 호출
    c.sayBye();  // 자식 클래스 메서드 호출

---

### ✅ 메서드 오버라이딩(재정의)

- 자식 클래스에서 부모 클래스의 메서드를 **같은 이름, 같은 매개변수로 다시 구현**하는 것  
- 실행 시 자식 클래스의 메서드가 호출됨 (다형성)

    @Override
    public void greet() {
        System.out.println("안녕하세요, 자식입니다.");
    }

---

### ✅ `super` 키워드

- 부모 클래스의 멤버(변수, 메서드)에 접근할 때 사용

    @Override
    public void greet() {
        super.greet(); // 부모 클래스 메서드 호출
        System.out.println("추가 인사말");
    }

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-11

## 📘 Java - 인터페이스(Interface)

---

### ✅ 인터페이스란?

- 클래스가 구현해야 하는 **메서드의 선언만 가진 일종의 설계도**  
- 다중 상속의 문제를 해결하고, 클래스 간의 **표준화된 계약**을 제공  
- 인터페이스를 구현한 클래스는 인터페이스에 선언된 모든 메서드를 반드시 구현해야 함

---

### ✅ 기본 문법

    public interface Animal {
        void sound();  // 구현부 없이 선언만
    }

    public class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    }

---

### ✅ 특징

- 모든 메서드는 기본적으로 `public abstract`  
- 변수는 `public static final` (상수)  
- 자바 8 이후로는 `default` 메서드와 `static` 메서드도 가능  
- 클래스는 여러 개의 인터페이스를 구현할 수 있음 (다중 구현 가능)

---

### ✅ 사용 예시

    Animal a = new Dog();
    a.sound();  // "멍멍" 출력

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-14

## 📘 Java - 제네릭(Generic)

---

### ✅ 제네릭(Generic) 이란?

- 클래스나 메서드에서 사용할 **데이터 타입을 일반화**하여 컴파일 시 타입 안전성을 제공하는 기능  
- 타입 변환(casting) 오류를 줄이고, 코드 재사용성을 높임

---

### ✅ 제네릭 클래스 예시

    public class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

---

### ✅ 제네릭 메서드 예시

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-15

## 📘 Java - Lambda와 Stream

---

### ✅ Lambda 표현식이란?

- 익명 함수(이름 없는 함수)를 간단하게 표현하는 방법  
- 함수형 인터페이스(추상 메서드가 하나인 인터페이스) 구현 시 주로 사용  
- 코드가 간결해지고, 함수형 프로그래밍 스타일 가능

---

### ✅ Lambda 기본 문법

    (parameters) -> expression

예:

    // Runnable 인터페이스 구현 예
    Runnable r = () -> System.out.println("Hello Lambda");

---

### ✅ Stream API란?

- 컬렉션, 배열 등 데이터 소스를 함수형 스타일로 처리할 수 있도록 도와주는 API  
- 데이터 필터링, 매핑, 집계 등을 쉽고 효율적으로 수행 가능

---

### ✅ Stream 기본 사용법 예시

    import java.util.Arrays;
    import java.util.List;

    List<String> names = Arrays.asList("철수", "영희", "민수", "지영");

    names.stream()
         .filter(name -> name.startsWith("철"))
         .forEach(System.out::println);  // "철수" 출력

---

📅[목차로 돌아가기](#-목차)

---

# 2025-07-16

## 📘 Java - 예외 처리 (Try-Catch)

---

### ✅ 예외(Exception)란?

- 프로그램 실행 중 발생하는 오류 상황  
- 예외를 처리하지 않으면 프로그램이 비정상 종료될 수 있음

---

### ✅ try-catch 문법

- 예외가 발생할 수 있는 코드를 `try` 블록에 작성  
- 예외가 발생하면 `catch` 블록에서 처리

    try {
        // 예외 발생 가능 코드
    } catch (ExceptionType e) {
        // 예외 처리 코드
    }

---

### ✅ 예시

    try {
        int result = 10 / 0;  // ArithmeticException 발생
    } catch (ArithmeticException e) {
        System.out.println("0으로 나눌 수 없습니다.");
    }

---

### ✅ finally 블록

- 예외 발생 여부와 상관없이 항상 실행되는 코드 블록  
- 자원 해제 등 반드시 실행해야 할 코드를 작성

    try {
        // 코드
    } catch (Exception e) {
        // 예외 처리
    } finally {
        // 항상 실행
    }

---

📅[목차로 돌아가기](#-목차)

---

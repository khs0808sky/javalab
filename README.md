# javalab

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
# 2025-07-03

## 📘 Java - 제어문과 반복문
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

* `if`는 조건이 참일 때 실행
* `else if`는 이전 조건이 거짓일 때 다음 조건 확인
* `else`는 모든 조건이 거짓일 때 실행

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

* 값이 명확히 나누는 경우 `switch`문이 더 깊은 형식
* `break`가 없으면 아래로 계속 실행

---

### 🔁 반복문

#### ▶️ for문

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

* 반복 횟수가 정해진 경우 사용
* 초기화; 조건; 증가 순

#### ▶️ while문

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

* 조건만 마지막하면 계속 반복
* 무한루프 주의!

#### ▶️ do-while문

```java
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
```

* **무조건 한 번은 실행**
* 조건 검사는 반복 이후에 수행

---

### 📚 관련 키워드

`if`, `else if`, `else`, `switch`, `for`, `while`, `do-while`, `break`, `continue`

<br><br><br>
# 2025-07-04

## 📘 Java - 클래스(class)

---

### ✅ 클래스란?

- 객체 지향 프로그래밍의 기본 단위
- 변수(필드)와 메서드(함수)를 묶어 하나의 새로운 데이터 타입을 정의
- 객체(Object)는 클래스로부터 생성된 실체(instance)

    public class Person {
        String name;    // 필드
        int age;

        void sayHello() {   // 메서드
            System.out.println("안녕하세요, 저는 " + name + "입니다.");
        }
    }

---

### ✅ 객체 생성과 사용

    Person p = new Person();  // 객체 생성
    p.name = "철수";          // 필드 접근 및 값 할당
    p.age = 29;
    p.sayHello();             // 메서드 호출

- `new` 키워드로 객체 생성
- 점(.) 연산자로 필드와 메서드 접근

---

### ✅ 생성자(Constructor)

- 객체 생성 시 호출되는 특별한 메서드
- 객체 초기화 용도로 사용

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

    Person p = new Person("영희", 25);
    p.sayHello();

---

### ✅ 접근 제어자 (Access Modifier)

| 종류        | 설명                                    |
| ----------- | --------------------------------------- |
| `public`    | 어디서나 접근 가능                       |
| `private`   | 클래스 내부에서만 접근 가능              |
| `protected` | 같은 패키지 또는 상속 관계에서 접근 가능 |
| `default`   | 같은 패키지 내에서만 접근 가능 (명시적 키워드 없음) |

    private String password;  // 외부에서 직접 접근 불가

---

### 📚 관련 키워드

`class`, `object`, `new`, `this`, `constructor`, `public`, `private`, `protected`, `default`, `method`, `field`

<br><br><br>
# 2025-07-07

## 📘 Java - Getter / Setter

---

### ✅ Getter와 Setter란?

- 클래스의 **private** 필드에 외부에서 접근하거나 값을 변경할 때 사용하는 메서드  
- 캡슐화(encapsulation)를 위해 직접 필드에 접근하지 않고, 메서드를 통해 접근하도록 함

---

### ✅ Getter 메서드

    public class Person {
        private String name;

        public String getName() {
            return name;
        }
    }

---

### ✅ Setter 메서드

    public class Person {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
    }

---

### ✅ 사용 예시

    Person p = new Person();
    p.setName("철수");
    System.out.println(p.getName());

---

### 📚 관련 키워드

`getter`, `setter`, `encapsulation`, `private`, `public`, `method`

<br><br><br>
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

### 📚 관련 키워드

`builder pattern`, `fluent interface`, `immutable object`, `design pattern`

<br><br><br>
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

### 📚 관련 키워드

`singleton`, `design pattern`, `ArrayList`, `java.util`, `dynamic array`, `collection`

<br><br><br>
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

### 📚 관련 키워드

`inheritance`, `extends`, `super`, `override`, `polymorphism`, `is-a 관계`

<br><br><br>
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

### 📚 관련 키워드

`interface`, `implements`, `abstract method`, `default method`, `multiple inheritance`, `polymorphism`

<br><br><br>
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

### 📚 관련 키워드

`generic`, `type safety`, `type parameter`, `compile-time checking`, `code reuse`

<br><br><br>
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

### 📚 관련 키워드

`lambda`, `functional interface`, `Stream API`, `filter`, `map`, `forEach`, `functional programming`

<br><br><br>
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

### 📚 관련 키워드

`exception`, `try`, `catch`, `finally`, `throw`, `throws`, `Exception handling`

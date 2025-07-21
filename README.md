# javalab

## 📅 목차

- [2025-07-03](#2025-07-03)
- [2025-07-04](#2025-07-04)
- [2025-07-07](#2025-07-07)

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

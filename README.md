# javalab

## 📅 목차

- [2025-07-03](#2025-07-03)

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


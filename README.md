# 🧪 Automation Practice Project

UI test automation for [demoblaze.com](https://www.demoblaze.com) using Java, Selenium WebDriver, and JUnit4. Follows the Page Object Model with PageFactory.

## ⚙️ Tech Stack

- Java 21
- Maven
- Selenium WebDriver 4.20.0
- JUnit 5.8.1
- WebDriverManager

## 🗂️ Project Structure

```
src
├── main
│   └── java
│       └── pages
│           ├── HomePage.java
│           ├── LoginPage.java
│           ├── SignUpPage.java
│           ├── ProductPage.java
│           └── CartPage.java
└── test
    └── java
        └── tests
            ├── BaseTest.java
            ├── LoginTests.java
            ├── SignUpTests.java
            ├── AddToCartTests.java
            └── CartTests.java
```

## ▶️ Run Tests

1. Clone the repo and open in IntelliJ (or any IDE).
2. Run:
   ```bash
   mvn clean test
   ```

## ✅ Covered Tests

- User registration (`SignUp`)
- User login (`Login`)
- Add product to cart
- View and delete items from cart
- Category selection

## ✍️ Author

Natali Ishakov

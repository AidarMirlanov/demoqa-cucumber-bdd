# demoqa-cucumber-bdd

BDD test automation project for [DemoQA](https://demoqa.com) using Cucumber framework.

## 🛠 Tech Stack

| Tool | Purpose |
|------|---------|
| Java 17 | Programming language |
| Cucumber | BDD framework |
| Selenide | UI browser automation |
| JUnit 5 | Test runner |
| Allure | Test reporting |
| Maven | Build tool |

## 📋 Test Coverage

- Background scenarios
- Data Table tests
- Data Table with POJO
- Scenario Outline
- Text Box interactions

## 🚀 How to Run

### All tests
```bash
mvn test
```

### Allure Report
```bash
mvn allure:serve
```

## 📁 Project Structure

- `features/` — Gherkin feature files
- `steps/` — Step definitions
- `pages/` — Page Object classes

# 🧪 Selenium Automation Framework - AutomationExercise.com

This project is a **test automation framework** built with **Java + Selenium WebDriver**, designed to validate the functionality of the [Automation Exercise](https://www.automationexercise.com) website.

It demonstrates **best practices in QA Automation**, including a modular structure, Page Object Model, reusable components, and detailed test reporting.

---

## 🧠 Key Features

- 🧩 **Page Object Model (POM)** design pattern  
- ⚙️ Configurable setup using `.properties` files  
- 🧾 Automated test reports with **Log4j / Extent Reports**  (in Development)
- 🧪 Functional and regression tests using **TestNG**  
- 🌐 Cross-browser testing (Chrome)    (Firefox and Edge in Development)
- 📸 Screenshot capture on test failure    (in Development)
- 🔁 Integrated with **Maven** and **GitHub** 

---

## 🛠️ Technologies Used

| Component | Technology |
|------------|-------------|
| Language | Java 17 |
| Test Framework | TestNG / JUnit 5 |
| Web Automation | Selenium WebDriver |
| Build Tool | Maven |
| Logging / Reports | Log4j / Extent Reports |
| IDE | Eclipse IDE / IntelliJ IDEA |
| Version Control | Git / GitHub |

---

## 🚀 Project Structure
📁 src
┣ 📂 main/java
┃ ┣ 📂 pages/ # Page objects
┃ ┣ 📂 utils/ # Utilities (driver, config, helpers)
┃ ┣ 📂 core/ # Core framework components (BaseTest, DriverManager, etc.)
┣ 📂 test/java
┃ ┣ 📂 tests/ # Test classes / suites
┣ 📄 pom.xml # Maven dependencies & plugins
┣ 📄 config.properties # Configuration for browser, base URL, etc.
┣ 📄 testng.xml # (if using TestNG) suite definition
README.md

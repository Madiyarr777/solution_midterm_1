# Midterm Exam Project: Smart Home + Payment Gateway + Coffee Shop


## 📖 Table of Contents
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Installation](#-installation)
- [Usage](#-usage)
- [Technologies](#-technologies)
- [License](#-license)

## 🚀 Features

### 1. Smart Home Control System
- **Design Patterns**: Composite, Decorator, Adapter, Facade, Abstract Factory
- Device management via `SmartHomeController`
- SmartWatch integration via `SmartWatchAdapter`
- Energy-saving mode with `EcoModeDecorator`

### 2. Payment Gateway
- **Design Patterns**: Factory Method, Adapter
- Supports credit cards and PayPal with encryption (`SecurePaymentDecorator`)
- Custom error handling via `PaymentException`

### 3. Coffee Shop Simulator
- **Design Patterns**: Factory Method, Decorator
- Seasonal drinks via `AutumnCoffeeFactory`
- Loyalty program with `LoyaltyDecorator`

## 🗂️ Project Structure
```
src/
├── smarthome/       # Smart Home System
│   ├── core/        # Base interfaces
│   ├── integrations/ # External device adapters
│   ├── decorators/  # Functionality extensions
│   └── control/     # Management facade
│
├── payment/         # Payment System
│   ├── processors/  # Payment methods
│   └── exceptions/  # Custom errors
│
├── coffee/          # Coffee Shop
│   ├── core/        # Base coffee types
│   ├── factories/   # Drink creation
│   └── decorators/  # Toppings/discounts
│
└── demo/            # Demo implementation
    └── UnifiedDemo.java
```

## 💻 Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Madiyar777/solution_midterm_1.git
   ```
2. Compile the project:
   git bash
   javac -d out src/**/*.java
   ```

## 🛠️ Usage
Run the unified demo:
git bash
java -cp out demo.UnifiedDemo
```


## 🔧 Technologies
- Java 21
- **Design Patterns Used:**
  - Composite
  - Decorator
  - Abstract Factory
  - Facade
  - Adapter
  - Factory Method

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

> **Anti-Plagiarism Notice:** Unique identifiers (VL prefixes) and custom class names are implemented to prevent code duplication.


# 📘 Diary Application – Factory Pattern Implementation

## 🧪 Testing & Implementation Overview

The application was tested using two different repository implementations:

- **XML-based storage** via `XmlRepositoryFactory`  
- **CSV-based storage** via `CsvRepositoryFactory`

In both cases, the **overall application behaviour remained consistent**, while the output clearly indicated that a different concrete repository was being used.  

This demonstrates a key design goal:  
👉 **The storage mechanism is fully abstracted from the core application logic.**

---

## 🏗️ Design Architecture

The system follows a **Factory Design Pattern**, ensuring loose coupling between components:

- `DiaryService` interacts only with the **`AppointmentRepository` abstraction**
- Concrete implementations (XML or CSV) are **not directly referenced**
- Repository instances are created via **factory classes**

### 🔹 Key Benefit

This design allows:
- Easy switching of storage types  
- No changes required in business logic  
- Improved scalability and maintainability  

---

## ✅ Functional Verification

The test results confirm that all required functionalities work correctly:

- ✔️ **Appointment Creation**  
  Successfully adds new appointments when the time slot is available  

- ❌ **Duplicate Booking Prevention**  
  Prevents multiple bookings for the same date and time slot  

- 🔍 **Appointment Retrieval**  
  Correctly fetches existing appointments  

- 🗑️ **Appointment Deletion**  
  Removes appointments accurately from the system  

---

## 🎯 Conclusion

The implementation successfully:

- Encapsulates storage details using the **Factory Pattern**
- Maintains consistent behaviour across different storage types
- Ensures core functionalities operate correctly regardless of implementation

👉 This confirms that the design meets the requirement of **hiding storage implementation while preserving full diary functionality**.

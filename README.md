# **Advanced Programming Test Cases**

## **Setup Environment**
If you are using **IntelliJ IDEA**, you can add the provided **Abstract** and **Interface** classes as dependencies by following these steps:

1. Open **IntelliJ IDEA**.
2. Go to **File → Project Structure**.
3. Select **Modules** from the left panel.
4. Click on the **Dependencies** tab.
5. Click **+ (Add) → Jars or directories**.
6. Select the folder **`source/class`** that contains the bytecode.
7. When prompted, choose **Classes**.
8. Click **OK** to save the changes.

---

## **Migrate Your Source Code**

### **1. Copy `source/` Directory**
- Copy the **`source/`** directory into your **project’s root folder**.

### **2. Copy `util/Utility.java`**
- Copy **`util/Utility.java`** into the `util` folder.
- Note that there may be some **inconsistencies** between `int` and `long` in the code. You may need to **adjust test cases accordingly**.
- If your utility function for getting the **Nth Fibonacci number** is named differently, modify your test case (`UtilityTest.java`) to match your function’s name.
    - Example: The function **`getNthFibonacci()`** should be reformatted to your corresponding function.

---

## **Expected Directory Structure**
Once you’ve set up the files correctly, your project should have the following structure:

```
+---class
|       Battle.class
|       Combatable.class
|       Fighter.class
|       Human.class
|       Main.class
|       Monster.class
|
+---source
|       DeathEater.java
|       Knight.java
|       Paladin.java
|       Warrior.java
|
+---test
|       (Test files)
|
\---util
        Complex.java
        TeamMaker.java
        Utility.java
```

---

## **Run Tests**
Once the setup is complete, run **`source/MainTest.java`** and check the results.

---

## **Contributing**
If you’d like to contribute, feel free to **make a pull request (PR)** to the repository.  

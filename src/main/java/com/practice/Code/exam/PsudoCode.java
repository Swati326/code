package com.practice.Code.exam;

public class PsudoCode {
    static int count = 0;

    static {
        System.out.println("Static block called");
    }

    public PsudoCode() {
        count++;
        System.out.println("Object created");
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        PsudoCode d1 = new PsudoCode(); // 0
        PsudoCode d2 = new PsudoCode();
        System.out.println("Total objects: " + PsudoCode.getCount());
    }
}
/*obj.staticVar → Parent Static
Static variables are resolved at compile time based on reference type, not actual object.

obj is of type Parent, so it prints Parent's staticVar.

❗ Static variables do not participate in method overriding or polymorphism.

🔹 obj.finalVar → Parent Final
Final variables behave like instance variables.

But since they are not overridden, and the reference is Parent, it picks Parent's finalVar.

Remember: final means you can't override it, but it still belongs to the declared type.

🔹 obj.instanceVar → Parent Instance
Same as above — instance variables are not polymorphic in Java.

The reference type (Parent) decides what is accessed

🎯 Final Verdict:
Feature	Resolved Using
Static method	             Reference type
Static variable	             Reference type
Static block	             Class itself (at load time)
Instance variable	         Reference type
Instance method	             Object type ✅ (true polymorphism)

chatgpt link for: https://chatgpt.com/c/6864f181-dcf0-8003-89ef-e4df1f82716b





*/
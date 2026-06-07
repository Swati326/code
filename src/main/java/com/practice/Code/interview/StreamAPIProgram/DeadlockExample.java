package com.practice.Code.interview;




    class Resource {
        void use() {
            System.out.println(Thread.currentThread().getName() + " resource use kar raha hai");
        }
    }

    public class DeadlockExample {
        static final Resource resource1 = new Resource();
        static final Resource resource2 = new Resource();

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println("Thread 1 ne Resource 1 lock kiya");

                    try { Thread.sleep(100);
                    }
                    catch (InterruptedException e) {

                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 ne Resource 2 lock kiya");
                    }
                }
            });

            Thread t2 = new Thread(() -> {
                synchronized (resource2) {  // Opposite order → Deadlock
                    System.out.println("Thread 2 ne Resource 2 lock kiya");

                    try { Thread.sleep(100); } catch (InterruptedException e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2 ne Resource 1 lock kiya");
                    }
                }
            });

            t1.start();
            t2.start();
        }
    }

    /*

    Sahi Approach 1: Ek Hi Order Me Lock Lo (Same Order Strategy)

    class Resource {
    void use() {
        System.out.println(Thread.currentThread().getName() + " resource use kar raha hai");
    }
}

public class DeadlockFixed {
    static final Resource resource1 = new Resource();
    static final Resource resource2 = new Resource();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {  // Pehle resource1 ka lock lo
                System.out.println("Thread 1 ne Resource 1 lock kiya");

                synchronized (resource2) {  // Phir resource2 ka lock lo
                    System.out.println("Thread 1 ne Resource 2 lock kiya");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource1) {  // Pehle resource1 ka lock lo (same order)
                System.out.println("Thread 2 ne Resource 1 lock kiya");

                synchronized (resource2) {  // Phir resource2 ka lock lo
                    System.out.println("Thread 2 ne Resource 2 lock kiya");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
============================

public class BankDeadlockSolution {
    public static void transferMoney(Account from, Account to, int amount) {
        Account firstLock = from.hashCode() < to.hashCode() ? from : to;
        Account secondLock = from.hashCode() < to.hashCode() ? to : from;

        synchronized (firstLock) {  // 🔴 Pehle chhoti ID wale account ko lock karega
            System.out.println(Thread.currentThread().getName() + " locked " + firstLock.getName());

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (secondLock) {  // 🔵 Fir dusre account ko lock karega
                System.out.println(Thread.currentThread().getName() + " locked " + secondLock.getName());

                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposit(amount);
                    System.out.println(amount + " transferred from " + from.getName() + " to " + to.getName());
                } else {
                    System.out.println("Insufficient balance in " + from.getName() + "'s account!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Account userA = new Account("User A", 1000);
        Account userB = new Account("User B", 2000);

        Thread t1 = new Thread(() -> transferMoney(userA, userB, 500), "Transaction-1");
        Thread t2 = new Thread(() -> transferMoney(userB, userA, 1000), "Transaction-2");

        t1.start();
        t2.start();
    }
}

     */



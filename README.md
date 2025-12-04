
This project aims to **highlight the value of the Builder design pattern** in an **asynchronous context**, compared to traditional factory patterns.

By *asynchronous*, we mean **collecting the necessary parts to construct an object in a delayed and unpredictable manner**.

---

## Branches

The project has **two branches**:

1. **`main`** – Demonstrates the traditional, step-by-step construction of an object.
2. **`asynchronous`** – Demonstrates building an object in a delayed and non-deterministic order.

---

## Use Case: Constructing a Turtle

- Both branches focus on **constructing a Turtle object**.
- The **sequential branch** showcases two packages:
    - `builder` – Implements the Builder pattern
    - `factory` – Implements the Factory pattern

> **Note:** The steps to construct a Turtle are **not complex** and have a **fixed order**. Typically, a simple factory would suffice.

---

 

## Design Notes

- There is **only one type of Turtle** to create.
- While it is not strictly necessary to abstract the Builder or Factory with interfaces, **interfaces were added for demonstration purposes**.
- This setup allows comparison between **sequential and asynchronous object construction** in a controlled example.

## Asynchronous branch
For the asynchronous branch, we implemented an Observer that randomly generates parts with a delay. The Builder is designed to wait for the next step to construct, remaining unblocked by these delays.

However, when attempting to implement the corresponding Factory logic, the only viable solution seemed to be using a cache to store the generated values.

I find this approach problematic for several reasons:

After gathering all the necessary information, we would need to map each cache entry to its corresponding parameter in the constructor or factory method.

There is no clear mechanism to determine when an object is fully ready for creation. Without having the object itself during the construction phase, it becomes impossible to perform intermediate tests or validations while the object is still “under construction.”


- There is **only one type of Turtle** to create.
- While it is not strictly necessary to abstract the Builder or Factory with interfaces, **interfaces were added for demonstration purposes**.
- This setup allows comparison between **sequential and asynchronous object construction** in a controlled example.

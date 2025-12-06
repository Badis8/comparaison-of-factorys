
This project aims to **highlight the value of the Builder design pattern** in an **asynchronous context**, compared to traditional factory patterns.

By *asynchronous*, we mean **collecting the necessary parts to construct an object in a delayed and unpredictable manner**.

---
## branches
we have only one main branch containning the factorys, within different contexts , with their tests
## Packaging

The project has  two main ** packages**:

1. **`sequential`** – Demonstrates the traditional, step-by-step construction of an object.
2. **`asynchronous`** – Demonstrates building an object in a delayed and non-deterministic order.

---

## Use Case: Constructing a Turtle

- Both branches focus on **constructing a Turtle object**.
- The **sequential package** showcases two packages:
    - `builder` – Implements the Builder pattern
    - `factory` – Implements the Factory pattern

> **Note:** The steps to construct a Turtle are **not complex** and have a **fixed order**. Typically, a simple factory would suffice.

---

## Design Notes

- There is **only one type of Turtle** to create.
- While it is not strictly necessary to abstract the Builder or Factory with interfaces, **interfaces were added for demonstration purposes**.
- This setup allows comparison between **sequential and asynchronous object construction** in a controlled example.



## unit test and goal

some unit test have been implemented to show case my point , all though the sequential test does not high lights 
the benefit of one creational pattern over the other, the aynschronous one aims to show my three main points : 

1) a builder has an inside reference to a product (turtle) mid creation ,and could know if they are ready to be used all thoguht not fully created , a servie might be intrested to use a turtle with just a shell
2) additional algorithms are needed to complete the product under a normal factory after receiving all the  data needed to create a product (turtle), 
3) a normal factory does not allow a semi foncitonal product (just a schell turtle) to be used via a service 
4) on a normal facotyr we need to have inside knowledge of the product to know when its "ready" to be created , after collecting the asynchoronus data (we dont have a in memory turtle to tell us when its ready , modifying buisness turtle logic would result to modify factorys)
5) any improvements of the additional algorithms  from the normal factory would result into the approachign the builder facotry

points 2 3 4 5 are better seen under the asynchronous StubbornTurtleFactory
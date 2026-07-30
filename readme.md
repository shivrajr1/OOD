# Design Patterns in Java

This repository contains implementations of all **23 Gang of Four (GoF) Design Patterns** along with the **Null Object Pattern**. Each pattern demonstrates a reusable solution to a common software design problem.

## Creational Design Patterns

| Pattern | Definition |
|---------|------------|
| Abstract Factory | Creates families of related objects without specifying their concrete classes. |
| Builder | Constructs complex objects step by step while keeping the construction process separate from the representation. |
| Factory Method | Defines an interface for creating objects while allowing subclasses to decide which class to instantiate. |
| Prototype | Creates new objects by copying an existing object instead of creating one from scratch. |
| Singleton | Ensures that only one instance of a class exists and provides a global access point to it. |

---

## Structural Design Patterns

| Pattern | Definition |
|---------|------------|
| Adapter | Converts the interface of one class into another interface expected by clients. |
| Bridge | Separates abstraction from implementation so that both can vary independently. |
| Composite | Composes objects into tree structures to represent part-whole hierarchies. |
| Decorator | Adds new responsibilities to an object dynamically without changing its structure. |
| Facade | Provides a simplified interface to a complex subsystem. |
| Flyweight | Reduces memory usage by sharing common object data among multiple objects. |
| Proxy | Provides a placeholder or surrogate object to control access to another object. |

---

## Behavioral Design Patterns

| Pattern | Definition |
|---------|------------|
| Chain of Responsibility | Passes a request through a chain of handlers until one of them processes it. |
| Command | Encapsulates a request as an object, allowing parameterization and undoable operations. |
| Interpreter | Defines a grammar and interprets sentences in a language. |
| Iterator | Provides a way to access elements of a collection sequentially without exposing its implementation. |
| Mediator | Centralizes communication between objects to reduce their dependencies. |
| Memento | Captures and restores an object's previous state without violating encapsulation. |
| Observer | Defines a one-to-many dependency so that observers are notified automatically when a subject changes. |
| State | Allows an object to change its behaviour when its internal state changes. |
| Strategy | Defines a family of algorithms and makes them interchangeable at runtime. |
| Template Method | Defines the skeleton of an algorithm while allowing subclasses to customize specific steps. |
| Visitor | Separates operations from the objects on which they operate by using a visitor object. |

---

## Additional Pattern

| Pattern | Definition |
|---------|------------|
| Null Object | Provides a default object with neutral behaviour instead of using `null` references. |

---

## Repository Structure

```
abstract-factory/
adapter/
bridge/
builder/
ChainofResponsibility/
command/
composite/
decorator/
facade/
factory/
flyweight/
interpreter/
iterator/
mediator/
memento/
null/
observer/
prototype/
proxy/
singleton/
state/
strategy/
template/
visitor/
```

## Goal

This repository is intended for learning and understanding software design patterns through practical Java implementations. Each folder contains an implementation of a specific design pattern with example code.
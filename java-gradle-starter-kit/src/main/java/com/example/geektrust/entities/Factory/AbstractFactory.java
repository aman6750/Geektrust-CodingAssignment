package com.example.geektrust.entities.Factory;

import com.example.geektrust.entities.Subscription;
import com.example.geektrust.enums.SubscriptionPlan;

public abstract class AbstractFactory {

	abstract Subscription getSubscriptionPlan(SubscriptionPlan subscriptionPlanType);
}

/*
 This is an abstract class that defines the factory design pattern. The factory design pattern is a creational
  pattern that provides an interface to create objects in a superclass but allows subclasses to alter the type
   of objects that will be created. In this case, the AbstractFactory class provides an interface for creating
    Subscription objects, but the type of Subscription object created will depend on the implementation of the
     getSubscriptionPlan method in its subclasses.

The AbstractFactory class defines the getSubscriptionPlan method as abstract, which means that its
 implementation will be provided by its subclasses. This method takes a SubscriptionPlan object as input and 
 returns a Subscription object. The SubscriptionPlan object represents the type of subscription plan that the 
 client wants to create, and the Subscription object represents the specific subscription plan that is created.

By using this factory design pattern, the client code can create Subscription objects without having to know 
the details of how the subscription objects are created. Instead, the client code simply calls the 
getSubscriptionPlan method on an instance of a subclass of the AbstractFactory class, passing in a 
SubscriptionPlan object that represents the type of subscription plan that is needed. The getSubscriptionPlan 
method then creates the appropriate Subscription object based on the SubscriptionPlan object passed in.
 */

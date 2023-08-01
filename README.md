# multithreading
Multithreading Practices

## :thread: Multithreading -> achieved -> Runnable Interface & Thread class
- Should go for Runnable since we can implement it along with that we can extend other class as well
- But with Thread class we cannot extend other class.
> Note: In order to start thread created from **Runnable** interface, we need to pass the reference of the class where it was implemented to Thread class and then call object of Thread class with method obj.start();
- In case of Thread created by extending **Thread** class we just need to call the method start() of the reference of that particular class.

## :knot: Multithreading Lifecycle
-   




# Multithreading
Multithreading Best Practices

## :thread: Multithreading -> achieved -> Runnable Interface & Thread class
- Should go for Runnable since we can implement it along with that we can extend other class as well
- But with Thread class we cannot extend other class.
> Note: In order to start thread created from **Runnable** interface, we need to pass the reference of the class where it was implemented to Thread class and then call object of Thread class with method obj.start();
- In case of Thread created by extending **Thread** class we just need to call the method start() of the reference of that particular class.

## :knot: Thread Lifecycle
![Thread Lifecycle](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*AVdsesDdmzZz4XoKi-AHWQ.png)


## :sewing_needle: Thread Operations
- Thread class has methods to perform **operations** on Threads.
- run() basically contains the `task` of the thread. (functionality)
- start() will actually start the thread by `allocating resources.`
- setPriority() & getPriority()
- sleep()

## :black_joker: Daemon Thread
- Daemon threads `serve` user threads by `handling background tasks` and have no role other than `supporting` the main execution.
- They run in the background to perform tasks such as **garbage collection or provide services to user threads.**
- The life of a daemon thread **depends** on the mercy of user threads.


## :building_construction: Producer & Consumer

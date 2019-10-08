
### Process and Thread
Thread is a flow of execution of the process. For Linux kernel, there is no concept of thread and thread is viewed as a separate process, often called as Light Weight Process. 
All threads in the same process own the same pid and have the same thread group leader, while their ppid is 1.
Child process's ppid is the parent process's pid, and its tgid equals to its pid.






The core idea: you want to visit every node level-by-level. That's exactly what a queue gives you - FIFO order matches the order you discover the nodes.

The size  = queue.size() trick before the inner loop is the key insight -- It's how you know where one level ends and the next begins. 

Github: 
#include <iostream>
#include <thread>
#include <vector>
#include <unordered_map>

// Function to find the nth Fibonacci number using recursion with memoization
int fibonacci(int n) {
    if (n <= 1)
        return n;

    static std::unordered_map<int, int> memo;

    // Check if the Fibonacci number is already computed and stored in the memo
    if (memo.find(n) != memo.end())
        return memo[n];

    // Compute Fibonacci number recursively and store it in the memo
    memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    return memo[n];
}


int main()
{
    std::vector<int> values = {1, 2, 3, 4, 5}; // Fibonacci numbers to compute
    int threadPoolSize = values.size();
    std::vector<std::thread> threads(threadPoolSize);
    std::vector<int> threadfibs(threadPoolSize);
    int i=0;

    // Start threads to compute Fibonacci numbers in parallel

    for (int n : values) {
            threads[i] = std::thread([&threadfibs, n, i]() {
            threadfibs[i] = fibonacci(n);
        });
        i++;

    }

    // Join all threads
    for (std::thread& t : threads) {
        t.join();
    }
    for (int i=0;i<threadPoolSize;i++){
        std::cout << "Fibonacci(" << values[i] << ") = " << threadfibs[i] << std::endl;
    }

    return 0;
}

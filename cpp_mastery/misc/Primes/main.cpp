
#include <iostream>
#include <cmath>

using namespace std;

// Function to check if a number is prime
/*
https://www.quora.com/Is-every-prime-number-other-than-2-and-3-of-the-form-6k%C2%B11-Is-this-a-proven-result-What-are-other-resources-about-it
*/
bool isPrime(int num) {
    // Check if the number is less than 2
    if (num < 2)
        return false;

    // Check if the number is 2 or 3
    if (num == 2 || num == 3)
        return true;

    // Check if the number is divisible by 2 or 3
    if (num % 2 == 0 || num % 3 == 0)
        return false;

    // Check divisibility by numbers of the form 6k ± 1 up to sqrt(num)
    // Every prime number can be expressed in the form 6k+-1 except 2 and 3
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0)
            return false;
    }

    // If the number is not divisible by any smaller primes, it is prime
    return true;
}

int main() {
    const int lowerLimit = 5;
    const int upperLimit = 10000000;
    long long sum = 0;

    // Iterate through the range from lowerLimit to upperLimit
    for (int num = lowerLimit; num <= upperLimit; num += 6) {
        // Check if num and num + 2 are prime and don't end in 3
        if (isPrime(num) && num % 10 != 3) {
            sum += num;
        }
        if (num + 2 <= upperLimit && isPrime(num + 2) && (num + 2) % 10 != 3) {
            sum += (num + 2);
        }
    }

    // Print the sum of primes meeting the specified criteria
    std::cout << "Sum of primes from " << lowerLimit << " to " << upperLimit
              << " (excluding primes ending in 3): " << sum << std::endl;

    return 0;
}




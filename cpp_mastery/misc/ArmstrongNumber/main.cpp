#include <iostream>
#include <math.h>

using namespace std;

/*
Input : 120
Output : No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input : 1253
Output : No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723
*/
class ArmstrongNumber{
public:
    static bool isArmstrong(int &&num){ //num is rvalue ref
        int numDigits=0;
        int temp=num;
        while(temp){
            temp=temp/10;
            numDigits++;
        }
        int sum=0;
        temp=num;
        while(temp){
            int digit=temp%10;
            sum+=pow(digit,3);
            temp=temp/10;
        }
        return (sum==num);
    }
};

/*
A number is a perfect number if is equal to sum of its proper divisors,
that is, sum of its positive divisors excluding the number itself.
*/
class PerfectNumber{
public:
    static bool isPerfect(long long int num){
        long long int sum=1;
        //Run a loop till square root of num
        //and include both divisor and num/divisor at one go
        //why? because we are running he loop till sq root which is healf way through
        for(long long int i=2;i*i<=num;i++){
            if (i*i==num){
                sum+=i;
            }else{
                //eg 6 = 2*3
                //i=2 and num/i is 3
                sum+=i+num/i;
            }
        }
        return (sum==num);
    }
};
int main()
{
    cout << "Hello world!" << endl;

    cout<<"\n Is 120 armstrong ? "<<(ArmstrongNumber::isArmstrong(120)?"Yes":"No");
    cout<<"\n Is 153 armstrong ? "<<(ArmstrongNumber::isArmstrong(153)?"Yes":"No");

    cout<<"\n Is 6 perfect number ? "<<(PerfectNumber::isPerfect(6)?"Yes":"No");
    cout<<"\n Is 15 perfect number ? "<<(PerfectNumber::isPerfect(15)?"Yes":"No");
    return 0;
}

#include <iostream>
using namespace std;

int main()
{
	long long rows = 0;
	long long temp = 0;
	long long sum = 0;
	long long max = 0;

	cin >> rows;
    
    
    for (int i = 0; i < rows; ++i)
    {
        cin >> temp;
        sum += temp;
        if (sum < 0)
            sum = 0;
        if (sum > max)
            max = sum;
    }

	cout << max;

	return 0;
}

#include <iostream>
#define sumit long long int
using namespace std;
int main()
{
    sumit x, y;
    cin >> x >> y;
    sumit arr[x], brr[y];
    for (sumit i = 0; i < x; i++)
    {
        cin >> arr[i];
    }
    for (sumit i = 0; i < y; i++)
    {
        cin >> brr[i];
    }
    sumit c = 0;
    for (sumit i = 1; i <= 100; i++)
    {
        bool yes = true, yess = true;
        for (sumit j = 0; j < x; j++)
        {
            if (i % arr[j] != 0)
            {
                yes = false;
                break;
            }
        }
        for (sumit j = 0; j < y; j++)
        {
            if (brr[j] % i != 0)
            {
                yess = false;
                break;
            }
        }
        if (yes && yess)
        {
            c++;
        }
    }
    cout << c;
    return 0;
}
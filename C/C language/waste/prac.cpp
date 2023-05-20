#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
   int check=89;
    for (int i = 2; i <= n; i++)
    {

        for (int j = 1; j <= (i / 2); j++)
        {

            if (i % j == 0 && ( j != 1))
            { 
                check=1;
                break;
                
            }
             else{
                check=89;
             }
            
        }
       
    if(check!=1){
             cout<<i<<" ";
         }

    }


    return 0;
}
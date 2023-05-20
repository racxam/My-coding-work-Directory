//STL Containers
//1. Sequence Container--ex.vector,list, dequeue
//2. Associative Container-- ex. set, multiset, dictionary, map , multimap
//3. Derived Container --ex. Stack queue[made for real time purposes]
//Today we'll talk about vectors here
#include<iostream>
using namespace std;
#include<vector>
void disp(vector<int> &v){
    for(int i=0;i<v.size();i++){

    cout<<v[i]<<" ";
   
    }
    cout<<endl;
    for(int i=0;i<v.size();i++){

 cout<<v.at(i)<<" ";
   
    }
   
}
int main(){
    vector<int> vec;
    cout<<"Enter the size of the array\n";
    int size;
    cin>>size;
    for(int i=0;i<size;i++){


        vec.push_back(i);
    }
    vector<int>::iterator poi= vec.begin();
    vec.erase(vec.begin(),vec.begin()+6);

 
    disp(vec);
    return 0;
}

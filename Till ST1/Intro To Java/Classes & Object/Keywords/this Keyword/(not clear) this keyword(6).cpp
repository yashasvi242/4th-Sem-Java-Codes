// code in cpp

#include <iostream>

using namespace std;

class Demo {
    
    public:
    
    int number;
    
    Demo(){
        number = 0;
    }
    
    void getName(){
        cout << "Object Returned" << endl;
    }
    
};

int main() {
    
    Demo d;
    Demo d1 = d; // this line will create a copy 'd2' of object 'd' 
    
    d1.number = 100;
    
    cout << "d's number : " << d.number << endl;
    cout << "d1's number : " << d1.number << endl;
    
}

/*
Output :-

d's number : 0
d1's number : 100

*/

#include <iostream>
#include <string>


using namespace std; 

int main()
{
	cout << "Hello world" << endl; 

	for (int i = 0; i < 6; i++)
	{
		cout << i << endl; 
	}

	string s = "used visual studio code"; 
	
	for(int i = 0; i < s.length(); i++)		// this was an error 
	{
		cout << s[i] << endl; 
		
	}
	return 0;
}


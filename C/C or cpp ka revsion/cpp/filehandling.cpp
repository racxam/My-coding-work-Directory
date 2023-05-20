/* file handling in cpp 
There are 3 classes in cppp
1. ifstream - input file stream
2. ofstream - output file stream
3. fstream - file stream

1st step to open the file for reading and writing purpose
1. passing file name in the constructor at the time of obj creation
2. using open method

modes of file
in
out
binary
ate- at end
app- append
beg- beginning 
trunc- truncate (any data in the file before opening the file will now be discarded)

default open modes
ifstream= ios::in
ofstream= ios::out
fstream= ios::in or ios::out



*/
/* File Handling with C++ using ifstream & ofstream class object*/
/* To write the Content in File*/
/* Then to read the content of file*/
#include <iostream>

/* fstream header file for ifstream, ofstream,
fstream classes */
#include <fstream>

using namespace std;

// Driver Code
int main()
{
	// Creation of ofstream class object
	ofstream fout;

	string line;

	// by default ios::out mode, automatically deletes
	// the content of file. To append the content, open in ios:app
	// fout.open("sample.txt", ios::app)
	fout.open("sample.txt");

	// Execute a loop If file successfully opened
	while (fout) {

		// Read a Line from standard input
		getline(cin, line);

		// Press -1 to exit
		if (line == "-1")
			break;

		// Write line in file
		fout << line << endl;
	}

	// Close the File
	fout.close();

	// Creation of ifstream class object to read the file
	ifstream fin;

	// by default open mode = ios::in mode
	fin.open("sample.txt");

	// Execute a loop until EOF (End of File)
	while (fin) {

		// Read a Line from File
		getline(fin, line);

		// Print line in Console
		cout << line << endl;
	}

	// Close the file
	fin.close();

	return 0;
}


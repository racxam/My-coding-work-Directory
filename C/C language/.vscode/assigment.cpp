#include <iostream>

#include <fstream>

using namespace std;

void vowelwords()

{

    ifstream fin;

    fin.open("FIRST.TXT");

    ofstream fout;

    if (!fin)

        cout << "NO SUCH FILE FOUND !!!" << endl;

    fout.open("SECOND.TXT");

    char word[30];

    while (!fin.eof())

    {

        fin >> word;

        if (word[0] == 'a' || word[0] == 'e' || word[0] == 'i' || word[0] == 'o' || word[0] == 'u')

            fout << word << " ";
    }

    fin.close();

    fout.close();
}

int main()

{

    vowelwords();
}
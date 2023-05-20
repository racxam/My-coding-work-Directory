#include <iostream>
#include <string>
#include <fstream>
 #include <unistd.h>

using namespace std;


struct Student {
    char name[100], dob[100], uid[100], fname[100], mname[100], address[100], mail[100];
    int roll, sem;

    char s1[100], s2[100], s3[100], s4[100], s5[100];
    float m1, m2, m3, m4, m5;
};

void welcomeScreen() {
    system("clear");
    cout << "\n\t\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    cout << "\n\t\t\t\t        =                 WELCOME TO                =";
    cout << "\n\t\t\t\t        =               Student Record              =";
    cout << "\n\t\t\t\t        =                 MANAGEMENT                =";
    cout << "\n\t\t\t\t        =                   SYSTEM                  =";
    cout << "\n\t\t\t\t        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" << endl;

    cout << "\n\t\t\t\t\t\t\tLoading data";
    for (int i = 0; i < 5; i++)
    {
        sleep(1);
        cout << "  ."<<flush;
    }
    sleep(1.5);
    system("clear");
}
void exitScreen() {
    system("clear");
    cout << "\n\tThank you for using this software." << endl
         << endl;
    cout << "\tDeveloped By:";
    cout << "\n\n";
    cout << "\t         Name                        UID              Class " << endl;
    cout << "\t   1. Kishan Poddar                20BCG1111         20BCG1-B" << endl;
    cout << "\t   2. Sumit Kumar Jhaldiyal        20BCG1115         20BCG1-B" << endl;
    cout << "\t   3. Pronoy Nath                  20BCG1096         20BCG1-B" << endl;
    cout << "\n\t\t\t\t   Submitted To: Mrs. Nisha Gautam\n";
    cout << "\t\t\t\t   Submission Date: 27 July 2021\n ";
    exit(0);
}

void addStudent() {
    system("clear");
    Student s;
    ofstream outfile;
    outfile.open("report.txt", ios::app | ios::binary);
   
    cout << "\n\n";
    cout << "\t\t\t\t=======CREATE A REPORT CARD========\n\n";
    cout << "ENTER YOUR FULL NAME :";
    fflush(stdin);
    cin.get(s.name, 25);
    cout << "ENTER YOUR ID NUMBER :";
    fflush(stdin);
    cin.get(s.uid, 100);
    cout << "ENTER YOUR ROLL NUMBER :";
    cin >> s.roll;
    cout << "Enter your father's name: ";
    fflush(stdin);
    cin.get(s.fname, 100);
    cout << "Enter your mother's name: ";
    fflush(stdin);
    cin.get(s.mname, 100);
    cout << "Enter your date of birth: ";
    fflush(stdin);
    cin.get(s.dob, 100);
    cout << "Enter your address: ";
    fflush(stdin);
    cin.get(s.address, 100);
    cout << "Enter your e-mail: ";
    fflush(stdin);
    cin.get(s.mail, 100);
    cout << "Enter your semester: ";
    cin >> s.sem;

    cout << "Enter subject 1: ";
    fflush(stdin);
    cin.get(s.s1, 100);
    cout << "Enter marks of " << s.s1 << ": ";
    cin >> s.m1;
    cout << "Enter subject 2: ";
    fflush(stdin);
    cin.get(s.s2, 100);
    cout << "Enter marks of " << s.s2 << ": ";
    cin >> s.m2;
    cout << "Enter subject 3: ";
    fflush(stdin);
    cin.get(s.s3, 100);
    cout << "Enter marks of " << s.s3 << ": ";
    cin >> s.m3;
    cout << "Enter subject 4: ";
    fflush(stdin);
    cin.get(s.s4, 100);
    cout << "Enter marks of " << s.s4 << ": ";
    cin >> s.m4;
    cout << "Enter subject 5: ";
    fflush(stdin);
    cin.get(s.s5, 100);
    cout << "Enter marks of " << s.s5 << ": ";
    cin >> s.m5;
    outfile.write(reinterpret_cast<char *>(&s), sizeof(Student));
    outfile.close();

}
void viewReport() {
    system("clear");

    Student s;

    int rNum;
    cout << "Enter a roll number: ";
    cin >> rNum;

    ifstream fin;
    fin.open("report.txt");

    bool condition = true;
    while (fin.read(reinterpret_cast<char*>(&s), sizeof(Student))) {
        if (rNum == s.roll) {
            cout << "Name: " << s.name << endl;
            cout << "UID: " << s.uid << endl;
            cout << "Roll: " << s.roll << endl;
            cout << "Date of birth: " << s.dob << endl;
            cout << "Father's Name: " << s.fname << endl;
            cout << "Mother's Name: " << s.mname << endl;
            cout << "Address: " << s.address << endl;
            cout << "E-mail: " << s.mail << endl;

            cout << endl << "Marks" << endl;
            cout << "Marks in: " << s.s1 << ": " << s.m1 << endl;
            cout << "Marks in: " << s.s2 << ": " << s.m2 << endl;
            cout << "Marks in: " << s.s3 << ": " << s.m3 << endl;
            cout << "Marks in: " << s.s4 << ": " << s.m4 << endl;
            cout << "Marks in: " << s.s5 << ": " << s.m5 << endl;

            condition = false;
            break;
        }
    }

    if (condition) {
        cout << "Record not found" << endl;
    }

    fin.close();
}
void viewAll() {
    system("clear");

    Student s;

    ifstream fin;
    fin.open("report.txt");

    bool condition = true;

    while (fin.read(reinterpret_cast<char*>(&s), sizeof(Student))) {
        cout << "Name: " << s.name << endl;
            cout << "UID: " << s.uid << endl;
            cout << "Roll: " << s.roll << endl;
            cout << "Date of birth: " << s.dob << endl;
            cout << "Father's Name: " << s.fname << endl;
            cout << "Mother's Name: " << s.mname << endl;
            cout << "Address: " << s.address << endl;
            cout << "E-mail: " << s.mail << endl;

            cout << endl << "Marks" << endl;
            cout << "Marks in: " << s.s1 << ": " << s.m1 << endl;
            cout << "Marks in: " << s.s2 << ": " << s.m2 << endl;
            cout << "Marks in: " << s.s3 << ": " << s.m3 << endl;
            cout << "Marks in: " << s.s4 << ": " << s.m4 << endl;
            cout << "Marks in: " << s.s5 << ": " << s.m5 << endl;

        condition = false;
    }

    if (condition) {
        cout << "No record found" << endl;
    }

    fin.close();
}
void modify() {
    Student s;

    int rNum;
    cout << "Enter your roll number: ";
    cin >> rNum;

    fstream f;
    f.open("report.txt", ios::in | ios::out);

    bool condition = true;

    while (!f.eof() && condition) {
        f.read(reinterpret_cast<char*>(&s), sizeof(Student)); {
            if (s.roll == rNum) {
                cout << "ENTER YOUR FULL NAME :";
    fflush(stdin);
    cin.get(s.name, 25);
    cout << "ENTER YOUR ID NUMBER :";
    fflush(stdin);
    cin.get(s.uid, 100);
    cout << "ENTER YOUR ROLL NUMBER :";
    cin >> s.roll;
    cout << "Enter your father's name: ";
    fflush(stdin);
    cin.get(s.fname, 100);
    cout << "Enter your mother's name: ";
    fflush(stdin);
    cin.get(s.mname, 100);
    cout << "Enter your date of birth: ";
    fflush(stdin);
    cin.get(s.dob, 100);
    cout << "Enter your address: ";
    fflush(stdin);
    cin.get(s.address, 100);
    cout << "Enter your e-mail: ";
    fflush(stdin);
    cin.get(s.mail, 100);
    cout << "Enter your semester: ";
    cin >> s.sem;

                int pos = (-1) * static_cast<int>(sizeof(Student));
                f.seekp(pos, ios::cur);
                f.write(reinterpret_cast<char*>(&s), sizeof(Student));

                condition = false;
            }
        }
    }

    if (condition) {
        cout << "No such record found" << endl;
    }

    f.close();
}
void deleteReport() {
    Student s;

    int rNum;
    cout << "Enter roll number: ";
    cin >> rNum;

    ifstream fin;
    fin.open("report.txt");
    ofstream fout;
    fout.open("temp.txt");

    while (fin.read(reinterpret_cast<char*>(&s), sizeof(Student))) {
        if (s.roll != rNum) {
            fout.write(reinterpret_cast<char*>(&s), sizeof(Student));
        }
    }

    fin.close();
    fout.close();

    remove("report.txt");
    rename("temp.txt", "report.txt");
}

void mainMenu() {
    

    int choice;

    while (true) {
    	
        cout << "\t\t\t\t\t\t--------------Main Menu--------------\n\n\n";
        cout << "\t\t\t\t\t\t1.Add a New Student \n"
             << endl;
        cout << "\t\t\t\t\t\t2.View a Student's Report Card \n"
             << endl;
        cout << "\t\t\t\t\t\t3.View all the records \n"
             << endl;
        cout << "\t\t\t\t\t\t4.Modify a Student's Record \n"
             << endl;
        cout << "\t\t\t\t\t\t5.Delete a Student's Report Card \n"
             << endl;
        cout << "\t\t\t\t\t\t6.EXIT\n\n\n";

        do {
            cout << "Enter your choice: ";
            cin >> choice;

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                
                case 2:
                    viewReport();
                    break;

                case 3:
                    viewAll();
                    break;
                
                case 4:
                    modify();
                    break;

                case 5:
                    deleteReport();
                    break;
                
                case 6:
                    exitScreen();

                default:
                    cout << "Enter a valid option" << endl;
            }
        } while (choice < 1 || choice > 5);
    }
}

void studentLogin() {
    system("clear");

    cout << "\t====================Welcome To The Student Login Page====================" << endl
         << endl;

    Student s;

    int rNum;
    cout << "Enter your Roll number: ";
    cin >> rNum;

    ifstream fin;
    fin.open("report.txt");

    bool condition = true;

    while (fin.read(reinterpret_cast<char*>(&s), sizeof(Student))) {
        if (rNum == s.roll) {
            cout << "Name: " << s.name << endl;
            cout << "UID: " << s.uid << endl;
            cout << "Roll: " << s.roll << endl;
            cout << "Date of birth: " << s.dob << endl;
            cout << "Father's Name: " << s.fname << endl;
            cout << "Mother's Name: " << s.mname << endl;
            cout << "Address: " << s.address << endl;
            cout << "E-mail: " << s.mail << endl;

            cout << endl << "Marks" << endl;
            cout << "Marks in: " << s.s1 << ": " << s.m1 << endl;
            cout << "Marks in: " << s.s2 << ": " << s.m2 << endl;
            cout << "Marks in: " << s.s3 << ": " << s.m3 << endl;
            cout << "Marks in: " << s.s4 << ": " << s.m4 << endl;
            cout << "Marks in: " << s.s5 << ": " << s.m5 << endl;

            condition = false;
            break;
        }
    }

    if (condition) {
        cout << "No such record found" << endl;
    }

    fin.close();
}
void facultyLogin() {
    system("clear");

    string user, password;
    int count = 0;

    do {
        cout << "Enter your user ID: ";
        fflush(stdin);
        getline(cin, user);
        
        cout << "Enter your password: ";
        fflush(stdin);
        getline(cin, password);

        count ++;

        if (user == "teacher" && password == "ChandigarhUniversity") {
            mainMenu();
            return;
        }
        else {
            cout << "Login failed" << endl;
            cout << "Check your ID and password again" << endl;
            cout << "Remaining attempts: " << 3 - count << endl;
        }
    } while (count < 3);

    cout << "Login failed" << endl;
    cout << "Exiting program" << endl;
    exitScreen();
}

void category() {
    system("clear");

    int choice;
    cout << "\n\n";
    cout << "\t====================Select your Category====================" << endl
         << endl
         << endl;
    cout << "\t\t\t\t1. Faculty\n\n";
    cout << "\t\t\t\t2. Students\n\n";
    cout << "\t\t\t\t3. EXIT\n\n";

    do {
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                facultyLogin();
                break;

            case 2:
                studentLogin();
                break;
            case 3:
                exitScreen();
                break;

            default:
                cout << "Wrong Choice! Please try again." << endl
                 << endl;
        }
    } while (choice < 1 || choice > 3);
}

int main() {
    welcomeScreen();
    category();

    return 0;
}

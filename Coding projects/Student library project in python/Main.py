class Library:
    def __init__(self,listOfBooks) :
        self.books=listOfBooks
    def displayAvailableBooks(self):
        print("\nBooks present in this library are: \n")
        for i,book in enumerate(self.books):
            i+=1
            print("\t",i,"-",book)
    def borrowBook(self,bookName):
        if bookName in self.books:
            print(f"You have been issued {bookName}. Please keep it safe and hadle it properly!! and return it within 30 days!")
            self.books.remove(bookName)
        else:
            print("Sorry, This book has been already issued to someone else!! wait for some time!!!!")

    def returnBook(self,bookName):
        self.books.append(bookName)  
        print("Thanks for returing this book, Hope you enjoyed returing it!!\n Have a Great Day!!!") 

class Student():
    
    def requestBook(self):
        self.book=input("Enter the name of the book you wants to borrow!!!: ")
        return self.book

    def returnBook(self):
        self.book=input("Enter the name of the book you wants to return!!!: ")
        return self.book

 
if __name__=="__main__":
    centralLibrary=Library(["Algorithm","Django","Clrs","Python Notes by Harry"])
    Stu=Student()

    while(True):
        welcomeMsg='''======Welcome to the Central library!!!!======
        Please Choose an option :
        1.Listing an book
        2.Request a book
        3.Return a book 
        4.To exit the Library'''
        print(welcomeMsg)
        User_choice=int(input("Enter Your choice!!!  "))
        if(User_choice==1):
            centralLibrary.displayAvailableBooks()
        elif(User_choice==2):
            centralLibrary.borrowBook(Stu.requestBook())
        elif(User_choice==3):
            centralLibrary.returnBook(Stu.returnBook())
        elif(User_choice==4):
            print("Thanks for using this library!!\n Have a Great day Ahead!!")
            exit()
        else:
            print("Invalid!! Choice.......")




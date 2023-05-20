//Rock paper seasor game
//player1:rock
//player 2: (computer):scissors -->player 1 wins
// paper vs scissor -->scissor wins
// paper vs rock -->paper wins
// write a c program to allow user to play this game three times with computer .log the scores of the computer and the player
// display the winner at the end
// Notes :
// you have to display the name of the player during the game .Take user name as an input
//three match series will be there

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int generateRandomNumber(int n)
{
    srand(time(NULL));
    return rand() % n;
}
int main()
{
    char name[25];
    // char one[4] = "ROCK", two[5] = "PAPER", three[7] = "SESSIOR";
    int i, inp, cinp, cs = 0, ps = 0;
 
    printf("------WELCOME TO THE GAME OF ROCK PAPER SCISSOR------\n");
    printf("Enter your name\n");
    scanf("%s",&name);
    printf("Welcome %s\n", name);
    printf("--HERE WE WILL PLAY THREE LEVELS---\n %s VS COMPUTER\n", name);
    for (i = 0; i < 3; i++)
    {

        printf("ROUND %d\n", i+1);
        printf("\n Instruction :\n TO ROCK PRESS 1 \n TO PAPER PRESS 2 \n TO SESSIOR PRESS 3 \n");
        printf("Choose any of one .....ROCK OR PAPER OR SESSIOR\n");
        scanf("%d", &inp);
        if (inp==1)
        {
            printf("you have chossen ROCK\n");
        }
        if (inp== 2)
        {
            printf("you have chossen PAPER\n");
        }
        if (inp==3)
        {
            printf("you have chossen SESSIOR\n");
        }

        printf("Now its COMPUTER'S TURN\n");
        printf("Choose any of one .....ROCK OR PAPER OR SESSIOR\n");
        cinp = generateRandomNumber(3) + 1;

        if (cinp==1)
        {
            printf("-------COMPUTER have chossen ROCK---------------------\n");
        }
        if (cinp==2)
        {
            printf("--------COMPUTER have chossen PAPER------------\n");
        }
        if (cinp==3)
        {
            printf("--------COMPUTER have chossen SESSIOR------------\n");
        }

        if (inp==cinp)
        {
            printf("-----------DRAW\n-------------");
        }
        else
        {
            if (inp==1 &&cinp==2)
            {
                printf("-------------COMPUTER WINS-------------\n");
                cs++;
            }
            else if (inp==2 &&cinp==1)
            {
                printf("-------------%s WINS\n-------------", name);
                ps++;
            }
            else if (inp==1 &&cinp==3)
            {
                printf("-------------%s WINS\n-------------", name);
                ps++;
            }
            else if (inp==3 &&cinp==1)
            {
                printf("-------------COMPUTER WINS-------------\n");
                cs++;
            }
            else if (inp==2 &&cinp==3)
            {
                printf("-------------COMPUTER WINS-------------\n");
                cs++;
            }

            else if (inp==3 &&cinp==2)
            {
                printf("-----------%s WINS-----------\n", name);
                ps++;
            }
        }
    }
    if(cs==ps){
        printf("--------DRAW--------");
    }
    else if (cs < ps)
    {
        printf("-----------%s WiN THE MATCH AT END-----------\n", name);
    }
    else
    {
    printf("-----------Computer WINS AT END-----------\n");
    }



    return 0;
}
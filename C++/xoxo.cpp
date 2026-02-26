#include<iostream>
using namespace std;

void displaygame(int arr[][3], int r, int c){
    cout << "***********" << endl;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            char mark = ' ';
            if(arr[i][j] == 1) mark = 'X';
            else if(arr[i][j] == 2) mark = 'O';
            cout << mark;
            if(j < c-1) cout << " | ";
        }
        cout << endl;
        if(i < r-1) cout << "--+---+--" << endl;
    }
    cout << "***********" << endl;
}

int enterchoice(int player, int arr[][3]){
    int choice;
    while(true){
        cout << "Player " << player << " (" << (player==1?'X':'O') << ") - Enter your choice (1-9): ";
        cin >> choice;
        if(choice < 1 || choice > 9){
            cout << "Invalid choice. Try again.\n";
            continue;
        }
        int row = (choice-1)/3;
        int col = (choice-1)%3;
        if(arr[row][col] == 0){
            arr[row][col] = player;
            break;
        } else {
            cout << "Cell already taken. Try again.\n";
        }
    }
    return choice;
}

int checkwin(int arr[][3]){
    // Rows and columns
    for(int i=0;i<3;i++){
        if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != 0)
            return arr[i][0];
        if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[0][i] != 0)
            return arr[0][i];
    }
    // Diagonals
    if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != 0)
        return arr[0][0];
    if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] != 0)
        return arr[0][2];
    return 0;
}

bool isDraw(int arr[][3]){
    for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            if(arr[i][j] == 0)
                return false;
    return true;
}

int main(){
    int xoxo[3][3]={0};
    int r=3,c=3;
    int winner = 0;
    int currentPlayer = 1;
    cout << "Welcome to Tic-Tac-Toe!\n";
    displaygame(xoxo,r,c);

    while(true){
        enterchoice(currentPlayer, xoxo);
        displaygame(xoxo,r,c);
        winner = checkwin(xoxo);
        if(winner != 0){
            cout << "Player " << winner << " (" << (winner==1?'X':'O') << ") wins!\n";
            break;
        }
        if(isDraw(xoxo)){
            cout << "It's a draw!\n";
            break;
        }
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }
    return 0;
}
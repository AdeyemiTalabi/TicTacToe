package com.example.google.tictactoe3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button but1, but2, but3, but4, but5, but6, but7, but8, but9;

    int playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);

        playerTurn = 1;

        }

    // Button 1: Column(0,0)
    public void clickBut1(View view) {
        if(but1.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but1.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but1.setText("O");
            }
        }
        gameOver();
    }

    // Button 2: Column(0,1)
    public void clickBut2(View view) {
        if(but2.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but2.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but2.setText("O");
            }
        }
        gameOver();
    }

    // Button 3: Column(0,2)
    public void clickBut3(View view) {
        if(but3.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but3.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but3.setText("O");
            }
        }
        gameOver();
    }

    // Button 4: Column(1,0)
    public void clickBut4(View view) {
        if(but4.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but4.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but4.setText("O");
            }
        }
        gameOver();
    }

    // Button 5: Column(1,1)
    public void clickBut5(View view) {
        if(but5.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but5.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but5.setText("O");
            }
        }
        gameOver();
    }

    // Button 6: Column(1,2)
    public void clickBut6(View view) {
        if(but6.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but6.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but6.setText("O");
            }
        }
        gameOver();
    }

    // Button 7: Column(2,0)
    public void clickBut7(View view) {
        if(but7.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but7.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but7.setText("O");
            }
        }
        gameOver();
    }

    // Button 8: Column(2,1)
    public void clickBut8(View view) {
        if(but8.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but8.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but8.setText("O");
            }
        }
        gameOver();
    }

    // Button 9: Column(2,2)
    public void clickBut9(View view) {
        if(but9.getText().toString().equals("")) {
            if(playerTurn == 1) {
                playerTurn = 2;
                but9.setText("X");
            } else if(playerTurn ==2) {
                playerTurn = 1;
                but9.setText("O");
            }
        }
        gameOver();
    }

    public void gameOver() {
        String a1, a2, a3, b1, b2, b3, c1, c2, c3;
        boolean endIt = false;

        a1 = but1.getText().toString();
        a2 = but2.getText().toString();
        a3 = but3.getText().toString();
        b1 = but4.getText().toString();
        b2 = but5.getText().toString();
        b3 = but6.getText().toString();
        c1 = but7.getText().toString();
        c2 = but8.getText().toString();
        c3 = but9.getText().toString();

//=========================
// PLAYER X OUTPUT
// ========================

//        Horizontal side: from top left to right
        if (a1.equals("X") && a2.equals("X") && a3.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//        Horizontal side: from center middle left to right
        if (b1.equals("X") && b2.equals("X") && b3.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//        Horizontal side: from bottom left to bottom right
        if (c1.equals("X") && c2.equals("X") && c3.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

// ============================================================
//        Vertical side: from top left to bottom
        if (a1.equals("X") && b1.equals("X") && c1.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//        Vertical side: from center middle to bottom
        if (a2.equals("X") && b2.equals("X") && c2.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//        Vertical side: from top right to bottom
        if (a3.equals("X") && b3.equals("X") && c3.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

// ============================================================
//        Diagonal side: from top left to bottom right
        if (a1.equals("X") && b2.equals("X") && c3.equals("X")) {
        Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//        Diagonal side: from top right to bottom left
        if (a3.equals("X") && b2.equals("X") && c1.equals("X")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
    }

//=========================
// PLAYER O OUTPUT
// ========================

//        Horizontal side: from top left to right
        if (a1.equals("O") && a2.equals("O") && a3.equals("O")) {
            Toast.makeText(this, "Player X Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

//        Horizontal side: from center middle left to right
        if (b1.equals("O") && b2.equals("O") && b3.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

//        Horizontal side: from bottom left to bottom right
        if (c1.equals("O") && c2.equals("O") && c3.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

// ============================================================
//        Vertical side: from top left to bottom
        if (a1.equals("O") && b1.equals("O") && c1.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

//        Vertical side: from center middle to bottom
        if (a2.equals("O") && b2.equals("O") && c2.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

//        Vertical side: from top right to bottom
        if (a3.equals("O") && b3.equals("O") && c3.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

// ============================================================
//        Diagonal side: from top left to bottom right
        if (a1.equals("O") && b2.equals("O") && c3.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

//        Diagonal side: from top right to bottom left
        if (a3.equals("O") && b2.equals("O") && c1.equals("O")) {
            Toast.makeText(this, "Player O Wins!", Toast.LENGTH_LONG).show();
            endIt = true;
        }

        if (endIt) {
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
        }
    }

    // Reset Button
    public void clickReset(View view) {
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
        but5.setText("");
        but6.setText("");
        but7.setText("");
        but8.setText("");
        but9.setText("");
    }
}

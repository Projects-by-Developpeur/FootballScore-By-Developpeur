package com.example.footballscore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    TextView fA, sA, fB, sB, fC, sC, fD, sD, fE, sE, fF, sF, fAP, sAP, fBP, sBP, fCP, sCP, fDP, sDP, fEP, sEP, fFP, sFP, first, second, third, fourth, Twin1, Twin2, Twin3, Twin4, Tloose1, Tloose2, Tloose3, Tloose4, Tnull1, Tnull2, Tnull3, Tnull4, Tscore1, Tscore2, Tscore3, Tscore4;
    EditText fAB, sAB, fBB, sBB, fCB, sCB, fDB, sDB, fEB, sEB, fFB, sFB;
    Button MajA, MajB, MajC, MajD, MajE, MajF;
    String S_fAB, S_sAB, S_fBB, S_sBB, S_fCB, S_sCB, S_fDB, S_sDB, S_fEB, S_sEB, S_fFB, S_sFB;
    int score1, score2, score3, score4, win1, win2, win3, win4, loose1, loose2, loose3, loose4, null1, null2, null3, null4;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        win1 = 0;
        win2 = 0;
        win3 = 0;
        win4 = 0;
        loose1 = 0;
        loose2 = 0;
        loose3 = 0;
        loose4 = 0;
        null1 = 0;
        null2 = 0;
        null3 = 0;
        null4 = 0;

        //TextView Id
        fA = findViewById(R.id.fA);
        sA = findViewById(R.id.sA);
        fB = findViewById(R.id.fB);
        sB = findViewById(R.id.sB);
        fC = findViewById(R.id.fC);
        sC = findViewById(R.id.sC);
        fD = findViewById(R.id.fD);
        sD = findViewById(R.id.sD);
        fE = findViewById(R.id.fE);
        sE = findViewById(R.id.sE);
        fF = findViewById(R.id.fF);
        sF = findViewById(R.id.sF);
        //EditText Id
        fAB = findViewById(R.id.fAB);
        sAB = findViewById(R.id.sAB);
        fBB = findViewById(R.id.fBB);
        sBB = findViewById(R.id.sBB);
        fCB = findViewById(R.id.fCB);
        sCB = findViewById(R.id.sCB);
        fDB = findViewById(R.id.fDB);
        sDB = findViewById(R.id.sDB);
        fEB = findViewById(R.id.fEB);
        sEB = findViewById(R.id.sEB);
        fFB = findViewById(R.id.fFB);
        sFB = findViewById(R.id.sFB);

        //TextView Id
        fAP = findViewById(R.id.fAP);
        sAP = findViewById(R.id.sAP);
        fBP = findViewById(R.id.fBP);
        sBP = findViewById(R.id.sBP);
        fCP = findViewById(R.id.fCP);
        sCP = findViewById(R.id.sCP);
        fDP = findViewById(R.id.fDP);
        sDP = findViewById(R.id.sDP);
        fEP = findViewById(R.id.fEP);
        sEP = findViewById(R.id.sEP);
        fFP = findViewById(R.id.fFP);
        sFP = findViewById(R.id.sFP);

        //Table

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        Twin1 = findViewById(R.id.win1);
        Twin2 = findViewById(R.id.win2);
        Twin3 = findViewById(R.id.win3);
        Twin4 = findViewById(R.id.win4);
        Tloose1 = findViewById(R.id.loose1);
        Tloose2 = findViewById(R.id.loose2);
        Tloose3 = findViewById(R.id.loose3);
        Tloose4 = findViewById(R.id.loose4);
        Tnull1 = findViewById(R.id.null1);
        Tnull2 = findViewById(R.id.null2);
        Tnull3 = findViewById(R.id.null3);
        Tnull4 = findViewById(R.id.null4);
        Tscore1 = findViewById(R.id.score1);
        Tscore2 = findViewById(R.id.score2);
        Tscore3 = findViewById(R.id.score3);
        Tscore4 = findViewById(R.id.score4);

        //get Intent from TeamActivity
        intent = getIntent();

        //table
        first.setText(intent.getStringExtra("firstT"));
        second.setText(intent.getStringExtra("secondT"));
        third.setText(intent.getStringExtra("thirdT"));
        fourth.setText(intent.getStringExtra("fourthT"));

        //1st
        fA.setText(intent.getStringExtra("firstT"));
        sA.setText(intent.getStringExtra("secondT"));
        fB.setText(intent.getStringExtra("firstT"));
        sB.setText(intent.getStringExtra("thirdT"));
        fC.setText(intent.getStringExtra("firstT"));
        sC.setText(intent.getStringExtra("fourthT"));

        //2nd
        fD.setText(intent.getStringExtra("secondT"));
        sD.setText(intent.getStringExtra("thirdT"));
        fE.setText(intent.getStringExtra("secondT"));
        sE.setText(intent.getStringExtra("fourthT"));

        //3rd
        fF.setText(intent.getStringExtra("thirdT"));
        sF.setText(intent.getStringExtra("fourthT"));


        //Edit Text to String

        S_fAB = fAB.getText().toString().trim();
        S_sAB = sAB.getText().toString().trim();
        S_fBB = fBB.getText().toString().trim();
        S_sBB = sBB.getText().toString().trim();
        S_fCB = fCB.getText().toString().trim();
        S_sCB = sCB.getText().toString().trim();
        S_fDB = fDB.getText().toString().trim();
        S_sDB = sDB.getText().toString().trim();
        S_fEB = fEB.getText().toString().trim();
        S_sEB = sEB.getText().toString().trim();
        S_fFB = fFB.getText().toString().trim();
        S_sFB = sFB.getText().toString().trim();


        //Button Id

        MajA = findViewById(R.id.MajA);
        MajB = findViewById(R.id.MajB);
        MajC = findViewById(R.id.MajC);
        MajD = findViewById(R.id.MajD);
        MajE = findViewById(R.id.MajE);
        MajF = findViewById(R.id.MajF);


        MajA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                S_fAB = fAB.getText().toString().trim();
                S_sAB = sAB.getText().toString().trim();
                if (S_fAB.isEmpty()) {
                    fAB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fAB.setError(null);

                }

                if (S_sAB.isEmpty()) {
                    sAB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sAB.setError(null);


                    if ((Integer.parseInt(S_fAB)) > (Integer.parseInt(S_sAB))) {
                        fAP.setText("3 نقاط");
                        sAP.setText("0 نقطة");
                        MajA.setClickable(false);
                        win1 = win1 + 1;
                        loose2 = loose2 + 1;
                        score1 = score1 + 3;
                        Twin1.setText(String.valueOf(win1));
                        Tscore1.setText(String.valueOf(score1));
                        Tloose2.setText(String.valueOf(loose2));


                    }

                    if ((Integer.parseInt(S_fAB)) == (Integer.parseInt(S_sAB))) {
                        fAP.setText("1 نقطة");
                        sAP.setText("1 نقطة");
                        MajA.setClickable(false);
                        null1 = null1 + 1;
                        null2 = null2 + 1;
                        score1 = score1 + 1;
                        score2 = score2 + 1;
                        Tnull1.setText(String.valueOf(null1));
                        Tnull2.setText(String.valueOf(null2));
                        Tscore1.setText(String.valueOf(score1));
                        Tscore2.setText(String.valueOf(score2));
                    }

                    if ((Integer.parseInt(S_sAB)) > (Integer.parseInt(S_fAB))) {
                        fAP.setText("0 نقطة");
                        sAP.setText("3 نقاط");
                        MajA.setClickable(false);
                        win2 = win2 + 1;
                        loose1 = loose1 + 1;
                        score2 = score2 + 3;
                        Twin2.setText(String.valueOf(win2));
                        Tscore2.setText(String.valueOf(score2));
                        Tloose1.setText(String.valueOf(loose1));

                    }
                }
            }
        });

        MajB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                S_fBB = fBB.getText().toString().trim();
                S_sBB = sBB.getText().toString().trim();
                if (S_fBB.isEmpty()) {
                    fBB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fBB.setError(null);

                }

                if (S_sBB.isEmpty()) {
                    sBB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sBB.setError(null);


                    if ((Integer.parseInt(S_fBB)) > (Integer.parseInt(S_sBB))) {
                        fBP.setText("3 نقاط");
                        sBP.setText("0 نقطة");
                        MajB.setClickable(false);
                        win1 = win1 + 1;
                        loose3 = loose3 + 1;
                        score1 = score1 + 3;
                        Twin1.setText(String.valueOf(win1));
                        Tscore1.setText(String.valueOf(score1));
                        Tloose3.setText(String.valueOf(loose3));
                    }

                    if ((Integer.parseInt(S_fBB)) == (Integer.parseInt(S_sBB))) {
                        fBP.setText("1 نقطة");
                        sBP.setText("1 نقطة");
                        MajB.setClickable(false);
                        null1 = null1 + 1;
                        null3 = null3 + 1;
                        score1 = score1 + 1;
                        score3 = score3 + 1;
                        Tnull1.setText(String.valueOf(null1));
                        Tnull3.setText(String.valueOf(null3));
                        Tscore1.setText(String.valueOf(score1));
                        Tscore3.setText(String.valueOf(score3));
                    }

                    if ((Integer.parseInt(S_sBB)) > (Integer.parseInt(S_fBB))) {
                        fBP.setText("0 نقطة");
                        sBP.setText("3 نقاط");
                        MajB.setClickable(false);
                        win3 = win3 + 1;
                        loose1 = loose1 + 1;
                        score3 = score3 + 3;
                        Twin3.setText(String.valueOf(win3));
                        Tscore3.setText(String.valueOf(score3));
                        Tloose1.setText(String.valueOf(loose1));
                    }
                }
            }
        });

        MajC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S_fCB = fCB.getText().toString().trim();
                S_sCB = sCB.getText().toString().trim();


                if (S_fCB.isEmpty()) {
                    fCB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fCB.setError(null);

                }

                if (S_sCB.isEmpty()) {
                    sCB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sCB.setError(null);

                    if ((Integer.parseInt(S_fCB)) > (Integer.parseInt(S_sCB))) {
                        fCP.setText("3 نقاط");
                        sCP.setText("0 نقطة");
                        MajC.setClickable(false);
                        win1 = win1 + 1;
                        loose4 = loose4 + 1;
                        score1 = score1 + 3;
                        Twin1.setText(String.valueOf(win1));
                        Tscore1.setText(String.valueOf(score1));
                        Tloose4.setText(String.valueOf(loose4));

                    }

                    if ((Integer.parseInt(S_fCB)) == (Integer.parseInt(S_sCB))) {
                        fCP.setText("1 نقطة");
                        sCP.setText("1 نقطة");
                        MajC.setClickable(false);
                        null1 = null1 + 1;
                        null4 = null4 + 1;
                        score1 = score1 + 1;
                        score4 = score4 + 1;
                        Tnull1.setText(String.valueOf(null1));
                        Tnull4.setText(String.valueOf(null4));
                        Tscore1.setText(String.valueOf(score1));
                        Tscore4.setText(String.valueOf(score4));
                    }

                    if ((Integer.parseInt(S_sCB)) > (Integer.parseInt(S_fCB))) {
                        fCP.setText("0 نقطة");
                        sCP.setText("3 نقاط");
                        MajC.setClickable(false);
                        win4 = win4 + 1;
                        loose1 = loose1 + 1;
                        score4 = score4 + 3;
                        Twin4.setText(String.valueOf(win4));
                        Tscore4.setText(String.valueOf(score4));
                        Tloose1.setText(String.valueOf(loose1));

                    }
                }
            }
        });

        MajD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S_fDB = fDB.getText().toString().trim();
                S_sDB = sDB.getText().toString().trim();


                if (S_fDB.isEmpty()) {
                    fDB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fDB.setError(null);

                }

                if (S_sDB.isEmpty()) {
                    sDB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sAB.setError(null);

                    if ((Integer.parseInt(S_fDB)) > (Integer.parseInt(S_sDB))) {
                        fDP.setText("3 نقاط");
                        sDP.setText("0 نقطة");
                        MajD.setClickable(false);
                        win2 = win2 + 1;
                        loose3 = loose3 + 1;
                        score2 = score2 + 3;
                        Twin2.setText(String.valueOf(win2));
                        Tscore2.setText(String.valueOf(score2));
                        Tloose3.setText(String.valueOf(loose3));
                    }

                    if ((Integer.parseInt(S_fDB)) == (Integer.parseInt(S_sDB))) {
                        fDP.setText("1 نقطة");
                        sDP.setText("1 نقطة");
                        MajD.setClickable(false);
                        null2 = null2 + 1;
                        null3 = null3 + 1;
                        score2 = score2 + 1;
                        score3 = score3 + 1;
                        Tnull2.setText(String.valueOf(null2));
                        Tnull3.setText(String.valueOf(null3));
                        Tscore2.setText(String.valueOf(score2));
                        Tscore3.setText(String.valueOf(score3));
                    }

                    if ((Integer.parseInt(S_sDB)) > (Integer.parseInt(S_fDB))) {
                        fDP.setText("0 نقطة");
                        sDP.setText("3 نقاط");
                        MajD.setClickable(false);
                        win3 = win3 + 1;
                        loose2 = loose2 + 1;
                        score3 = score3 + 3;
                        Twin3.setText(String.valueOf(win3));
                        Tscore3.setText(String.valueOf(score3));
                        Tloose2.setText(String.valueOf(loose2));
                    }
                }
            }
        });

        MajE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S_fEB = fEB.getText().toString().trim();
                S_sEB = sEB.getText().toString().trim();


                if (S_fEB.isEmpty()) {
                    fEB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fEB.setError(null);

                }

                if (S_sEB.isEmpty()) {
                    sEB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sAB.setError(null);

                    if ((Integer.parseInt(S_fEB)) > (Integer.parseInt(S_sEB))) {
                        fEP.setText("3 نقاط");
                        sEP.setText("0 نقطة");
                        MajE.setClickable(false);
                        win2 = win2 + 1;
                        loose4 = loose4 + 1;
                        score2 = score2 + 3;
                        Twin2.setText(String.valueOf(win2));
                        Tscore2.setText(String.valueOf(score2));
                        Tloose4.setText(String.valueOf(loose4));

                    }

                    if ((Integer.parseInt(S_fEB)) == (Integer.parseInt(S_sEB))) {
                        fEP.setText("1 نقطة");
                        sEP.setText("1 نقطة");
                        MajE.setClickable(false);
                        null2 = null2 + 1;
                        null4 = null4 + 1;
                        score2 = score2 + 1;
                        score4 = score4 + 1;
                        Tnull2.setText(String.valueOf(null2));
                        Tnull4.setText(String.valueOf(null4));
                        Tscore2.setText(String.valueOf(score2));
                        Tscore4.setText(String.valueOf(score4));
                    }

                    if ((Integer.parseInt(S_sEB)) > (Integer.parseInt(S_fEB))) {
                        fEP.setText("0 نقطة");
                        sEP.setText("3 نقاط");
                        MajE.setClickable(false);
                        win4 = win4 + 1;
                        loose2 = loose2 + 1;
                        score4 = score4 + 3;
                        Twin4.setText(String.valueOf(win4));
                        Tscore4.setText(String.valueOf(score4));
                        Tloose2.setText(String.valueOf(loose2));
                    }
                }
            }
        });

        MajF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                S_fFB = fFB.getText().toString().trim();
                S_sFB = sFB.getText().toString().trim();

                if (S_fFB.isEmpty()) {
                    fFB.setError("يرجى كتابة نتيجة المباراة");

                } else {
                    fFB.setError(null);

                }

                if (S_sFB.isEmpty()) {
                    sFB.setError("يرجى كتابة نتيجة المباراة");


                } else {
                    sAB.setError(null);

                    if ((Integer.parseInt(S_fFB)) > (Integer.parseInt(S_sFB))) {
                        fFP.setText("3 نقاط");
                        sFP.setText("0 نقطة");
                        MajF.setClickable(false);
                        win3 = win3 + 1;
                        loose4 = loose4 + 1;
                        score3 = score3 + 3;
                        Twin3.setText(String.valueOf(win3));
                        Tscore3.setText(String.valueOf(score3));
                        Tloose4.setText(String.valueOf(loose4));
                    }

                    if ((Integer.parseInt(S_fFB)) == (Integer.parseInt(S_sFB))) {
                        fFP.setText("1 نقطة");
                        sFP.setText("1 نقطة");
                        MajF.setClickable(false);
                        null3 = null3 + 1;
                        null4 = null4 + 1;
                        score3 = score3 + 1;
                        score4 = score4 + 1;
                        Tnull3.setText(String.valueOf(null3));
                        Tnull4.setText(String.valueOf(null4));
                        Tscore3.setText(String.valueOf(score3));
                        Tscore4.setText(String.valueOf(score4));
                    }

                    if ((Integer.parseInt(S_sFB)) > (Integer.parseInt(S_fFB))) {
                        fFP.setText("0 نقطة");
                        sFP.setText("3 نقاط");
                        MajF.setClickable(false);
                        win4 = win4 + 1;
                        loose3 = loose3 + 1;
                        score4 = score4 + 3;
                        Twin4.setText(String.valueOf(win4));
                        Tscore4.setText(String.valueOf(score4));
                        Tloose3.setText(String.valueOf(loose3));
                    }
                }
            }
        });

        //back button
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CalculatorActivity.this, TeamActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent2 = new Intent(this, TeamActivity.class);
        startActivity(intent2);
        finish();

    }
}
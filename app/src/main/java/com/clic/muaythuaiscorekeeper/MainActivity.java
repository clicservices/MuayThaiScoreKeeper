package com.clic.muaythuaiscorekeeper;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePied;
    int scoreTete;
    int scorePoing;
    int scoreTeteB;
    int scorePiedB;
    int scorePoingB;
    Chronometer firstChrono;
    Button start, pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //chromettre cnfiguration
        firstChrono = (Chronometer) findViewById(R.id.chronometer);
        start = (Button) findViewById(R.id.on);
        pause = (Button) findViewById(R.id.off);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstChrono.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstChrono.stop();
            }
        });
        //end chronomettre configarion

    }

    /*
    -----------------------Etape de creation de methode pour le FIGHTER-----------------------------
    ------------------------------------------------------------------------------------------------
    Nous allons creer les methodes pour afficher le score du combattant A
    ------------------------------------------------------------------------------------------------
    ------------------------------------------------------------------------------------------------
    */
    //  on cree la methode pour afficher le score pour le coup de pied
    private void afficheScorePied(int scorePied) {
        TextView ScoreTextViewPied = (TextView) findViewById(R.id.Score_A_pied);
        ScoreTextViewPied.setText("" + scorePied);
    }

    //la methode pour affiche le score du coup de la tete
    private void afficheScoreTete(int scoreTete) {
        TextView scoreTextViewTete = (TextView) findViewById(R.id.Score_A_tete);
        scoreTextViewTete.setText(String.valueOf(scoreTete));
    }

    // la methode pour affiche le score des coups de poings
    private void afficheScorePoing(int scorePoing) {
        TextView scoreTextViewPoing = (TextView) findViewById(R.id.Score_A_poing);
        scoreTextViewPoing.setText(String.valueOf(scorePoing));
    }

    /*    ================================ FIN DE LA PROCEDURE======================================
     * */
/*======================================LES BOUTTONS POUR AFFICHER LE SCORE=========================
ON VA FAIRE EN SORTE QUE CHAQUE BOUTON AJOUTE DES POINTS AU SCORE
 */
// BOUTON POUR LE COUP DE PIED QUI ES A 32 POING
    public void coupDePiedA(View v) {

        scorePied = scorePied + 5;
        afficheScorePied(scorePied);

    }

    //BOUTON COUP DE TETE
    public void coupDeTeteA(View view) {
        scoreTete = scoreTete + 2;
        afficheScoreTete(scoreTete);
    }

    public void coupDePoingA(View view) {
        scorePoing = scorePoing + 4;
        afficheScorePoing(scorePoing);

    }

    /*
            ====================Etape de creation de methode pour le FIGHTER B======================

             Nous allons creer les methodes pour afficher le score du combattant A

            ========================================================================================
            */
    //  on cree la methode pour afficher le score pour le coup de pied
    private void afficheScoreTeteB(int scoreTeteB) {
        TextView textViewScoreTeteB = (TextView) findViewById(R.id.Score_B_tete);
        textViewScoreTeteB.setText(String.valueOf(scoreTeteB));
    }

    //methode pour afficher le scoe du coup de pied
    private void afficheScorePiedB(int scorePiedB) {
        TextView textViewScorePiedB = (TextView) findViewById(R.id.Score_B_pied);
        textViewScorePiedB.setText(String.valueOf(scorePiedB));
    }

    //methode pour afficher le score du coups de poing
    private void afficheScorePoingB(int scorePoingB) {
        TextView textViewScorePoingB = (TextView) findViewById(R.id.Score_B_poing);
        textViewScorePoingB.setText(String.valueOf(scorePoingB));
    }

    // on cree l action des boutons pour le score du Fighter B
    public void calcScoreTeteB(View view) {
        scoreTeteB = scoreTeteB + 2;
        afficheScoreTeteB(scoreTeteB);
    }

    public void calcScorePiedB(View view) {
        scorePiedB = scorePiedB + 5;
        afficheScorePiedB(scorePiedB);
    }

    public void calcScorePoingB(View view) {
        scorePoingB = scorePoingB + 4;
        afficheScorePoingB(scorePoingB);
    }

    // reset score buttom
    public void resetScore(View view) {
        afficheScoreTete(0);
        afficheScorePoing(0);
        afficheScorePied(0);
        afficheScoreTeteB(0);
        afficheScorePoingB(0);
        afficheScorePiedB(0);

    }

}

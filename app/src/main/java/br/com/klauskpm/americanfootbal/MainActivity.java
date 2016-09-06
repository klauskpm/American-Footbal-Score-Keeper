package br.com.klauskpm.americanfootbal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private AmericanFootballTeam AmericanFootballTeamA;
    private AmericanFootballTeam AmericanFootballTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout viewGroupTeamA = (LinearLayout) findViewById(R.id.team_a);
        LinearLayout viewGroupTeamB = (LinearLayout) findViewById(R.id.team_b);

        AmericanFootballTeamA = new AmericanFootballTeam(this, "49ers");
        AmericanFootballTeamB = new AmericanFootballTeam(this, "Chicago Bulls");

        viewGroupTeamA.addView(AmericanFootballTeamA.template);
        viewGroupTeamB.addView(AmericanFootballTeamB.template);
    }

    public void reset(View v) {
        AmericanFootballTeamA.reset();
        AmericanFootballTeamB.reset();
    }
}

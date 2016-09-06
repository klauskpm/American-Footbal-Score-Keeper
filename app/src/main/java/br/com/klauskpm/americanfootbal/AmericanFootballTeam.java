package br.com.klauskpm.americanfootbal;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by klaus.machado on 06/09/2016.
 */
public class AmericanFootballTeam extends Team {

    final int FIELD_GOAL_POINTS = 3;
    final int TOUCHDOWN_POINTS = 6;
    final int EXTRA_1_POINTS = 1;
    final int EXTRA_2_POINTS = 2;
    final int SAFETY_POINTS = 2;

    public AmericanFootballTeam(AppCompatActivity activity, String teamName) {
        super(activity, R.layout.american_football_team, teamName);

        Button fieldGoalButton = (Button) template.findViewById(R.id.field_goal__button);
        Button touchdownButton = (Button) template.findViewById(R.id.touchdown__button);
        Button extra1Button = (Button) template.findViewById(R.id.extra_point_1__button);
        Button extra2Button = (Button) template.findViewById(R.id.extra_point_2__button);
        Button safetyButton = (Button) template.findViewById(R.id.safety__button);

        fieldGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doFieldGoal();
            }
        });

        touchdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doTouchdown();
            }
        });

        extra1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doExtra1();
            }
        });

        extra2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doExtra2();
            }
        });

        safetyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSafety();
            }
        });
    }

    public void doFieldGoal() {
        addPoints(FIELD_GOAL_POINTS);
    }

    public void doTouchdown() {
        addPoints(TOUCHDOWN_POINTS);
    }

    public void doExtra1() {
        addPoints(EXTRA_1_POINTS);
    }

    public void doExtra2() {
        addPoints(EXTRA_2_POINTS);
    }

    public void doSafety() {
        addPoints(SAFETY_POINTS);
    }
}

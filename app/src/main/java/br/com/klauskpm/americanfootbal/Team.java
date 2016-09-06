package br.com.klauskpm.americanfootbal;

import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by klaus.machado on 06/09/2016.
 */
public class Team {

    public LinearLayout template;

    private TextView teamScoreTextView;
    private int teamScore = 0;

    public Team (AppCompatActivity activity, int teamLayout, String teamName) {
        template = getTemplate(activity, teamLayout);

        TextView teamNameTextView = (TextView) template.findViewById(R.id.team_name__text_view);
        teamNameTextView.setText(teamName);

        teamScoreTextView = (TextView) template.findViewById(R.id.team_score__text_view);
        teamScoreTextView.setText("" + teamScore);
    }

    private LinearLayout getTemplate(AppCompatActivity activity, int teamLayout) {
        LinearLayout template = (LinearLayout) activity.getLayoutInflater().inflate(
                teamLayout,
                null
        );

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        template.setLayoutParams(layoutParams);

        return template;
    }

    protected void addPoints(int points) {
        teamScore += points;

        teamScoreTextView.setText("" + teamScore);
    }


    /**
     * Reseta o score(teamScore) para 0
     */
    public void reset() {
        teamScore = 0;

        teamScoreTextView.setText("" + teamScore);
    }
}

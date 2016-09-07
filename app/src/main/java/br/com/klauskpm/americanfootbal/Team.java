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

    /**
     * Prepare the team template for any desired sport
     *
     * @param activity Parent Activity
     * @param teamLayout Team Layout ID
     * @param teamName Team Name
     */
    public Team (AppCompatActivity activity, int teamLayout, String teamName) {
        template = getTemplate(activity, teamLayout);

        TextView teamNameTextView = (TextView) template.findViewById(R.id.team_name__text_view);
        teamNameTextView.setText(teamName);

        teamScoreTextView = (TextView) template.findViewById(R.id.team_score__text_view);
        teamScoreTextView.setText("" + teamScore);
    }

    /**
     * Get the team template and sets it to fit the screen
     *
     * @param activity Parent Activity
     * @param teamLayout Team Layout ID
     * @return Team template as a LinearLayout
     */
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

    /**
     * Add points to the score
     *
     * @param points Desired points to add
     */
    protected void addPoints(int points) {
        teamScore += points;

        teamScoreTextView.setText("" + teamScore);
    }


    /**
     * Resets the team score to 0
     */
    public void reset() {
        teamScore = 0;

        teamScoreTextView.setText("" + teamScore);
    }
}

package in.cliffesto.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_team_a, score_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Method to display score for Team A
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method to increment score of team A
     */
    public void threeIncrementA(View view) {
        score_team_a = score_team_a + 3;
        displayForTeamA(score_team_a);
    }

    public void twoIncrementA(View view) {
        score_team_a = score_team_a + 2;
        displayForTeamA(score_team_a);
    }

    public void oneIncrementA(View view) {
        score_team_a = score_team_a + 1;
        displayForTeamA(score_team_a);
    }

    /**
     * Method to display score for Team B
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method to increment score of team B
     */
    public void threeIncrementB(View view) {
        score_team_b = score_team_b + 3;
        displayForTeamB(score_team_b);
    }

    public void twoIncrementB(View view) {
        score_team_b = score_team_b + 2;
        displayForTeamB(score_team_b);
    }

    public void oneIncrementB(View view) {
        score_team_b = score_team_b + 1;
        displayForTeamB(score_team_b);
    }

    /**
     * Method to reset the score
     */
    public void resetScore(View view) {
        score_team_a = 0;
        score_team_b = 0;
        displayForTeamB(score_team_b);
        displayForTeamA(score_team_a);

    }

}

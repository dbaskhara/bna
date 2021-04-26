package com.example.bna.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bna.R;

import org.w3c.dom.Text;


public class CardDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_description);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        TextView tvTitle = (TextView) findViewById(R.id.titleDescription);
        TextView tvSeason = (TextView) findViewById(R.id.seasonDescription);
        TextView tvEpisode = (TextView) findViewById(R.id.episodeDescription);
        TextView tvDescription = (TextView) findViewById(R.id.descriptionDescription);
        String titleExtra = (String) b.get("title");
        String seasonExtra = (String) b.get("season");
        String episodeExtra = (String) b.get("episode");
        String descriptionExtra = (String) b.get("description");
        tvTitle.setText(titleExtra);
        tvSeason.setText(seasonExtra);
        tvEpisode.setText(episodeExtra);
        tvDescription.setText(descriptionExtra);
    }
}
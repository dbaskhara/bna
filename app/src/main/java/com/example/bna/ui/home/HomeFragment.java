package com.example.bna.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bna.R;

import java.util.ArrayList;
import java.util.List;

import com.example.bna.R;
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, null);
        List<CardData> data = fill_with_data();
        RecyclerView rv = (RecyclerView) root.findViewById(R.id.rv);
        CardAdapter rva = new CardAdapter(data,getContext());
        rv.setAdapter(rva);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
    public List<CardData> fill_with_data(){
        List<CardData> data = new ArrayList<>();
        data.add(new CardData("The National Anthem","Season 1", "Episode 1", "Prime Minister Michael Callow faces a shocking dilemma when Princess Susannah, a much-loved member of the Royal Family, is kidnapped.", R.mipmap.movie1));
        data.add(new CardData("Fifteen Million Merits","Season 1", "Episode 2", "In a world where people's lives consist of riding exercise bikes to gain credits, Bing tries to help a woman get on to a singing competition show.", R.mipmap.movie2));
        data.add(new CardData("The Entire History of You","Season 1", "Episode 3", "In the near future, everyone has access to a memory implant that records everything they do, see and hear. You need never forget a face again - but is that always a good thing?.", R.mipmap.movie3));
        data.add(new CardData("Be Right Back","Season 2", "Episode 1", "After learning about a new service that lets people stay in touch with the deceased, a lonely, grieving Martha reconnects with her late lover.", R.mipmap.movie4));
        data.add(new CardData("White Bear","Season 2", "Episode 2", "Victoria wakes up and cannot remember anything about her life. Everyone she encounters refuses to communicate with her, and they all seem to know something she doesn't. But what?.", R.mipmap.movie5));
        data.add(new CardData("The Waldo Moment","Season 2", "Episode 3", "A failed comedian who voices a popular cartoon bear named Waldo finds himself mixing in politics when TV executives want Waldo to run for office.", R.mipmap.movie6));
        data.add(new CardData("White Christmas","Season 2", "Episode 4", "Three interconnected tales of technology run amok during the Christmas season are told by two men at a remote outpost in a frozen wilderness.", R.mipmap.movie7));
        data.add(new CardData("Nosedive","Season 3", "Episode 1", "A woman desperate to boost her social media score hits the jackpot when she's invited to a swanky wedding, but the trip doesn't go as planned.", R.mipmap.movie8));
        data.add(new CardData("Playtest","Season 3", "Episode 2", "An American traveler short on cash signs up to test a revolutionary new gaming system, but soon can't tell where the hot game ends and reality begins.", R.mipmap.movie9));
        data.add(new CardData("Shut Up and Dance","Season 3", "Episode 3", "When withdrawn Kenny stumbles headlong into an online trap, he is quickly forced into an uneasy alliance with shifty Hector, both at the mercy of persons unknown.", R.mipmap.movie10));
        data.add(new CardData("San Junipero","Season 3", "Episode 4", "When Yorkie and Kelly visit San Junipero, a fun-loving beach town full of surf, sun and sex, their lives are changed.", R.mipmap.movie11));
        data.add(new CardData("Men Against Fire","Season 3", "Episode 5", "Future soldiers Stripe and Raiman must protect frightened villagers from an infestation of vicious feral mutants.", R.mipmap.movie12));
        data.add(new CardData("Hated in the Nation","Season 3", "Episode 6", "In near-future London, police detective Karin Parke, and her tech-savvy sidekick Blue, investigate a string of mysterious deaths with a sinister link to social media.", R.mipmap.movie13));
        return data;
    }
}
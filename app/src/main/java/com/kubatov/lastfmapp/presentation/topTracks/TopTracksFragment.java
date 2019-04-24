package com.kubatov.lastfmapp.presentation.topTracks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kubatov.lastfmapp.R;

public class TopTracksFragment extends Fragment {
    private final static String ARG_PAGE_TITLE = "title";
    private String title;

    public static TopTracksFragment newInstance(String title){

        TopTracksFragment tracksFragment = new TopTracksFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PAGE_TITLE, title);
        tracksFragment.setArguments(args);
        return tracksFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        TextView textTitle = v.findViewById(R.id.text_title1);
        if (getArguments() !=null){
            title = getArguments().getString(ARG_PAGE_TITLE);
        }
        textTitle.setText(title);
        return v;
    }
}

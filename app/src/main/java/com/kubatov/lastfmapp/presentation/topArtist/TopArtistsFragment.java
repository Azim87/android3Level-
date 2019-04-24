package com.kubatov.lastfmapp.presentation.topArtist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kubatov.lastfmapp.R;
import com.kubatov.lastfmapp.model.ArtistEntity;

import java.util.List;

public class TopArtistsFragment extends Fragment implements ITopArtistContract.View{
    private ITopArtistContract.Presenter mPresenter;
    private final static String ARG_PAGE_TITLE = "title";
    private String title;

    public static TopArtistsFragment newInstance(String title){
        TopArtistsFragment artistsFragment = new TopArtistsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PAGE_TITLE, title);
        artistsFragment.setArguments(args);
        return artistsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        TextView  textTitile = v.findViewById(R.id.text_title2);
        if (getArguments() !=null){
            title = getArguments().getString(ARG_PAGE_TITLE);
        }
        textTitile.setText(title);
        return v;

    }

    @Override
    public void showArtist(List<ArtistEntity> artistEntityList) {
    }

    @Override
    public void openArtist(ArtistEntity artistEntity) {
    }

    @Override
    public void attachPresenter(ITopArtistContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void finishView() {
        getActivity().finish();
    }
}

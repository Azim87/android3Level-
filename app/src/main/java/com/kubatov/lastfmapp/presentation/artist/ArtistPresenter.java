package com.kubatov.lastfmapp.presentation.artist;

import com.kubatov.lastfmapp.model.ArtistEntity;
import java.util.ArrayList;

public class ArtistPresenter implements IArtistContract.Presenter {
    private IArtistContract.View mView;
    @Override
    public void getArtist() {

    }

    @Override
    public void onArtistClick() {
        ArrayList<ArtistEntity> artistEntities = new ArrayList<>();
        artistEntities.add(new ArtistEntity());

        if (mView !=null){
             mView.showArtist(artistEntities);
        }
    }

    @Override
    public void attachView(IArtistContract.View view) {
        mView = view;
        mView.attachPresenter(this);
    }

    @Override
    public void detachView() {
        mView = null;
    }
}

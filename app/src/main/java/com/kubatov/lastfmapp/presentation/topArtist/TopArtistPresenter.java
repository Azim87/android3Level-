package com.kubatov.lastfmapp.presentation.topArtist;

import com.kubatov.lastfmapp.model.ArtistEntity;
import java.util.ArrayList;

public class TopArtistPresenter implements ITopArtistContract.Presenter {

    private ITopArtistContract.View mView;
    @Override
    public void onArtistClick(int position) {
    }

    @Override
    public void getArtist() {
        ArrayList<ArtistEntity> artistEntities = new ArrayList<>();
        artistEntities.add(new ArtistEntity());
            if (mView !=null){
                mView.showArtist(artistEntities);
            }
    }

    @Override
    public void attachView(ITopArtistContract.View view) {
        mView = view;
        mView.attachPresenter(this);
    }

    @Override
    public void detachView() {
        mView = null;
    }
}

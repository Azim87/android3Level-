package com.kubatov.lastfmapp.presentation.artist;

import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.ArtistEntity;

import java.util.ArrayList;

public class ArtistPresenter implements ArtistContract.Presenter {
    private ArtistContract.View mView;
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
    public void attachView(ArtistContract.View view) {
        mView.attachPresenter(this);

    }

    @Override
    public void attachView(BaseView baseView) {
        mView = (ArtistContract.View)baseView;
        mView.attachPresenter(this);
    }

    @Override
    public void detachView() {
        mView = null;
        assert false;
        mView.finishView();

    }
}

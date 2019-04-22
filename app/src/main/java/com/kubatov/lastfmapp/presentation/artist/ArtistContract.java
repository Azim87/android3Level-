package com.kubatov.lastfmapp.presentation.artist;

import com.kubatov.lastfmapp.baseOfBase.BasePresenter;
import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.ArtistEntity;

import java.util.ArrayList;

public interface ArtistContract  {

    interface View extends BaseView {
        void showArtist(ArrayList<ArtistEntity> artistEntity);
        void finishView();
        void attachPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {
        void getArtist();
        void onArtistClick();
        void attachView(ArtistContract.View view);
        void detachView();
    }
}

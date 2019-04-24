package com.kubatov.lastfmapp.presentation.artist;

import com.kubatov.lastfmapp.model.ArtistEntity;
import java.util.ArrayList;
import core.mvp.ICoreMvpContract;

public interface IArtistContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showArtist(ArrayList<ArtistEntity> artistEntity);
    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {

        void getArtist();

        void onArtistClick();
    }
}

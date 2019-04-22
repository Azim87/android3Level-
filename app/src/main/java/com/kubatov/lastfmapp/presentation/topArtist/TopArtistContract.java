package com.kubatov.lastfmapp.presentation.topArtist;

import com.kubatov.lastfmapp.baseOfBase.BasePresenter;
import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.ArtistEntity;

import java.util.List;

public interface TopArtistContract {

    interface View extends BaseView {
        void showArtist(List<ArtistEntity> artistEntityList);
        void showArtistMessage(String message);
        void openArtist(ArtistEntity artistEntity);

        void finishView();
        void attachPresenter(Presenter presenter);


    }


    interface Presenter extends BasePresenter {
        void onArtistClick(int position);
        void getArtist();

        void attachView(View view);
        void detachView();

    }
}

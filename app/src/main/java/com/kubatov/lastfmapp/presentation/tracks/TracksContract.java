package com.kubatov.lastfmapp.presentation.tracks;

import com.kubatov.lastfmapp.baseOfBase.BasePresenter;
import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.TrackEntity;
import com.kubatov.lastfmapp.presentation.topTracks.TopTracksContract;

import java.util.ArrayList;

public interface TracksContract {

    interface View extends BaseView {
        void showTracks(ArrayList<TrackEntity> trackEntity);

        void finishView();
        void attachPresenter(Presenter presenter);

    }

    interface Presenter extends BasePresenter {

        void getTracks();
        void onTracksClick(int position);

        void attachView(View view);
        void detachView();

    }
}

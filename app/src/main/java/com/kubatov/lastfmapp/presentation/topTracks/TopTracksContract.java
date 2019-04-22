package com.kubatov.lastfmapp.presentation.topTracks;

import com.kubatov.lastfmapp.baseOfBase.BasePresenter;
import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.TrackEntity;

import java.util.List;

public interface TopTracksContract {

    interface View extends BaseView {

        void showTracks(List<TrackEntity> tracks);
        void showMessage(String message);
        void openTrack(TrackEntity track);

        void finishView();
        void attachPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {

        void onTrackClick(int position);
        void getTracks();

        void attachView(View view);
        void detachView();

    }
}

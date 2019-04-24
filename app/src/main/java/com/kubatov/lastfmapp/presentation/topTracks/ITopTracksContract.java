package com.kubatov.lastfmapp.presentation.topTracks;

import com.kubatov.lastfmapp.model.TrackEntity;
import java.util.List;
import core.mvp.ICoreMvpContract;

public interface ITopTracksContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTracks(List<TrackEntity> tracks);
        void openTrack(TrackEntity track);
    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {

        void onTrackClick(int position);
        void getTracks();
    }
}

package com.kubatov.lastfmapp.presentation.tracks;


import com.kubatov.lastfmapp.model.TrackEntity;

import java.util.ArrayList;

import core.mvp.ICoreMvpContract;

public interface ITracksContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTracksDetails(ArrayList<TrackEntity> trackEntity);
    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {

        void getTracks();

        void onTracksClick(int position);
    }
}

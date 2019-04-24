package com.kubatov.lastfmapp.presentation.tracks;

import com.kubatov.lastfmapp.model.TrackEntity;

import java.util.ArrayList;

public class TracksPresenter implements ITracksContract.Presenter {
    private ITracksContract.View  mView;

    @Override
    public void getTracks() {
        ArrayList<TrackEntity> trackEntities = new ArrayList<>();
        trackEntities.add(new TrackEntity());

        if (mView !=null){
            mView.showTracksDetails(trackEntities);
        }
    }

    @Override
    public void onTracksClick(int position) {

    }

    @Override
    public void attachView(ITracksContract.View view) {
        mView = view;
        mView.attachPresenter(this);

    }

    @Override
    public void detachView() {
        mView = null;
    }
}

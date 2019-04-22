package com.kubatov.lastfmapp.presentation.tracks;

import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.TrackEntity;

import java.util.ArrayList;

public class TracksPresenter implements TracksContract.Presenter {
    private TracksContract.View  mView;

    @Override
    public void getTracks() {
        ArrayList<TrackEntity> trackEntities = new ArrayList<>();
        trackEntities.add(new TrackEntity());

        if (mView !=null){
            mView.showTracks(trackEntities);
        }
    }

    @Override
    public void onTracksClick(int position) {

    }

    @Override
    public void attachView(TracksContract.View view) {

    }

    @Override
    public void attachView(BaseView baseView) {
        mView = (TracksContract.View)baseView;
        mView.attachPresenter(this);

    }

    @Override
    public void detachView() {
        mView = null;
        assert false;
        mView.finishView();

    }
}

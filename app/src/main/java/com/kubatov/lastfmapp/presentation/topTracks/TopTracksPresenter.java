package com.kubatov.lastfmapp.presentation.topTracks;

import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.TrackEntity;

import java.util.ArrayList;

public class TopTracksPresenter implements TopTracksContract.Presenter {
    private TopTracksContract.View mView;

    @Override
    public void onTrackClick(int position) {
       ArrayList<TrackEntity>trackEntity = new ArrayList<>();
       trackEntity.add(new TrackEntity());

        if (mView !=null){
            mView.showTracks(trackEntity);
        }
    }

    @Override
    public void getTracks() {
        ArrayList<TrackEntity> trackEntities = new ArrayList<>();
            trackEntities.add(new TrackEntity());

        if (mView !=null){
            mView.showTracks(trackEntities);
        }
    }

    @Override
    public void attachView(TopTracksContract.View view) {
        mView.attachPresenter(this);
    }

    @Override
    public void attachView(BaseView baseView) {
        mView = (TopTracksContract.View)baseView;
        mView.attachPresenter(this);

    }

    @Override
    public void detachView() {
        mView = null;
        assert false;
        mView.finishView();
    }
}

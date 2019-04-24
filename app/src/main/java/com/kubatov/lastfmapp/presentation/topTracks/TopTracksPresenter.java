package com.kubatov.lastfmapp.presentation.topTracks;

import com.kubatov.lastfmapp.model.TrackEntity;
import java.util.ArrayList;

public class TopTracksPresenter implements ITopTracksContract.Presenter {
    private ITopTracksContract.View mView;

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
    public void attachView(ITopTracksContract.View view) {
        mView = view;
        mView.attachPresenter(this);
    }

    @Override
    public void detachView() {
        mView = null;
    }
}

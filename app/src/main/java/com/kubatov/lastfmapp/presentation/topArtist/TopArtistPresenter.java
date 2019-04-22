package com.kubatov.lastfmapp.presentation.topArtist;
import com.kubatov.lastfmapp.baseOfBase.BaseView;
import com.kubatov.lastfmapp.model.ArtistEntity;
import java.util.ArrayList;

public class TopArtistPresenter implements TopArtistContract.Presenter {

    private TopArtistContract.View mArtistView;
    @Override
    public void onArtistClick(int position) {
    }

    @Override
    public void getArtist() {
        ArrayList<ArtistEntity> artistEntities = new ArrayList<>();
        artistEntities.add(new ArtistEntity());
            if (mArtistView !=null){
                mArtistView.showArtist(artistEntities);
            }
    }

    @Override
    public void attachView(TopArtistContract.View view) {
        mArtistView.attachPresenter(this);
    }

    @Override
    public void attachView(BaseView baseView) {

    }

    @Override
    public void detachView() {
        mArtistView = null;
        assert false;
        mArtistView.finishView();
    }
}

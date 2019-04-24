package com.kubatov.lastfmapp.presentation.tracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kubatov.lastfmapp.R;

import core.mvp.ICoreMvpContract;

public class TracksActivity extends AppCompatActivity
        implements ICoreMvpContract.View {

    private ICoreMvpContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);
        mPresenter = new TracksPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void attachPresenter(ICoreMvpContract.Presenter presenter) {
        mPresenter = presenter;
        mPresenter.attachView(this);
    }

    @Override
    public void finishView() {
        mPresenter = null;

    }
}

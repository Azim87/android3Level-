package com.kubatov.lastfmapp.baseOfBase;

public interface BaseView {
    void attachPresenter(BasePresenter basePresenter);
    void detachPresenter();
}

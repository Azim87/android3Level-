package com.kubatov.lastfmapp.baseOfBase;

public interface BasePresenter {
    void attachView(BaseView baseView);
    void detachView();
}

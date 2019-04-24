package core.mvp;

import android.support.v4.app.Fragment;

public class CoreMvpFragment extends Fragment
        implements ICoreMvpContract.View{

    private ICoreMvpContract.Presenter mPresenter;

    @Override
    public void attachPresenter(ICoreMvpContract.Presenter presenter) {
        mPresenter = presenter;
        mPresenter.attachView(this);
    }

    @Override
    public void finishView() {
        getActivity().finish();
    }
}

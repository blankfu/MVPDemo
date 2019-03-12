package fupp.mvp_demo.base;

import android.content.Context;

public abstract class BasePresenter<M, T> {

    public Context context;
    public M mModel;
    public T mView;
    public RxManager mRxManager = new RxManager();

    void setVM(T v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public void onDestroy() {
        mRxManager.clear();
    }

    public abstract void onStart();

}

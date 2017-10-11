package com.app.best.documentaries.ui.base;

/**
 * Created by agrim on 4/7/17.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(Throwable throwable);
}

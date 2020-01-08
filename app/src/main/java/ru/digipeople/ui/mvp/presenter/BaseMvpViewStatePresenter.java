package ru.digipeople.ui.mvp.presenter;

import android.support.annotation.NonNull;

import ru.digipeople.ui.mvp.view.MvpView;
import ru.digipeople.ui.mvp.viewState.MvpViewState;

/**
 * Скелетная реализация {@link MvpPresenter , работающего с прослойкой {@link MvpViewState }.
 *
 * @param <V>  {@link MvpView }, c которой работает презентер.
 * @param <VS> {@link MvpViewState }, c которой работает презентер.
 * @author Aleksandr Brazhkin
 */
public abstract class BaseMvpViewStatePresenter<V extends MvpView, VS extends MvpViewState<V>> implements MvpPresenter<V> {

    /**
     * Представление, ассоциированное с презентером.
     */
    protected final V view;
    /**
     * {@link MvpViewState} прослойка
     */
    private final VS viewState;

    public BaseMvpViewStatePresenter(VS viewState) {
        this.viewState = viewState;
        this.view = (V) viewState;
    }

    @Override
    public void bind(@NonNull V view) {
        viewState.attachView(view);
    }

    @Override
    public void unbind(@NonNull V view) {
        viewState.detachView(view);
    }

    @Override
    public void destroy() {

    }
}

package ru.digipeople.ui.mvp;

import ru.digipeople.ui.mvp.presenter.MvpPresenter;

/**
 * Фабрика презентеров.
 *
 * @author Aleksandr Brazhkin
 */
public interface PresenterProvider<P extends MvpPresenter> {
    P providePresenter();
}

package roman.bannikov.dictionary.presenter

import roman.bannikov.dictionary.model.data.AppState
import roman.bannikov.dictionary.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}

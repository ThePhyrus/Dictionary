package roman.bannikov.dictionary.view.base

import roman.bannikov.dictionary.model.data.AppState

interface View {

    fun renderData(appState: AppState)

}

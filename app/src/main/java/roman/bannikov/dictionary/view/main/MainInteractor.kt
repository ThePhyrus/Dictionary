package roman.bannikov.dictionary.view.main

import io.reactivex.Observable
import roman.bannikov.dictionary.model.data.AppState
import roman.bannikov.dictionary.model.data.DataModel
import roman.bannikov.dictionary.model.repository.Repository
import roman.bannikov.dictionary.presenter.Interactor

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}

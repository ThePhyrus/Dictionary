package roman.bannikov.dictionary.model.repository


import io.reactivex.Observable
import roman.bannikov.dictionary.model.data.DataModel
import roman.bannikov.dictionary.model.datasource.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}

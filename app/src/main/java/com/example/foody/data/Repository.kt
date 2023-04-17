package com.example.foody.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

// 如果需要所有的ViewModel 共享同一個類型的實例，使用 @ActivityRetainedScoped 註解。
@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {

    val remote = remoteDataSource
    val local = localDataSource
}
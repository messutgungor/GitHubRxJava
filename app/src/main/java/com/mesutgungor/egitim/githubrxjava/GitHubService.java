package com.mesutgungor.egitim.githubrxjava;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by MesutG on 16.1.2018.
 */

public interface GitHubService {
    @GET("users/{user}/starred")
    Observable<List<GitHubRepo>> getStarredRepositoris(@Path("user") String userName);
}

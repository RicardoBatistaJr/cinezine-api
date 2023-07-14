package com.ricardo.cinezineapi.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "MovieClient", url = "https://api.themoviedb.org/3/search/movie")
public interface MovieClient {
}

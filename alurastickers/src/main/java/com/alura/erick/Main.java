package com.alura.erick;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args) {

        // make http request to the api
        // the imdb api was not working when I tried, so I got another one I had already used in other project
        // link to the project I made using the same api last year: github.com/erickgnclvs/flask-movie-app

        String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=b0c85929904b01fc66d943266877e630&language=en-US&page=1";
        var client = HttpClient.newHttpClient();
        URI uri = URI.create(url);
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();



    }
}
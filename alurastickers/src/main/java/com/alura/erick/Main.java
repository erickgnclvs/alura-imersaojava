package com.alura.erick;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.server.ExportException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        // The imdb API was not working when I tried, so I got another one I had already used in other project
        // Link to the project I made using the same api last year: github.com/erickgnclvs/flask-movie-app

        // Make http request to the API
        String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=b0c85929904b01fc66d943266877e630&language=en-US&page=1";
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(url);
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        // Parse body to extract backdrop_path, original_title, vote_average
        var jsonParser = new JsonParser();
        List<Map<String, String>> movieList = jsonParser.parse(body);
        System.out.println(body);


    }
}
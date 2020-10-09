package com.tuan.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckNorrisConfig {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}

package com.dachen.demo;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;

/**
 * Created by liming on 2016/9/1.
 */
public class Demo {
    public static JestClient client;

    static {

        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig(new HttpClientConfig
                .Builder("http://localhost:9200")
                .multiThreaded(true)
                .build());
        JestClient client = factory.getObject();

    }

    public static void main(String[] args) {

        createIndexTest();

    }

    public static void createIndexTest(){
        String settings = "\"settings\" : {\n" +
                "        \"number_of_shards\" : 5,\n" +
                "        \"number_of_replicas\" : 1\n" +
                "    }\n";

        //client.execute(new CreateIndex.Builder("articles").settings(settings.builder().loadFromSource(settings).build().getAsMap()).build());

    }




}

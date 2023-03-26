package com.hanteocodingtest1.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response {
    private Long id;
    private List<Response> responseList;

    public Response() {
    }

    public Response(Long id) {
        this.id = id;
    }
}

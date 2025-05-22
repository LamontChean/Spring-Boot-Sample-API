package com.example.sample.common;

public class ResponseWrapper<T> {
    private T data;
    private Object error;

    public ResponseWrapper(T data, Object error) {
        this.data = data;
        this.error = error;
    }

    public static <T> ResponseWrapper<T> success(T data) {
        return new ResponseWrapper<>(data, null);
    }

    public static <T> ResponseWrapper<T> error(Object error) {
        return new ResponseWrapper<>(null, error);
    }


    public static class ErrorResponse {
        private String message;
        private String code;

        public ErrorResponse(String message, String code) {
            this.message = message;
            this.code = code;
        }
    }
}

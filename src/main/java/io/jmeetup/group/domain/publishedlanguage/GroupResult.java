package io.jmeetup.group.domain.publishedlanguage;

import lombok.Value;

public interface GroupResult {
    boolean isValid();
    String message();


    @Value
    class Success implements GroupResult {
        String message;

        public static Success emptyMessage(){
            return new Success("");
        }

        @Override
        public boolean isValid() {
            return true;
        }

        @Override
        public String message() {
            return message;
        }
    }

    @Value
    class Failure implements GroupResult {
        String message;
        public static Failure emptyMessage(){
            return new Failure("");
        }

        @Override
        public boolean isValid() {
            return false;
        }

        @Override
        public String message() {
            return message;
        }
    }
}



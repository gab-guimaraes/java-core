package org.example.anonymous_class;

public interface SpeakingEntity {
    void sayHello();
    void sayGoodbye();

    public static void main(String[] args) {
        SpeakingEntity speakingEntity = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Goodbye");
            }
        };

        speakingEntity.sayHello();
        speakingEntity.sayGoodbye();
    }
}


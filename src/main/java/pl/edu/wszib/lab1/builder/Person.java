package pl.edu.wszib.lab1.builder;

public class Person {
    private final String name;
    private final String surname;
    private final Address address;
    private final Integer age;

    private final Gender gender;

    private Person(String name, String surname, Address address, Integer age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public static Person.Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private  String name;
        private  String surname;
        private  Address address;
        private  Integer age;

        private  Gender gender;


        public Person build() {
          return new Person(name,surname,address,age,gender);
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder address(Address address){
            this.address = address;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }

    }
}

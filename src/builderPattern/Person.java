package builderPattern;

public class Person {
    private final Long id;
    private final String firstname;
    private final PersonAddress personAddress;


    private Person(Builder builder){
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.personAddress = builder.personAddress;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    public static class Builder{
        private Long id;
        private String firstname;

        private PersonAddress personAddress;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public Builder personAddress(PersonAddress personAddress){
            this.personAddress = personAddress;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }
}

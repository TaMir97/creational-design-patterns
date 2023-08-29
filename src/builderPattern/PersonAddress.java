package builderPattern;

public class PersonAddress {
    private final String zipcode;
    private final String street;
    private final String city;

    private PersonAddress(Builder builder){
        this.zipcode = builder.zipcode;
        this.street = builder.street;
        this.city = builder.city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public static class Builder{
        private String zipcode;
        private String street;
        private String city;

        public Builder zipcode(String zipcode){
            this.zipcode = zipcode;
            return this;
        }

        public Builder street(String street){
            this.street = street;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public PersonAddress build(){
            return new PersonAddress(this);
        }
    }
}

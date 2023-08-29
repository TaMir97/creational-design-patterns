package builderPattern;

import java.util.List;

public class Name {
    private final String firstname;
    private final List<String> middleName;
    private final String surname;

    private Name(Builder builder){
        this.firstname = builder.firstname;
        this.middleName = builder.middleName;
        this.surname = builder.surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public static class  Builder{
        private String firstname;
        private List<String> middleName;
        private String surname;

        public Builder firstname(final String firstname){
            this.firstname = firstname;
            return this;
        }
        public Builder middleName(final List<String> middleName){
            this.middleName = middleName;
            return this;
        }
        public Builder surname(final String surname){
            this.surname = surname;
            return this;
        }
        public Name build(){
            return new Name(this);
        }
    }
}

package phonebook;

import java.util.Objects;

public class Record {
    private final String name;
    private final String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name) && Objects.equals(phone, record.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Record%d{name='%s', phone='%s'}".formatted(hashCode(), name, phone);
    }
}

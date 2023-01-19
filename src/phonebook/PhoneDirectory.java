package phonebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PhoneDirectory {
    private final HashSet<Record> records;

    public PhoneDirectory() {
        this.records = new HashSet<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) return record;
        }

        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> recordList = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) recordList.add(record);
        }

        return recordList;
    }
}
